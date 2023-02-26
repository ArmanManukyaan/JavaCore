package medicalCenter.model;

import medicalCenter.util.DataUtil;

import java.util.Date;
import java.util.Objects;

public class Patients extends Person {

    private Doctor doctor;
    private Date registerDateTime;

    public Patients(String id, String name, String surname, String phone, Doctor doctor, Date registerDateTime) {
        super(id, name, surname, phone);
        this.doctor = doctor;
        this.registerDateTime = registerDateTime;
    }

    public Patients() {
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(Date registerDateTime) {
        this.registerDateTime = registerDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Patients patients = (Patients) o;

        if (!Objects.equals(doctor, patients.doctor)) return false;
        return Objects.equals(registerDateTime, patients.registerDateTime);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (doctor != null ? doctor.hashCode() : 0);
        result = 31 * result + (registerDateTime != null ? registerDateTime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Patients{" +
                "doctor=" + doctor +
                ", registerDateTime=" + DataUtil.dateTimeToString(registerDateTime)  +
                "} " + super.toString();
    }

}
