package no.nith.pg560.application;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.inject.Inject;

import no.nith.pg560.domain.Country;
import no.nith.pg560.infrastructure.CountryJpaRepository;

@Singleton
public class CountryServiceBean {
	
	private List<Country> countries;
	
	@Inject
	private CountryJpaRepository repository;
	
	@PostConstruct
	public void init(){
		
		countries = repository.getContries();	
		System.out.println(countries);
	}
	
	public List<Country> getCountryList(){
		return countries;
	}

}
