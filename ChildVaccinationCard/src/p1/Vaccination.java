package p1;

import java.time.LocalDate;

import javax.persistence.Embeddable;
@Embeddable
public class Vaccination{
	private String doseName;
	private String vaccinationdate;
	private String nextDoseName;
	private String nextVaccinationDate;
	private String remarks;
	private int cost;
	public Vaccination() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vaccination(String doseName, String vaccinationdate, String nextDoseName, String nextVaccinationDate,
			String remarks, int cost) {
		super();
		this.doseName = doseName;
		this.vaccinationdate = vaccinationdate;
		this.nextDoseName = nextDoseName;
		this.nextVaccinationDate = nextVaccinationDate;
		this.remarks = remarks;
		this.cost = cost;
	}
	public String getDoseName() {
		return doseName;
	}
	public void setDoseName(String doseName) {
		this.doseName = doseName;
	}
	public String getVaccinationdate() {
		return vaccinationdate;
	}
	public void setVaccinationdate(String vaccinationdate) {
		this.vaccinationdate = vaccinationdate;
	}
	public String getNextDoseName() {
		return nextDoseName;
	}
	public void setNextDoseName(String nextDoseName) {
		this.nextDoseName = nextDoseName;
	}
	public String getNextVaccinationDate() {
		return nextVaccinationDate;
	}
	public void setNextVaccinationDate(String nextVaccinationDate) {
		this.nextVaccinationDate = nextVaccinationDate;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
}