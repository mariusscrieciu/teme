package recursivitate;


public class Recursion {


    public static void main(String[] args) {
        System.out.println(sumOfEvenNumbers(10));
        System.out.println(fibonaciyArr(9));
        System.out.println(sumOfDigitsForANumber(12345));
        System.out.println(checkFirstAndLastLetterPalindrome("madam"));

    }



    static int sumOfIntNumbers(int n){
        if(n == 1){
            return 1;
        }
       return n + sumOfIntNumbers(n -1);
    }


    static int sumOfEvenNumbers(int n){
        if(n == 0){
            return 0;
        }

        int evenNumber;
        if( n % 2 == 0){
            evenNumber = n;
        }else {
            evenNumber = 0;
        }

        return evenNumber + sumOfEvenNumbers(n -1);

    }



    static boolean checkFirstAndLastLetterPalindrome(String word){
        if (word.length() == 0 || word.length() == 1) return true;
        if (word.charAt(0) == word.charAt(word.length() - 1)){
            return checkFirstAndLastLetterPalindrome(word.substring(1, word.length() - 1));
        }

        return false;
    }


    static int sumOfDigitsForANumber(int number){
        if(number  == 0){
            return 0;
        }
        return (number % 10 + sumOfDigitsForANumber(number /10));

    }

    static int fibonaciyArr(int n){
        if(n <= 1){
            return n;
        }
        return fibonaciyArr(n-1) + fibonaciyArr(n -2);
    }


}
