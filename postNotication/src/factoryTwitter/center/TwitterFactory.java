package factoryTwitter.center;

import factoryTwitter.TwitterAuthenticator;
import factoryTwitter.TwitterPublisher;
import factoryTwitter.TwitterValidator;
import interfaces.center.IAbstractPost;
import interfaces.*;

/**
 * @author gmuniz
 */
public class TwitterFactory implements IAbstractPost{

    @Override
    public IAuthenticator authenticator(String login, String pass) {
        return new TwitterAuthenticator(login, pass);
    }

    @Override
    public IValidator validator(String message) {
        return new TwitterValidator(message);
    }

    @Override
    public IPublisher publisher() {
        return new TwitterPublisher();
    }    
}