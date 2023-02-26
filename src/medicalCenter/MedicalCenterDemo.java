package medicalCenter;

import medicalCenter.model.Doctor;
import medicalCenter.model.Patients;
import medicalCenter.storage.PersonStorage;
import medicalCenter.util.DataUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class MedicalCenterDemo implements Commands {
    static Scanner scanner = new Scanner(System.in);
    static PersonStorage personStorage = new PersonStorage();

    public static void main(String[] args) {
        boolean iRun = true;
        while (iRun) {
            Commands.printCommands();
            String commands = scanner.nextLine();
            switch (commands) {
                case EXIT:
                    iRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    break;
                case CHANGE_DOCTOR_DATA_BY_ID:
                    changeDoctorData();
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    printAllPatientsByDoctor();
                    break;
                case PRINT_TODAY_PATIENTS:
                    personStorage.printTodayPatients();
                    break;
                default:
                    System.out.println("Wrong command!");
            }
        }
    }
    private static void printAllPatientsByDoctor() {
        personStorage.printDoctors();
        System.out.println("please input doctors id");
        String Id = scanner.nextLine();
        Doctor doctor = personStorage.getDoctorById(Id);
        if (doctor != null) {
            personStorage.searchPatientsByDoctor(doctor);
        } else {
            System.out.println("doctor with " + Id + " dose not exits!");
        }
    }
    private static void addPatient() {
        personStorage.printDoctors();
        System.out.println("please input doctors id");
        String Id = scanner.nextLine();
        Doctor doctor = personStorage.getDoctorById(Id);
        if (doctor != null) {
            try {
                System.out.println("please input id(id card),name,surname,phone,registerDataTime(dd-mm-yyyy HH:mm)");
                String patientDataStr = scanner.nextLine();
                String[] patientData = patientDataStr.split(",");
                Date registerDataTime = DataUtil.stringToDateTime(patientData[4]);
                if (personStorage.isDoctorAvailable(registerDataTime, doctor)) {
                    Patients patient = new Patients();
                    patient.setId(patientData[0]);
                    patient.setName(patientData[1]);
                    patient.setSurname(patientData[2]);
                    patient.setPhone(patientData[3]);
                    patient.setDoctor(doctor);
                    patient.setRegisterDateTime(registerDataTime);
                    personStorage.add(patient);
                    System.out.println("Patient registered");
                } else {
                    System.out.println("doctor is unavailable in that date time pela" + "please choose another!");
                }
            } catch (ParseException e) {
                System.out.println("incorrect registerDate Time please try again!");
            }
        }
    }

    private static void changeDoctorData() {
        personStorage.printDoctors();
        System.out.println("please input Id");
        String Id = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(Id);
        if (doctorById != null) {
            System.out.println("please input name,surname,email,phone,profession");
            listProfession();
            String doctorDataStr = scanner.nextLine();
            String[] doctorData = doctorDataStr.split(",");
            String doctorDatum = doctorData[4];
            doctorById.setName(doctorData[0]);
            doctorById.setSurname(doctorData[1]);
            doctorById.setEmail(doctorData[2]);
            doctorById.setPhone(doctorData[3]);
            try {
                doctorById.setProfession(Profession.valueOf(doctorDatum));
            } catch (IllegalArgumentException e) {
                System.out.println("wrong profession");
            }
            System.out.println("doctor was updated!");
        } else {
            System.out.println("doctor with " + Id + " dose not exists");
        }
    }

    private static void deleteDoctorById() {
        personStorage.printDoctors();
        System.out.println("please choose id");
        String doctorId = scanner.nextLine();
        Doctor doctor = personStorage.getDoctorById(doctorId);
        if (doctor != null) {
            personStorage.deleteDoctorById(doctorId);
            System.out.println("the doctor was deleted");
        } else {
            System.out.println("wrong id.please input try again!");
        }
    }

    private static void searchDoctorByProfession() {
        System.out.println("please input profession");
        String profession = scanner.nextLine();
        personStorage.searchDoctorByProfession(profession);
    }

    private static void addDoctor() {
        System.out.println("please input id,name,surname,email,phone,profession");
        listProfession();
        String doctorDataStr = scanner.nextLine();
        String[] doctorData = doctorDataStr.split(",");
        String doctorId = doctorData[0];
        String doctorProfession = doctorData[5];
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById == null) {
            Doctor doctor = new Doctor();
            doctor.setId(doctorId);
            doctor.setName(doctorData[1]);
            doctor.setSurname(doctorData[2]);
            doctor.setEmail(doctorData[3]);
            doctor.setPhone(doctorData[4]);
            try {
                doctor.setProfession(Profession.valueOf(doctorProfession));
            } catch (IllegalArgumentException e) {
                System.out.println("Profession wrong!");
            }
            personStorage.add(doctor);
            System.out.println("doctor add!");
        } else {
            System.out.println("doctor with" + doctorId + "already exists");
        }
    }

    private static void listProfession() {
        System.out.println("Please choose profession");
        Profession[] values = Profession.values();
        for (Profession profession : values) {
            System.out.println(profession);

        }
    }
}




