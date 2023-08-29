package advjava.part2;

public class Blocks3 {
	static
	{	System.out.println("Demo class static block");
	}
	void wish()
	{	System.out.println("Good morning");
	}
}


class Test2
{	@SuppressWarnings({ "rawtypes", "deprecation" })
public static void main(String[] args)throws Exception
	{	Class c = Class.forName("Blocks3");
		Blocks3 d = (Blocks3)c.newInstance();
		d.wish();
	}
}

