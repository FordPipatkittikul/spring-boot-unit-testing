# 1. Unit testing

## 1.1 Structure

![Screenshot (14)](https://github.com/user-attachments/assets/f3ee568d-4d94-4f55-b55a-4db7998f620b)

![Screenshot (15)](https://github.com/user-attachments/assets/f8eadd3b-5fc6-4bad-8695-b0c3525df7a4)

## 1.2 Assertions

- assertEquals : Assert that the values are equal.
- assertNotEquals : Assert that the values are not equal.
- assertNull : Assert that the value is null.
- assertNotNull : Assert that the value is not null.
- assertSame : Assert that items refer to same object. **in terms of Object reference**
- assertNotSame : Assert that items do not refer to same object. **in terms of Object reference**
- assertTrue : Assert that condition is true.
- assertFalse : Assert that condition is false.
- assertArrayEquals : Assert that both object arrays are deeply equal.
- assertIterableEquals : Assert that both object iterables are deeply equal. **An "iterable" is an instance of a class that implements the java.lang.Iterable interface Examples: ArrayList, LinkedList, HashSet, TreeSet**
- assertLinesMatch : Assert that both lists of strings match.
- assertThrows Assert that an executable throws an exception of expected type.
- assertTimeoutPreemptively Assert that an executable completes before given timeout is exceeded


## 1.3 Lifecycle

- @BeforeEach : Method is executed before each test method. Useful for common setup code: creating objects, setting up test data.
- @AfterEach : Method is executed after each test method. Useful for common clean up code: releasing resources, cleanning up test data.
- @BeforeAll : Method is executred only once, before all test methods. Useful for getting database connections, connecting to servers. **by default this method must be static**
- @AfterAll : Method is executed only once, after all test methods. Useful for releasing database connections, disconnecting from servers. **by default this method must be static**

![Screenshot (16)](https://github.com/user-attachments/assets/b6a4f3bb-3256-42ac-9a5c-cf0dc9fa1f83)

## 1.4 Custom Display Names

![Screenshot (17)](https://github.com/user-attachments/assets/3903a2b7-91ba-4b6b-b346-8f5b12bfea77)

![Screenshot (18)](https://github.com/user-attachments/assets/13c574a9-ddd3-4df2-ad88-1b75417624d2)

![Screenshot (20)](https://github.com/user-attachments/assets/0c8f902c-b312-4e25-9641-da88a9c7b181)

![Screenshot (21)](https://github.com/user-attachments/assets/a2f9cbab-340c-4cef-8bae-789ef09fbb90)

## 1.5 Order of the tests

- In general
  - Order should not be a factor in unit tests
  - There should be no dependency between tests
  - All tests should pass regardless of the order in which they are run

- However, there are some uses cases when you want to control the order
  - You want tests to appear in alphabetical order for reporting purposes 
  - Sharing reports with project management, QA team etc...
  - Group tests based on functionality or requirements

![Screenshot (22)](https://github.com/user-attachments/assets/36191c6e-29a0-4360-bb3e-552c23805011)

![Screenshot (23)](https://github.com/user-attachments/assets/fddbd9c7-cd4d-4637-ae20-638f14173283)

![Screenshot (25)](https://github.com/user-attachments/assets/132a855d-7d95-45be-9a95-1278c76ebe8a)

![Screenshot (24)](https://github.com/user-attachments/assets/3de7a80a-ef4c-47db-ad68-cb9dde98ba02)

## 1.6 code coverage and test reports by intelliJ or Maven

- Code Coverage measures how many methodes/lines are called by your test. Represented as a percentage: 50% coverage
  - In general, the higher the coverage the better
    - However, 100% is not alwats attainble. usually 70% - 80% is acceptable.
  - code coverage is just one data to consider is it a good or bad test. There are a lot of data to consider is it a good or bad test.

## 1.7 Conditional Tests

- Use Cases
  - Don't run a test because the method to test is broken ... and we are waiting on dev team to fix it 
  - A test should only run for a specific version of Java (Java 18) or range of versions (13 - 18) 
  - A test should only run on a given operating system: MS Windows, Mac, Linux 
  - A test should only run if specific environment variables or system properties are set


- @Disabled : Disable a test method.
- @EnabledOnOs : Enable test when running on a given operating system.
- @EnabledOnJre : Enable test for a given Java version.
- @EnabledForJreRange : Enable test for a given Java version range.
- @EnabledIfSystemProperty : Enable test based on system property.
- @EnabledIfEnvironmentVariable : Enable test based on environment variable.

![Screenshot (26)](https://github.com/user-attachments/assets/d8c3b570-054c-4eaf-84a6-52570bed2da7)

![Screenshot (27)](https://github.com/user-attachments/assets/56ff6514-596b-499d-bba9-cffcae27adc4)

![Screenshot (29)](https://github.com/user-attachments/assets/70845487-2c1b-4b26-a6db-2854bf309e03)

# 2. TDD and ParameterizedTest

TDD:

   1. Write a failing test 
   2. Write code to make the test pass 
   3. Refactor the code 
   4. Repeat the process

Using **@ParameterizedTest**
   
   - @ValueSource Array of values: Strings, ints, doubles, floats etc
   - @CsvSource Array of CSV String values
   - @CsvFileSource CSV values read from a file
   - @EnumSource Enum constant values
   - @MethodSource Custom method for providing values

![Screenshot (30)](https://github.com/user-attachments/assets/2bd8473e-e2b9-4641-ade5-c021f7be3e6d)

![Screenshot (31)](https://github.com/user-attachments/assets/a3ce3f51-15ff-491f-a633-8cf16209483a)

![Screenshot (32)](https://github.com/user-attachments/assets/e53d42c5-9365-433c-8f96-7efdca493815)
