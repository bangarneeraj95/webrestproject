package com.Aartek.SpringLogin.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.Aartek.SpringLogin.form.Contact;
  
 

@Component
public class RegisterValidator {
	
	

	public boolean supports(Class<?> clazz) {
		return Contact.class.isAssignableFrom(clazz);
	}

	
	public void validate(Object target, Errors errors) {
		Contact registration = (Contact) target;
		ValidationUtils.rejectIfEmpty(errors, "firstName", "first name empty");

}
}