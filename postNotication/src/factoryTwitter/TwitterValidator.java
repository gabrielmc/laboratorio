package factoryTwitter;

import interfaces.IValidator;

/**
 * @author gmuniz
 */
public class TwitterValidator implements IValidator{

    private String message;
    
    public TwitterValidator(String message ){
        this.message = message;
    }
            
    @Override
    public boolean validator(String message) {
        return (message != null);
    }   
}