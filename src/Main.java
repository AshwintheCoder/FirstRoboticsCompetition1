import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner number = new Scanner(System.in);

        int correctnumber = 7;
        boolean correct = false;

        while (correct == false) {
        
        System.out.println("Input a number: ");

        int num = number.nextInt();

        System.out.println("Your number is " + num + ".");

        if (num>7) {

            System.out.println("You are wrong, try lower.");

        }

        else if (num<7) {

            System.out.println("You are wrong, try higher");
        }

        else {

            System.out.println("Good job you are right.");
            correct = true;
        }

    }


        
    }
}
