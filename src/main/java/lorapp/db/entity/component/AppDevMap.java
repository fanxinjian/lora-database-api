package lorapp.db.entity.component;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AppDevMap {
	@Column(nullable = false, unique = true, length = 50)
	private String devEUI;
	@Column(nullable = false, length = 50)
	private String appEUI;
	
	public AppDevMap(){}
	public AppDevMap(String appEUI2, String devEUI2) {
		appEUI = appEUI2;
		devEUI = devEUI2;
	}
	public String getDevEUI() {
		return devEUI;
	}
	public void setDevEUI(String devEUI) {
		this.devEUI = devEUI;
	}
	public String getAppEUI() {
		return appEUI;
	}
	public void setAppEUI(String appEUI) {
		this.appEUI = appEUI;
	}

}
