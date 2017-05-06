/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citizen.database;

import java.sql.SQLException;

/**
 *
 * @author Xristos Aslamagidis
 */
public class Problem {

    int problem_id; //primary_key
    String title;
    String typeOfProblem;
    String description;
    String road;
    String numberOfRoad;
    String area;

    /*-----Getters----- */
    public int getProblem_id() {
        return problem_id;
    }

    public String getTypeOfProblem() {
        return typeOfProblem;
    }

    public String getDescription() {
        return description;
    }

    public String getRoad() {
        return road;
    }

    public String getNumberOfRoad() {
        return numberOfRoad;
    }

    public String getArea() {
        return area;
    }

    public String getTitle() {
        return title;
    }
    
    

    /*----Setters----*/
    public void setProblem_id(int problem_id) {
        this.problem_id = problem_id;
    }

    public void setTypeOfProblem(String typeOfProblem) {
        this.typeOfProblem = typeOfProblem;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public void setNumberOfRoad(String numberOfRoad) {
        this.numberOfRoad = numberOfRoad;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    

    public void InsertProblem(DbLinker dblinker) {

        try {

           String query = "INSERT INTO problem" + "(title,description,road,street_number,area)" + "VALUES('" +title + "','" +description + "','" + road + "','" + numberOfRoad + "','" + area + "')";
            dblinker.getSt().executeUpdate(query);
            System.out.println("successfull insert \n");
        } catch (Exception ex) {
            System.out.println(ex);
            System.out.println("error");

        }

    }

}
