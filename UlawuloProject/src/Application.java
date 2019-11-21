import java.util.*;
public class Application {
    private List<Manager> Manager = new ArrayList<>();
    private List<Programmer> Programmer = new ArrayList<>();
    private List<Person> Person = new ArrayList<>();
    private List<Client> Client = new ArrayList<>();
    private List<Project> Project = new ArrayList<>();
    
    /* SEARCH */
    public Programmer searchProgrammer(String id){
        int i = 0;
        while(i<Programmer.size()){
            if(!Programmer.get(i).getIdProgrammer().equals(id)){
                i++;
            }else{
                return Programmer.get(i);
            }
        }
        return null;
    }
    
    public Project searchProject(String nameProject){
        int i = 0;
        while(i<Project.size()){
            if(!Project.get(i).getNameProject().equals(nameProject)){
                i++;
            }else{
                return Project.get(i);
            }
        }
        return null;
    }
    
    public Manager searchManager(String id){
        int i = 0;
        while(i<Manager.size()){
            if(!Manager.get(i).getIdManager().equals(id)){
                i++;
            }else{
                return Manager.get(i);
            }
        }
        return null;
    }
    
    public Client searchClient(String nameClient){
        int i = 0;
        while(i<Client.size()){
            if(!Client.get(i).getNameClient().equals(nameClient)){
                i++;
            }else{
                return Client.get(i);
            }
        }
        return null;
    }
    
    /* VIEW */
    
    public void viewProject(String nameProject){
        if(searchProject(nameProject)==null){
            System.out.println("Project not Found");
        }else{
            searchProject(nameProject).display();
        }
    }
    
    public void viewProgrammer(String id){
        if(searchProgrammer(id)==null){
            System.out.println("Programmer not Found");
        }else{
            searchProgrammer(id).display();
        }
    }
    
    public void viewManager(String id){
        if(searchManager(id)==null){
            System.out.println("Manager not Found");
        }else{
            searchManager(id).display();
        }
    }
    
    public void viewClient(String nameClient){
        if(searchClient(nameClient)==null){
            System.out.println("Client not Found");
        }else{
            searchClient(nameClient).getNameClient();
        }
    }
    
    /* ADD */
    public void addClient(String nameClient){
        Client c = new Client(nameClient);
        Client.add(c);
    }
    
    public void addProgrammer(String nameProgrammer, int maxTask){
        Programmer p = new Programmer(nameProgrammer,maxTask);
        Programmer.add(p);
        Person.add(p);
    }
    
    public void addManager(String nameManager, String divisi, String phone){
        Manager m = new Manager(nameManager,divisi,phone);
        Manager.add(m);
        Person.add(m);
    }
    
    public void addProject(String nameProject, int maxProgrammer, String deadline){
        Project proyek = new Project(nameProject,maxProgrammer,deadline);
        Project.add(proyek);
    }
    
    public void insertProgrammer(Programmer p, Project proyek){
        Programmer p1 = searchProgrammer(p.getIdProgrammer());
        Project project = searchProject(proyek.getNameProject());
        if(p1 != null && project != null){
            project.addProgrammer(p1);
        }
    }
    
    public void insertManager(Manager m, Project proyek){
        Manager m1 = searchManager(m.getIdManager());
        Project project = searchProject(proyek.getNameProject());
        if(m1 != null && project != null){
            project.setManager(m1);
        }
    }
    
    /* DELETE */
    public void deleteProgrammer(String id) {
        Programmer p1 = searchProgrammer(id);
        if (p1 != null) {
            Programmer.remove(p1);
//            for (int i = 0; i < Project.size(); i++) {
//                if (Project.get(i).getProgrammer() == p1) {
//                    MataPelajaran m2 = new MataPelajaran("KOSONG", 0, 0);
//                    daftarKelas.get(i).addMapel(m2);
//                }
//            }
            System.out.println("Programmer Deleted");
        } else {
            System.out.println("Programmer not Found");
        }
    }
    
    public void deleteManager(String id){
        Manager m1 = searchManager(id);
        if(m1 != null){
            Manager.remove(m1);
            System.out.println("Manager Deleted");
        }else{
            System.out.println("Manager not Found");
        }
    }
    
    public void deleteProject(String nameProject){
        Project p1 = searchProject(nameProject);
        if(p1 != null){
            Project.remove(p1);
            System.out.println("Project Deleted");
        }else{
            System.out.println("Project not Found");
        }
    }
    
    /* getSize */
    public int getProgrammerSz(){
        return Programmer.size();
    }
    public int getManagerSz(){
        return Manager.size();
    }
    public int getProjectSz(){
        return Project.size();
    }
    
    /* GETTER */
    public Manager getManager(int i){
        return Manager.get(i);
    }
    public Programmer getProgrammer(int i){
        return Programmer.get(i);
    }
    public Project getProject(int i){
        return Project.get(i);
    }
//    public void editProgrammer(int id){
//        this.Programmer.set(id, getProgrammer(Programmer.size()));
//        Programmer.remove(Programmer.size());
//    }
    
}
