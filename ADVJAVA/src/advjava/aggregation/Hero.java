package advjava.aggregation;

public class Hero {
	public String name ;
	public int age ;
	public double height ;
	public Adress addr ;
	public Movie mov ;
	public Hero(String name, int age, double height, Adress addr, Movie mov) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.addr = addr;
		this.mov = mov;
	}
	void res () {
		System.out.println("Heros name is  :-  "+name );
		System.out.println("Heros age is  :-  "+age );
		System.out.println("Heros height is  :-  "+height );
		System.out.println("Heros addres is  :-  "+addr.dno+" "+addr.state+" "+addr.street );
		System.out.println("Heros name is  :-  "+mov.bolM+" "+mov.holl );		
	}
	public static void main(String[] args) {
		Adress u = new Adress(222, "Amalapada", "Odisha");
		Movie e = new Movie(34 , "Hollywood");
		Hero s = new  Hero("Sunil", 21, 5.7, u, e);
		s.res();
		System.out.println("******************");
		Hero  g = new Hero("Sanjit ", 19, 5.8, new Adress(333, "Sriram Colony", "Hydrabad"), new Movie(200, "Hollywood"));
		g.res();
	}
	
	
	
}
