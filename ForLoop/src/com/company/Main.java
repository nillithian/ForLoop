package com.company;

public class Main {

    public static void main ( String[] args ) {

//        System.out.println ("10,000 at 2% interest = " + calculateInterest ( 10000.0,2.0 ));
//        System.out.println ("10,000 at 3% interest = " + calculateInterest ( 10000.0,3.0 ));
//        System.out.println ("10,000 at 4% interest = " + calculateInterest ( 10000.0,4.0 ));
//        System.out.println ("10,000 at 5% interest = " + calculateInterest ( 10000.0,7.0 ));

        for (int i = 0; i < 5; i++) {
            System.out.println ( "loop " + i + " hello" );

        }

        for (double i = 2.0; i < 9.0; i++) {
            System.out.println ( "for 10,000 at " + i + " %, the interest rates are : " + calculateInterest ( 10000, i ) );
        }


        for (double i = 8.0; i >= 2.0; i--) {
            System.out.println ( "For 10,000 at " + i + " %, the interest rates are : " + calculateInterest ( 10000, i ) );
        }

        int count = 0;
        for (int i = 2; i < 10000; i++) {
            if ( isPrime ( i ) ) {
                count++;
                System.out.println ( i + " is the prime number found." );
                if ( count == 10000 ) {
                    System.out.println ( "Exiting the For Loop!" );
                    break;
                }
            }

        }


    }


    public static double calculateInterest ( double amount, double interestRate ) {
        return ( amount * ( interestRate / 100 ) );
    }

    public static boolean isPrime ( int n ) {
        if ( n == 1 ) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
//            System.out.println (i);
            if ( n % i == 0 ) {
                return false;
            }
        }
        return true;
    }

}
