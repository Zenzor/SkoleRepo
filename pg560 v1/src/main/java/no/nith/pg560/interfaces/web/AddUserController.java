package no.nith.pg560.interfaces.web;

import javax.enterprise.context.Conversation;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import no.nith.pg560.application.CountryServiceBean;
import no.nith.pg560.application.UserServiceBean;
import no.nith.pg560.common.Pg560PageNavigation;
import no.nith.pg560.domain.User;


@Named
@RequestScoped
public class AddUserController {
	
	@Inject
	private Conversation conversation;
	
	@Inject
	private AddUserBean addUserBean;
	
	@Inject
	UserServiceBean userServiceBean;
	
	@Inject
	CountryServiceBean countryServiceBean;
	
	
	public String addUserEntry(){
		conversation.begin();
		addUserBean.setCountries(countryServiceBean.getCountryList());
		return Pg560PageNavigation.ADDUSER_PAGE1;
	}
	
	public String navigateToPage1(){
		return Pg560PageNavigation.ADDUSER_PAGE1;
	}
	
	public String navigateToPage2(){
		return Pg560PageNavigation.ADDUSER_PAGE2;
	}
	
	public String navigateToPage3(){
		return Pg560PageNavigation.ADDUSER_PAGE3;
	}

	public String navigateToConfirmationPage(){
		
		User newUser = new User();
		newUser.setUsername(addUserBean.getUsername());
		newUser.setCity(addUserBean.getCity());
		newUser.setCountry(addUserBean.getCountry());
		newUser.setName(addUserBean.getFirstname() + " " + addUserBean.getLastname());
		
		userServiceBean.saveUser(newUser);
		
		return Pg560PageNavigation.ADDUSER_CONFIRMATION;
	}
	
	

}
