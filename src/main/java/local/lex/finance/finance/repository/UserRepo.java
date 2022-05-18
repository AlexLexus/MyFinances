package local.lex.finance.finance.repository;

import local.lex.finance.finance.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserEntity, Long> {
    UserEntity findByUserName(String userName);
}
