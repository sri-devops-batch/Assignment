package p1;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import p1.HibernateConnection;
import p1.Kid;
import p1.Hospital;
import p1.Doctors;
import p1.Parent;

public class DatabaseOperation {

	public static void main(String[] args) {
	Session hibernate = HibernateConnection.getHibernateLink();
	
	Parent p = new Parent("dev","Rani",9502719555L);
	Parent g = new Parent("sai","Aishu",63067893L);
	
	Vaccination v1= new Vaccination("c1",LocalDate.of(2022, 6, 7).toString(),"c10",LocalDate.of(2033, 10, 5).toString(),"good for health",500);
	Vaccination v2= new Vaccination("c2",LocalDate.of(2021, 6, 7).toString(),"c11",LocalDate.of(2032, 8, 6).toString(),"good",600);
	Vaccination v3=new Vaccination("c1",LocalDate.of(2022, 6, 7).toString(),"c10",LocalDate.of(2033, 10, 5).toString(),"good for health",500);

	List<Vaccination> k1AllVaccination=Arrays.asList(v1,v2,v3);
	
	Hospital hs= new Hospital(1,"apollo",243);
	hs.sethId(101);
	hs.setRegistrationNumber(243);
	insertHospital(hibernate,hs);
	
	Doctors d=new Doctors("Suresh","MBBS","ChildernSpecialist");
	List<Doctors> hsAllDoctors=Arrays.asList(d);
	insertDoctors(hibernate,d);
	


	Kid k1 = new Kid(LocalDate.of(2002,10, 4).toString(),"sri","male",50);
	
	k1.setParentInfo(p);
	k1.setAllVaccination(k1AllVaccination);
	k1.setId(103);
	
	 insertKid(hibernate, k1);
	}


	private static void insertKid(Session hibernate, Kid k1) {


			Transaction t1 = hibernate.beginTransaction();

			hibernate.save(k1); // code to save kid in the database

			t1.commit();
			hibernate.close();

			System.out.println(" Database commit & hibernate closed ...");
		}
	public static void doUpdate(Session hibernate,Serializable id) {
		Transaction t1 = hibernate.beginTransaction();
		Kid kid = (Kid) hibernate.get(Kid.class,id );
		System.out.println(kid);
		System.out.println("------------calling some setter methods---------------");
		kid.setId(103);
		kid.setWeight(50);

	     t1.commit();
		hibernate.getClass();
	
	}
	private static void insertHospital(Session hibernate,Hospital hs) {

		Transaction t2 = hibernate.beginTransaction();

		hibernate.save(hs); // code to save hospital in the database

		t2.commit();
		hibernate.close();

		System.out.println("  Database commit & hibernate closed ...");
	}
	private static void insertDoctors(Session hibernate, Doctors d) {
		Transaction  t= hibernate.beginTransaction();

		hibernate.save(d); // code to save doctors in the database

		t.commit();
		hibernate.close();

		System.out.println(" Database commit & hibernate closed ...");
	}
		
	}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	