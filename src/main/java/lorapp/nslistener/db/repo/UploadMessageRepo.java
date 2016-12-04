package lorapp.nslistener.db.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import lorapp.nslistener.db.entity.UploadMessage;
import lorapp.nslistener.db.entity.component.AppDevMap;

public interface UploadMessageRepo extends CrudRepository<UploadMessage, Long> {
	List<UploadMessage> findAllByDevAppMap(AppDevMap devAppMap);
}
