public class Pythagorean {
        static void calculateHypotenuse(int legA, int legB) {
        // the hypotenuse is the side across from the right angle. 
        // calculate the value of c given legA and legB
        double four = 4.0;
        
        double a = Math.sqrt(legA);
        double b = Math.sqrt(legB);
        double c = a + b;
        c = Math.sqrt(c);
        // calling the sqrt static method of the Math class
        System.out.println(c);
        
        
    }
    public static void main(String[]args){
        
        calculateHypotenuse(2,4);
    }
    
    
   
    
}

