/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import java.text.DateFormat;
import java.util.*;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
/**
 *
 * @author Rizal MF
 */
public class Client {
    private String nameClient;
    private List<Project> listProject;
//    DateFormat deadline = new SimpleDateFormat("dd/MM/yyyy");
//    private String dl;
    
    public Client(String nameClient) {
        setNameClient(nameClient);
        listProject = new ArrayList<>();
    }
    
    public String getNameClient(){
        return nameClient;
    }
    
    public void setNameClient(String nameClient){
        this.nameClient = nameClient;
    }
    
    public void createProject(Manager m, String nameP, String deadline){
        Project project = new Project(m,nameP,deadline);
        listProject.add(project);
    }
    
    public Project getProject(int x){
        return listProject.get(x);
    }
}
