import java.util.*;

public class Task {
    private String descTask;
    private List<Programmer> listPelaksana;
    private String status;
    
    public Task(String descTask,String status){
        setDescTask(descTask);
        listPelaksana = new ArrayList<>();
        setStatus(status);
    }

    public String getDescTask() {
        return descTask;
    }

    public void setDescTask(String DescTask) {
        this.descTask = DescTask;
    }

    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status){
        if (status == "done") this.status = status;
        else this.status = "not done yet";
    }
    
    public void addPelaksana(Programmer programmer){
        listPelaksana.add(programmer);
    }
}
