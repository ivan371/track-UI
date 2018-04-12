package problem3;

public interface WebService {
    String getUserEmail(int id);
    String getCurrentUrl();
    boolean isRegisteredUser(String email);
}
