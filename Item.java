package practice1;

public class Item extends AbstractItemAPI {
	
	private String name;
	private int price;
	private String discription;
    public Item()
    {
    	super();
    	this.name = "null";
    	this.price = 0;
    	this.discription = "null";
    }
    
    public Item(String name, int price, String discription ) {
		super();
	    this.name = name;
	    this.price = price;
	    this.discription = discription;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}
}
