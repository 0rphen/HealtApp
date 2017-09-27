package com.lorenz.konrad.healtapp.entities;

/**
 * Created by Camilo on 26/09/17.
 */

public class User {
    String name;
    String lastName;
    int identityCard;
    int phone;
    String email;
    String clinicHistory;
    String familyBackground;
    char userType;//P Patient, D Doctor

    public User(String name, String lastName, int identityCard, int phone, String email, String clinicHistory, String familyBackground, char userType) {
        this.name = name;
        this.lastName = lastName;
        this.identityCard = identityCard;
        this.phone = phone;
        this.email = email;
        this.clinicHistory = clinicHistory;
        this.familyBackground = familyBackground;
        this.userType = userType;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(int identityCard) {
        this.identityCard = identityCard;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClinicHistory() {
        return clinicHistory;
    }

    public void setClinicHistory(String clinicHistory) {
        this.clinicHistory = clinicHistory;
    }

    public String getFamilyBackground() {
        return familyBackground;
    }

    public void setFamilyBackground(String familyBackground) {
        this.familyBackground = familyBackground;
    }

    public char getUserType() {
        return userType;
    }

    public void setUserType(char userType) {
        this.userType = userType;
    }
}
