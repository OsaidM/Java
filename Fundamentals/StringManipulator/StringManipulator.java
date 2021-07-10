public class StringManipulator{
    String concatSubstring(String q, int y, int z, String b){
        String sbtr = q.substring(y,z);
        String result = sbtr.concat(b);
        return result;
    }
    
    Integer getIndexOrNull(String x, char y){
        int a = x.indexOf(y);
        if(a > 0){
            return a;
        }else{
            return null;
        }
    }
    
    Integer getIndexOrNull(String x, int y){
        int a = x.indexOf("in",y);
        
            return a;
        
    }
    
    
    String trimAndConcat(String a, String b){
        String str1 = a.trim();
        String str2 = b.trim();
        String str = str1.concat(str2);
        return str;
    }
    
    public static void main(String[] args){
        StringManipulator obj = new StringManipulator();
        
        System.out.println(obj.trimAndConcat("    Hello     ","     World    "));
        
        System.out.println(obj.getIndexOrNull("Coding", 'd'));
        
        System.out.println(obj.getIndexOrNull("Codingcoding", 2));
        
        System.out.println(obj.concatSubstring("Hello", 1, 2, "world"));
    }
}
