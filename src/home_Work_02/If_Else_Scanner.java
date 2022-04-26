package home_Work_02;

import java.util.Scanner;

public class If_Else_Scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Who is crazy for married? male or female ? ");
        System.out.println("Enter your current age ");
        int age = scan.nextInt();

        System.out.println("Enter your gender clarification");
        String gender = scan.next();

        if (gender.equalsIgnoreCase("female")   ||   age <=18 ){
            System.out.println("If your age is 18, you are adult, you can marry ");

        } else if (gender.equalsIgnoreCase("male")   &&  age <= 21  ){

            System.out.println("you are ready for getting married");
            }
        else{
                System.out.println("No, you are not ready because you're minor");

        }

    }
}
