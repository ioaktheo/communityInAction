/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citizen.database;

/**
 *
 * @author Xristos Aslamagidis
 */
public class Citizen {

    int cititized_id; //primary key
    String name;
    String surname;
    String dateOfBirthday;
    String sex;
    String road;
    String numberOfRoad;
    String postCode;
    Municipallity munincipality;

    /*-----Getters----- */
    public int getCititized_id() {
        return cititized_id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public String getSex() {
        return sex;
    }

    public String getRoad() {
        return road;
    }

    public String getNumberOfRoad() {
        return numberOfRoad;
    }

    public String getPostCode() {
        return postCode;
    }

    public Municipallity getMunincipality() {
        return munincipality;
    }

    /*-----Setters----*/
    public void setCititized_id(int cititized_id) {
        this.cititized_id = cititized_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public void setNumberOfRoad(String numberOfRoad) {
        this.numberOfRoad = numberOfRoad;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public void setMunincipality(Municipallity munincipality) {
        this.munincipality = munincipality;
    }

    public void InsertCitizen(DbLinker dblinker) {
        try {

            String query = "INSERT INTO problem" + "(name,surname,gender,road,street_Number,postcode)" + "VALUES('" + name + "','" + surname + "','" + sex + "','" + road + "','" + numberOfRoad + "','" + postCode + "')";
            dblinker.getSt().executeUpdate(query);
            System.out.println("successfull insert \n");
        } catch (Exception ex) {
            System.out.println(ex);
            System.out.println("error");

        }

    }
}
