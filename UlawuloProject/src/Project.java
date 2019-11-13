import java.util.*;
public class Project {
    private Manager manager;
    private String nameProject;
    private Programmer[] listProgrammer;
    private int numProgrammer = 0;
    private int maxProgrammer;
    private Task[] listTask;
    private int numTask = 0;

    public Project(Manager manager, String nameProject, int maxProgrammer) {
        setManager(manager);
        setNameProject(nameProject);
        setMaxProgrammer(maxProgrammer);
        this.listProgrammer = new Programmer[maxProgrammer];
       
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

    public int getNumProgrammer() {
        return numProgrammer;
    }

    public void setNumProgrammer(int numProgrammer) {
        this.numProgrammer = numProgrammer;
    }

    public int getMaxProgrammer() {
        return maxProgrammer;
    }

    public void setMaxProgrammer(int maxProgrammer) {
        this.maxProgrammer = maxProgrammer;
    }
    
    public void addProgrammer(Programmer programmer){
        if(numProgrammer < maxProgrammer){
            this.listProgrammer[numProgrammer] = programmer;
            numProgrammer++;
        }
    }
    
    public void createTask(Task t){
        if(numTask < maxProgrammer){
            this.listTask[numTask] = t;
            numTask++;
        }
    }
    
    public void display(){
        System.out.println("========= PROJECT : "+getNameProject()+" =========");
        getManager().display();
        for (int i = 0; i < getNumProgrammer(); i++) {
            listProgrammer[i].display();
        }

    }
    
}
