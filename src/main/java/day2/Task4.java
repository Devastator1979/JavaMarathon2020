package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        in.close();
        if ((x >= 5) || ((-3 < x) && (x < 5 ))){
            if (x >= 5){
                double y = (x*x - 10) / (x +7);
                System.out.println(y);
            }
            if ((-3 < x) && (x < 5 )){
                double y = (x + 3) * (x * x - 2);
                System.out.println(y);
            }
        }
        else {
            System.out.println(420D);
        }
    }
}