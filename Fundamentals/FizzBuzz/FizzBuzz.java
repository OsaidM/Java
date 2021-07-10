public class FizzBuzz {
    public String fizzBuzz(int number) {
        // fizzbuzz logic here
        String s = "";
        if( number %3 == 0 && number %5 != 0){
           s = "Fizz";
        }else if( number %5 == 0 && number %3 != 0){
           s = "Buzz";
        }else{
            s = "FizzBuzz";
        }
        return s ;
    }
    
    public static void main(String[] args){
        FizzBuzz obj = new FizzBuzz();
        
        String result = obj.fizzBuzz(15);
        System.out.println(result);
    }
}
 
