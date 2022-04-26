package home_Work_02;

import java.util.Scanner;

public class If_Else_Score {

    public void getScore() {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your result's score ");
            double score = sc.nextDouble();

            if (score >= 94) {
                System.out.println("This is highest and Excellent result ");
            } else if (score >= 90) {
                System.out.println("This is very good");
            } else if (score >= 85) {
                System.out.println("This is good");
            } else if (score >= 80) {
                System.out.println("This is Average");
            } else if (score >= 70) {
                System.out.println("This is only pass");
            } else if (score >= 60) {
                System.out.println("Poor is the lower score");
            } else if (score >= 50) {
                System.out.println("This is very lowest you have to repeat this course");
            }

        }

    public static void main(String[] args) {
        If_Else_Score nadia = new If_Else_Score();
        nadia.getScore();
    }

    }

