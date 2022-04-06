package assisted_practice_projects;

public class AccessModifiers {
	void display1() { 
	       System.out.println("This is defalut access modifier"); 
	   } 
	private void display2() 
	  { 
	      System.out.println("This is private access modifier"); 
	  }
	protected void display3() 
	  { 
	      System.out.println("This is protected access modifier"); 
	  } 
	public void display4() 
	  { 
	      System.out.println("This is Public Access modifier"); 
	  } 
	public static void main(String[] args) {
	AccessModifiers obj = new AccessModifiers(); 		  
obj.display1(); 
obj.display2();
obj.display3();
obj.display4();
}

}
