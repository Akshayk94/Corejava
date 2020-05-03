package products;

//IMPLEMENTATION LAYER
public class ElectronicsProducts implements Product
{
	String productName;
	Double productPrice;
	int productQty;
	
	public ElectronicsProducts(String productName, Double productPrice, int productQty)
	{
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQty = productQty;
		System.out.println("YOU HAVE SELECTED ELECTRONICS PRODUCTS");
	}

	@Override
	public void getProductBill() 
	{
		double totalAmt=productPrice*productQty;
		System.out.println("TOTAL BILL AMOUNT IS "+totalAmt);
	}

}
