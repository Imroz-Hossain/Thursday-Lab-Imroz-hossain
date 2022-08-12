package ArrayClass;
class Book{
	private int bookId;
	private String bookName;
	private double bookPrice;
	
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public Book(int bookId, String bookName, double bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [bookId=");
		builder.append(bookId);
		builder.append(", bookName=");
		builder.append(bookName);
		builder.append(", bookPrice=");
		builder.append(bookPrice);
		builder.append("]");
		return builder.toString();
	}
	
	
}

import java.util.Scanner;
public class BookMain {

	public static void main(String[] args) {
	
		int ch;
		Scanner sc=new Scanner(System.in);
		BookService bservice=new BookService();
		System.out.println("Welcome to book service system");
		do {
		System.out.println("\n1.create Book\n2.for get book details by id"
				+ "\n3.get all the book details\n4.Quit");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			
			bservice.createBook();
			break;
		case 2:
			BookService.SreachById();
			break;
		case 3:
			BookService.getAllBookDetails();
			break;
		case 4:
			System.exit(0);
			
		}
		System.out.println("Thanks for visit us");
		}while(true);
		
		
		
	}
}

import java.util.Scanner;

public class BookService {

	static Book book[]=new Book[10];
	static Scanner sc=new Scanner(System.in);
	static int index=0;
	//create Book method
		public void createBook()
		{
			int id;
			String bname;
			double price;
			System.out.println("enter Book Id: ");
			id=sc.nextInt();
			sc.nextLine();
			System.out.println("enter Book Name: ");
			bname=sc.nextLine();
			System.out.println();
			System.out.println("enter the price");
			price=sc.nextDouble();
			 book[index]=new Book(id,bname,price);
			 index++;
			 System.out.println("Book details add successfully");
		}
		//get all book details
		public static void getAllBookDetails()
		{
			for(int i=0;i<index;i++)
			{
				System.out.println("Book Id: "+book[i].getBookId());
				System.out.println("Book Name: "+book[i].getBookName());
				System.out.println("Book Price: "+book[i].getBookPrice());
				System.out.println("======================================================");
			}
		}
		
		//get book details based on id
		public static void SreachById()
		{
			System.out.println("Enter the Book Id: ");
			int sid=sc.nextInt();
			int i;
			for( i=0;i<index;i++)
			{
				if(book[i].getBookId()==sid)
				{
					System.out.println("Book Id: "+book[i].getBookId());
				System.out.println("Book Name: "+book[i].getBookName());
				System.out.println("Book Price: "+book[i].getBookPrice());
				System.out.println("======================================================");
				}
			}
			/*if(i==index)
				System.out.println("Book not found");*/
		}
		
	

}
public static void updateBookById() {
	boolean status=true;
	System.out.println("enter BookId to update book details: ");
	int id=sc.nextInt();
	for(int i=0;i<index;i++)
	{
		if(id==book[i].getBookId())
			System.out.println("enter the new book id: ");
		int bid=sc.nextInt();
		System.out.println("enter the new book Name: ");
		String bname=sc.nextLine();
		System.out.println("Enter new book price: ");
		double price=sc.nextDouble();
		book[i]=new Book(bid,bname,price);
		System.out.println("book has been updated successfully");
		status=true;
	}
	if(status==false)
	{
		System.out.println("Book id not found");
		System.out.println("=================================");
	}
}


