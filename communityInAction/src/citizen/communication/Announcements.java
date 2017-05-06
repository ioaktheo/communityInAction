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
public class Announcements {
    int annoncements_id; //primar key
    String name;
    String criticalness;
    String type;
    String description;
    String area;
    String road;
    int postCode;
    Municipallity munincipality; 
    
    /*-----Getters----- */

    public int getAnnoncements_id() {
        return annoncements_id;
    }

    public String getName() {
        return name;
    }

    public String getCriticalness() {
        return criticalness;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public String getArea() {
        return area;
    }

    public String getRoad() {
        return road;
    }

    public int getPostCode() {
        return postCode;
    }

    public Municipallity getMunincipality() {
        return munincipality;
    }
    
    

    
}
