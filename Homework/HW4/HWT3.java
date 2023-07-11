package Homework.HW4;


import java.util.Scanner;

public class HWT3 {

    static Scanner scanner = new Scanner(System.in);
    
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
