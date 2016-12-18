package lorapp.db.supervision.repo;

import org.springframework.data.repository.CrudRepository;

import lorapp.db.supervision.enity.Alarm;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface AlarmRepo extends CrudRepository<Alarm, Long> {
}
