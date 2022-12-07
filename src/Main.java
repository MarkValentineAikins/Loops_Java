//import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

//        int TestNum1, TestNum2, TestNum3;
//        double averageTest;
//        char repeat;
//        String input;
//
//        System.out.println("This program will average three test scores for users");
//        System.out.println("________________________________________________________________");
//
//        Scanner scanner = new Scanner (System.in);
//
//        do {
//
//            // Get the number of test scores from user
//            System.out.println("Enter test number1 score ");
//            TestNum1 = scanner.nextInt();
//
//            System.out.println("Enter test number2 score ");
//            TestNum2 = scanner.nextInt();
//
//            System.out.println("Enter test number3 score ");
//            TestNum3 = scanner.nextInt();
//
//            scanner.nextLine(); // this line is enable the next user to enter set of test scores
//
//            //Calculating the average Test scores for the user
//            averageTest = (TestNum1 + TestNum2 + TestNum3)/3.0;
//
//            System.out.println("Average for the three test is " + averageTest);
//            System.out.println("");
//
//            System.out.println("Do you want to average another set of test scores? ");
//            System.out.println("Enter Y for yes or N for no");
//            input = scanner .nextLine();
//            repeat = input.charAt(0);
//
//        } while (repeat == 'Y' || repeat == 'y');

        int number;

        System.out.println("This program displays number 1 to 10 and their corresponding square");
        System.out.println("Number      NumberSquare");
        System.out.println("--------------------------------");

        for (number  = 1; number <= 10; number++){
            System.out.println(number + "\t\t" + number*number);
        }


    }
}