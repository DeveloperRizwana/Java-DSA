public class rectangle1 {
    private int length;
    private int breadth;

    public rectangle1(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public rectangle1(){
        length = 5;
        breadth = 6;
    }

    public int getLenght(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
    public static void main(String[] args) {
        rectangle1 rectangle = new rectangle1();

        System.out.println("breadth of the rectangle : " + rectangle.getBreadth());
        System.out.println("length of the rectangle : " + rectangle.getLenght());
    }

    
}
