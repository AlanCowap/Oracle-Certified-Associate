/** 
 *  Demo of selected classes from java.time.*
 *  - LocalDate, Period, DateTimeFormatter, ChronoUnit
 *   
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.stringsarrays;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateApp {

	public static void main(String[] args) {
		System.out.println("Dates...");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMMyyyy");
		LocalDate startDate = LocalDate.parse("22May2017", dtf);
		System.out.println("You started this course on " + startDate);

		LocalDate now = LocalDate.now();
		Period p = Period.between(startDate, now);
		System.out.println("Period " + p);
		System.out.printf("Years %d, Months %d, Days %d\n", p.getYears(), p.getMonths(), p.getDays());
		
		long daysDone = startDate.until(now, ChronoUnit.DAYS); 
		System.out.printf("Days done on course %d\n", daysDone);
		
		LocalDate endDate = LocalDate.parse("17May2019", dtf);
		long daysRemaining = now.until(endDate, ChronoUnit.DAYS);
		System.out.printf("Days remaining on course %d\n", daysRemaining);
		
		double percentageRemaining = ((double) daysRemaining / (daysRemaining + daysDone)) * 100;
		System.out.printf("Percentage remaining %2.2f%%\n", percentageRemaining);
		
		//Formatted output
		System.out.println(now.format(dtf));
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("E, dd MMM yy");
		System.out.println(now.format(dtf2));
		
	}

}
