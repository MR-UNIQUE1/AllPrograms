
package advjava.stringmanuplation;

public class Case2 {
	public Case2 (String s ) {
		
	}
	public static void main(String[] args) {
		Case2 t1 = new Case2("ratan");
		Case2 t2 = new Case2("ratan");
		System.out.println(t1.equals(t2));  
		
		//String class Overriding equals() : Data Comparison 
		String str1 = "anu";	
		String str2 = "anu";
		System.out.println(str1.equals(str2));  
		
		String s1 = new String("sravya");
		String s2 = new String("sravya");
		System.out.println(s1.equals(s2));		
	
		//StringBuffer there is no equals() method So it uses Object class equals() reference-comparison
		StringBuffer sb1 = new StringBuffer("durga");
		StringBuffer sb2 = new StringBuffer("durga");		
		System.out.println(sb1.equals(sb2)); 	 
	}
}
