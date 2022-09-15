package factoryTwitter;

import interfaces.IAuthenticator;

/**
 * @author gmuniz
 */
public class TwitterAuthenticator implements IAuthenticator{
    
    private String login;
    private String pass;
    
    public TwitterAuthenticator(String login, String pass){
        this.login = login;
        this.pass = pass;
    }
    
    @Override
    public boolean authenticator() {
        return (this.login != null && this.pass != null);
    } 
}