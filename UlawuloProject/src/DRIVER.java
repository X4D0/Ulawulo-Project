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
//        List<Manager> Manager = new ArrayList<>();
//        List<Programmer> Programmer = new ArrayList<>();
//        List<Project> Project = new ArrayList<>();
        List<Project> Client = new ArrayList<>();
//               
//        Manager m1 = new Manager(001,"Udin Sedunia","Product Development","087751123");
//        
//        Project project = new Project(m1,"Building Tubes",5);
//        
//        Programmer p1 = new Programmer("4233","Ray",4);
//        Programmer p2 = new Programmer("0150","Riz",4);
//        Task t1 = new Task("Membuat Class");
//        Task t2 = new Task("Membuat Driver");
//        p1.addTask(t1);
//        p2.addTask(t2);
//        
//        
//        project.addProgrammer(p1);
//        project.addProgrammer(p2);
//        
//        Client.add(0,project);
//        
//        Project p;
//        for (int i = 0; i < proyek.size(); i++) {
//                p = (Project)proyek.get(i);
//                p.display();
//        }
        
        Application mulai = new Application();
        Scanner choice = new Scanner(System.in);
        Scanner input = new Scanner (System.in);
        
        int pilih = 1;
        while (pilih != 0) {
            System.out.println("\tProject Management");
            System.out.println("1. Create Project");
            System.out.println("2. Edit Project");
            System.out.println("3. Show Project");
            System.out.println("4. Delete Project");
            System.out.println("5. Add Manager");
            System.out.println("6. Edit Manager");
            System.out.println("7. Show Manager");
            System.out.println("8. Delete Manager");
            System.out.println("9. Add Programmer");
            System.out.println("10. Edit Programmer");
            System.out.println("11. Show Programmer");
            System.out.println("12. Delete Programmer");
            System.out.print("Choice : ");
            pilih = choice.nextInt();
            switch (pilih) {
                case 1: {
                    System.out.println("Nama Project : Proyek1");
                    String np = "Proyek1";
                    System.out.println("Masukkan TGL Deadline : 10 November 2019");
                    String dl = "10 November 2019";
                    System.out.println("Jumlah Maks. Programmer : 4");
                    int maks = 4;
                    mulai.addProject(np,maks,dl);
                    String x = input.next();
                    break;
                    }
                case 2 : {
                    break;
                }
                case 3 : {
                    System.out.println("VIEW PROJECTS : ");
                    for (int i = 0; i < mulai.getProjectSz(); i++) {
                        mulai.viewProject(mulai.getProject(i).getNameProject());
                    }
                    String x = input.next();
                    break;
                }
                case 4 : {
                    System.out.println("Project yang ingin dihapus : Proyek1");
                    String np = "Proyek1";
                    mulai.deleteProject(np);
                    String x = input.next();
                    break;
                }
                case 5 : {
                    System.out.println("Nama Manager : Asep Saepudin");
                    String nm = "Asep Saepudin";
                    System.out.println("Divisi : Mining");
                    String div = "Mining";
                    System.out.println("Nomor Handphone : 08123213");
                    String nope = "08123123";
                    mulai.addManager(nm,div,nope);
                    String x = input.next();
                    break;
                }
                case 6 : {
                    break;
                }
                case 7 : {
                    System.out.println("VIEW MANAGERS : ");
                    for (int i = 0; i < mulai.getManagerSz(); i++) {
                        mulai.viewManager(mulai.getManager(i).getNameManager());
                    }
                    String x = input.next();
                    break;
                }
                case 8 : {
                    System.out.println("Manager yang ingin dihapus : Asep Saepudin");
                    String np = "Asep Saepudin";
                    mulai.deleteManager(np);
                    String x = input.next();
                    break;
                }
                case 9 : {
                    System.out.println("Nama Programmer : Sehat Walafiat");
                    String np = "Sehat Walafiat";
                    System.out.println("Max Task : 3");
                    int max = 3;
                    mulai.addProgrammer(np,max);
                    String x = input.next();
                    break;
                }
                case 10 : {
                    break;
                }
                case 11 : {
                    System.out.println("VIEW PROGRAMMERS : ");
                    for (int i = 0; i < mulai.getProgrammerSz(); i++) {
                        mulai.viewProgrammer(mulai.getProgrammer(i).getNameProgrammer());
                    }
                    String x = input.next();
                    break;
                }
                case 12 : {
                    System.out.println("Programmer yang ingin dihapus : Sehat Walafiat");
                    String np = "Sehat Walafiat";
                    mulai.deleteProgrammer(np);
                    String x = input.next();
                    break;
                }
            }            
        }
    }
}
