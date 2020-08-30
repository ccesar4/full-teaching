package com.fullteaching.backend.user;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

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
}
