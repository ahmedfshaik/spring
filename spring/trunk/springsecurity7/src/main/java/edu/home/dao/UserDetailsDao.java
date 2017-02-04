package edu.home.dao;

import edu.home.domain.UserAttempts;

public interface UserDetailsDao {

    void updateFailAttempts(String username);

    void resetFailAttempts(String username);

    UserAttempts getUserAttempts(String username);

}
