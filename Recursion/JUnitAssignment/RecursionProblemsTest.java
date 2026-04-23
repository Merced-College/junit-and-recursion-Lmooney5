import org.junit.Test;
import static org.junit.Assert.*;

public class RecursionProblemsTest {

    // count8 (5 tests)

    @Test
    public void testCount8Single() {
        assertEquals(1, RecursionProblems.count8(8));
    }

    @Test
    public void testCount8DoubleChain() {
        assertEquals(4, RecursionProblems.count8(8818));
    }

    @Test
    public void testCount8Mixed() {
        assertEquals(2, RecursionProblems.count8(818));
    }

    @Test
    public void testCount8None() {
        assertEquals(0, RecursionProblems.count8(123));
    }

    @Test
    public void testCount8AllEights() {
        assertEquals(9, RecursionProblems.count8(88888)); // IMPORTANT FIX
    }

    // countHi (5 tests)

    @Test
    public void testCountHiBasic() {
        assertEquals(1, RecursionProblems.countHi("xxhixx"));
    }

    @Test
    public void testCountHiMultiple() {
        assertEquals(2, RecursionProblems.countHi("xhixhix"));
    }

    @Test
    public void testCountHiExact() {
        assertEquals(1, RecursionProblems.countHi("hi"));
    }

    @Test
    public void testCountHiNone() {
        assertEquals(0, RecursionProblems.countHi("abc"));
    }

    @Test
    public void testCountHiRepeat() {
        assertEquals(3, RecursionProblems.countHi("hihihi"));
    }

    // countHi2 (5 tests)

    @Test
    public void testCountHi2Basic() {
        assertEquals(1, RecursionProblems.countHi2("ahixhi"));
    }

    @Test
    public void testCountHi2Multiple() {
        assertEquals(2, RecursionProblems.countHi2("ahibhi"));
    }

    @Test
    public void testCountHi2Blocked() {
        assertEquals(0, RecursionProblems.countHi2("xhixhi"));
    }

    @Test
    public void testCountHi2None() {
        assertEquals(0, RecursionProblems.countHi2("xxxx"));
    }

    @Test
    public void testCountHi2Mixed() {
        assertEquals(1, RecursionProblems.countHi2("xhihi"));
    }

    // strCount (5 tests)

    @Test
    public void testStrCountBasic() {
        assertEquals(2, RecursionProblems.strCount("catcowcat", "cat"));
    }

    @Test
    public void testStrCountSingle() {
        assertEquals(1, RecursionProblems.strCount("catcowcat", "cow"));
    }

    @Test
    public void testStrCountNone() {
        assertEquals(0, RecursionProblems.strCount("catcowcat", "dog"));
    }

    @Test
    public void testStrCountRepeat() {
        assertEquals(2, RecursionProblems.strCount("aaaa", "aa"));
    }

    @Test
    public void testStrCountExact() {
        assertEquals(1, RecursionProblems.strCount("cat", "cat"));
    }

    // stringClean (5 tests)

    @Test
    public void testStringCleanBasic() {
        assertEquals("yza", RecursionProblems.stringClean("yyzzza"));
    }

    @Test
    public void testStringCleanLetters() {
        assertEquals("abcd", RecursionProblems.stringClean("abbbcdd"));
    }

    @Test
    public void testStringCleanMixed() {
        assertEquals("Helo", RecursionProblems.stringClean("Hello"));
    }

    @Test
    public void testStringCleanNone() {
        assertEquals("abc", RecursionProblems.stringClean("abc"));
    }

    @Test
    public void testStringCleanAllSame() {
        assertEquals("a", RecursionProblems.stringClean("aaaaa"));
    }
}