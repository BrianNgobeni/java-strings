import java.util.Scanner;

public class Practice
{
    public static void main(String[] args)
    {
        String name = "Bring him back";
        System.out.println("The character at position 6 is: " + name.charAt(6));
        Scanner ip = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Enter the first number: ");
        num1 = ip.nextInt();
        System.out.println("Enter the second number: ");
        num2 = ip.nextInt();
        System.out.println("Enter the last number: ");
        num3 = ip.nextInt();
        


        System.out.println("The highest number is: " + Math.max(Math.max(num1, num2),num3));
        System.out.println("The smallest nember is: " + Math.min(Math.min(num1, num2),num3));
        int average = (num1 + num2 + num3) / 3;
        System.out.println("The average of the 3 numbers is: " + average);


    }
}

