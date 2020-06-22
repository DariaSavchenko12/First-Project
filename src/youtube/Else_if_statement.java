package youtube;

import java.util.Scanner;

public class Else_if_statement {
    private static Scanner scanner;

    public static void main(String[] args) {

        //command+z go back
        //option(ctrl) command l = line up


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter_a_grade:");


        String imya = scanner.next();
        if (imya.equals("Daria")){
            System.out.println("It is me");
        } else if (imya.equals("Zhibekchach")){
            System.out.println("" +
                    "my friend");
        } else {
            System.out.println("unknown input");
        }

        int number = scanner.nextInt();
        if(number > 10 && number < 100){
            System.out.println("from 10 to 100");
        } else if (number > 10 && number < 110) {
            System.out.println("from 10 to 110");
        }

    }
}