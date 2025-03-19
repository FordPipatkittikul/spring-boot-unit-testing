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

# 3 Spring Boot support for Unit Testing

## 3.1 What do we need for Spring Boot unit testing

 - Access to the Spring Application Context
 - Support for Spring dependency injection
 - Retrieve data from Spring application.properties
 - Mock object support for web, data, REST APIs etc

![Screenshot (33)](https://github.com/user-attachments/assets/07fe42a3-3ef5-48dc-af92-6c54a3b05d44)

![Screenshot (34)](https://github.com/user-attachments/assets/467295eb-cb30-4743-811f-64e30fbab058)

![Screenshot (35)](https://github.com/user-attachments/assets/b89d4597-79c5-441c-af91-69f37e6d0fc0)

## 3.2 Configuration

![Screenshot (36)](https://github.com/user-attachments/assets/2dd54c58-248e-4b7f-a786-34a1a8624dc1)

![Screenshot (37)](https://github.com/user-attachments/assets/3f3b504f-3f68-4a1d-aad2-f8605aa4dea8)

# Mocking

## 3.1 benefits

- Allows us to test a given class in isolation
- Test interaction between given class and its dependencies
- Minimizes configuration / availability of dependencies
- For example DAO, DB, REST API etc
    - We can mock the DAO to give a response
    - We can mock a REST API to give a response

![Screenshot (38)](https://github.com/user-attachments/assets/471c6629-b5e2-4cce-9b69-7f7826ab83f0)

## 3.2 Mocking Framework

- Mockito. **Reccomend** because Spring boot has built-in support for Mockito.
- EasyMock
- JMockit

## 3.3 Process

![Screenshot (39)](https://github.com/user-attachments/assets/ebc27f10-6705-4182-ba8a-8015958a8b1a)

![Screenshot (44)](https://github.com/user-attachments/assets/b47dfe35-5da9-480f-b5e0-decef0aed1af)

![Screenshot (45)](https://github.com/user-attachments/assets/996b57fb-c3c4-4908-af22-6584fa003042)

![Screenshot (40)](https://github.com/user-attachments/assets/c1615b00-b317-4a20-96bc-1c15e8196b02)

![Screenshot (41)](https://github.com/user-attachments/assets/8d9d3365-837d-4e7d-87f1-0b08b13c0e49)

![Screenshot (42)](https://github.com/user-attachments/assets/f30cd49d-8135-41d4-9276-3b3fa5cd4069)

![Screenshot (43)](https://github.com/user-attachments/assets/f962cf51-d190-4e2f-ae1e-a6f93a5aef4d)


## 3.4 @MockitoBean

![Screenshot (46)](https://github.com/user-attachments/assets/61baf8ae-6c47-4bee-a605-91bac455dd83)

![Screenshot (47)](https://github.com/user-attachments/assets/ab4c87d7-7702-466c-9e86-1fd1b17ae173)

# 4 Testing using Reflection

- It is for special cases when you need to access non-public fields or invoke non-public methods

- In general, testing non-public fields and methods is controversial(ขัดเเย้ง). So be careful about it.

![Screenshot (48)](https://github.com/user-attachments/assets/419eeb6f-7352-48ca-a079-a7196bb680c0)

![Screenshot (49)](https://github.com/user-attachments/assets/fabded32-32cf-4e08-8eed-752883de458b)

![Screenshot (50)](https://github.com/user-attachments/assets/d888ec30-ad23-4625-8367-1dc2a6773b48)

# 5 Database Integration Testing

## 5.1 Approach

- When we are performing integration testing with a database
  - Each test should run from a known state 

- Before each test, perform initialization
  - Insert sample data
     
- After each test, perform cleanup
  - Delete the sample data

![Screenshot (51)](https://github.com/user-attachments/assets/5ade4147-fe58-4851-99cb-d92212662cf2)

## 5.2 Set Up SQL Scripts in properties file instead of hardcoding

![Screenshot (52)](https://github.com/user-attachments/assets/47f93f00-000e-45af-8729-c4935e2551ba)

![Screenshot (53)](https://github.com/user-attachments/assets/e301b201-9118-43b6-836d-e1d6d7ef8c46)

![Screenshot (54)](https://github.com/user-attachments/assets/3dc62ee6-3fa9-4a5b-929b-e984ea485389)


