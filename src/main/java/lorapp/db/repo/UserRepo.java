package lorapp.db.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import lorapp.db.entity.User;

@Transactional

public interface UserRepo extends CrudRepository<User, Long>{
    User findByUserName(String userName);
}
