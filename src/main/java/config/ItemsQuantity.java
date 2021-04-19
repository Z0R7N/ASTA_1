package config;

public class ItemsQuantity {

    private static final int Okulary = 2;
    private static final int Kabel = 4;
    private static final int Kubek = 7;
    private static final int Kamera = 3;

    public static int sumOfItem(String item){
        switch (item){
            case "Okulary":
                return Okulary;
            case "Kabel":
                return Kabel;
            case "Kubek":
                return Kubek;
            case "Kamera":
                return Kamera;
        }
        return Okulary + Kabel + Kubek + Kamera;
    }
}