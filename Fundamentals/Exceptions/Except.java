import java.util.ArrayList;

public class Except{

    public static void main(String[] args){
        ArrayList<Object> nS = new ArrayList<Object>();
        nS.add("13");
        nS.add("hello World");
        nS.add(43);
        nS.add("Good Bye Love");
        
            for(int i =0; i < nS.size();i++){
            try{
                Integer castedValue = (Integer) nS.get(i);
                }catch(ClassCastException e){
                    System.out.println("Hey, uh, so, I ran out of gas..");
                }
                
            
        }
        
    }
} 
