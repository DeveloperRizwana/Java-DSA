import java.util.ArrayList;

public class lecture1Problems {
    public static void main(String[] args) {
        
	    // wrapper class
	    Integer in = Integer.valueOf(5);
		System.out.println(in);
		
		ArrayList<Integer> l1 = new ArrayList<>();
		// add new element 
		l1.add(4);
		l1.add(5);
		l1.add(6);
	    
	    // get an element 
	    System.out.println(l1.get(2));
	    
	    // print with for loop 
	    for(int i = 0; i < l1.size(); i++){
	         System.out.print(l1.get(i) + " ");
	    }
	    System.out.println();
	    // print diectly
	    System.out.println(l1);
	    
	    //adding element at some index i 
	    l1.add(1,23);
	    System.out.println(l1);
	    
	    //modifying element at index i 
	    l1.set(1,32);
	    System.out.println(l1);
	    
	    //removing an element at index i 
	    l1.remove(1);
	    System.out.println(l1); // original ArrayList
	    
	    // removing an element e 
	    l1.remove(Integer.valueOf(5));
	    System.out.println(l1);
	    
	    //checking an element if exists 
	    boolean ans = l1.contains(Integer.valueOf(6));
	    System.out.println(ans);
	    
	    // if you don't specify class, you can put anything 
	    ArrayList l = new ArrayList();
	    l.add("rizu");
	    l.add(1);
	    l.add(true);
	    System.out.println(l);
	}
}

    
    

