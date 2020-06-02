package com.renato.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.renato.cursomc.domain.Cliente;
import com.renato.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
