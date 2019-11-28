/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Rizal MF
 */
public class Client {
    private String nameClient;
    private Project[] daftarProject;
    private Date deadline;
    private int numProject = 0;
    private int maxProject;

    public Client(String nameClient) {
        setNameClient(nameClient);
        this.daftarProject = new Project[maxProject];
    }
    
    public String getNameClient(){
        return nameClient;
    }
    
    public void setNameClient(String nameClient){
        this.nameClient = nameClient;
    }
    
    public void addProject(Project project){
        Project proyek = new Project(nameClient,nameProject,maxProgrammer,deadline);
        if(numProject < maxProject){
            this.daftarProject[numProject] = project;
            numProject++;
        }
    }

    public Date getDeadline() {
        return deadline;
    }
    public void display(){
        getNameClient();
    }
}
