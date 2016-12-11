package lorapp.db.supervision.repo;

import org.springframework.data.repository.CrudRepository;

import lorapp.db.supervision.enity.Alarm;

public interface AlarmRepo extends CrudRepository<Alarm, Long> {
}
