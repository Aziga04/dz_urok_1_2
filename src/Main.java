import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(word(23,43));
        System.out.println(word(2,43));
        System.out.println(word(3,13));
        System.out.println(word(26,42));
        System.out.println(word(23,27));
        System.out.println(word(15,33));
    }

    public static String word(int age, int temp) {
        if (age > 20 && age < 45 && temp > -20 && temp < 30) {
            return "yoe can gou for a walk";
        } else if (age < 20 && temp >= 0 && temp < 28) {
            return "yoe can gou for a walk";
        } else {
            return "stay home";
        }
    }
public static int generateRandomAge() {
        Random random = new Random();
        int gou = random.nextInt(50);
        return  gou;
}
}