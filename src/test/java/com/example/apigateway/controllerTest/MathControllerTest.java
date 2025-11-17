package com.example.apigateway.controllerTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class MathControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testSumEndpoint() throws Exception {
        mockMvc.perform(get("/sum/10/5"))
                .andExpect(status().isOk())
                .andExpect(content().string("15.0"));
    }

    @Test
    void testInvalidInput() throws Exception {
        mockMvc.perform(get("/sum/a/b"))
                .andExpect(status().isBadRequest());
    }
}
