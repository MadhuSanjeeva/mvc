package com.practice.spring.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private String operatingSystems;
	
	//private LinkedHashMap<String, String> countryOptions;
	
	private LinkedHashMap<String, String> favoriteLanguageOptions;
	
	public Student() {
		//populate country options
		/*countryOptions = new LinkedHashMap<>();
		countryOptions.put("IN", "INDIA");
		countryOptions.put("AUS", "AUSTRALIA");
		countryOptions.put("CAN", "CANADA");
		countryOptions.put("USA", "USA");*/
		
		// populate favorite language options
        favoriteLanguageOptions = new LinkedHashMap<>();

        // parameter order: value, display label
        //
        favoriteLanguageOptions.put("Java", "Java");
        favoriteLanguageOptions.put("C#", "C#");
        favoriteLanguageOptions.put("PHP", "PHP");
        favoriteLanguageOptions.put("Ruby", "Ruby");  
	}
	
	public String getFirstName() {
		return firstName;
	}

	/*public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}*/

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}

	public void setFavoriteLanguageOptions(LinkedHashMap<String, String> favoriteLanguageOptions) {
		this.favoriteLanguageOptions = favoriteLanguageOptions;
	}

	public String getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

}
