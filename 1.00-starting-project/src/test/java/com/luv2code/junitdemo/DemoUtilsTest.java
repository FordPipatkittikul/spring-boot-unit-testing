package com.luv2code.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.List;


public class DemoUtilsTest {

    DemoUtils demoUtils;

    @BeforeEach
    void setUp(){
        // Set up
        demoUtils = new DemoUtils();
        System.out.println("@BeforeEach executes before the execution of each test method");
    }

    @AfterEach
    void cleanUp(){
        System.out.println("Running @AfterEach\n");
    }

    @BeforeAll
    static void setupBeforeAll(){
        System.out.println("@BeforeAll executes only once before all test methods execution in the class\n");
    }

    @AfterAll
    static void cleanUpAfterAll(){
        System.out.println("@AfterAll executes only after all test methods execution in the class");
    }

    @Test
    void testEqualsAndNotEquals(){
        System.out.println("running testEqualsAndNotEquals");
        int expected = 6;

        // execute
        int actual = demoUtils.add(2,4);

        // assert
        assertEquals(expected, actual, "2+4 = 6");
        assertNotEquals(8, actual, "2+4 != 8");

    }

    @Test
    void testNullAndNotNull(){
        System.out.println("running testNullAndNotNull");
        String str1 = null;
        String str2 = "xyz";

        assertNull(demoUtils.checkNull(str1), "Object should be null");
        assertNotNull(demoUtils.checkNull(str2), "Object should not be null");
    }

    @Test
    void testSameAndNotSame(){
        String str = "luv2code";

        assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate(), "Objects should refer to same object");
        assertNotSame(str, demoUtils.getAcademy(), "Objects should not refer to same object");
    }

    @Test
    void testTrueFalse(){
        int gradeOne = 15;
        int gradeTwo = 10;

        assertTrue(demoUtils.isGreater(gradeOne,gradeTwo), "Should return True");
        assertFalse(demoUtils.isGreater(gradeTwo,gradeOne), "Should return False");
    }

    @Test
    void testArrayEquals(){
        String[] stringArray = {"A", "B", "C"};

        assertArrayEquals(stringArray, demoUtils.getFirstThreeLettersOfAlphabet(), "Arrays should be the same");
    }

    @Test
    void testIterableEquals(){
        List<String> arrayListOfString = List.of("luv", "2", "code");

        assertIterableEquals(arrayListOfString, demoUtils.getAcademyInList(), "array list of string should be the same");
    }

    @Test
    void testThrowsAndDoesNotThrow(){
        assertThrows(Exception.class, () -> { demoUtils.throwException(-1); }, "Should throw exception" );
        assertDoesNotThrow(() -> { demoUtils.throwException(9); }, "Should not throw exception" );
    }

    @Test
    void testTimeout(){
        assertTimeoutPreemptively(Duration.ofSeconds(3), () -> { demoUtils.checkTimeout(); }, "Method should execute in 3 seconds");
    }
}
