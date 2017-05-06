/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citizen.communication;

/**
 *
 * @author Xristos Aslamagidis
 */
public class Citizen {
    int cititized_id; //primary key
    String name;
    String sirname;
    String dateOfBirthday;
    String sex;
    String road;
    int numberOfRoad;
    int postCode;
    Municipallity munincipality; 
    
     /*-----Getters----- */

    public int getCititized_id() {
        return cititized_id;
    }

    public String getName() {
        return name;
    }

    public String getSirname() {
        return sirname;
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

    public int getNumberOfRoad() {
        return numberOfRoad;
    }

    public int getPostCode() {
        return postCode;
    }

    public Municipallity getMunincipality() {
        return munincipality;
    }
    
    
    
    
}
