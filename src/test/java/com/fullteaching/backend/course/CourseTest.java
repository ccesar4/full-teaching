package com.fullteaching.backend.course;

import com.fullteaching.backend.coursedetails.CourseDetails;
import com.fullteaching.backend.user.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

@RunWith(MockitoJUnitRunner.class)
public class CourseTest {

    @Mock
    private User mockTeacher;
    @Mock
    private CourseDetails mockCourseDetails;

    private Course courseUnderTest;

    @Before
    public void setUp() {

        courseUnderTest = new Course("title", "image", mockTeacher, mockCourseDetails);
    }

    @Test
    public void testEquals() {

        final boolean result = courseUnderTest.equals(courseUnderTest);

        assertTrue(result);
    }

    @Test
    public void testToString() {

        when(mockTeacher.getNickName()).thenReturn("result");

        final String result = courseUnderTest.toString();

        assertEquals("Course[title: \"title\", teacher: \"result\", #attenders: 0, #sessions: 0]", result);
    }
}
