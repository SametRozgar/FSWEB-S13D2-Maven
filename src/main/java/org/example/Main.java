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

    public static String numberToWords (int number)
    {
        if(number<0)
        {
            System.out.println( "Invalid Value" );
            return "Invalid Value";
        }

        String result="";
        String numStr=Integer.toString(number);

        char[] charArray=numStr.toCharArray();

        for (char c : charArray) {
            switch (c) {
                case '0':
                    result += "Zero ";
                    break;
                case '1':
                    result += "One ";
                    break;
                case '2':
                    result += "Two ";
                    break;
                case '3':
                    result += "Three ";
                    break;
                case '4':
                    result += "Four ";
                    break;
                case '5':
                    result += "Five ";
                    break;
                case '6':
                    result += "Six ";
                    break;
                case '7':
                    result += "Seven ";
                    break;
                case '8':
                    result += "Eight ";
                    break;
                case '9':
                    result += "Nine ";
                    break;
                default:
                    return "Invalid Value";
            }
        }

        return result;
    }

}
