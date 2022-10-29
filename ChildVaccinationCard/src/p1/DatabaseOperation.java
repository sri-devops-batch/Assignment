package p1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import p1.HibernateConnection;
import p1.Kid;
public class DatabaseOperation {

	public static void main(String[] args) {
	Session hibernate = HibernateConnection.getHibernateLink();
	
	Parent p = new Parent("dev","Rani",9502719555L);
	Vaccination v1= new Vaccination("c1",LocalDate.of(2022, 6, 7).toString(),"c10",LocalDate.of(2033, 10, 5).toString(),"good for health",500);
	Vaccination v2= new Vaccination("c2",LocalDate.of(2021, 6, 7).toString(),"c11",LocalDate.of(2032, 8, 6).toString(),"good",600);
	Vaccination v3=new Vaccination("c1",LocalDate.of(2022, 6, 7).toString(),"c10",LocalDate.of(2033, 10, 5).toString(),"good for health",500);

	List<Vaccination> k1AllVaccination=Arrays.asList(v1,v2,v3);
	
	Kid k1 = new Kid(LocalDate.of(2002,10, 4).toString(),"sri","male",50);
	
	k1.setParentInfo(p);
	k1.setAllVaccination(k1AllVaccination);
	k1.setId(102);
	
	 insertKid(hibernate, k1);
	}

	private static void insertKid(Session hibernate, Kid k1) {


			Transaction t1 = hibernate.beginTransaction();

			hibernate.save(k1); // code to save Student in the database

			t1.commit();
			hibernate.close();

			System.out.println(" 5. Database commit & hibernate closed ...");
		}
	}
		

