public class MyClass {
    
    private int UID;
    public int PID;
    private String userName;
  
    public MyClass(String userName){
      PID = 123;
      UID = 000;
      this.userName = userName;
    }

    public void setPID(int ID) {
      UID = ID;
    }
    
    public void getPID() {
        System.out.println("New ID: "+ UID);
    }
    
    public static void main(String args[]) {
      MyClass mc = new MyClass("peter");
      mc.setPID(444);
      mc.getPID();
    }
}
