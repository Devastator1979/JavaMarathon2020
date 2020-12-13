package day2;
            /* реализовать программу из Task2  про помощи цикла  while*/

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();
        if ((a == b) || (a > b)){
            System.out.println("некорректный ввод");
        }
        else {
            int i = a;
            while ( i < b - 1){
                i++;
                if (((i%5) == 0) && ((i%10)!=0)){
                    System.out.print(i + " ");
                }
            }
        }
    }
}
