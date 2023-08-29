package advjava.part2;

public class Method3 {
	
	public double calculateBill (String pName,double price , int quantity) {
		double bill = price* quantity;
		return bill;
	}
	public static void courseInfo (String name , String cName ) {
		if (cName.equalsIgnoreCase("java")) {
			System.out.println("Hii"+name+":-   You are so luckey \n we also provide 90% discount on this course ");
			System.out.println("Java by ratan sir  with price 10000");
		} else {
			System.out.println("Sorry "+name + "This course is not available in our institude ");
		}
	}

	public static void main(String[] args) {
		Method3.courseInfo("Sunil", "Spring");
		System.out.println("***************************");
		
		Method3 s = new  Method3();
		double TotalBill = s.calculateBill("Grinder", 1400.00, 1);
		System.out.println("Total bill of this product is :-    "+TotalBill);

	}

}
