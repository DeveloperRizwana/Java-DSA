class Phone {

    public void showTime(){
        System.out.println("The time is 8'am ");
    }

    public void on(){
        System.out.println("Turning on phone.....");
    }
}
class SmartPhone extends Phone {

    public void music(){
        System.out.println("Playing music......");
    }

    @Override
    public void on(){
        System.out.println("Turning on smartphone..... ");
    }
}

public class dynamicMethodDispatch {
    public static void main(String[] args) {
       // Phone obj = new Phone(); // allowed
        //SmartPhone smobj = new SmartPhone();  // alloawed
        //obj.greet();
        //smobj.greet();

        Phone obj = new SmartPhone(); //it's allowed
        //SmartPhone smobj = new Phone(); // it's not allowed

        obj.showTime();
        obj.on();
        //obj.music(); // it's not allowed 
    }
    
}
