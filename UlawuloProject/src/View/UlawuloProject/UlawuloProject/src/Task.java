
public class Task {
    private String descTask;
    private int maxTugas;
    private Programmer[] pelaksana;
    private String status;
    private int maxPelaksana;
    
    public Task(String descTask, int maxPelaksana, String status){
        setDescTask(descTask);
        this.pelaksana = new Programmer[maxPelaksana];
        setStatus(status);
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
    
    public void setStatus(String status){
        if (status == "done") this.status = status;
        else this.status = "not done yet";
    }
    
    public void setPelaksana(Programmer pelaksana) {
        this.pelaksana[maxPelaksana] = pelaksana;
        maxPelaksana++;
    }
}
