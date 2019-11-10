public class Manager extends Person {
    private static int idManager;
    private static String nameManager;
    private static String divisi;
    private static String phoneManager;

    public Manager(int idManager, String nameManager, String divisi, String phoneManager) {
        setIdManager(idManager);
        setNameManager(nameManager);
        setDivisi(divisi);
        setPhoneManager(phoneManager);
    }
    
    public static int getIdManager(){
        return idManager;
    }
    
    public void setIdManager(int idManager){
        this.idManager = idManager;
    }

    public static String getNameManager() {
        return nameManager;
    }

    public void setNameManager(String nameManager) {
        this.nameManager = nameManager;
    }

    public static String getDivisi() {
        return divisi;
    }

    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }

    public static String getPhoneManager() {
        return phoneManager;
    }

    public void setPhoneManager(String phoneManager) {
        this.phoneManager = phoneManager;
    }
    
    public static void display(){
        System.out.println("====================MANAGER PROJECT=======================");
        System.out.println("Nama Manager : "+getNameManager());
        System.out.println("ID Manager   : "+getIdManager());
        System.out.println("Nomor Telpon : "+getPhoneManager());
        System.out.println("Divisi       : "+getDivisi());
    }
}
