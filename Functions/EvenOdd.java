//Java Program to Check if a Given Integer is Odd or Even

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        evenOdd(num);
        sc.close();

    }

    static void evenOdd(int num){
        if ((num | 1) > num) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }
}

    // static void evenOdd(int num){
    //     if (num%2 == 0){
    //         System.out.println("Even");
    //     }
    //     else{
    //         System.out.println("Odd");
    //     }
    // }

