import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class PuzzleJava {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        
        Collections.shuffle(numbers);
        System.out.println(numbers); // [1, 5, 2, 4, 3]
        Collections.sort(numbers);
        System.out.println(numbers); // [1, 2, 3, 4, 5]
                
        Random r = new Random();
        System.out.println(r.nextInt()); // without bounds
        System.out.println(r.nextInt(5)); // with bounds 0 to 5
        
        PuzzleJava puzle = new PuzzleJava();
        
        puzle.arraySum(new int[] {3, 5, 1, 2, 7, 9, 8, 13, 25, 32});
        
        puzle.shuffleName(new String[] {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"});
        
        puzle.shuffleAlphabet(new String[] {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"});
        
        puzle.randomNumber();
        puzle.randomNumberSorted();
        puzle.randomString();
        puzle.randomStringTen();
    }
    
    public void arraySum(int [] x){
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        
        int sum = 0;
        for(int i=0; i < x.length; i++){
            sum += x[i];
        }
        System.out.println(sum);
    }
    
    public void shuffleName(String [] x){
        ArrayList<String> arr1 = new ArrayList<String>();
        ArrayList<String> arr2 = new ArrayList<String>();
        
        for(String i: x){
            System.out.println(i);
            if(i.length() > 5){
                arr1.add(i);
            }
        }
        
        for(String i: x){
            arr2.add(i);
        }
        
        Collections.shuffle(arr2);
        System.out.println(arr1);
        System.out.println(arr2);
    }
    
    public void shuffleAlphabet(String [] x){
        ArrayList<String> arr1 = new ArrayList<String>();
        for(String i: x){
            arr1.add(i);
        }
        Collections.shuffle(arr1);
        int last = arr1.size() -1;
        System.out.println(arr1.get(last));
        System.out.println(arr1.get(0));
        
    }
    
    public void randomNumber(){
    ArrayList<Integer> arr1 = new ArrayList<Integer>();
        int [] x = new int[5];
        Random rnd = new Random();
        for(int i =0; i < 10; i++){
            int n = rnd.nextInt(100 - 55 )+55;
            arr1.add(n);
        }
        System.out.println(arr1);
    }
    
    public void randomNumberSorted(){
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        Random rnd = new Random();
        for(int i =0; i < 10; i++){
            int n = rnd.nextInt(100 - 55 )+55;
            arr1.add(n);
        }
        Collections.sort(arr1);
        System.out.println(arr1);
    }
    
    public void randomString(){
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
         String newString = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Random rnd = new Random();
        while(newString.length() < 5 ){
            int n = rnd.nextInt(alphabet.length());
            char thisChar = alphabet.charAt(n);
            newString += thisChar;
        }
            
        System.out.println(newString);
    }
    
    
    public void randomStringTen(){
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Random rnd = new Random();
        String [] c = new String[10];
        for(int x =0; x< 10; x++){
            String newString = "";
            while(newString.length() < 5 ){
                int n = rnd.nextInt(alphabet.length());
                char thisChar = alphabet.charAt(n);
                newString += thisChar;
            }
            c[x] = newString;
        }
        ArrayList<String> arr = new ArrayList<String>();
        for(String s: c){
            arr.add(s);
        }
        System.out.println(arr);
    }
    
    
    
}
