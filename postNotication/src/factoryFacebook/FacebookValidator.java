package factoryFacebook;

import factoryTwitter.*;
import interfaces.IValidator;

/**
 * @author gmuniz
 */
public class FacebookValidator implements IValidator{

    private String message;
    
    public FacebookValidator(String message ){
        this.message = message;
    }
            
    @Override
    public boolean validator(String message) {
        return (message != null);
    }   
}