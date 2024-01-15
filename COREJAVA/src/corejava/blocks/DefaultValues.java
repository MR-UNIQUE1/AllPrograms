package corejava.blocks;

public class DefaultValues {
	
	 int a ;
	 
	 DefaultValues(){
		 a= 9;
		 a=4048;
	 }
	 {
		 a=3038;		//default values are intialize using constructor and using instance block not both at a time .
		 
	 }

	public static void main(String[] args) {
		DefaultValues u = new DefaultValues() ;
		System.out.println(u.a);
		
	}

}
