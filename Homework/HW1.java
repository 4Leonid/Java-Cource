package Homework;

import java.util.Scanner;

public class HW1 {

    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean f = true;
        while(f){
            System.out.println("Укажите номер задачи:");
            System.out.println("1 - Задача 1");
            System.out.println("2 - Задача 2");
            System.out.println("3 - Задача 3");
            System.out.println("0 - Завершение работы приложения");
            int no = Integer.parseInt(scanner.nextLine());

            switch(no){

                case 2:
                    taskTwo();
                    break;
                case 1:
                    taskOne();;
                    break;
                case 3:
                    simpleCalculator();;
                    break;
                case 0:
                    System.out.println("Завершение работы приложения.");
                    f = false;
                    break;
                default:
                    System.out.println("Некорректный номер задачи,\nповторите попытку ввода.");
                break;
            }
        }
    }

    static void taskOne() {
        /*
         * Вычислить n-ое треугольного число (сумма чисел от 1 до n), 
         * n! (произведение чисел от 1 до n)
         */
        System.out.println("Input number");
        int num = scanner.nextInt();
        int sum = 0;  
        int fact = 1;
        if(num >0) {
            for(int i=1; i<=num; i++){
                sum += i;
                fact *= i;
            }
            System.out.println("Sum of numbers from 1 to "+num+" = "+sum);
            System.out.println(num+"! = "+fact);
        } else {
            for(int i=1; i>=num; i--){
                sum += i;
            }
            System.out.println("Sum of numbers from 1 to "+num+" = "+sum);
            System.out.println("Factorial doesn't exist");
        }
    }

    static void taskTwo() {
        /*
         * Вывести все простые числа от 1 до 1000
         */
        for (int i = 2; i <= 1000; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if(i%j == 0){
                    flag = false;
                    break;
                }
            }
                if(flag){
                    System.out.println(i);
                }
            }
    }

    static void simpleCalculator() {
        /*
         * Реализовать простой калькулятор
         */
        System.out.print("Input operation sign ");
        String sign = scanner.nextLine();
        System.out.print("Input first number ");
        int num1 = scanner.nextInt();
        System.out.print("Input second number ");
        int num2 = scanner.nextInt();
        
        switch(sign){
            case "+":
                System.out.println(num1+" + "+num2+" = "+(num1+num2));
                break;
            case "-":
                System.out.println(num1+" - "+num2+" = "+(num1-num2));
                break;
            case "*":
                System.out.println(num1+" * "+num2+" = "+(num1*num2));
                break;
            case "/":
                System.out.println(num1+" / "+num2+" = "+(num1/num2));
                break;
        }
    }
}
