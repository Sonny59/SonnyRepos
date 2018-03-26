package com.testspring.annuaire.model;

public class Member {

    private int id;
    private Gender gender;
    private String lastName;
    private String firstName;
    private String birthDate;
    private String tel;
    private String email;
    private String postCode;
    private String city;

    public Member() {
    }

    public Member(int id, Gender gender, String lastName, String firstName, String birthDate, String tel, String email, String postCode, String city) {
        this.id = id;
        this.gender = gender;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.tel = tel;
        this.email = email;
        this.postCode = postCode;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
