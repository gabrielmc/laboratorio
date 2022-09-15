package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import model.Network;
import services.Facebook;
import services.Twitter;

/**
 *
 * @author gmuniz
 * Demo class. Everything comes together here.
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        InputStreamReader readerStream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(readerStream);
        
        System.out.print("Input user name: ");
        String userName = reader.readLine();
        System.out.print("Input password: ");
        String password = reader.readLine();

        // Enter the message.
        System.out.print("Input message: ");
        String message = reader.readLine();

        System.out.println("\nChoose social network for posting message.\n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        
        Network network = null;
        int choise = Integer.parseInt(reader.readLine());
        network = ( choise == 1) ? 
            new Facebook(userName, password) : 
            new Twitter(userName, password);
        network.post(message);
    }
}