public class wordCounter {
  
    static int countWords(String str){
        String[] words = str.split(" ");
        return words.length;
        // if(str.length() == 0) return 0;
        // int count = 1;
        // for(int i = 0; i < str.length(); i++){
        //     if(str.charAt(i) == ' '){
        //         count++;
        //     }
        // }
        // return count;
    }
    public static void main(String[] args) {
        String str = "Hello world this is ChatGPT"; // Example input
        int wordCount = countWords(str); // Call the method
        System.out.println("Total words: " + wordCount); // Output the result
    }
}
