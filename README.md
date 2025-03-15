# 1. Unit testing

## Structure

![Screenshot (14)](https://github.com/user-attachments/assets/f3ee568d-4d94-4f55-b55a-4db7998f620b)

![Screenshot (15)](https://github.com/user-attachments/assets/f8eadd3b-5fc6-4bad-8695-b0c3525df7a4)

## Lifecycle

- @BeforeEach : Method is executed before each test method. Useful for common setup code: creating objects, setting up test data.
- @AfterEach : Method is executed after each test method. Useful for common clean up code: releasing resources, cleanning up test data.
- @BeforeAll : Method is executred only once, before all test methods. Useful for getting database connections, connecting to servers. **by default this method must be static**
- @AfterAll : Method is executed only once, after all test methods. Useful for releasing database connections, disconnecting from servers. **by default this method must be static**

![Screenshot (16)](https://github.com/user-attachments/assets/b6a4f3bb-3256-42ac-9a5c-cf0dc9fa1f83)

## Custom Display Names

![Screenshot (17)](https://github.com/user-attachments/assets/3903a2b7-91ba-4b6b-b346-8f5b12bfea77)

![Screenshot (18)](https://github.com/user-attachments/assets/13c574a9-ddd3-4df2-ad88-1b75417624d2)

![Screenshot (20)](https://github.com/user-attachments/assets/0c8f902c-b312-4e25-9641-da88a9c7b181)

![Screenshot (21)](https://github.com/user-attachments/assets/a2f9cbab-340c-4cef-8bae-789ef09fbb90)


