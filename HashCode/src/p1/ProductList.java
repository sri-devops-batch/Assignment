package p1;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
public class ProductList {

	public static void main(String[] args) {
		ProductList pl=new ProductList();
		Product p1=new Product("rice","home appliances",400,4,LocalDate.of(2020, 11, 8));
	    Product p2=new Product("dal","home appliances",200,3,LocalDate.of(2020, 12, 8));
		Product p3=new Product("books","materials",500,4,LocalDate.of(2020, 10, 8));
	    Product p4=new Product("mobile","Accesories",10000,2,LocalDate.of(2020, 9, 8));
		Product p5=new Product("watches","Accesories",1000,1,LocalDate.of(2020, 8, 8));
		Product p6=new Product("fridge","Accesories",20000,5,LocalDate.of(2020, 7, 8));
		Product p7=new Product("books","materials",600,6,LocalDate.of(2020, 6, 8));
	    Product p8=new Product("headphones","Accesories",400,1,LocalDate.of(2020, 5, 8));
		Product p9=new Product("bangles","Accesories",400,44,LocalDate.of(2020, 4, 8));
	    Product p10=new Product("vessels","home appliances",400,4,LocalDate.of(2020, 2, 8));
	
	Set<Product>productset = new HashSet<>();
		productset.add(p1);
		productset.add(p2);
		productset.add(p3);
		productset.add(p4);
		productset.add(p5);
		productset.add(p6);
		productset.add(p7);
		productset.add(p8);
		productset.add(p9);
		productset.add(p10);
	pl.printSet(productset);
	}

	private void printSet(Set<Product> productset) {
		for (Product p : productset) {
			System.out.println(p);
		}
		
	}
	
	
	
}