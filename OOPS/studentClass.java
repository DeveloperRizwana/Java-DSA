public class studentClass {
  
   public static void change(Student s){
    s.name = "choti";
   }
    public static void main(String[] args) {
        Student s1 = new Student(); //declaration   student -> class name 
        s1.name = "Rizu";  
        // s1.rol = 01;
        s1.percent = 99.5;
        System.out.println("Result: " + s1.name);
        change(s1);
        System.out.println(s1.name);
        System.out.println(s1.schoolName);
        // s1.setRno(87);
        // System.out.println(s1.getRno());
        Student c1 = new Student("choti", 02, 98);
        System.out.println(c1.getNumberOfStudent());

        Student s2 = new Student("Rizu", 11, 99);
        System.out.println(s2.name);
        System.out.println(s2.rol);
        System.out.println(s2.percent);
        System.out.println(s2.getNumberOfStudent());

        Student c2 = new Student("Aahish", 03, 97);
        System.out.println(c2.getNumberOfStudent());
        System.out.println(Student.getNumberOfStudent());
    }    
    
}
