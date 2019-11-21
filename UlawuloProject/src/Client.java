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
    private List<Project> daftarProject;
    private Date deadline;

    public Client(String nameClient) {
        setNameClient(nameClient);
        this.daftarProject = new ArrayList<>();
    }
    
    public String getNameClient(){
        return nameClient;
    }
    
    public void setNameClient(String nameClient){
        this.nameClient = nameClient;
    }
    
    public void addProject(String nameProject, int maks,String deadline){
        Project project = new Project(nameProject, maks,deadline);
        daftarProject.add(project);
    }

    public Date getDeadline() {
        return deadline;
    }
    
    
}
