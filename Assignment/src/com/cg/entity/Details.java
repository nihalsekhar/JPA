package com.cg.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="cargo_details")
public class Details {
@Id
@GeneratedValue(generator="my_seq")
@SequenceGenerator(name="my_seq",sequenceName="MY_SEQ", allocationSize=1)
	private int trackingId;
	private String packageName;
	private String origin;
	private String destination;
	private String customerName;
	
	public int getTrackingId() {
		return trackingId;
	}
	public void setTrackingId(int trackingId) {
		this.trackingId = trackingId;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		return "Details [trackingId=" + trackingId + ", packageName=" + packageName + ", origin=" + origin
				+ ", destination=" + destination + ", customerName=" + customerName + "]";
	}
	public Details() {
		super();

	}
	
}
