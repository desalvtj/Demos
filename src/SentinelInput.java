import java.util.Scanner;

public class SentinelInput
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

       double grade = 0; //0-100 is good, -1 to exit
        double average = 0;
        double totalGrade = 0;
        int numGrades = 0;
        String trash = "";
        boolean doneGrade = false;

        do {


            System.out.print("Enter your grade: ");
            if (in.hasNextDouble())
            {
                grade = in.nextDouble();
                in.nextLine();
                if (grade == -1)
                {
                    doneGrade = true;
                }
                else if(grade >= 0 && grade <= 100)
                {
                    totalGrade += grade; //totalGrade = totalGrade + grade
                    numGrades++;
                }
                else
                {
                    System.out.println("Must be between 0 and 100, not: " + grade);
                }

            } else
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash + ". Try again.");
            }

        }while(!doneGrade);
        //calc the avg
        if (numGrades > 0)
        {

            average = totalGrade / numGrades;
        }
        else
            average = 0;

        System.out.println("The average grade is " + average);
    }
}
