package in.asclepius.app.models;

import android.util.Log;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Doctors {

    private String availableOn;
    private String name;
    private String experience;
    private int fees;
    private String fullName;
    private String hospital;
    private float rating;
    private int specialityId;
    private String speciality;

    public Doctors(@NotNull ModelDoctorFirebase doctor) {
        name = doctor.getFullName();
        availableOn = "Monday";
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getSpecialityId() {
        return specialityId;
    }

    public void setSpecialityId(int specialityId) {
        this.specialityId = specialityId;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getAvailableOn() {
        return availableOn;
    }

    public void setAvailableOn(String availableOn) {
        this.availableOn = availableOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ClassPojo [availableOn = " + availableOn + ", name = " + name + "]";
    }

    public static Doctors[] getDoctorsAvailableOnDay(Doctors[] doctors, String availableOn) {
        ArrayList<Doctors> tempList = new ArrayList<>();
        for (int i = 0; i < doctors.length; i++) {
            Log.d("Doctors", "Comparing : required -> " + availableOn + " with actual : " + doctors[i].getAvailableOn());
            if (doctors[i].getAvailableOn().equalsIgnoreCase(availableOn)) {
                tempList.add(doctors[i]);
            }
        }
        return tempList.toArray(new Doctors[0]);
    }

}