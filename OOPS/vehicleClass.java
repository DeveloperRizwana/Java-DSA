public class vehicleClass {
    int wheel;
    boolean isElectric;
    String colour;

    public vehicleClass(int wheel, boolean isElectric, String colour){
        this.wheel = wheel;
        this.isElectric = isElectric;
        this.colour = colour;
    }

    public void print(){
        String electric;
        if(this.isElectric == true){
            electric = "an electric vehicle";
        } else {
            electric = "not electric vehicle";

        }
        System.out.println("I have " + this.wheel + " wheels ");
        System.out.println("I am " + electric);
        System.out.println("I am " + this.colour + " in color ");    
    }
}
