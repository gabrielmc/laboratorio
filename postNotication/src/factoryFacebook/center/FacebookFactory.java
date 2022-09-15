package factoryFacebook.center;

import factoryFacebook.*;
import interfaces.center.IAbstractPost;
import interfaces.*;

/**
 * @author gmuniz
 */
public class FacebookFactory implements IAbstractPost{

    @Override
    public IAuthenticator authenticator(String login, String pass) {
        return new FecebookAuthenticator(login, pass);
    }

    @Override
    public IValidator validator(String message) {
        return new FacebookValidator(message);
    }

    @Override
    public IPublisher publisher() {
        return new FacebookPublisher();
    }    
}