package com.spring.testrest.domain;

public class UserInfo {
    private String firstName;
    private String secondName;
    private String firstLastName;
    private String secondLastName;
    private Document typeOfDocument;
    private Long numOfDocument;
    private Long telephoneNumber;
    private String address;
    private String city;
    public UserInfo(String firstName, String secondName, String firstLastName, String secondLastName, Document typeOfDocument, Long numOfDocument, Long telephoneNumber, String address, String city) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
        this.typeOfDocument = typeOfDocument;
        this.numOfDocument = numOfDocument;
        this.telephoneNumber = telephoneNumber;
        this.address = address;
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstLastName() {
        return firstLastName;
    }

    public void setFirstLastName(String firstLastName) {
        this.firstLastName = firstLastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public Document getTypeOfDocument() {
        return typeOfDocument;
    }

    public void setTypeOfDocument(Document typeOfDocument) {
        this.typeOfDocument = typeOfDocument;
    }

    public Long getNumOfDocument() {
        return numOfDocument;
    }

    public void setNumOfDocument(Long numOfDocument) {
        this.numOfDocument = numOfDocument;
    }

    public Long getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(Long telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
