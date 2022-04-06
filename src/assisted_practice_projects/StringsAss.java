package assisted_practice_projects;

public class StringsAss {
	public static void main(String[] args) {
		String s="Java Started ";
		StringBuffer b=new StringBuffer(s);
		b.append("Phase1");
		System.out.println(b);
		b.delete(2, 5);
		System.out.println(b);
		b.replace(5, 9, "Selenium");
		System.out.println(b);
		b.insert(11, "language");
		System.out.println(b);
		b.reverse();
		System.out.println(b);
		System.out.println(b.charAt(7));
		String str="Hello";
        StringBuilder sbl = new StringBuilder(str); 
        sbl.append("World"); 
        System.out.println("String to StringBuilder");
        System.out.println(sbl);    
        sbl.delete(2, 5);
		System.out.println(sbl);
		sbl.replace(0, 7, "welcome");
		System.out.println(sbl);
		sbl.insert(0, "humans");
		System.out.println(sbl);
		sbl.reverse();
		System.out.println(sbl);
		System.out.println(b.charAt(7));
	}

}
