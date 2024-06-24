import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class githubpractice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = scanner.nextLine();

        Pattern p = Pattern.compile("[a-zA-Z]+");
        Matcher m = p.matcher(name);

        if (m.matches()) {
            System.out.println("name valid");
        }else{
            System.out.println("name not");
        }
        scanner.close();
    }
}
