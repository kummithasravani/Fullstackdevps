package assisted_practice_projects;

class My_Exception extends Exception{
	   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String str1;
	   My_Exception(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("MyException Occurred: "+str1) ;
	   }
	}
	class CustomExceptionHandle17 {
	   public static void main(String args[]){
		try{
			System.out.println("Starting of try block");
			// I'm throwing the custom exception using throw
			throw new My_Exception("This is My error Message");
		}
		catch(My_Exception exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
	   }
	}