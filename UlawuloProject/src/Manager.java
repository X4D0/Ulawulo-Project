public class Manager extends Person {
    private int idManager;
    private String nameManager;
    private String divisi;
    private String phoneManager;

    public Manager(int idManager, String nameManager, String divisi, String phoneManager) {
        setIdManager(idManager);
        setNameManager(nameManager);
        setDivisi(divisi);
        setPhoneManager(phoneManager);
    }
    
    public int getIdManager(){
        return idManager;
    }
    
    public void setIdManager(int idManager){
        this.idManager = idManager;
    }

    public String getNameManager() {
        return nameManager;
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
