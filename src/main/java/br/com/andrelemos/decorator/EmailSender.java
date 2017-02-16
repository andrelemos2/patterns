package br.com.andrelemos.decorator;

public class EmailSender {

    public void sendEmail(IEmail email) {

	ExternalEmailDecorator external = new ExternalEmailDecorator(email);

	external.getContents();

	//send
    }
}