package lorapp.db.repo;

import org.springframework.data.repository.CrudRepository;

import lorapp.db.entity.DevConfig;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface DevConfigRepo extends CrudRepository<DevConfig, Long> {
    List<DevConfig> findAllByDevAppMapDevEUI(String devEUI);
}
