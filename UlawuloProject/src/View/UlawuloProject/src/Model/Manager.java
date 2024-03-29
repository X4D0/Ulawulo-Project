package Model;

public class Manager extends Person {
    private String idManager;
    private String nameManager;
    private String divisi;
    private String phoneManager;
    private static int mId = 1;

    public Manager(String nameManager, String divisi, String phoneManager) {
        super(nameManager, "Manager-"+mId);
        mId++;
        setDivisi(divisi);
        setPhoneManager(phoneManager);
    }
    
    public String getIdManager(){
        return super.getId();
    }
    
    public void setIdManager(String idManager){
        this.idManager = idManager;
    }

    public String getNameManager() {
        return super.getName();
    }

    public void setNameManager(String nameManager) {
        this.nameManager = nameManager;
    }

    public String getDivisi() {
        return divisi;
    }

    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }

    public String getPhoneManager() {
        return phoneManager;
    }

    public void setPhoneManager(String phoneManager) {
        this.phoneManager = phoneManager;
    }
    
    public void display(){
        System.out.println("\t<<<<<MANAGER>>>>>");
        System.out.println("Nama Manager : "+getNameManager());
        System.out.println("ID Manager   : "+getIdManager());
        System.out.println("Nomor Telpon : "+getPhoneManager());
        System.out.println("Divisi       : "+getDivisi());
    }
}
