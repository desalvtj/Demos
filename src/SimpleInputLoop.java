import java.util.Scanner;

public class SimpleInputLoop
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int age = 0;
        double salary = 0;
        String trash = "";
        boolean doneAge = false;

        do {


            System.out.print("Enter your age: ");
            if (in.hasNextInt()) {
                age = in.nextInt();
                in.nextLine();
                doneAge = true;
                System.out.println("You said your age is " + age);
            } else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + ". Try again.");
            }

        }while(!doneAge);
    }

}