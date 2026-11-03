//Java program to find the Largest and Smallest of three Integers
import java.util.Scanner;

public class Maxmin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three Numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int maximum = max(num1,num2,num3);
        int minimum = min(num1,num2,num3);
        System.out.println("The Largest Number: "+maximum);
        System.out.println("The Smallest Number: "+minimum);
        sc.close();

    }
    static int max(int num1,int num2,int num3){
        int max = num1;
        if (num2>=max){
            max = num2;
        }
        if (num3>=max){
            max = num3;
        }
        return max;
    }

    static int min(int num1,int num2,int num3){
        int min = num1;
        if (num2<=min){
            min = num2;
        }
        if (num3<=min){
            min = num3;
        }
        return min;
    }

    // static void max(int num1,int num2,int num3){
    //     if ((num1>=num2) && (num1>=num3)){
    //         System.out.println("The Largest Number is:"+ num1);
    //     }
    //     else if ((num2>=num1) && (num2>=num3)){
    //         System.out.println("The Largest Number is:"+ num2);
    //     }
    //     else{
    //         System.out.println("The Largest Number is:"+ num3);
    //     }
    // }
    // static void min(int num1,int num2,int num3){
    //     if ((num1<=num2) && (num1<=num3)){
    //         System.out.println("The Smallest Number is:"+ num1);
    //     }
    //     else if ((num2<=num1) && (num2<=num3)){
    //         System.out.println("The Smallest Number is:"+ num2);
    //     }
    //     else{
    //         System.out.println("The Smallest Number is:"+ num3);
    //     }
    // }
}
