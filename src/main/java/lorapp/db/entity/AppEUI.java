package lorapp.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="appeuis")
public class AppEUI {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false, unique = true, length = 50)
	private String appEUI;
	
	private boolean enabled = true;

	public AppEUI(){}
	public AppEUI(String appEUI){
		this.appEUI = appEUI;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getAppEUI() {
		return appEUI;
	}
	public void setAppEUI(String appEUI) {
		this.appEUI = appEUI;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	
}
