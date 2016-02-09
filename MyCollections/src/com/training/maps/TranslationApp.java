package com.training.maps;

public class TranslationApp {

	public static void main(String[] args) {

		TranslateService tsObj = new TranslateService();
		tsObj.printWords(); //for printing the list
		System.out.println("\n" + tsObj.findEngWord("ek")); //for finding corresponding english word
	}

}
