import java.util.*;
public class Application {
    public void editProgrammer(){
        
    }
    public static void main(String[] args) {
//        List<Manager> Manager = new ArrayList<>();
//        List<Programmer> Programmer = new ArrayList<>();
//        List<Project> Project = new ArrayList<>();
        List<Project> proyek = new ArrayList<>();
               
        Manager m1 = new Manager(001,"Udin Sedunia","Product Development","087751123");
        
        Project project = new Project(m1,"Building Tubes",5);
        
        Programmer p1 = new Programmer(4233,"Ray",4);
        Programmer p2 = new Programmer(0150,"Riz",4);
        Task t1 = new Task("Membuat Class");
        Task t2 = new Task("Membuat Driver");
        p1.addTask(t1);
        p2.addTask(t2);
        
        
        project.addProgrammer(p1);
        project.addProgrammer(p2);
        
        proyek.add(0,project);
        
        Project p;
        for (int i = 0; i < proyek.size(); i++) {
                p = (Project)proyek.get(i);
                p.display();
        }
        
//        
//        Scanner choice = new Scanner(System.in);
//        
//        int pilih = 1;
//        while (pilih != 0) {
//            System.out.println("\tProject Management");
//            System.out.println("1. Create Project");
//            System.out.println("2. Add Manager Project");
//            System.out.println("3. Add Programmer");
//            System.out.print("Cboice : ");
//            pilih = choice.nextInt();
//            switch (pilih) {
//                case 1: {
//                    System.out.println("Masukkan nama Project : ");
//                    
//                    System.out.println("Masukkan ");
//                }
//                case 2 : {
//                    System.out.print("Masukkan Nama Manager : ");
//                    String nameManager = choice.next();
//                    System.out.print("Masukkan ID Manager : ");
//                    int idManager = choice.nextInt();
//                    System.out.print("Masukkan Divisi : ");
//                    String divisi = choice.next();
//                    System.out.print("Masukkan Nomor Telepon : ");
//                    String phoneManager = choice.next();
//                    Manager m1 = new Manager(idManager, nameManager, divisi, phoneManager);
//                    Manager.add(m1);
//                    System.out.println();
//                }
//                case 3 : {
//                    
//                }
//            }            
//        }
    }
}
