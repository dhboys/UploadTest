package org.bmi.service;

public class BMIService {

	public double calculate(double height, double weight) {
		double result = 0;
		
		result = weight/ Math.pow(height, 2);
		
		result = Math.floor(result * 100) / 100;
		
		return result;
	}
}