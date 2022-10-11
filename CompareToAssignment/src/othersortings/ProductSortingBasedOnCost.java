package othersortings;
	import java.util.Comparator;

import p1.Product;

	public class ProductSortingBasedOnCost implements Comparator<Product> {

		@Override
		public int compare(Product p1, Product p2) {
			return (int)(p1.getCost()-p2.getCost());
		}

		
	}
