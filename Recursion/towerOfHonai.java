public class towerOfHonai {
    static void printTowerOfHanoi(int n, char source, char auxiliary, char destination){
        if(n == 0) return;

        if(n == 1){
            System.out.println(source + "" + destination);
            return;
        }

        printTowerOfHanoi(n-1, source, destination, auxiliary);
        System.out.println(source + "" + destination);
        printTowerOfHanoi(n-1, auxiliary, source, destination);
    }
      public static void main(String[] args) {
        System.out.println("Tower of hanoi: ");
        int n = 1;
        printTowerOfHanoi(n, 'a', 'b', 'c');
    }
    
}
