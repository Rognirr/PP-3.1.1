package web.service;

import web.entity.User;

import java.util.List;

public interface UserService {

    void add(User user);

    User getById(Long id);

    void update(User user);

    void delete(Long id);

    List<User> allUsers();
}
