package JavaPractise;

public class ConceptArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String carpro[]= new String[3];
		
		carpro[0]="Prem";
		carpro[1]="Tripathi";
		carpro[2]="TCS";
		
		/*
		 * for(String s:carpro) { System.out.println(s); }
		 */

		
		int len=carpro.length;
		
		for(int i=0; i<len; i++)
		{
			System.out.println(carpro[i]);
		}
		
		
	}

}
