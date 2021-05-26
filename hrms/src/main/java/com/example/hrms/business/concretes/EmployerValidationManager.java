package com.example.hrms.business.concretes;
import com.example.hrms.business.consts.Messages;
import com.example.hrms.business.abstracts.EmployerValidationService;
import com.example.hrms.core.utilities.results.ErrorResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessResult;
import com.example.hrms.core.utilities.tools.RunTools;
import com.example.hrms.entites.concretes.Employer;

public class EmployerValidationManager implements EmployerValidationService {

	public EmployerValidationManager() 
	{
		
	}
	
	@Override
	public void validate(Employer employer) throws Exception {
		Result[] results = RunTools.runValidationRules(this.checkCompanyNameNotNull(employer.getCompanyName()),
				this.checkWebSiteNotNull(employer.getWebAddress()), this.checkEmailNotNull(employer.getEmail()),
				this.checkTelNotNull(employer.getPhoneNumber()), this.checkPasswordNotNull(employer.getPassword()),
				this.checkPasswordAgainNotNull(employer.getPasswordAgain()));
		for (Result result : results) {
			if (!result.isSuccess()) {
				throw new Exception(result.getMessage());
			}
		}
		
	}
	
	private Result checkCompanyNameNotNull(String companyName) {
		if (companyName.isEmpty() || companyName == null) {
			return new ErrorResult(Messages.companyNameCanNotBeNullOrEmpty);
		}
		return new SuccessResult();
	}
	
	private Result checkWebSiteNotNull(String webSite) {
		if (webSite.isEmpty() || webSite == null) {
			return new ErrorResult(Messages.websiteCanNotBeNullOrEmpty);
		}
		return new SuccessResult();
	}
	
	private Result checkEmailNotNull(String email) {
		if (email.isEmpty() || email == null) {
			return new ErrorResult(Messages.emailCanNotBeNullOrEmpty);
		}
		return new SuccessResult();
	}
	
	private Result checkTelNotNull(String tel) {
		if (tel.isEmpty() || tel == null) {
			return new ErrorResult(Messages.telCanNotBeNullOrEmpty);
		}
		return new SuccessResult();
	}
	
	private Result checkPasswordNotNull(String password) {
		if (password.isEmpty() || password == null) {
			return new ErrorResult(Messages.passwordCanNotBeNullOrEmpty);
		}
		return new SuccessResult();
	}
	
	private Result checkPasswordAgainNotNull(String passwordAgain) {
		if (passwordAgain.isEmpty() || passwordAgain == null) {
			return new ErrorResult(Messages.passwordCanNotBeNullOrEmpty);
		}
		return new SuccessResult();
	}

}