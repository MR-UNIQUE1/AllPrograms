package corejava.method;

public class MethodArgument {
	void good () {
		System.out.println("Good Morning Sunil");
	}
	void sum (int a , int b ) {
		int res ;
		res = a + b;
		System.out.println(res);
	}
	static void courseInfo (String yName,String course,long mob) {
		if (course.equalsIgnoreCase("java")) {
			System.out.println("hi...."+yName +"core java by Mr ratan and her fee is 6000");
		} else if (course.equalsIgnoreCase("python")) {
			System.out.println("hii...."+yName +"python by mr ratan and her fee is 3000 ");
		}else if (course.equalsIgnoreCase("spring Boot ")) {
			System.out.println("hii...."+yName + "Spring boot by mr ratan and fee if 4000");
		}else {
			System.out.println("hii.... "+yName+"This course is not available for your requirement ");
		}
	}
	static void personal (char grade , double sal, boolean status ) {
		System.out.println("your grade is ......"+grade+   "your salary is ..... "+sal  +"your status is ..."+ status );
	}

}
