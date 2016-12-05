package lorapp.db.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import lorapp.db.entity.UploadMessage;
import lorapp.db.entity.component.AppDevMap;

public interface UploadMessageRepo extends CrudRepository<UploadMessage, Long> {
	List<UploadMessage> findAllByDevAppMap(AppDevMap devAppMap);
	List<UploadMessage> findAllByDevAppMapAndReceiveTimeBetween(AppDevMap devAppMap, Date from, Date to);
}
