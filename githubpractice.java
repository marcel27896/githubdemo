import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class githubpractice implements Runnable{
//this is for demo purposes
    public static void main(String[] args) {
        githubpractice prac = new githubpractice();
        Thread t = new Thread(prac);
        t.start();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = scanner.nextLine();

        Pattern p = Pattern.compile("[a-zA-Z]+");
        Matcher m = p.matcher(name);

        if (m.matches()) {
            System.out.println("name hotdog");
            System.out.println("name hotdog");
        }else{
            System.out.println("name not");
        }
        scanner.close();
    }
    @Override
    public void run(){
        System.out.println("hello world");
        System.out.println("this is fuckin text");
 }
}
