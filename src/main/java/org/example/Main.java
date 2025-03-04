package org.example;

public class Main {
    public static void main(String[] args) {



        System.out.println(numberToWords(1548));


    }

    public static boolean isPalindrome(int number) {
        int original = Math.abs(number);
        int reversed = 0;
        int referans = original;

        while (referans > 0) {
            int sonIndex = referans % 10;
            reversed = (reversed * 10) + sonIndex;
            referans /= 10;
        }
        return reversed == original;
    }

    public static boolean isPerfectNumber(int number){
        int sayac=0;
        if(number<=0)
        {
            return false;
        }
        for(int i=1;i<number;i++)
        {
            if(number %i==0)
            {
                sayac+=i;
            }
        }

        return  number==sayac;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }


        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        StringBuilder result = new StringBuilder();
        String numStr = Integer.toString(number);

        for (int i = 0; i < numStr.length(); i++) {
            for (int j = 0; j < words.length; j++) {
                if (Character.getNumericValue(numStr.charAt(i)) == j) {
                    result.append(words[j]).append(" ");
                    break;
                }
            }
        }

        return result.toString().trim();
    }
}
