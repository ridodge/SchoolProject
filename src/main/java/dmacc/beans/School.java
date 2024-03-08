/**
 * Riley Dodge - tjrace
 * CIS175 - Fall 2023
 * Mar 7, 2024
 */

package dmacc.beans;

import jakarta.persistence.Embeddable;

/**
 * 
 */
@Embeddable
public class School {
	private String schoolName;
	private String city;
	private String state;
	public String getName() {
		return schoolName;
	}
	public void setName(String name) {
		this.schoolName = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public School(String name, String city, String state) {
		this.schoolName = name;
		this.city = city;
		this.state = state;
	}
	public School() {
	}
	
	@Override
	public String toString() {
		return "School [name=" + schoolName + ", city=" + city + ", state=" + state + "]";
	}

}
