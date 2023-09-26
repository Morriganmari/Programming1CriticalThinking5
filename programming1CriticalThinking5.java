package Programming1CriticalThinking5;	

import java.util.Scanner;

/**
 * This program will store data in the form of daily average temperatures for
 * one week and display the information requested by the user about a specific
 * day or the entire week.
 * 
 * @author Shayna Almond
 */

public class programming1CriticalThinking5 {

	/**
	 * Store the day and average temperature for each in two array lists. Prompt the
	 * user for the day of the week (Monday through Sunday). Print both the day and
	 * average temperature for the day entered. If the user enters 'week', print the
	 * average temperature for each day and the weekly average.
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Store days of the week and average temperatures in two arrays.
		String[] day = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		String userInput = null;

		// Initiate variables for the program
		double[] dailyTemperature = { 85.2, 90.7, 91.0, 90.6, 89.7, 89.2, 87.6 };
		double sumTemperature = 0;
		double averageTemperature = 0;
		boolean validEntry = false;
		int i = 0;

		// Prompt user for input
		System.out.println("Please type a day of the week to see the average temperature, "
				+ "or type \"Week\" to see the average for every day and the total weekly average: ");

		// Check if user entry is valid and then display the relevant information
		if (scanner.hasNext("[A-Za-z]*")) {
			userInput = scanner.next();

			// If the user enters "Week" display the average temperature for every day and the entire week
			if (userInput.equalsIgnoreCase("Week")) {
				for (i = 0; i < day.length; ++i) {
					// Add all daily temperatures together, divide by 7 to calculate the average weekly temperature
					sumTemperature += dailyTemperature[i];
					averageTemperature = sumTemperature / 7;
					// Display user message for each day of the week and its average temperature
					System.out.println("The average temperature on " + day[i] + " was " + dailyTemperature[i] + " degrees.");
				}
				// Display user message for the average temperature for the week
				System.out.printf("The average temperature for the week was " + "%1.1f" + " degrees.", averageTemperature);
			}

			// If user enters a day of the week return the day and average temperature
			else {
				for (i = 0; (i < day.length) && !validEntry; ++i) {
					if (userInput.equalsIgnoreCase(day[i])) {
						validEntry = true;
						System.out.println("The average temperature on " + day[i] + " was " + dailyTemperature[i] + " degrees.");
					}
				}
			}
		}

		scanner.close();
	}
}
