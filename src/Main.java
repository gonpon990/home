import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(mojnoIdtiGulyati(11, 15));
        System.out.println(mojnoIdtiGulyati(0, 80));
        System.out.println(mojnoIdtiGulyati(15, 26));
        System.out.println(mojnoIdtiGulyati(12, 56));
        System.out.println(mojnoIdtiGulyati(generateRandomAge(),33));
    }


    public static String mojnoIdtiGulyati(int age, int temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
        return "Можно идти гулять";
    } else if (age < 20 && temperature > 0 && temperature < 28) {
        return "можно идти гулять ";
    } else if (age > 45 && temperature > -10 && temperature < 25) {
        return "Можно идти гулять";
    } else {
        return "Оставайтесь дома ";
    }    }
    public static int generateRandomAge() {
        Random randomAge = new Random();
        return randomAge.nextInt(100);
    }
}