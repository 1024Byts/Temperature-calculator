import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // for rankine maybe
        float r;
        float k, f, c;
        String choice, choice2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose a value");
        System.out.println(("Celsius(c) Fahrenheit(f) Kelvin(k)"));
        choice = scan.next();
        //converts a celsius value to kelvin or fahrenheit
        if(choice.equalsIgnoreCase("c")) {
            System.out.println("Enter Celsius Value: ");
            c = scan.nextFloat();
            System.out.println("Convert to (f) | (k): ");
            choice2 = scan.next();
            if(choice2.equalsIgnoreCase("f")) {
                System.out.println(((c * 1.8) + 32) + "°F");
            } else if(choice2.equalsIgnoreCase("k")) {
                System.out.println((c + 273.15) + "°K");
            }
        }
        //converts a fahrenheit value to celsius or kelvin
        if(choice.equalsIgnoreCase("f")) {
            System.out.println("Enter Fahrenheit Value: ");
            f = scan.nextFloat();
            System.out.println("Convert to (c) | (k): ");
            choice2 = scan.next();
            if(choice2.equalsIgnoreCase("c")) {
                System.out.println(((f - 32) / 1.8) + "°C");
            } else if(choice2.equalsIgnoreCase("k")) {
                System.out.println(((f - 32) / 1.8 + 273.15) + "°K");
            }
        }
        //converts a kelvin value to fahrenheit or celsius
        if(choice.equalsIgnoreCase("k")) {
            System.out.println("Enter Kelvin Value: ");
            k = scan.nextFloat();
            System.out.println("Convert to (c) | (f): ");
            choice2 = scan.next();
            if(choice2.equalsIgnoreCase("c")) {
                System.out.println((k - 273.15) + "°C");
            } else if(choice2.equalsIgnoreCase("f")) {
                System.out.println((k * 1.8 - 459.67) + "°F");
            }
        }
    }
}