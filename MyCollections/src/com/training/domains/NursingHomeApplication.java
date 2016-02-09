package com.training.domains;

import java.util.*;

public class NursingHomeApplication {

	public static void main(String[] args) {

		Doctor doc1 = new Doctor(101, "V.K.Sharma", "Dermatology");
		Doctor doc2 = new Doctor(302, "Mansukhani", "Gynaecology");
		Doctor doc3 = new Doctor(103, "N.F.Shah", "Endocrinology");
		Doctor doc4 = new Doctor(204, "Kirtane", "ENT");

		NursingHome nhObj = new NursingHome();

		nhObj.addDoctor(doc1);
		nhObj.addDoctor(doc2);
		nhObj.addDoctor(doc3);
		nhObj.addDoctor(doc4);

		Patient pat1 = new Patient(910, "Ishika", 9889);
		Patient pat2 = new Patient(915, "Dhawal", 9998);
		Patient pat3 = new Patient(895, "Gaurav", 9898);

		TreeSet<Patient> patients = new TreeSet<Patient>();
		// Hash Set is not ordered in any way - comparable / comparator not
		// added
		// HashSet<Patient> patients = new HashSet<Patient>();

		patients.add(pat1);
		patients.add(pat2);
		patients.add(pat3);

		doc1.setPatients(patients);
		System.out.println("Printing Doctor List: ");
		nhObj.printDoctorList();
		System.out.println("\nPrinting Doctor List by ID sequence: ");
		nhObj.printSortedList(1);
		System.out.println("\nPrinting Doctor List by Name: ");
		nhObj.printSortedList(2);
		System.out.println("\nPrinting Doctor List by Specialization: ");
		nhObj.printSortedList(3);
	}

}
