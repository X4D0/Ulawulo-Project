import java.util.*;
public class Programmer extends Person{
    private Task[] listTask;
    private int idProgrammer;
    private String nameProgrammer;
    private int numTask = 0;
    private int maxTask;

    public Task getTask(int x){
        return listTask[x];
    }

    public void addTask(Task listTask){
        if(numTask < maxTask){
            this.listTask[numTask] = listTask;
            numTask++;
        }
    }

    public int getNumTask() {
        return numTask;
    }

    public void setNumTask(int numTask) {
        this.numTask = numTask;
    }

    public int getMaxTask() {
        return maxTask;
    }

    public void setMaxTask(int maxTask) {
        this.maxTask = maxTask;
    }
    
    public String getNameProgrammer() {
        return nameProgrammer;
    }

    public void setNameProgrammer(String nameProgrammer) {
        this.nameProgrammer = nameProgrammer;
    }

    public int getIdProgrammer() {
        return idProgrammer;
    }

    public void setIdProgrammer(int idProgrammer) {
        this.idProgrammer = idProgrammer;
    }
    
    public Programmer(int idProgrammer, String nameProgrammer, int maxTask) {
        setIdProgrammer(idProgrammer);
        setNameProgrammer(nameProgrammer);
        listTask = new Task[maxTask];
        this.maxTask = maxTask;
    }
    
    public void display(){
        System.out.println("\n\t<<<<PROGRAMMER>>>>");
        System.out.println("Nama Programmer : "+getNameProgrammer());
        System.out.println("ID Programmer : "+getIdProgrammer());
        System.out.println("Tugas : ");
        for(int i = 0; i<getNumTask(); i++){
            System.out.println("\t"+(i+1)+". "+getTask(i).getDescTask());
        }
    }
    
}
