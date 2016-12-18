package lorapp.db.supervision.enity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

@Entity(name="simple_supervision")
public class SimpleSupervision implements Serializable {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String appEui;
	private String devEui;
	private String spvdMetric;
	private String comparator; //less, lessOrequal, greater, greaterOrequal, equal
	private float threshold;
	private boolean enabled;
	@JsonIgnore
	private boolean alarming = false;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAppEui() {
		return appEui;
	}

	public void setAppEui(String appEui) {
		this.appEui = appEui;
	}

	public String getDevEui() {
		return devEui;
	}

	public void setDevEui(String devEui) {
		this.devEui = devEui;
	}

	public String getSpvdMetric() {
		return spvdMetric;
	}

	public void setSpvdMetric(String spvdMetric) {
		this.spvdMetric = spvdMetric;
	}

	public String getComparator() {
		return comparator;
	}

	public void setComparator(String comparator) {
		this.comparator = comparator;
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
