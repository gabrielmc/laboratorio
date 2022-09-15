package model;

/**
 * @author gmuniz
 * Base class of social network.
 */
public abstract class Network {
    public String userName;
    public String password;

    public Network() {}

    public boolean post(String message) {
        // Authenticate before posting. Every network uses a different
        // authentication method.
        if (logIn(this.userName, this.password)) {
            boolean result =  sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    public abstract boolean logIn(String userName, String password);
    public abstract boolean sendData(byte[] data);
    public abstract void logOut();
}