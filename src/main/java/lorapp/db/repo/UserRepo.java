package lorapp.db.repo;

import lorapp.db.entity.AppEUI;
import lorapp.db.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional

public interface UserRepo extends CrudRepository<User, Long>{
    User findByUserName(String userName);
}
