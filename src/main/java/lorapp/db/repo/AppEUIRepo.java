package lorapp.db.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import lorapp.db.entity.AppEUI;

@Transactional

public interface AppEUIRepo extends CrudRepository<AppEUI, Long>{
}
