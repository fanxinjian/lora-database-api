package lorapp.db.supervision.enity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name="simple_supervision")
public class SimpleSupervision {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String AppEUI;
	private String DevEUI;
	private String comparator; //less, lessOrequal, greater, greaterOrequal, equal
	private float threshold;
	private boolean enabled;
	@JsonIgnore
	private boolean alarming = false;
	
	public String getAppEUI() {
		return AppEUI;
	}
	public void setAppEUI(String appEUI) {
		AppEUI = appEUI;
	}
	public String getDevEUI() {
		return DevEUI;
	}
	public void setDevEUI(String devEUI) {
		DevEUI = devEUI;
	}
	public String getMethod() {
		return comparator;
	}
	public void setMethod(String method) {
		this.comparator = method;
	}
	public float getThreshold() {
		return threshold;
	}
	public void setThreshold(float threshold) {
		this.threshold = threshold;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public boolean isAlarming() {
		return alarming;
	}
	public void setAlarming(boolean alarming) {
		this.alarming = alarming;
	}
}
