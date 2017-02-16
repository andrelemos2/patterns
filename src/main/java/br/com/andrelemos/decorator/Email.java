package br.com.andrelemos.decorator;

/**
 * Created by andreasl on 23/11/16.
 */
//concrete component
public class Email implements IEmail {

    private String content;

    public Email(String content) {
        this.content = content;
    }

    public String getContents() {
        return null;
    }
}
