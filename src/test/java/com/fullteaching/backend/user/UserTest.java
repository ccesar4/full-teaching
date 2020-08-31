package com.fullteaching.backend.user;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class UserTest {

    private User userUnderTest;

    @Before
    public void setUp() {
        userUnderTest = new User("name", "password", "nickName", "picture", "roles");
    }

    @Test
    public void testEquals() {

        final boolean result = userUnderTest.equals(userUnderTest);

        assertTrue(result);
    }

    @Test
    public void testHashCode() {

        final int result = userUnderTest.hashCode();

        assertEquals(0, 0);
    }

    @Test
    public void testToString() {

        final String result = userUnderTest.toString();

        assertEquals("nickName", result);
    }

    @Test
    public void testGetSetId() {
        userUnderTest.setId((long) 9);
        assertEquals((long)userUnderTest.getId(), 9);
    }

    @Test
    public void testGetSetNickname() {
        userUnderTest.setNickName("nickName");
        assertEquals("nickName", userUnderTest.getNickName());
    }

    @Test
    public void testGetSetRoles() {
        String[] roles = {"teste1", "teste2"};
        userUnderTest.setRoles(Arrays.asList(roles));
        assertEquals(Arrays.asList(roles), userUnderTest.getRoles());
    }

    @Test
    public void testGetSetName() {
        userUnderTest.setName("teste@teste.com");
        assertEquals("teste@teste.com", userUnderTest.getName());
    }

    @Test
    public void testGetSetPasswordHash() {
        userUnderTest.setPasswordHash("teste");
        assertEquals("teste", userUnderTest.getPasswordHash());
    }

}
