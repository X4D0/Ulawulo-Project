/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.DateFormat;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Rizal MF
 */
public class Client {
    private String nameClient;
    List<Project> listProject;
    DateFormat deadline = new SimpleDateFormat("dd/MM/yyyy");
    private String dl;
    
    public Client(String nameClient) {
        setNameClient(nameClient);
        listProject = new ArrayList<>();
    }

    public void setDl(String dl) {
        this.dl = dl;
    }

    public String getDl() {
        return dl;
    }
    
    public String getNameClient(){
        return nameClient;
    }
    
    public void setNameClient(String nameClient){
        this.nameClient = nameClient;
    }
    
    public void createProject(String nameP, String deadline){
        Project project = new Project(nameP,deadline);
        listProject.add(project);
    }
    
    public Project searchProject(String nameProject){
        int i = 0;
        while(i<listProject.size()){
            if(!listProject.get(i).getNameProject().equals(nameProject)){
                i++;
            }else{
                return listProject.get(i);
            }
        }
        return null;
    }
    
    public void removeProject(String project){
        Project p1 = searchProject(project);
        listProject.remove(p1);
    }
    
    
    public Project getProject(int x){
        return listProject.get(x);
    }
}
