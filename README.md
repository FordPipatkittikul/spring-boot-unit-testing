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

## 1.6
