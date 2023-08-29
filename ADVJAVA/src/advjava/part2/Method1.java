package advjava.part2;
public class Method1 {
	void test (int a , int b) {
		int add  ;
		 add = a +b ;
		System.out.println(add);
	}
	void test1 () {
		System.out.println("Good morning sunil ");
	}
	static void courseInfo(String Name,long mobileNo,String cName) {
		if (cName.equalsIgnoreCase("java")) {
			System.out.println("Hii "+Name+" Core java by Mr ratan and fee 6000");
		}
		else if (cName.equalsIgnoreCase("python")) {
			System.out.println("Hii "+Name+"Python by Mr ratan and fee 8000 ");
		}
		else if (cName.equalsIgnoreCase("c")) {
			System.out.println("Hii"+Name +"This course are not available in our faculty");
		}
		else {
			System.out.println("Hii "+Name+"Choose another course");
		}
	}	
	static void test3(char grade, String name ) {
		String section = "I";
		String section1 = "II";
		String section2 = "III";
if (grade=='A') {
	System.out.println("Hii "+name+"\nYour grade is "+grade+"\nGo to section   :-"+section);
} else if(grade == 'B'){
	System.out.println("Hii "+name +"\n Your grade is "+grade +"\n Go to section   :-"+section1);
}
else if (grade == 'C') {
	System.out.println("Hii "+name +"\n your grade is "+grade +"\n go to section   :-"+section2);
}else {
	System.out.println("Hii "+name +"\n plz waiting for next phase selection ");
}
	}
}
class TestClient  {
	public static void main(String[] args) {
		Method1 m = new Method1();
		m.test1();
		m.test(3,7 );	
		Method1.courseInfo("sunil", 7735688331l, "java");
		Method1.test3('B', "Sunil");
	}
}