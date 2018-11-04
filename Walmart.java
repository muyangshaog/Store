package practice1;
import java.util.ArrayList;
import java.util.List;

public class Walmart extends AbstractStoreAPI {
	
	private String name;
	private List<Item> items = new ArrayList<>();
	private List<Employee1> employees = new ArrayList<>() ;
    public Walmart()
    {
    	super();
    	this.name = "Walmart";
    	this.items = null;
    	//this.employees = null;
    }
    
    public Walmart(String name) {
		super();
	    this.name = name;
	    //items.add(item);
	    //employees.add(employee);
	}
    
    public void addItem(Item item) {
    	items.add(item);
    }
    
    public void addImployee(Employee1 employee) {
    	employees.add(employee);
    }


}
