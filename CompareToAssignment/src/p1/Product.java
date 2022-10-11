package p1;

import java.time.LocalDate;

public  class Product implements Comparable<Product> {
  
	private String productName;
	private String category;
	private int cost;
	private int rating;
    private  LocalDate dateOfManufacturing;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String productName, String category, int cost, int rating, LocalDate dateOfManufacturing) {
		super();
		this.productName = productName;
		this.category = category;
		this.cost = cost;
		this.rating = rating;
		this.dateOfManufacturing = dateOfManufacturing;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public LocalDate getDateOfManufacturing() {
		return dateOfManufacturing;
	}

	public void setDateOfManufacturing(LocalDate dateOfManufacturing) {
		this.dateOfManufacturing = dateOfManufacturing;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", category=" + category+ ", cost=" + cost + ",rating="+rating+",LocalDate="+dateOfManufacturing+"]";
	}
	
	@Override
	public int hashCode() {
	
		return cost+rating+productName.length()+category.length()+3;
	}
	@Override
	public boolean equals(Object obj) {
		
		/* code to inform java , how to compare 10 products*/
		
		// type cast object to Product type 
		//System.out.println(" inside equals for Product :- "+id);
		
		if(obj instanceof Product)
		{
			// if its employee , then compare each property one by one 
			
			Product p = (Product) obj;
			
			boolean a = this.productName.equals(p.getProductName());
			boolean b = this.category == p.getCategory(); 
			boolean c = this.cost == p.getCost();
			boolean d=this.rating==p.getRating();
			boolean e=this.dateOfManufacturing==p.getDateOfManufacturing();
			return a && b && c && d && e;
			
		
		}
		else
		{
			return false; 
		}
}
	@Override
	public int compareTo(Product p) {
		
		return  p.getCost()-this.cost;
	}

	
	
}

