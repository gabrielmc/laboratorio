package services;

import factory.interfaces.IButton;

/*
 * @author gmuniz
 */
public class HtmlButton implements IButton {

    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}