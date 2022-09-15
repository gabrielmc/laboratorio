package ui;

import interfaces.center.IAbstractPost;
import factoryTwitter.*;
import factoryFacebook.*;
import factoryTwitter.center.TwitterFactory;
import factoryFacebook.center.FacebookFactory;
import interfaces.*;

/**
 * @author gmuniz
 */
public class Main {
    
    private IAuthenticator auth;
    private IPublisher publish;
    private IValidator validate;
    
    public void sendPostTw(IAbstractPost post){
        this.auth = (TwitterAuthenticator) post.authenticator("G Muniz", "1234");
        if(this.auth.authenticator()){
            this.validate = (TwitterValidator) post.validator("Teste");
            if(this.validate.validator("Teste")){
                this.publish = (TwitterPublisher) post.publisher();
                this.publish.publisher();
            }
        }
    }
    
    public void sendPostFb(IAbstractPost post){
        this.auth = (FecebookAuthenticator) post.authenticator("G Muniz", "1234");
        if(this.auth.authenticator()){
            this.validate = (FacebookValidator) post.validator("Teste face");
            if(this.validate.validator("Teste face ")){
                this.publish = (FacebookPublisher) post.publisher();
                this.publish.publisher();
            }
        }
    }
    
    public void clearFactory(){
        this.auth = null;
        this.validate = null;
        this.validate = null;
        this.publish = null;
    }
    
    public static void main(String[] args){
        Main rumApp = new Main();
        rumApp.sendPostTw(new TwitterFactory());
        rumApp.clearFactory();
        rumApp.sendPostFb(new FacebookFactory());
    }
}