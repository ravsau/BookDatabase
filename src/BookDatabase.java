
public  class BookDatabase {


	private String sku;
	private String title;
	private String author;
	private String description;
	private double price;

	private Book book1=new Book("Java1001",	"Head First Java","Kathy Sierra and Bert Bates",
			"Easy to read Java workbook",	47.50);
	private Book book2=new Book("Java1002",	"Thinking in Java", "Bruce Eckel", "Details about Java under the hood"
			,	20.00);
	private Book book3=new Book("Orcl1003",	"OCP: Oracle Certified Professional Java SE","Jeanne Boyarsky",
			"Everything you need to know in one place",	45.00);
	private Book book4=new Book("Python1004",	"Automate the Boring Stuff with Python","Al Sweigart",
			"Fun with Python",	10.50);
	private Book book5=new Book("Zombie1005",	"The Maker's Guide to the Zombie Apocalypse","Simon Monk",
			"Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi",	16.50);
	private Book book6=new Book("Rasp1006",	"Raspberry Pi Projects for the Evil Genius","Donald Norris",
			"A dozen fiendishly fun projects for the Raspberry Pi!",	14.75);


	public String returnBook(String sku){

		String bookSku=sku;
	
		
		String choice="";
		
		


		switch(sku){

		case "JAVA1001":
			choice=book1.toString();
			break;
		case "JAVA1002":
			choice=book2.toString();
			break;
		case "ORCL1003":
			choice=book3.toString();
			break;
		case "PYTHON1004":
			choice=book4.toString();
			break;
		case "ZOMBIE1005":
			choice=book5.toString();
			break;
		case "RASP1006":
			choice=book6.toString();
			break;
		default:
			choice="That SKU doesn't exist!";
			break;
		}

		return choice;


	}

	public String returnInfo(){
		return (this.sku+" "+this.title+" "+this.author+" "+this.description+" "+this.price);
	}
}









