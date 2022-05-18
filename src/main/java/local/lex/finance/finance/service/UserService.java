package local.lex.finance.finance.service;

import local.lex.finance.finance.entity.UserEntity;
import local.lex.finance.finance.exceptions.UserAlreadyExistException;
import local.lex.finance.finance.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public UserEntity registerUser(UserEntity user) throws UserAlreadyExistException {
        if (userRepo.findByUserName(user.getUserName()) != null) throw new UserAlreadyExistException("User already exist");
        return userRepo.save(user);
    }
}
