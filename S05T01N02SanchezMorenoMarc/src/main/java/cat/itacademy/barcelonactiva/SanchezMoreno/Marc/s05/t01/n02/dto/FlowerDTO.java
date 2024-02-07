package cat.itacademy.barcelonactiva.SanchezMoreno.Marc.s05.t01.n02.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import cat.itacademy.barcelonactiva.SanchezMoreno.Marc.s05.t01.n02.domain.Flower;

public class FlowerDTO {
	
	private int id;
	private String name;
	private String country;
	private String countryType;
	private final List<String> EUCountries = new ArrayList<>(Arrays.asList("Albania", "Alemania", "Andorra",
			"Armenia", "Austria", "Azerbaiyán", "Bélgica", "Bielorrusia", "Bosnia y Herzegovina", "Bulgaria", "Chipre",
			"Croacia", "Dinamarca", "Eslovaquia", "Eslovenia", "España", "Estonia", "Finlandia", "Francia", "Georgia",
			"Grecia", "Hungría", "Irlanda", "Islandia", "Italia", "Kazajistán", "Kosovo", "Letonia", "Liechtenstein",
			"Lituania", "Luxemburgo", "Macedonia del Norte", "Malta", "Moldavia", "Mónaco", "Montenegro", "Noruega",
			"Países Bajos", "Polonia", "Portugal", "Reino Unido", "República Checa", "Rumanía", "Rusia", "San Marino",
			"Serbia", "Suecia", "Suiza", "Turquía", "Ucrania", "Vaticano"));
	
	
	public FlowerDTO(){
		
	}
	public FlowerDTO(Flower flower) {
		this.id = flower.getid();
		this.name = flower.getName();
		this.country = flower.getCountry();
		this.countryType = findCountryType();
	}

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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountryType() {
		return countryType;
	}

	public void setCountryType(String countryType) {
		this.countryType = countryType;
	}

	public String findCountryType() {

		if (this.EUCountries.contains(country)) {
			return "Inside EU";
		} else {
			return "Outside EU";
		}
	}
}
