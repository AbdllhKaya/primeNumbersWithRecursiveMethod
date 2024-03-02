import java.util.Scanner;

public class Main {
    public static boolean primeNumberCheck (int number, int divisor ) {
        if (number <= 1 ) {
            return false;
        }
        if (divisor ==1 ){
           return true;
        }
        if (number % divisor==0 ) {
            return false;
        }
        return primeNumberCheck (number,divisor-1);
    }


    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter number = ");
        int number= input.nextInt();
        int divisor= number-1;

        if(primeNumberCheck(number, divisor)){
            System.out.println(number + " is prime number") ;
        } else{
            System.out.println(number + " is not prime number");}





    }


}