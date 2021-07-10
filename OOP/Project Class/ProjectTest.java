import java.util.*;  

public class ProjectTest{
    
    public static void main(String[] args)
    {
        Project elevatorPitch = new Project("abc","defg");
        Project elevatorPitch1 = new Project("hig","klm");
        Project elevatorPitch2 = new Project("nop","qrs");
        
        System.out.println(elevatorPitch.getName());
        System.out.println(elevatorPitch.getDescription());
    }
}
