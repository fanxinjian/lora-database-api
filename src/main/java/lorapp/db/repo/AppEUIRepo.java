package lorapp.db.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import lorapp.db.entity.AppEUI;

@Transactional

public interface AppEUIRepo extends CrudRepository<AppEUI, Long>{
	List<AppEUI> findAllByAppEUI(String appEUI);
	List<AppEUI> findAllByAppEUIAndEnabled(String appEUI, boolean enable);
	AppEUI findByAppEUI(String appEUI);
//	AppEUI findbyAppEUIAndEnabled(String appEUI, boolean enable);
}
