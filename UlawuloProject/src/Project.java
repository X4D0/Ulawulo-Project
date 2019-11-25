import java.util.*;
public class Project {
    private Manager manager;
    private String nameProject;
    private List<Programmer> listProgrammer;
    private List<Task> listTask;
    private String deadline;
    
    public Project(Manager manager, String nameP, String dl) {
        setManager(manager);
        setNameProject(nameP);
        this.listProgrammer = new ArrayList<>();
        this.deadline = deadline;
    }
    
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public String getNameProject() {
        return nameProject;
    }

    public void setNameProject(String nameProject) {
        this.nameProject = nameProject;
    }
    
    public void addProgrammer(Programmer programmer){
        listProgrammer.add(programmer);
    }
    
    public void createTask(String tugas, String status){
        Task task = new Task(tugas,status);
        listTask.add(task);
    }
    
    public Task getTask(int x){
        return listTask.get(x);
    }
    
    public Programmer searchProgrammer(String id){
        int i = 0;
        while(i<listProgrammer.size()){
            if(!listProgrammer.get(i).getIdProgrammer().equals(id)){
                i++;
            }else{
                return listProgrammer.get(i);
            }
        }
        return null;
    }
    
    public Task searchTask(String tugas){
        int i = 0;
        while(i<listTask.size()){
            if(!listTask.get(i).getDescTask().equals(tugas)){
                i++;
            }else{
                return listTask.get(i);
            }
        }
        return null;
    }
    
    public void removeTask(String tugas){
        Task t1 = searchTask(tugas);
        listTask.remove(t1);
    }
}
