package assisted_practice_projects;


interface First 
{  
    default void show() 
    { 
        System.out.println("Default First"); 
    } 
} 
interface Second 
{  
    default void show() 
    { 
        System.out.println("Default Second"); 
    } 
}  
public class DaimondProblem20 implements First, Second {  
    public void show() 
    {  
        First.super.show(); 
        Second.super.show(); 
    } 
    public static void main(String args[]) 
    { 
    	DaimondProblem20 ob = new DaimondProblem20 (); 
        ob.show(); 
    } 
}
