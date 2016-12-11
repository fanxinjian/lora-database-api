package lorapp.db.supervision.enity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="alarms")
public class Alarm {
	@Id
	@GeneratedValue
	private Long id;
	
	private String appEUI;
	private String devEUI;
	private Date raiseTime;
	private Date cleardTime;
	private String reason;
	private boolean cleared = false;
	
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
	public String getDevEUI() {
		return devEUI;
	}
	public void setDevEUI(String devEUI) {
		this.devEUI = devEUI;
	}
	public Date getRaiseTime() {
		return raiseTime;
	}
	public void setRaiseTime(Date raiseTime) {
		this.raiseTime = raiseTime;
	}
	public boolean isCleared() {
		return cleared;
	}
	public void setCleared(boolean cleared) {
		this.cleared = cleared;
	}
	public Date getCleardTime() {
		return cleardTime;
	}
	public void setCleardTime(Date cleardTime) {
		this.cleardTime = cleardTime;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
}
