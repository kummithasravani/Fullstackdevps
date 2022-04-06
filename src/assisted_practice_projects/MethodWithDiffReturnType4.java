package assisted_practice_projects;

public class MethodWithDiffReturnType4 {

	public int addition(int a,int b) {
		int c=a+b;
		return c;
	}
	public void area(int b,int h)
    {
         System.out.println("Area of Rectangle : "+(b*h));
    }
    public void area(int s) 
    {
         System.out.println("Area of Square : "+(s*s));
    }
	int val=150;
	int operation(int val) {
		val =val*10/100;
		return(val);
		}
	public static void main(String[] args) {
	MethodWithDiffReturnType4 b=new MethodWithDiffReturnType4();
		int ans= b.addition(9,5);
		System.out.println("Addition of two numbers="+ans);
		System.out.println("The value of the operation method="+b.val);
		b.area(5,9);
		b.area(6);
	}
}