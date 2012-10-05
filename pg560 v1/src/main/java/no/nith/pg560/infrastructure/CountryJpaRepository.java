package no.nith.pg560.infrastructure;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import no.nith.pg560.common.CommonRepository;
import no.nith.pg560.domain.Country;
import no.nith.pg560.domain.User;

import org.apache.log4j.Logger;

public class CountryJpaRepository  extends CommonRepository<Country> {
	private Logger logger = Logger.getLogger(UserJpaRepository.class);
	
	
	public CountryJpaRepository() {
		super(Country.class);
	}

	public CountryJpaRepository(EntityManager em) {
		super(Country.class, em);
	}

	public List<Country> getContries() {
		Query query = getEntityManager().createQuery("select c from Country c");
		
		List<Country> countries = null; 
		try {
			countries = query.getResultList();
		} catch (NoResultException e) {
			logger.info("Fikk ingen treff");
		}
		return countries;
	}
	
	public void persist(User user) {
		getEntityManager().persist(user);
	}

}
