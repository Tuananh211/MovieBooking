package com.base.moviebooking.entity;

public class RegisterRequest {
    private String fullName;
    private String email;
    private String password;
    private String address;
    private String dob;

    public RegisterRequest(String fullName, String email, String password, String address, String dob) {

        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.address = address;
        this.dob = dob;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
