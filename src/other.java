import java.util.*;

public class other {
    public static void main(String[] args) throws Exception {

        Scanner number = new Scanner(System.in);

        int correctnumber = 7;

        for (int i = 0; i <10; i++) {
            System.out.println("Input a number: ");

            int num = number.nextInt();

            System.out.println("Your number is " + num + ".");

            if (num > 7) {

                System.out.println("You are wrong, try lower.");

            }

            else if (num < 7) {

                System.out.println("You are wrong, try higher");
            }

            else {

                System.out.println("Good job you are right.");
            }

            if (i == 9) {
                System.out.println("You ran out of tries.");

            }
        }

    }
}
