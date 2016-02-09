package com.training.utils;

import java.util.*;

import com.training.domains.Doctor;
import com.training.domains.Patient;

public class MyComparators {

	// Inner Classes - Used

	public class NameComparator implements Comparator<Doctor> {

		@Override
		public int compare(Doctor o1, Doctor o2) {
			// String Class already implements Comparable
			// Doctor Class is Encapsulated. Hence using getter Method
			return o1.getDoctorName().compareTo(o2.getDoctorName());
		}

	}

	public class Specialization implements Comparator<Doctor> {

		@Override
		public int compare(Doctor o1, Doctor o2) {
			return o1.getSpecialization().compareTo(o2.getSpecialization());
		}

	}

	public class PatientComparator implements Comparator<Patient> {

		@Override
		public int compare(Patient o1, Patient o2) {
			return o1.getPatientName().compareTo(o2.getPatientName());
		}

	}
}
