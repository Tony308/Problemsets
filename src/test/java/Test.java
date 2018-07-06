import org.junit.Before;
import org.junit.Ignore;

import static org.junit.Test.*;
import static org.junit.Assert.*;

public class Test {

    @org.junit.Test
    public void getSandwichTest() {
        JavaAssessment main = new JavaAssessment();

        assertEquals("and", main.getSandwich("hellabreadandbread"));
        assertEquals("jam", main.getSandwich("xxbreadjambreadyy"));
        assertEquals("", main.getSandwich("xxbreadyy"));
        assertEquals("honey", main.getSandwich("xxbreadhoneybreadyy"));
    }
    @org.junit.Test
    public void evenlySpacedTest() {
        JavaAssessment main = new JavaAssessment();

        assertEquals(true, main.evenlySpaced(1,2,3));
        assertEquals(true, main.evenlySpaced(4,6,2));
        assertEquals(false, main.evenlySpaced(1,4,8));

    }

    @org.junit.Test
    public void nTwiceTest() {

        JavaAssessment main = new JavaAssessment();

        assertEquals("Helo", main.nTwice("Hello", 2)   );
        assertEquals("Choate", main.nTwice("Chocolate", 3)  );
        assertEquals("Ce", main.nTwice("Chocolate", 1));
    }

    @org.junit.Test
    public void endslyTest() {

        JavaAssessment main = new JavaAssessment();
        assertEquals(true, main.endsly("oddly"));
        assertEquals(false, main.endsly("y"));
        assertEquals(false, main.endsly("oddy"));
        assertEquals(false, main.endsly("l"));

    }

    @org.junit.Test
    public void stringCleanTest() {

        JavaAssessment main = new JavaAssessment();
        assertEquals("yza", main.stringClean("yyzzza") );
        assertEquals("abcd", main.stringClean("abbbcdd"));
        assertEquals("Helo", main.stringClean("Hello"));
    }

    @org.junit.Test
    @Ignore
    public void fibonacciTest() {
        JavaAssessment main = new JavaAssessment();

        assertEquals(0, main.fibonacci(0));
        assertEquals(1, main.fibonacci(1));
//        assertEquals(1, main.fibonacci(2));
//        assertEquals(2, main.fibonacci(3));
//        assertEquals(75025, main.fibonacci(25));


    }

    @org.junit.Test

    public void bunnyEarsTest() {
        JavaAssessment main = new JavaAssessment();
        System.out.println(main.bunnyEars(1));
        assertEquals(2, main.bunnyEars(1));
        assertEquals(4, main.bunnyEars(2));
        assertEquals(6, main.bunnyEars(3));
        assertEquals(50, main.bunnyEars(25));

    }

    @org.junit.Test
    public void doubleCharTest() {
        JavaAssessment main = new JavaAssessment();

    }

}

