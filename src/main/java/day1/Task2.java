package day1;
/*
Вывести на экран слово ​“JAVA”,​в строку, чтобы оно повторилось 10 раз, используя цикл ​for.​
        Вывод в консоль должен быть таким:
        JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA
*/


public class Task2 {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 10; i++){
            System.out.print("JAVA ");
        }
    }
}