package advjava.collections.list.readdata;

import java.util.ArrayList;
import java.util.Iterator;

public class BookAssignment {

	public static void main(String[] args) {
		ArrayList<Book> objs = new ArrayList<Book>();
		objs.add(new Book(111, "java", "james gosling"));
		objs.add(new Book(222, "Sunil", "mind your own busigness"));
		objs.add(new Book(333, "Ranu", "My home"));
		objs.add(new Book(444, "savni", "Surgery"));
		
		 // Read the data using for-each loop
		System.out.println("*********************");
		for (Book t  : objs) {
			System.out.println(t.id+" "+ t.name+ " "+ t.author);
		}
		System.out.println("*********************");
		 // Read the data using get method
			Book b = objs.get(2);
			System.out.println(b.id+" "+b.name+ " "+b.author);
			System.out.println("*********************");
		 // Read the data using iterator generics 
			Iterator<Book>e = objs.iterator();
			while (e.hasNext()) {
			Book r =	(Book)e.next();
			System.out.println(r.id+ " "+r.name+" "+r.author);
			}
			System.out.println("*********************");
		 // Read the data using for-each method
			objs.forEach( books -> System.out.println(books.id +" "+books.name +" "+books.author) );
			System.out.println("*********************");
		 // Read the data using referance 
			objs.forEach(System.out::println);
	}

}
