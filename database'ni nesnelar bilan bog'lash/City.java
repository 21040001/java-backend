package hibernatePACKAGE;

import javax.persistence.*;

@Entity //boglashimizga va datamizni chaqirishimizga yordamchi boladi
@Table(name = 'city') // datamizni nomi 

public class City {
	@Id
	@Column(name="ID") // bu shakilda har columbni nomini  berib chiqamiz 
	private int id; // bu shakilda columnlarimizga clasim ichida nom berib ularni boglaymiz va privatedan chiqarish uchun getter va setter foydalanamiz
	
	@Column(name="name")
	private String name;
	
	@Column(name="countryCode")
	private String countryCode;
	
	@Column(name="district")
	private String district;
	
	@Column(name="population")
	private int population;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}

}


