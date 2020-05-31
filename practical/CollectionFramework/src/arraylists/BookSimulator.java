package arraylists;

import java.util.ArrayList;

public class BookSimulator
{
	public static void main(String[] args)
	{
		Book b1=new Book(101,"JAVA",450.25);
		
		Book b2=new Book(102,"J2EE",1500.45);
		
		Book b3=new Book(103,"SELENIUM",1000.15);
		
		ArrayList<Book> booklist=new ArrayList<Book>();
		booklist.add(b1);
		booklist.add(b2);
		booklist.add(b3);
		
		for(Book b:booklist)
		{
			System.out.println(b.bookId+"\t"+b.bookName+"\t"+b.bookPrice);
		}
	}
}
