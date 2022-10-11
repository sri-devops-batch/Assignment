package othersortings;

import java.util.Comparator;

import p1.Product;

public class ProductSortingBasedOnRating implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		return (int)(p1.getRating()-p2.getRating());
	}

	
}