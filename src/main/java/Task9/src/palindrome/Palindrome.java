package Task9.src.palindrome;

import java.util.Iterator;
import java.util.TreeSet;

public class Palindrome {

    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("This program checks if number is a palindrome. To use the program you have to enter " +
                    "a number\n which you want to check. Program will display groups of palindromes.");
        }else if(args.length == 1){
            System.out.println(args[0]);
            String num = args[0];
            if(num.matches("\\d+")) {
                String[] number = num.split("");
                TreeSet palindromeAnswer = Palindrome.getPalindrome(number);
                Palindrome.displayAnswer(palindromeAnswer);
            }else{
                System.out.println("Parameters are wrong!");
            }
        }else{
            System.out.println("Parameters are wrong!");
        }
    }

    private static TreeSet getPalindrome(String[] number) {
        TreeSet palindromeSet = new TreeSet();
        for (int i = 0; i < number.length - 1; i++) {
            String palindrome = null;
            int k = i - 1;
            int v = i + 1;
            if (number[i].equals(number[v])) {
                palindrome = number[i] + number[v];
                i = v;
                v++;
                if(v < number.length && number[i].equals(number[v])){
                    while(v < number.length && number[i].equals(number[v])){
                        palindrome = palindrome + number[v];
                        v++;
                    }
                    i = v;
                }else{
                    while (k >= 0 && v < number.length) {
                        if (number[k].equals(number[v])) {
                            palindrome = number[k] + palindrome + number[v];
                            i = v;
                            k--;
                            v++;
                        }else {
                            break;
                        }
                    }
                }

                palindromeSet.add(palindrome);
            } else if (i > 0 && number[k].equals(number[v])) {
                palindrome = number[k] + number[i] + number[v];
                i = v;
                k--;
                v++;
                while (k >= 0 && v < number.length) {
                    if (number[k].equals(number[v])) {
                        palindrome = number[k] + palindrome + number[v];
                        i = v;
                        k--;
                        v++;
                    }else {
                        break;
                    }
                }
                palindromeSet.add(palindrome);
            }
        }
        return palindromeSet;
    }

    private static void displayAnswer(TreeSet palindromeSet){
        if(palindromeSet.size() == 0){
            System.out.println(0);
        }
        else{
            Iterator iter = palindromeSet.iterator();
            while(iter.hasNext()){
                System.out.print(iter.next() + " ");
            }
        }
    }
}
