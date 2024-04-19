package web.service;

import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    void removeUserById(long id);

    User findById(long id);

    List<User> getAllUsers();

    void updateUser(User user);

}
