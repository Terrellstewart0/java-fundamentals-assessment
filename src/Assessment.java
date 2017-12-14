import java.util.Arrays;
import java.util.Scanner;



public class Assessment {
public static void main(String[]args){


            Scanner sc = new Scanner(System.in);

            System.out.println("Please enter a number to be squared: ");
                int userInt = sc.nextInt();
//                System.out.println(userInt);
                int squareInt = userInt * userInt;
                 System.out.println(squareInt);



                System.out.println("Please enter a number: ");
                int userSum = sc.nextInt();
                System.out.println("Please enter another number and we will add them together: ");
                int userSumTwo = sc.nextInt();
                System.out.println(userSum + userSumTwo);



    System.out.print("Enter how many numbers to average: ");
    int numOfNumbers = Integer.parseInt(sc.nextLine());


    Double arrayOfNumbers[] = new Double[numOfNumbers];
    for (int i = 0; i < arrayOfNumbers.length; i++) {
        System.out.println(i);
        System.out.println(arrayOfNumbers[i]);
    }





}
        }
