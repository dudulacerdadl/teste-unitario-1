import org.junit.Test;

import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void testTrue() {
        MyClass tester = new MyClass();
        assertTrue("Value X or Y equals 0", tester.quotbool(1,1));
        assertFalse("Value X or Y not equals 0", tester.quotbool(0,0));
    }

    @Test
    public void testFalse() {
        MyClass tester = new MyClass();
        assertFalse("Value X or Y not equals 0", tester.quotbool(0,0));
    }

    @Test
    public void testEquals() {
        MyClass tester = new MyClass();
        assertEquals("10 / 5 must be 2", 2, tester.quotient(10,5));
    }

    @Test
    public void testEqualsBool() {
        MyClass tester = new MyClass();
        assertEquals("Your return not float", 1.4, tester.quotient(10,7), 5);
    }

    @Test
    public void testNull() {
        MyClass tester = new MyClass();
        assertNull("Result isn't null", tester.quotnull(1));
    }

    @Test
    public void testNotNull() {
        MyClass tester = new MyClass();
        assertNotNull("Result is null", tester.quotnull(0));
    }

    @Test
    public  void testSame() {
        MyClass tester = new MyClass();
        ObjA classes = new ObjA();
        assertSame("Objects not equals", classes, classes);
    }

    @Test
    public  void testNotSame() {
        MyClass tester = new MyClass();
        ObjA classA = new ObjA();
        ObjB classB = new ObjB();
        assertNotSame("Objects equals", classA, classB);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExpectionIsThrown() {
        MyClass tester = new MyClass();
        tester.quotient(10, 0);
    }
}