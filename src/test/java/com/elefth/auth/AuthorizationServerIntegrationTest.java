package com.elefth.auth;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author <a href="mailto:george@elefth.com">Eleftheriadis Georgios</a>
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = AuthorizationServerApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class AuthorizationServerIntegrationTest {

    @Test
    public void whenLoadApplication_thenSuccess() {

    }

}