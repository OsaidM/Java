import java.util.Set; 
import java.util.HashMap;
public class Hashmatique{
    
    public static void main(String [] args){
        HashMap<String, String> newHash = new HashMap<String,String>();
        
        newHash.put("starset", "mydemons");
        newHash.put("ashesremain", "onmyown");
        newHash.put("skillet1", "hero");
        newHash.put("skillet2", "awakealive");
        String n = newHash.get("skillet1");
        System.out.println(n + " <==");
        Set<String> keys = newHash.keySet();
        for(String key:keys){
            System.out.println(key + " : " + newHash.get(key));
        
        }
        System.out.println(newHash.values());
        
        
    }
}
