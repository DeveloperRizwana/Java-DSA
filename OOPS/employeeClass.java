public class employeeClass {
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String r){
         name = r;
    }
    public static void main(String[] args) {
        employeeClass rizu = new employeeClass();
        rizu.setName("Rizwana");
        rizu.salary = 10000;
        
        System.out.println("Salary of rizu is : " + rizu.getSalary());
        System.out.println(rizu.getName());
    }
}
