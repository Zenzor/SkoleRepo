package no.nith.pg560.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * Domain object exposing the PG560_COUNTRY database. 
 */
@Entity
@Table(name = "PG560_COUNTRY")
public class Country {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(unique = true)
	private String fullValue;
	@Column(unique = true)
	private String shortValue;
	public String getFullValue() {
		return fullValue;
	}
	public void setFullValue(String fullValue) {
		this.fullValue = fullValue;
	}
	public String getShortValue() {
		return shortValue;
	}
	public void setShortValue(String shortValue) {
		this.shortValue = shortValue;
	}
	

	public long getId() {
		return id;
	}
	@Override
	public String toString(){
		
		return ReflectionToStringBuilder.reflectionToString(this);
	}
}
