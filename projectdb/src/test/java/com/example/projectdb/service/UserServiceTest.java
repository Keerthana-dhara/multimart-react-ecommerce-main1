package com.example.projectdb.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.projectdb.api.model.RegistrationBody;
import com.example.projectdb.exception.UserAlreadyExistsException;
import jakarta.transaction.Transactional;

@SpringBootTest
public class UserServiceTest {

  /** The UserService to test. */
  @Autowired
  private UserService userService;

  /**
   * Tests the registration process of the user.
   * @throws MessagingException Thrown if the mocked email service fails somehow.
   */
  @Test
  @Transactional
  public void testRegisterUser() {
    RegistrationBody body = new RegistrationBody();
    body.setUsername("test-1");
    body.setEmail("UserServiceTest$testRegisterUser@junit.com");
    body.setFirstName("FirstName");
    body.setLastName("LastName");
    body.setPassword("MySecretPassword123");
    Assertions.assertThrows(UserAlreadyExistsException.class,
        () -> userService.registerUser(body), "Username should already be in use.");
    body.setUsername("UserServiceTest$testRegisterUser");
    body.setEmail("UserA@junit.com");
    Assertions.assertThrows(UserAlreadyExistsException.class,
        () -> userService.registerUser(body), "Email should already be in use.");
    body.setEmail("UserServiceTest$testRegisterUser@junit.com");
    Assertions.assertDoesNotThrow(() -> userService.registerUser(body),
        "User should register successfully.");
  }

}




