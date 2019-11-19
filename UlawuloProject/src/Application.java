import java.util.*;
public class Application {
    List<Manager> Manager = new ArrayList<>();
    List<Programmer> Programmer = new ArrayList<>();
    
    public void inputProgrammer(Programmer p){
        Programmer.add(p);
    }

    public Programmer getProgrammer(int id) {
        return Programmer.get(id);
    }
    
    public void editProgrammer(int id){
        this.Programmer.set(id, getProgrammer(Programmer.size()));
        Programmer.remove(Programmer.size());
    }
    
}
