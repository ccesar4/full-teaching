package com.fullteaching.backend.course;

import com.fullteaching.backend.coursedetails.CourseDetails;
import com.fullteaching.backend.session.Session;
import com.fullteaching.backend.user.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

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

    @Test
    public void testGetSetId() {
        courseUnderTest.setId(2);
        assertEquals(2, courseUnderTest.getId());
    }

    @Test
    public void testGetSetTeacher() {
        User newTeacher = Mockito.mock(User.class);
        courseUnderTest.setTeacher(newTeacher);
        assertEquals(newTeacher, courseUnderTest.getTeacher());
    }

    @Test
    public void testGetSetTile() {
        courseUnderTest.setTitle("teste");
        assertEquals("teste", courseUnderTest.getTitle());
    }

    @Test
    public void testGetSetAttenders() {
        User attender = Mockito.mock(User.class);
        Set<User> attenders = new HashSet<>();
        attenders.add(attender);

        courseUnderTest.setAttenders(attenders);
        assertEquals(attenders, courseUnderTest.getAttenders());
    }

    @Test
    public void testGetSetSessions() {
        Session session = Mockito.mock(Session.class);
        Set<Session> sessionSet = new HashSet<>();
        sessionSet.add(session);

        courseUnderTest.setSessions(sessionSet);
        assertEquals(sessionSet, courseUnderTest.getSessions());
    }

    @Test
    public void testGetSetCourseDetails() {
        CourseDetails details = Mockito.mock(CourseDetails.class);
        courseUnderTest.setCourseDetails(details);
        assertEquals(details, courseUnderTest.getCourseDetails());
    }


}