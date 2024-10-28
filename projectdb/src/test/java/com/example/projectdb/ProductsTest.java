// package com.example.projectdb;

// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.http.MediaType;
// import org.springframework.test.web.servlet.MockMvc;
// import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
// import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
// import static org.hamcrest.Matchers.hasSize;
// import static org.hamcrest.Matchers.is;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
// import com.example.projectdb.Model.User;
// import com.example.projectdb.Repository.UserRepository;
// import com.example.projectdb.Services.UserService;
// import com.fasterxml.jackson.databind.ObjectMapper;

// @SpringBootTest
// @AutoConfigureMockMvc
// public class ProductsTest {

// @Autowired
// private MockMvc mockMvc;

// @Autowired
// private UserService userService;

// @Autowired
// private UserRepository repo;

// @BeforeEach
// void setUp(){
//     User user1=new User("keerthana","abc");
//     User user2=new User("priya","xyz");
//     userService.fetchaddedUsers(user1);
//     userService.fetchaddedUsers(user2);
// }

// @Test
// public void testTestCase() throws Exception{
//     mockMvc.perform(MockMvcRequestBuilders.get("/test"))
//     .andExpect(MockMvcResultMatchers.status().isOk())
//     .andExpect(MockMvcResultMatchers.content()
//     .string("testing for web service"));
// }

// @Test
// public void testFetchUsers() throws Exception{
// mockMvc.perform(MockMvcRequestBuilders.get("/GET/users"))
// .andExpect(MockMvcResultMatchers.status().isOk())
// .andExpect(MockMvcResultMatchers.content().contentTypeCompatibleWith(org.springframework.http.MediaType.APPLICATION_JSON))
// .andExpect(jsonPath("$",hasSize(4)))
// .andExpect(jsonPath("$[0].username",is("hemanth")))
// .andExpect(jsonPath("$[0].password",is("abc")));
// }

// @Test
// public void testAddUsers() throws Exception{
//     User user=new User("niteesh", "password");
//     ObjectMapper mapper = new ObjectMapper();
//         String json = mapper.writeValueAsString(user);

//     mockMvc.perform(MockMvcRequestBuilders.post("/POST/users")
//     .contentType(MediaType.APPLICATION_JSON)
//     .content(json))
//     .andExpect(MockMvcResultMatchers.status().isOk())
//     .andExpect(MockMvcResultMatchers.content()
//     .string("successfully added"));
// }
// }
