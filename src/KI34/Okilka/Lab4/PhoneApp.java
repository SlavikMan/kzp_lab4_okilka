package KI34.Okilka.Lab4;

import java.io.*;
/**
 * Phone Application class implements main method for Phone
 class possibilities demonstration
 * @author EOM Stuff
 * @version 1.0
 */
public class PhoneApp {
    /**
     * @param args args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        MobilePhone phone = new MobilePhone("Samsung",55,"dvf",10);
        phone.phoneModel();
        phone.minusBright();
        phone.minusBright();
        phone.showBright();
        phone.swipeToMenu();
    }
}

