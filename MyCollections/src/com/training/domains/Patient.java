package com.training.domains;

public class Patient implements Comparable<Patient> {

	private long patientId;
	private String patientName;
	private long phoneNumber;

	public Patient() {
		super();
	}

	public Patient(long patientId, String patientName, long phoneNumber) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.phoneNumber = phoneNumber;
	}

	public long getPatientId() {
		return patientId;
	}

	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "\n\tPatient ID: " + patientId + "\n\tPatient Name: " + patientName + "\n\tPhone Number: " + phoneNumber;
	}

	@Override
	public int compareTo(Patient o) {
		if (patientId < o.patientId)
			return -1;
		else if (patientId > o.patientId)
			return 1;
		else
			return 0;
	}

}
