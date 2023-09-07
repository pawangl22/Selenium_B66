package day20.feb02;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Demo5 {
  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
    LocalDate fiveDaysLater = today.plus(5, ChronoUnit.DAYS);
    
    int year = fiveDaysLater.getYear();
    Month month = fiveDaysLater.getMonth();
    int day = fiveDaysLater.getDayOfMonth();
    
    String monthName = month.toString().substring(0, 1) + month.toString().substring(1).toLowerCase();
    System.out.println("Today's date: " + today);
    System.out.println("Date after 5 days: " + fiveDaysLater);
 
    System.out.println("Year: " + year);
    System.out.println("Month: " + monthName);
    System.out.println("day: " + day);
  }
}