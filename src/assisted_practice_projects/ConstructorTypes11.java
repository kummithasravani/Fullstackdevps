package assisted_practice_projects;

public class ConstructorTypes11 {
	int id;
	String name;
	ConstructorTypes11(){
		}
	void display() {
		System.out.println(id+" "+name);
		}
	ConstructorTypes11(int i,String n)
	{
	id=i;
	name=n;
	}
	public static void main(String[] args){
		ConstructorTypes11 a=new ConstructorTypes11(0,"null Constructor");
		ConstructorTypes11 b=new ConstructorTypes11();
		a.display();
		b.display();
		ConstructorTypes11 c=new ConstructorTypes11(1,"sravs :parameterized Constructor");
		ConstructorTypes11 d=new ConstructorTypes11(2,"idris");
		c.display();
		d.display();
	}

}
