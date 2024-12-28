public class employee {
    private int id;
    private String name;

    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
    public void setName(String s){
        name = s;
    }
    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        employee Rizu = new employee();
        Rizu.setId(12);
        System.out.println("Employee id is : " + Rizu.getId());

        Rizu.setName("Rizu");
        System.out.println("Employee name is : " + Rizu.getName());

    }
}
