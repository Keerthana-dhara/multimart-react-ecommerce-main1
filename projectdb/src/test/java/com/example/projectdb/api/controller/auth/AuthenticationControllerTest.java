package com.example.projectdb.api.controller.auth;

import com.example.projectdb.api.model.RegistrationBody;
import com.example.projectdb.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(AuthenticationController.class)
public class AuthenticationControllerTest {
    @MockBean
    private UserService userService;

    @InjectMocks
    private AuthenticationController authenticationController;

    private MockMvc mockMvc;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(authenticationController).build();
    }

    @Test
    public void registerUser_Success() throws Exception {
        // Arrange
        RegistrationBody registrationBody = new RegistrationBody();
                registrationBody.setUsername("newUser");
                registrationBody.setEmail("newUser@example.com");
                registrationBody.setPassword("Password123");
                registrationBody.setFirstName("John");
                registrationBody.setLastName("Doe");
        

        // Act & Assert
        mockMvc.perform(post("/auth/register")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{ \"username\": \"newUser\", \"email\": \"newUser@example.com\", " +
                        "\"password\": \"Password123\", \"firstName\": \"John\", \"lastName\": \"Doe\" }"))
                .andExpect(status().isOk());
    }
}