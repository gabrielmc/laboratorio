package interfaces.center;

import interfaces.IAuthenticator;
import interfaces.IPublisher;
import interfaces.IValidator;

/**
 * @author G Muniz
 */
public interface IAbstractPost {
    public IAuthenticator authenticator(String login, String pass);
    public IValidator validator(String message);
    public IPublisher publisher();    
}