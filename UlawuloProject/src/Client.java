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
    private Project[] daftarProject;
    private Date deadline;

    public Client(Project[] daftarProject) {
        this.daftarProject = daftarProject;
    }
    
    public void creteProject(Date deadline){
        this.deadline = deadline;
    }

    public Date getDeadline() {
        return deadline;
    }
    
    
}
