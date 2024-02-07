package pro.sky.users.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pro.sky.users.entity.User;
import pro.sky.users.repository.UsersRepository;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public void createUser(User user){
        usersRepository.save(user);
    }

    public User getUserById(Integer id){
        return usersRepository.getById(id);
    }

    public void deleteUserById(Integer id){
        usersRepository.getById(id);
    }

}
