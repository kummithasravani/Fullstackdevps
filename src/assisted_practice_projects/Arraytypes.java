package assisted_practice_projects;

public class Arraytypes {
	public static void main(String[] args){
		
		System.out.println("Single-Dimensional Array :");
		int a[]={5,6,8,3};
		int b[]={9,2,5,3};
		int c[]=new int[4];
		for(int i=0;i<c.length;i++){
			c[i]=a[i]+b[i];
			 System.out.println(c[i]);
	    }
		
		System.out.println("Multi-Dimensional Array :");
		int d[][]={{1,2,3,4},{5,6,7,8}};
		int e[][]={{1,4,2,3},{5,6,7,8}};
		int f[][]=new int[2][2];
		for(int i=0;i<f.length;i++){
			for(int j=0;j<f.length;j++){
				f[i][j]=d[i][j]*e[i][j];
			System.out.print(f[i][j]+" ");
			}
		}
		}

}
