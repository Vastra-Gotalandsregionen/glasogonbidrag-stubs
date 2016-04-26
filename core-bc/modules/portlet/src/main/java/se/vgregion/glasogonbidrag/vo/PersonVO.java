package se.vgregion.glasogonbidrag.vo;

public class PersonVO {

    private String firstName;
    private String lastName;
    private String personNumber;
    private String streetAdress;
    private String zipCode;
    private String city;

    public PersonVO() {
    }

    public PersonVO(String firstName, String lastName, String personNumber, String streetAdress, String zipCode, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personNumber = personNumber;
        this.streetAdress = streetAdress;
        this.zipCode = zipCode;
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(String personNumber) {
        this.personNumber = personNumber;
    }

    public String getStreetAdress() {
        return streetAdress;
    }

    public void setStreetAdress(String streetAdress) {
        this.streetAdress = streetAdress;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
