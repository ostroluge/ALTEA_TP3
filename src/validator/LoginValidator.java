package validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import metier.MetierPersonnes;

public class LoginValidator implements Validator {

	@Override
	public void validate(FacesContext fc, UIComponent comp, Object ref) throws ValidatorException {
		String login;
		
		if (fc == null || comp == null || ref == null) {
			throw new NullPointerException();
		}
	
		login = ref.toString();
		
		if (MetierPersonnes.loginExisteDeja(login)) {
			throw new ValidatorException(new FacesMessage(
					FacesMessage.SEVERITY_ERROR,
					"Erreur login", "Ce nom d'utilisateur est déjà utilisé"));
		}
	}
}
