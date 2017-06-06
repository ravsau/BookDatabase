
public class Book {


	private String title; 
	private String author; 
	private String info; 
	private double price;
	private Boolean isInStock;
	private String sku;
	private int noInStock;
	




	public Book(){


	}
	
	public Book(String sku,String title, String author, String info, double price){
		this.title=title; 
		this.author=author;; 
		this.info=info; 
		this.price=price;
		
		this.sku=sku;
		
		
	}

	public Book(String sku,String title, String author, String info, double price, Boolean isInStock,int noInStock){

		this.title=title; 
		this.author=author;; 
		this.info=info; 
		this.price=price;
		this.isInStock=isInStock;
		this.sku=sku;
		this.noInStock=noInStock;
		

	}

	public void setTitle(String title){

		this.title=title;

	}

	public String getTitle(){

		return title;

	}

	public void setAuthor(String author){

		this.author=author;

	}

	public String getAuthor(){

		return author;

	}

	public void setInfo(String info){

		this.info=info;

	}

	public String getInfo(){

		return info;

	}

	public void setPrice(double price){

		this.price=price;

	}

	public double getPrice(){

		return price;

	}

	public void setAvailable(Boolean is){

		this.isInStock=is;

	}
	
	

	public Boolean getAvailable(){

		return isInStock;

	}
	public String getSku(){

		return this.sku;

	}
	
	public void setSku(String sku){
		
		this.sku=sku;
	}
	public void setnoInStock(int num){
		
		noInStock=num;
	}
	public int getStock(){

		return this.noInStock;

	}
	
	
	public String PrintPrice(String sku, int bookNum){
		
		String response="";
		sku=sku.toUpperCase();
		
		if (sku.equals("TTC") && (bookNum<=getStock())){

			response=("Your cost is $" + bookNum*getPrice()+ " for "+ bookNum +" books.");

			


		}

		else if(sku.equals("SID") && (bookNum<=getStock())){

			 response=("Your cost is $" + bookNum*getPrice()+ " for "+ bookNum +" books.");

		


		}

		else if ((bookNum>getStock())||(bookNum>getStock())) {

			 response=("Sorry, we don't have that many books. ");
		}

		
		
		return response;
		
	}
	
	public String toString(){
		
		return (this.sku+" | "+" "+ this.title+" | "+this.author+" | "+this.info+" | "+ "$"+this.price);
	}



}

/*Create a project in Eclipse called BookApplication

Create a Book class that allows for Book title, author, description, price and isInStock variables

The Book class shall contain private member variables, a default constructor, an overloaded constructor 
and a method called getDisplayText() which prints the author, title and description.



The application shall also contain getters and setters for each private member variable.

Create another class called BookApp which contains the main method. In the main method you shall 
create an instance of a Book and print the Author, Title and Description.

 */