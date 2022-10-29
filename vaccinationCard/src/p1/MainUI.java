package p1;

import java.time.LocalDate;

import org.hibernate.SessionFactory;

import net.sf.ehcache.hibernate.HibernateUtil;

public class MainUI {

	public static void main(String [] args) {
		Kid k1= new Kid();
		k1.setId(101);
		
		Kid k2 = new Kid();
		k2.setId(102);
		
		Vaccination v1= new Vaccination("c1",LocalDate.of(2022, 6, 7).toString(),"c10",LocalDate.of(2033, 10, 5).toString(),"good for health",500);
		Vaccination v2= new Vaccination("c2",LocalDate.of(2021, 6, 7).toString(),"c11",LocalDate.of(2032, 8, 6).toString(),"good",600);
		Vaccination v3=new Vaccination("c1",LocalDate.of(2022, 6, 7).toString(),"c10",LocalDate.of(2033, 10, 5).toString(),"good for health",500);
        
		
        
        
	}
}
