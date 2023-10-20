package com.location.util;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class emailutil {
	
	@Autowired
	JavaMailSender mailsender;   //JavaMailSender is a interface inside mail jars
	

    public void sendSimpleMessage(String to, String subject, String text) {
    	MimeMessage message = mailsender.createMimeMessage();
    	MimeMessageHelper messageHelper = new MimeMessageHelper(message); 
    	
    	try {
    		messageHelper.setTo(to); 
    		messageHelper.setText(subject);
    		messageHelper.setSubject(text); 
    		mailsender.send(message);
    }catch (Exception e) {
		System.out.println(e);
	}
}
}


