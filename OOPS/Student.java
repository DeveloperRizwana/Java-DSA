public class Student {
    String name;
    int rol;
    private static int numberOfStudent; // class variable
    //  private int rol;
    double percent;
    final String schoolName = "KV"; // it's immutable

    public Student(){ // default constructor

    }
     
   public Student(String nm, int roll, double per){ // constructor
    name = nm;
    rol = roll;
    percent = per;
    numberOfStudent++;
   } 
   // used if we want to access a function in the class through just className.function
   public static int getNumberOfStudent(){ 
    return numberOfStudent;
   }
   public int getRno() { // getter
    return rol;
   } 
   public void setRno(int rno){ // setter 
    rol = rno;
   }
    
}
