package assisted_practice_projects;

public class ArraysofString {
	public static void main(String[] args) {
		String[] strArray = { "abdulla", "sravs", "idris" };  
        boolean x = false; //initializing x to false  
        int in = 0; //declaration of index variable  
        String s = "sravs";  // String to be searched  
        // Iteration of the String Array  
        for (int i = 0; i < strArray.length; i++) {  
            if(s.equals(strArray[i])) {  
                in = i; x = true; break;  
            }  
        }  
        if(x)  
            System.out.println(s +" String is found at index "+in);  
        else  
            System.out.println(s +" String is not found in the array");  
    }  

}
