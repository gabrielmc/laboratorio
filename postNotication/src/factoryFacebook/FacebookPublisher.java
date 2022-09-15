package factoryFacebook;

import factoryTwitter.*;
import interfaces.IPublisher;

/**
 * @author gmuniz
 */
public class FacebookPublisher implements IPublisher{

    @Override
    public void publisher() {
        System.out.println("Your post was published in Facebook plataform");
    }
}