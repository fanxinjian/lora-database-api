package lorapp.db.repo;

import org.springframework.data.repository.CrudRepository;

import lorapp.db.entity.DevConfig;


public interface DevConfigRepo extends CrudRepository<DevConfig, Long> {

}
