package lorapp.db.supervision.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import lorapp.db.supervision.enity.SimpleSupervision;

public interface SimpleSupervisionRepo extends CrudRepository<SimpleSupervision, Long> {
	List<SimpleSupervision> findAllByEnabled(boolean enabled);
}
