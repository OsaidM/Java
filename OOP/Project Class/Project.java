import java.util.*;  

public class Project{
    private String name;
    private String description;
    public Project(String name,String description)
    {
       this.name = name;
       this.description = description;
//        System.out.println(this.name + " : " +this.description );
    }
    
    public String getName(){
        return name;
    }
    
    public String getDescription(){
        return description;
    }
}


