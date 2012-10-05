package no.nith.pg560.interfaces.web;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ConversationScoped;
import javax.inject.Named;

import no.nith.pg560.domain.Country;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

@Named
@ConversationScoped
public class AddUserBean implements Serializable {
	private static final long serialVersionUID = 7919694216675534863L;

	private String username;
	private String firstname;
	private String lastname;
	private String city;
	private String country;
	
	private List<Country> countries;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	@Override
	public String toString(){
		
		return ReflectionToStringBuilder.reflectionToString(this);
	}
	
	public List<Country> getCountries() {
		return countries;
	}

	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}
}
