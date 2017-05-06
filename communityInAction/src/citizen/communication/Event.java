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
public class Event {
    int event_id; //primary key
    String name;
    String type;
    String eventLocation;
    String description;
    Municipallity munincipality; 
    
     /*-----Getters----- */

    public int getEvent_id() {
        return event_id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public String getDescription() {
        return description;
    }

    public Municipallity getMunincipality() {
        return munincipality;
    }
    
    
    
    
}
