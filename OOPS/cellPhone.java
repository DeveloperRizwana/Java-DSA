public class cellPhone {

   public void ring(){
    System.out.println("Ringing.....");
   }

   public void vibrate(){
    System.out.println("Vibrating .....");
   }

   public void callFriend(){
    System.out.println("Call Nusrat....");
   }

   public static void main(String[] args) {
    cellPhone phone = new cellPhone();
    phone.ring();
    phone.vibrate();
    phone.callFriend();
   }
}
