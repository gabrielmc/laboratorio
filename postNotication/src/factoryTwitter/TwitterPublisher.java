package factoryTwitter;

import interfaces.IPublisher;

/**
 * @author gmuniz
 */
public class TwitterPublisher implements IPublisher{

    @Override
    public void publisher() {
        System.out.println("Your post was published in Twitter plataform");
    }
}