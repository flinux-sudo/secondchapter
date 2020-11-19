package com.controllingexecution;

public class PrimeNumbers {
    public static void printPrimeNumbers(int i, boolean valid){
        if(valid) {
            System.out.println("prime number: " + i);
        }else{
            System.out.println("is not prime number: " + i);

        }
    }


    public static void primeNumbers(){
        long boundary=Long.MAX_VALUE;
        for(int i=2;i<=boundary;i++) {
            boolean isPrime=true;
            isPrime = isPrime(isPrime, i);
            if(isPrime) {
                printPrimeNumbers(i,isPrime);
            }
        }

    }

    public static boolean isPrime(boolean isPrime, int i) {
        for (int j =2; j<i-1;j++) {
            if (i % j == 0) {
                isPrime=false;
                printPrimeNumbers(i,isPrime);
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        primeNumbers();

    }
}
