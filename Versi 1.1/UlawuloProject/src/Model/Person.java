package Model;

public abstract class Person {
    private static String nama;
    private static String id;
    
    public Person(String nama, String id){
        this.nama = nama;
        this.id = id;
    }

    public static String getName() {
        return nama;
    }

    public void setName(String nama) {
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
}
