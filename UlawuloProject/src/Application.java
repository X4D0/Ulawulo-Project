import java.util.*;
public class Application {
    private List<Manager> Manager = new ArrayList<>();
    private List<Programmer> Programmer = new ArrayList<>();
    private List<Person> Person = new ArrayList<>();
    private List<Client> Client = new ArrayList<>();
    private List<Project> Project = new ArrayList<>();
    
    /* SEARCH */
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
    
    public void viewProject(String nama){
        if(searchProject(nama)==null){
            System.out.println("Project not Found");
        }else{
            System.out.println("Nama Project : "+searchProject(nama).getNameProject());
            System.out.println("==========================================================");
        }
    }
    public void viewProjectFull(String nama){
        if(searchProject(nama)==null){
            System.out.println("Project not Found");
        }else{
            System.out.println("Nama Project : "+searchProject(nama).getNameProject());
            System.out.println("\tNama Manager : "+searchProject(nama).getManager().getNameManager());
            System.out.println("\tTugas : ");
            for (int i = 0; i < searchProject(nama).sizeTask(); i++) {
                System.out.println("\t\t- "+searchProject(nama).getTask(i).getDescTask());
            }
            System.out.println("\tProgrammer : ");
            for (int i = 0; i < searchProject(nama).sizeProgrammer(); i++) {
                System.out.println("\t\t- "+searchProject(nama).getProgrammer(i));
            }
            System.out.println("==========================================================");
        }
    }
    
    public void viewProgrammer(String id){
        Programmer p = searchProgrammer(id);
        if(p==null){
            System.out.println("Programmer not Found");
        }else{
            System.out.println("ID Programmer : "+p.getIdProgrammer());
            System.out.println("Nama : "+p.getNameProgrammer());
            System.out.println("Tugas : "+p.getTask().getDescTask());
            System.out.println("==========================================================");    
        }
    }
    
    public void viewManager(String id){
        Manager m = searchManager(id);
        if(m==null){
            System.out.println("Manager not Found");
        }else{
            System.out.println("ID Manager : "+m.getIdManager());
            System.out.println("Nama : "+m.getNameManager());
            System.out.println("Phone : "+m.getPhoneManager());
            System.out.println("Divisi : "+m.getDivisi());
            System.out.println("==========================================================");
        }
    }
    
    public void viewClient(String nameClient){
        if(searchClient(nameClient)==null){
            System.out.println("Client not Found");
        }else{
            System.out.println("CLIENT : "+searchClient(nameClient).getNameClient());
            System.out.println("==========================================================");
        }
    }
    
    /* ADD */
    public void addClient(String nameClient){
        Client c = new Client(nameClient);
        Client.add(c);
    }
    
    public void addProgrammer(String nameProgrammer){
        Programmer p = new Programmer(nameProgrammer);
        Programmer.add(p);
        Person.add(p);
    }
    
    public void addManager(String nameManager, String divisi, String phone){
        Manager m = new Manager(nameManager,divisi,phone);
        Manager.add(m);
        Person.add(m);
    }
    
    public void inputClient(String nama){
        Client c = new Client(nama);
        Client.add(c);
    }
    
    public void inputProgrammer(String nama){
        Programmer p1 = new Programmer(nama);
        Programmer.add(p1);
        Person.add(p1);
    }
    public void inputManager(String nama, String divisi, String hp){
        Manager m = new Manager(nama,divisi,hp);
        Manager.add(m);
        Person.add(m);
    }
    
    /* DELETE */
    public void deleteProgrammer(String id) {
        Programmer p1 = searchProgrammer(id);
        if (p1 != null) {
            Programmer.remove(p1);
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
            Client.remove(p1);
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
    public Client getClient(int i) {
        return Client.get(i);
    }
    
    /* EDIT */
    public void editProgrammer(String idProgrammer, String nameProgammer){
        Programmer p1 = searchProgrammer(idProgrammer);
        if (p1 != null){
            for (int i = 0; i < Programmer.size(); i++) {
                if(Programmer.get(i).equals(p1)){
                    Programmer.get(i).setIdProgrammer(idProgrammer);
                    Programmer.get(i).setNameProgrammer(nameProgammer);
                }
            }
            Programmer.set(Programmer.indexOf(p1), p1);
        }
        else{
            System.out.println("Programmer not Found");
        }
    }
    public void editManager(String idManager, String nameManager, String divisi, String phoneManager){
        Manager m1 = searchManager(idManager);
        if (m1 != null){
            for (int i = 0; i < Manager.size(); i++) {
                if(Manager.get(i).equals(m1)){
                    Manager.get(i).setIdManager(idManager);
                    Manager.get(i).setNameManager(nameManager);
                    Manager.get(i).setDivisi(divisi);
                    Manager.get(i).setPhoneManager(phoneManager);
                }
            }
        }
        else{
            System.out.println("Manager not Found");
        }
    }
    public void editProject(String nameProject, String deadline){
        Project p1 = searchProject(nameProject);
        if (p1 != null){
            for (int i = 0; i < Project.size(); i++) {
                if(Project.get(i).equals(p1)){
                    Project.get(i).setNameProject(nameProject);
                    Project.get(i).setDeadline(deadline);
                }
            }
        }
        else{
            System.out.println("Project not Found");
        }
    }
    public void editClient(String nameClient){
        Client c1 = searchClient(nameClient);
        if(c1 != null){
            for (int i = 0; i < Client.size(); i++) {
                if(Client.get(i).equals(c1)){
                    Client.get(i).setNameClient(nameClient);
                }
            }
        }
        else {
            System.out.println("Client not Found");
        }
    }
    
    /* toString */
    public String toStringManager(String nama) {
        if (searchManager(nama) == null) {
            return "Manager not Found";
        } else {
            return "ID Manager : "+searchManager(nama).getIdManager()+"\nNama Manager\t: " + searchManager(nama).getNameManager() 
                    + "\nDivisi\t: " + searchManager(nama).getDivisi() + "\nPhone \t: " + searchManager(nama).getPhoneManager();
        }
    }
    
    public String toStringProgrammer(String nama) {
        if (searchProgrammer(nama) == null) {
            return "Programmer not Found";
        } else {
            return "ID Programmer : "+searchProgrammer(nama).getIdProgrammer()+"\nNama Programmer\t: " + searchProgrammer(nama).getNameProgrammer() 
                    + "\nTugas\t: " + searchProgrammer(nama).getTask().getDescTask();
        }
    }
    
    public String[] getProjectListId(){
        String[] listId = new String[Project.size()];
        for (int i = 0; i < Project.size(); i++) {
            listId[i] = Project.get(i).getNameProject();
        }
        return listId;
    }
}
