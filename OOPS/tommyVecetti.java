public class tommyVecetti {

    public void hit(){
        System.out.println("Hitting the enemy");
    }

    public void run(){
        System.out.println("Running from the enemy");
    }

    public void fire(){
        System.out.println("Firing on the enemy");
    }

    public static void main(String[] args) {
        tommyVecetti player = new tommyVecetti();
        player.hit();
        player.run();
        player.fire();

    }
    
}
