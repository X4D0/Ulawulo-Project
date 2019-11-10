
public class Task {
    private String descTask;
    private int maxTugas;
    
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
    
    
}
