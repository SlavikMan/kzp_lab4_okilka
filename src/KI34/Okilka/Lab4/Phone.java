package KI34.Okilka.Lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public abstract class Phone extends Object{
    private int battery;
    private String model;
    private String wifi;
    private Boolean isCharged;
    private int pics = 0;
    private String currentApp;
    private int brightness;
    private PrintWriter fout;
//,String currentApp


    public Phone(String model, int battery, String wifi, int brightness) throws FileNotFoundException {
        this.battery = battery;
        this.model = model;
        this.wifi = wifi;
        this.brightness = brightness;
        fout = new PrintWriter(new File("Log.txt"));

    }

    /**
     * Method sets battery
     *
     * @param battery battery
     */
    public void setBattery(int battery) {
        this.battery = battery;
    }

    /**
     * Method returns battery
     *
     * @return battery
     */
    public int getBattery() {
        return battery;
    }

    /**
     * Method sets phone model
     *
     * @param model model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Method returns phone model
     *
     * @return phone model
     */
    public String getModel() {
        return model;
    }

    /**
     * Method sets wi-fi
     *
     * @param wifi wifi
     */
    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    /**
     * Method returns wi-fi
     *
     * @return wi-fi
     */
    public String getWifi() {
        return wifi;
    }

    /**
     * Method sets  brightness
     *
     * @param brightness brightness
     */
    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }


    /**
     * Method returns brightness
     *
     * @return brightness
     */
    public int getBrightness() {
        return brightness;
    }

    private Boolean levelBattery() {
        if (battery <= 0) {
            isCharged = false;
        } else {
            isCharged = true;
        }
        return isCharged;
    }

    private void takePhone() {
        levelBattery();
        if (!isCharged) {
            System.out.println("Телефон розрядженно");
            fout.println("Телефон розрядженно");
            fout.flush();
            System.exit(0);

        }

    }

    public void phoneModel() {
        takePhone();
        System.out.println("Марка: " + model);
        fout.println("Марка: " + model);
        fout.flush();

    }


    public void checkCharge() {
        takePhone();
        levelBattery();
        if (isCharged) {
            System.out.println("Зар'яд батареї: " + battery + "%");
            fout.println("Зар'яд батареї: " + battery + "%");
            fout.flush();
        }

    }

    public void connectToWifi() {
        takePhone();
        if (wifi.length() > 0) {
            System.out.println("Wi-fi: " + wifi);
            fout.println("Зар'яд батареї: " + battery + "%");
            fout.flush();
        } else {
            System.out.println("Wi-fi: Disconnected");
            fout.println("Wi-fi: Disconnected");
            fout.flush();
        }
    }

    public void makePhoto() {
        takePhone();
        pics += 1;
    }

    public void deletePhoto() {
        takePhone();
        if (pics <= 0) {
            pics = 0;
        } else {
            pics -= 1;
        }

    }

    public void showPhoto() {
        takePhone();
        System.out.println("Кількість фото: " + pics);
        fout.println("Wi-fi: Disconnected");
        fout.flush();
    }

    private void maxBrightness() {
        if (brightness >= 100) {
            brightness = 100;
        }
    }

    private void minBrightness() {
        if (brightness <= 0) {
            brightness = 0;
        }
    }

    public void addBright() {

        brightness += 10;


    }

    public void minusBright() {

        brightness -= 10;


    }

    public void showBright() {
        takePhone();
        minBrightness();
        maxBrightness();
        System.out.println("Яскравість: " + brightness + "%");
        fout.println("Яскравість: " + brightness + "%");
        fout.flush();
    }
}
