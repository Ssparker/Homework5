package edu.dmacc.codedsm.hw5;

public class Calculator {
    public static void main(String[] args) {
        int number = 27;
        double squareRoot = Math.sqrt(number);

        double a = 28.0;
        double b = 5.0;
        double round = Math.round(a / b);

        double mathFloor = Math.floor(a / b);

        double pow = Math.pow(2.2, 4);

        int abc;
        abc = (int) (Math.random()*100);

        System.out.println("number : " + number);

        System.out.println("division : " + (a / b));
        System.out.println("Division rounds down : " + mathFloor);

        System.out.println(pow);

        System.out.println(abc);
    }
}
