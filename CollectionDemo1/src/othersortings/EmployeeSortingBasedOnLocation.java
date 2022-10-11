package othersortings;

import java.util.Comparator;

import allLists.Employee;

public class EmployeeSortingBasedOnLocation implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getLocation().compareTo(o2.getLocation());
	}

	
}