import com.sun.org.apache.xpath.internal.operations.Bool;
import com.sun.xml.internal.fastinfoset.algorithm.BooleanEncodingAlgorithm;

import javax.print.DocFlavor;

public class JavaAssessment {

    // Given a string, return a string where
    // for every char in the original,
    // there are two chars.

    // doubleChar("The") → "TThhee"
    // doubleChar("AAbb") → "AAAAbbbb"
    // doubleChar("Hi-There") → "HHii--TThheerree"

    public String doubleChar(String input) {

        String temp = "";
        for (int x = 0; x < input.length();x++) {
            temp += input.charAt(x);
            temp += input.charAt(x);
        }
        return temp;
    }
    //
    // A sandwich is two pieces of bread with something in between. Return the
    // string that is between the first and last appearance of "bread" in the
    // given string, or return the empty string "" if there are not two pieces
    // of bread.

    // getSandwich("breadjambread") → "jam"
    // getSandwich("xxbreadjambreadyy") → "jam"
    // getSandwich("xxbreadyy") → ""
    // getSandwich("xxbreadhoneybreadyy") → "honey"

    public String getSandwich(String input) {
        int first = 0;
        int second = 0;

        if (input.contains("bread")) {
            first = input.indexOf("bread");
            second = input.indexOf("bread", first+5);
        }

        if (second <= 0) {
            return "";
        }
        return input.substring(first+5 ,second);

    }

    // Given three ints, a b c, one of them is small, one is medium and one is
    // large. Return true if the three values are evenly spaced, so the
    // difference between small and medium is the same as the difference between
    // medium and large.

    // evenlySpaced(2, 4, 6) → true
    // evenlySpaced(4, 6, 2) → true
    // evenlySpaced(4, 6, 3) → false

    public boolean evenlySpaced(int a, int b, int c) {

        boolean result = false;
        if (    ((a-b) == (b-c))   ||   (c-a) == (a-b)  ) {
            result = true;
        } else if (  ((a-b) != (b-c))   ||   (c-a) != (a-b) ) {
            result = false;
        }
        return result;
    }

    // Given a string and an int n, return a string made of the first and last n
    // chars from the string. The string length will be at least n.

    // nTwice("Hello", 2) → "Helo"
    // nTwice("Chocolate", 3) → "Choate"
    // nTwice("Chocolate", 1) → "Ce"

    public String nTwice(String input, int a) {

        return input.substring(0,a) + input.substring(input.length()-a, input.length());
    }

    // Given a string, return true if it ends in "ly".

    // endsLy("oddly") → true
    // endsLy("y") → false
    // endsLy("oddy") → false
    // endsLy("l") → false

    public boolean endsly(String input)  {


        if (input.length() > 1 ) {
            if (input.charAt(input.length()-2) == 'l' && input.charAt(input.length()-1) == 'y') {
                return true;
            }
        }
        return false;
    }

    // Given a string, return recursively a "cleaned" string where adjacent
    // chars that are the same have been reduced to a single char. So "yyzzza"
    // yields "yza".

    // stringClean("yyzzza") → "yza"
    // stringClean("abbbcdd") → "abcd"
    // stringClean("Hello") → "Helo"

    public String stringClean(String input) {

        return stringClean(input);
    }

    // The fibonacci sequence is a famous bit of mathematics, and it happens to
    // have a recursive definition. The first two values in the sequence are 0
    // and 1 (essentially 2 base cases). Each subsequent value is the sum of the
    // previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13,
    // 21 and so on. Define a recursive fibonacci(n) method that returns the nth
    // fibonacci number, with n=0 representing the start of the sequence.

    // fibonacci(0) → 0
    // fibonacci(1) → 1
    // fibonacci(2) → 1
    // fibonacci(3) → 2
    // fibonacci(4) → 3
    // fibonacci(5) → 5
    // fibonacci(6) → 8
    // fibonacci(25) → 75025

    public int fibonacci(int input) {

        if (input == 0){
            return 0;
        }
        if (input == 1 ){
            return 1;
        }
        return fibonacci(input - 1) + fibonacci(input - 2);

    }

    // We have a number of bunnies and each bunny has two big floppy ears. We
    // want to compute the total number of ears across all the bunnies
    // recursively (without loops or multiplication).

    // bunnyEars(0) → 0
    // bunnyEars(1) → 2
    // bunnyEars(2) → 4
    // bunnyEars(4) → 8
    // bunnyEars(16) → 32

    public int bunnyEars(int input) {

        if ((input % 5) == 0 && input != 1  && input != 0)
            return 1 + input + bunnyEars(input - 1);
        else if ((input % 2) == 0 && input != 0 )
            return 2 + bunnyEars(input - 1);
        else if ((input % 2) != 0 && input != 0)
            return 3 + input + bunnyEars(input - 1);
        else
            return 0;
    }

    // Given a string, return the length of the largest "block" in the string.
    // A block is a run of adjacent chars that are the same.

    // superBlock("jeffbert") → 2
    // superBlock("abbCCCddBBBxx") → 3
    // superBlock("") → 0

    public int superBlock(String str) {

        int counter = 1;
        int result = 0;

        for (int x = 0;x < str.length()-1;x++) {
            if (str.charAt(x) == str.charAt(x+1)) {
                counter++;
                result = counter;
            }
        }
        return result;
    }
}
