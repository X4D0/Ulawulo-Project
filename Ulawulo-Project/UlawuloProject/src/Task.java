
public class Task {
    private String descTask;
    private int maxTugas;
    private Programmer pelaksana;
    private String status;
    
    public Task(String descTask){
        setDescTask(descTask);
    }

    public String getDescTask() {
        return descTask;
    }

    public void setDescTask(String DescTask) {
        this.descTask = DescTask;
    }

    public int getMaxTugas() {
        return maxTugas;
    }

    public void setMaxTugas(int maxTugas) {
        this.maxTugas = maxTugas;
    }

    public String getStatus() {
        return status;
    }
    
    public void setStatus(){
        if (status == "done") this.status = status;
        else this.status = "not done yet";
    }
    
    public void setPelaksana(Programmer pelaksana) {
        this.pelaksana = pelaksana;
    }
    
    
}
