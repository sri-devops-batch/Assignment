package p1;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import p1.Product;
import othersortings.ProductSortingBasedOnCost;
import othersortings.ProductSortingBasedOnProductName;
import othersortings.ProductSortingBasedOnRating;




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
	
	Set<Product>allproduct = new HashSet<>();
		allproduct.add(p1);
		allproduct.add(p2);
		allproduct.add(p3);
		allproduct.add(p4);
		allproduct.add(p5);
		allproduct.add(p6);
		allproduct.add(p7);
		allproduct.add(p8);
		allproduct.add(p9);
		allproduct.add(p10);
	
		
     pl.printCollection(allproduct," Print Set based on Default Sorting ");
		

		// ------------------------------------------------------

		 // in order to get the customized sorted output 
		// we should use Collections.sort();
		// collection.sort method takes list as input , but we have Set 
		// so convert set to list
		
		List<Product>  sortedProductByCost = new ArrayList<>(allproduct);
		// step1 : convertion of set to List
		// note : by providing set in the constructor of ArrayList , we can convert the set into list
		
		// provide list to Collections.sort() // NOTE :- Collections is the class in util package
		// https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html#sort(java.util.List)
		
		Collections.sort(sortedProductByCost, new ProductSortingBasedOnCost());
		
		// Note on sort method 
		// argument 1: list of data 
		// argument 2 : way of sorting , {means the object of SortedClass}
		
		pl.printCollection(sortedProductByCost, " Print Set based on cost ");
			
		// -------------------------------------------------------------------------------
		
		List<Product> sortedProductByRating = new ArrayList<>(allproduct);
		Collections.sort(sortedProductByRating,new ProductSortingBasedOnRating());
		pl.printCollection(sortedProductByRating, " Print List of product based on Rating");
		
		// -------------------------------------------------------------------------------
		
		List<Product> sortedProductByProductName = new ArrayList<>(allproduct);
		Collections.sort(sortedProductByProductName,new ProductSortingBasedOnProductName());
		pl.printCollection(sortedProductByProductName, " Print List of Product based on ProductName");
		
		
		
	}
	
	public void printCollection(Collection<Product> collection, String tagLine)
	{
		System.out.println(" \n\n ===============  "+tagLine+"   ==========================\n");
		for (Product p : collection) {
			System.out.println(p);
		}
	}

	}
	
	
	