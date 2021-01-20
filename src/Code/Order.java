package Code;

public class Order {
    	     
      	  private String type[] ;
	  private int quantity[];

    public Order( String[] products, int[] quantity) {
    
        this.type = products;
        this.quantity = quantity;
    }

 

    public String[] getType() {
        return type;
    }

    public int[] getQuantity() {
        return quantity;
    }
    

}
