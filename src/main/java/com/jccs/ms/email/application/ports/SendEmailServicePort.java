package com.jccs.ms.email.application.ports;

import com.jccs.ms.email.application.domain.Email;

public interface SendEmailServicePort {

	void sendEmailSmtp(Email email);
}
