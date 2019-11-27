package Model;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rizal MF
 */
public class DRIVER {
    public static void main(String[] args) {
//        Application mulai = new Application();
//        Client c1 = new Client("Bro");
//        Manager m1 = new Manager("Ray","mining","0986");
//        Project p = new Project(m1,"Proyek1","29-11-2019");
//        c1.createProject(p);
//        p.createTask("Membuat Driver","Done");
//        
//        Programmer p1 = new Programmer("Ray");
//        Programmer p2 = new Programmer("Riz");
//        
//        p1.getTask();
//        p.addProgrammer(p1);
//        p.addProgrammer(p2);
//        mulai.searchManager(viewManager(id));
        
        Application mulai = new Application();
        Scanner choice = new Scanner(System.in);
        Scanner input = new Scanner (System.in);
        
        int pilih = 1;
        while (pilih != 0) {
            System.out.println("\tProject Management");
            System.out.println("1. Create Client");
            System.out.println("2. Create Manager");
            System.out.println("3. Create Task");
            System.out.println("4. Create Programmer");
            System.out.println("5. Create Project");
            System.out.println("6. Input Programmer to Project");
            System.out.println("7. Input Task to Project");
            System.out.println("8. Input Project to Client");
            System.out.println("9. Input Manager to Project");
            System.out.println("10. Edit Programmer");
            System.out.println("11. Edit Manager");
            System.out.println("12. Edit Project");
            System.out.println("13. Edit Client");
            System.out.println("14. Delete Project");
            System.out.println("15. Delete Task");
            System.out.println("16. Delete Manager");
            System.out.println("17. Delete Client");
            System.out.print("Choice : ");
            pilih = choice.nextInt();
            
            switch (pilih) {
                case 1:
                    String nameClient = "Bro";
                    mulai.inputClient(nameClient);
                    break;
                case 2 :
                    String nameManager = "Udin";
                    String divisi = "mining";
                    String phoneManager = "085";
                    mulai.inputManager(nameManager, divisi, phoneManager);
                    break;
                case 3 :
                    String descTask = "Bikin driver";
                    String status = "done";
                    mulai.inputTask(descTask, status);
                    break;
                case 4 :
                    String nameProgrammer = "Ray";
                    mulai.inputProgrammer(nameProgrammer);
                    break;
                case 5 :
                    nameClient = "Bro";
                    String dl = "29-11-2019";
                    Client c1 = mulai.searchClient(nameClient);
                    mulai.inputProjectToClient(c1, nameClient, dl);
                    break;
                case 6 :
                    String nameProg = "Ray";
                    String project1 = "Proyek 1";
                    Programmer p2 = mulai.searchProgrammer(nameProg);
                    Project proj = mulai.searchProject(project1);
                    if (proj != null){
                        mulai.inputProgrammerToProject(p2, proj);
                    }
                    break;
                case 7 :
                    descTask = "Bikin Driver";
                    status  = "done";
                    project1 = "Proyek 1";
                    proj = mulai.searchProject(project1);
                    if(proj != null){
                        mulai.inputTaskToProject(proj, descTask, status);
                    }
                    break;
                case 8 :
                    project1 = "Proyek 1";
                    dl = "29-11-2019";
                    nameClient = "Bro";
                    proj = mulai.searchProject(project1);
                    Client c2 = mulai.searchClient(nameClient);
                    if(c2 != null){
                        mulai.inputProjectToClient(c2, project1, dl);
                    }
                    break;
                case 9 :
                    nameManager = "Udin";
                    divisi = "mining";
                    phoneManager = "085";
                    project1 = "Proyek 1";
                    Manager m2 = mulai.searchManager("Manager-1");
                    proj = mulai.searchProject(project1);
                    if(proj != null){
                        mulai.inputManagerToProject(m2, proj);
                    }
                    break;
                case 10 :
                    String ProgId = "Programmer-1";
                    String newProgName = "Riz";
                    mulai.editProgrammer(ProgId, newProgName);
                    break;
                case 11 :
                    String newId = "Manager-1";
                    String newManagerName = "Ujang";
                    String newDivisi = "Programming";
                    String newPhone = "0812";
                    mulai.editManager(newId, newManagerName, newDivisi, newPhone);
                    break;
                case 12 :
                    String newProjName = "Proyek 2";
                    String newDl = "30-11-2019";
                    mulai.editProject(newProjName, newDl);
                    break;
                case 13 :
                    String newClientName = "Coy";
                    mulai.editClient(newClientName);
                    break;
                case 14 :
                    String namaProject = "Proyek 1";
                    mulai.deleteProject(namaProject);
                    break;
                case 15 :
                    mulai.deleteTask("F0001", "GLB");
                    break;
                case 16 :
                    
                    break;
            }
        }
    }
}
