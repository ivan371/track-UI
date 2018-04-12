package tests;

import org.junit.Test;
import problem3.WebService;

import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WebServiceTest {

    @Test
    public void testPositiveGetUserEmail() {
        WebService webService = mock(WebService.class);
        String email = "test@test.ru";
        int id = 1;
        when(webService.getUserEmail(id)).thenReturn(email);
        assertEquals("e-mail for id " + id, email, webService.getUserEmail(id));
    }

    @Test
    public void testNegativeGetUserEmail() {
        WebService webService = mock(WebService.class);
        String email = "test@test.ru";
        int id = 1;
        when(webService.getUserEmail(id)).thenReturn(null);
        assertEquals("e-mail for id " + id, email, webService.getUserEmail(id));
    }

    @Test
    public void testPositiveGetCurrentUrl() {
        WebService webService = mock(WebService.class);
        String url = "https://mail.ru/";
        when(webService.getCurrentUrl()).thenReturn(url);
        assertEquals("current url", url, webService.getCurrentUrl());
    }

    @Test
    public void testNegativeGetCurrentUrl() {
        WebService webService = mock(WebService.class);
        String url = "https://mail.ru";
        when(webService.getCurrentUrl()).thenReturn(null);
        assertEquals("current url", url, webService.getCurrentUrl());
    }

    @Test
    public void testPositiveIsRegisteredUser() {
        WebService webService = mock(WebService.class);
        String email = "test@test.ru";
        when(webService.isRegisteredUser(email)).thenReturn(true);
        assertTrue("registered e-mail: " + email, webService.isRegisteredUser(email));
    }

    @Test
    public void testNegativeIsRegisteredUser() {
        WebService webService = mock(WebService.class);
        String email = "test@test.ru";
        when(webService.isRegisteredUser(email)).thenReturn(false);
        assertTrue("registered e-mail: " + email, webService.isRegisteredUser(email));
    }
}
