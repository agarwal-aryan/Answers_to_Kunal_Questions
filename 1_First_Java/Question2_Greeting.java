import java.util.Scanner;

public class Question2_Greeting {
    public static void main(String[] args) {
        //Take name as input and print a greeting message for that particular name.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name:-");
        String s1 = input.nextLine();
        System.out.println("Hi " + s1 + " ,How Are You?");
        
    }
}
