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
public class Municipallity {
    int municipality_id;
    String name;
    String deparment;
    String law;
    String country;
    int fax;
    int telephone;
    String road;
    int numberOfRoad;
    int postCode;
    String mayor;
    int population;
    
     /*-----Getters----- */

    public int getMunicipality_id() {
        return municipality_id;
    }

    public String getName() {
        return name;
    }

    public String getDeparment() {
        return deparment;
    }

    public String getLaw() {
        return law;
    }

    public String getCountry() {
        return country;
    }

    public int getFax() {
        return fax;
    }

    public int getTelephone() {
        return telephone;
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

    public String getMayor() {
        return mayor;
    }

    public int getPopulation() {
        return population;
    }
    
    
   
    
    
}
