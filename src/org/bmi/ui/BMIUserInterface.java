package org.bmi.ui;

import java.util.Scanner;

import org.bmi.service.BMIService;

public class BMIUserInterface {
	
	Scanner scanner;
	
	BMIService service;
	
	public BMIUserInterface(BMIService service) {
		this.scanner = new Scanner(System.in);
		this.service = service;
	}
	
	private String inputStr(String msg) {
		String result = null;
		System.out.println(msg);
		
		result = scanner.nextLine();
		
		return result;
	}

	public void input() {
		
		String name = this.inputStr("본인의 이름"); 
		
		double height = Double.parseDouble(this.inputStr("본인의 키"));
		
		double weight = Double.parseDouble(this.inputStr("본인의 몸무게"));

		System.out.println(name+": " + height+": " + weight);
		
		double bmi = service.calculate(height, weight);
		
		System.out.println("BMI: " + bmi);
		
	}
}