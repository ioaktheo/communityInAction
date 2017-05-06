/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citizen.database;

import java.sql.ResultSet;

/**
 *
 * @author Xristos Aslamagidis
 */
public class Announcements {

    private ResultSet result;

    int annoncements_id; //primar key
    String title;
    String criticalness;
    String type;
    String description;
    String road;
    String postCode;
    Municipallity munincipality;

    /*-----Getters----- */
    public int getAnnoncements_id() {
        return annoncements_id;
    }

    public String getTitle() {
        return title;
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

    public String getRoad() {
        return road;
    }

    public String getPostCode() {
        return postCode;
    }

    public Municipallity getMunincipality() {
        return munincipality;
    }

    /*-----Setters----- */
    public void setAnnoncements_id(int annoncements_id) {
        this.annoncements_id = annoncements_id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCriticalness(String criticalness) {
        this.criticalness = criticalness;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public void setMunincipality(Municipallity munincipality) {
        this.munincipality = munincipality;
    }

    public void InsertProblem(DbLinker dblinker) {

        try {

            String query = "select * from announcements";
            result = dblinker.getSt().executeQuery(query);
            // this.setAnnoncements_id(annoncements_id);
            while (result.next()) {
                this.setTitle(result.getString("title"));
                this.setCriticalness(result.getString("reliability"));
                this.setType(result.getString("an_type"));
                this.setDescription(result.getString("description"));
                this.setRoad(result.getString("road"));
                this.setPostCode(result.getString("postcode"));
            }
        } catch (Exception ex) {
            System.out.println(ex);
            System.out.println("error");

        }

    }
}
