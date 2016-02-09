package com.training.domains;

import java.util.*;

import com.training.utils.MyComparators;

public class NursingHome {

	// Creating Type Safe Ordered Collection
	private ArrayList<Doctor> docList;

	public NursingHome() {
		// Generic
		docList = new ArrayList<Doctor>();
	}

	public boolean addDoctor(Doctor doc) {
		boolean result = docList.add(doc);
		return result;
	}

	public void printDoctorList() {
		for (Doctor doc : docList) {

			System.out.println(doc);
			if (doc.getPatients() != null) {
				System.out.println("Appointments");
				for (Patient pat : doc.getPatients()) {
					System.out.println(pat);
				}
			} else {
				System.out.println("No Appointments");
			}

		}
	}

	public void printSortedList() {
		Collections.sort(docList);
		// Reusing Print Function - OOP Programming
		printDoctorList();
	}

	public void printSortedList(int i) {
		MyComparators comp = new MyComparators();
		switch (i) {
		case 1:
			printSortedList();
			break;
		case 2:
			MyComparators.NameComparator comp1 = comp.new NameComparator();
			Collections.sort(docList, comp1);
			printDoctorList();
			break;
		case 3:
			MyComparators.Specialization comp2 = comp.new Specialization();
			Collections.sort(docList, comp2);
			printDoctorList();
			break;
		default:
			break;
		}
	}
}
