import java.time.Duration; 
import java.time.LocalDateTime; 
import java.time.ZoneId; 
import java.time.ZonedDateTime; 
import java.time.format.DateTimeFormatter; 
import java.time.temporal.ChronoUnit; 
  
public class practise { 
  
     public static void main(String[] args) { 
  
         // Current date and time using now() 
         ZonedDateTime currentDateTime = ZonedDateTime.now(); 
  
         // Creating two timezone zoneid objects using ZoneId.of() method. 
         ZoneId losAngelesTimeZone = ZoneId.of("America/Los_Angeles"); 
         ZoneId new_yorkTimeZone = ZoneId.of("America/New_York"); 
  
         // Converting Current timezone time to Log Angeles time 
         ZonedDateTime losAngelesDateTime = currentDateTime.withZoneSameInstant(losAngelesTimeZone); 
  
         // Converting Current timezone time to Dubai time 
         ZonedDateTime new_yorkDateTime = currentDateTime.withZoneSameInstant(new_yorkTimeZone); 
  
         // Datetime formatting 
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd HH:mm z"); 
  
         // Print all 3 dates 
         System.out.println("Current time in IST : " + formatter.format(currentDateTime)); 
         System.out.println("Los Angeles time now : " + formatter.format(losAngelesDateTime)); 
         System.out.println("new_york time now : " + formatter.format(new_yorkDateTime)); 
  
         // getting the diff b/w two los angeles and dubai times. 
       //  printDurationBetweenTwoDates(losAngelesDateTime, new_yorkDateTime); 
  
     } 
  
 //    private static void printDurationBetweenTwoDates(ZonedDateTime sfoDateTime, ZonedDateTime dubaiDateTime) { 
 //        Duration d = Duration.between(sfoDateTime, dubaiDateTime); 
 //        long days = d.get(ChronoUnit.SECONDS); 
 //        System.out.println("Time Difference between los angeles and dubai : " + days / (60 * 60) + " Hours " + (days % (60 * 60)) / 60 + " Minites"); 
  
 }
