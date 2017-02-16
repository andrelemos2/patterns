package br.com.andrelemos.decorator;

/**
 * Created by andreasl on 23/11/16.
 */
public abstract class EmailDecorator
		implements IEmail {
    //wrapped component
    IEmail originalEmail;
}