package KI34.Okilka.Lab4;

import java.io.FileNotFoundException;

public class MobilePhone extends Phone implements Mobile {
    /**
     * Constructor
     * @param model
     * @param battery
     * @param wifi
     * @param brightness
     * @throws FileNotFoundException
     */
    public MobilePhone(String model, int battery, String wifi, int brightness) throws FileNotFoundException {
        super(model, battery, wifi, brightness);
    }

    /**
     * Implementing method swipeToMenu
     */
    @Override
    public void swipeToMenu() {
        System.out.println("Перехід в головне меню");
    }
}
