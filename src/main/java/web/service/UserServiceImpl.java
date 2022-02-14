package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.repository.UserRepository;
import web.entity.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userDao) {
        this.userRepository = userDao;
    }

    @Transactional
    @Override
    public void add(User user) {
        userRepository.add(user);
    }

    @Override
    public User getById(Long id) {
        return userRepository.getById(id);
    }

    @Transactional
    @Override
    public void update(User user) {
        userRepository.update(user);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        userRepository.delete(id);
    }

    @Transactional
    @Override
    public List<User> allUsers() {
        return userRepository.allUsers();
    }
}
