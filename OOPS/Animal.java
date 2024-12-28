public class Animal {
    int leg;
    String color;
    boolean isPet;
    String sound;

    public int getLeg(){
        return leg;
    }
    public void setLeg(int leg){
        this.leg = leg;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getIsPet() {
        return isPet;
    }

    public void setIsPet(boolean isPet) {
        this.isPet = isPet;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
class Dog extends Animal {

    public Dog(int leg, String color, boolean isPet, String sound){
        this.leg = leg;
        this.color = color;
        this.isPet = isPet;
        this.sound = sound;
    }
    public void print(){
        String pet;
        if(this.isPet == true){
            pet = "a pet animal";
        } else {
            pet = "not a pet animal";

        }
        System.out.println("The dog is : " + pet);
        System.out.println("The dog has : " + this.leg + " legs");
        System.out.println("The color of the dog is : " + this.color);
        System.out.println("Sound of dog : " + this.sound);
    }    
    public static void main(String[] args) {
        Dog myDog = new Dog(4, "brown", true, "bark bark!");
        myDog.print();
    }
}
