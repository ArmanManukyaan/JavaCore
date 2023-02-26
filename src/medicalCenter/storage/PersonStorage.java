package medicalCenter.storage;

import employee.util.DateUtil;
import medicalCenter.Profession;
import medicalCenter.model.Doctor;
import medicalCenter.model.Patients;
import medicalCenter.model.Person;
import medicalCenter.util.DataUtil;

import java.util.Date;

public class PersonStorage {
    private Person[] persons = new Person[10];
    private int size = 0;

    public void add(Person person) {
        if (size == persons.length) {
            extend();
        }
        persons[size++] = person;

    }

    public void printDoctors() {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Doctor) {
                System.out.println(persons[i]);
            }
        }
    }

    public void printPatients() {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Patients) {
                System.out.println(persons[i]);
            }
        }
    }

    public void searchDoctorByProfession(String profession) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Doctor) {
                Doctor doctor = (Doctor) person;
                if (doctor.getProfession().equals(profession)) {
                    System.out.println(doctor);
                }
            }
        }
    }

    public void deleteDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Doctor &&
                    person.getId().equals(id)) {
                deletePersonByIndex(i);
            }

        }
    }

    public Doctor getDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Doctor &&
                    person.getId().equals(id)) {
                return (Doctor) person;
            }
        }
        return null;
    }

    public void searchPatientsByDoctor(Doctor doctor) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Patients) {
                Patients patient = (Patients) person;
                if (patient.getDoctor().equals(doctor)) {
                    System.out.println(patient);
                }
            }
        }
    }

    public void printTodayPatients() {
        Date today = new Date();
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patients) {
                Patients patient = (Patients) persons[i];
                DataUtil.isSameDay(today, patient.getRegisterDateTime());
                System.out.println(patient);
            }
        }
    }


    private void deletePersonByIndex(int i) {
        for (int j = i; j < size; j++) {
            persons[j] = persons[j + 1];
        }
        size--;
    }

    private void extend() {
        Person[] tmp = new Person[persons.length + 10];
        System.arraycopy(persons, 0, tmp, 0, size);
        persons = tmp;
    }


    public boolean isDoctorAvailable(Date registerDataTime, Doctor doctor) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Patients) {
                Patients patients = (Patients) person;
                if (patients.getDoctor().equals(doctor) &&
                        patients.getRegisterDateTime().equals(registerDataTime)) {
                    return false;
                }
            }
        }
        return true;
    }


}


