import java.util.*;
public class Programmer extends Person{
    private Task Task;
    private String idProgrammer;
    private String nameProgrammer;
    private static int proId = 1;

    public Programmer(String nameProgrammer) {
        super(nameProgrammer,"Programmer-"+proId);
        proId++;
//        Task = new Task();
    }
    
    public Task getTask(){
        return Task;
    }
    
    public String getNameProgrammer() {
        return super.getName();
    }

    public void setNameProgrammer(String nameProgrammer) {
        this.nameProgrammer = nameProgrammer;
    }

    public String getIdProgrammer() {
        return super.getId();
    }

    public void setIdProgrammer(String idProgrammer) {
        this.idProgrammer = idProgrammer;
    }
    
}
