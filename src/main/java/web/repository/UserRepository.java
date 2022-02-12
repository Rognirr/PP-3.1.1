package web.repository;

import web.entity.User;

import java.util.List;

public interface UserRepository {

    void add(User user);

    User getById(Long id);

    void update(User user);

    void delete(Long id);

    List<User> allUsers();
}