import org.junit.jupiter.api.Disabled;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;


public class UnitTests {

    private JavaAssessment main;
    
    @BeforeMethod
    public void setUp() {
        main = new JavaAssessment();
    }


    @Test
    public void doubleCharTest() {
        assertEquals(main.doubleChar("The"), "TThhee");
        assertEquals("AAAAbbbb", main.doubleChar("AAbb"));
        assertEquals("HHii--TThheerree", main.doubleChar("Hi-There"));
    }

    @Test
    public void getSandwichTest() {
        assertEquals("and", main.getSandwich("hellabreadandbread"));
        assertEquals("jam", main.getSandwich("xxbreadjambreadyy"));
        assertEquals("", main.getSandwich("xxbreadyy"));
        assertEquals("honey", main.getSandwich("xxbreadhoneybreadyy"));
    }
    @Test
    public void evenlySpacedTest() {

        assertTrue(main.evenlySpaced(1, 2, 3));
        assertTrue(main.evenlySpaced(4, 6, 2));
        assertFalse(main.evenlySpaced(1, 4, 8));

    }

    @Test
    public void nTwiceTest() {

        assertEquals("Helo", main.nTwice("Hello", 2)   );
        assertEquals("Choate", main.nTwice("Chocolate", 3)  );
        assertEquals("Ce", main.nTwice("Chocolate", 1));
    }

    @Test
    public void endslyTest() {
        assertTrue(main.endsly("oddly"));
        assertFalse(main.endsly("y"));
        assertFalse(main.endsly("oddy"));
        assertFalse(main.endsly("l"));

    }

    @Test
    public void stringCleanTest() {

        assertEquals("yza", main.stringClean("yyzzza") );
        assertEquals("abcd", main.stringClean("abbbcdd"));
        assertEquals("Helo", main.stringClean("Hello"));
        assertEquals("abcdefg", main.stringClean("abcdefg"));
        assertEquals("b", main.stringClean("bb"));
        assertEquals("b", main.stringClean("bbb"));
    }

    @Test
    public void fibonacciTest() {
        

        assertEquals(0, main.fibonacci(0));
        assertEquals(1, main.fibonacci(1));
        assertEquals(1, main.fibonacci(2));
        assertEquals(2, main.fibonacci(3));
        assertEquals(3, main.fibonacci(4));
        assertEquals(5, main.fibonacci(5));
        assertEquals(8, main.fibonacci(6));
        assertEquals(75025, main.fibonacci(25));


    }

    @Test
    public void bunnyEarsTest() {
        assertEquals(0, main.bunnyEars(0));
        assertEquals(2, main.bunnyEars(1));
        assertEquals(4, main.bunnyEars(2));
        assertEquals(8, main.bunnyEars(4));
        assertEquals(32, main.bunnyEars(16));

    }

    @Test
    public void testSuperBlock() {

        assertEquals(2, main.superBlock("jeffbert"));
        assertEquals(3, main.superBlock("abbCCCddBBBxx"));
        assertEquals(0, main.superBlock(""));
    }
}

