import java.util.Scanner;

public class BookDatabaseApp {

	public static void main(String[] args) {
		
		//Currently there are 6 sku'S 'JAVA1001' 'JAVA1002' 'ORCL1003' 
		//'PYTHON1004' 'ZOMBIES1005','RASP1006'
		
		System.out.println("Enter the SKU of the book you're looking for");
		Scanner sc=new Scanner(System.in);
		
		String sku=sc.nextLine();
		sku=sku.toUpperCase();
		
		
		BookDatabase b = new BookDatabase();
		
	
	    
		System.out.println(b.returnBook(sku));
		
		

	}

}
