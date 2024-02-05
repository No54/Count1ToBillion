import java.time.Duration;  
import java.time.Instant;  
import java.time.LocalDateTime;  
  
public class ConsoleProject {
  public static void main(String[] args) {
    LocalDateTime time1 = LocalDateTime.now();    
    int i = 1;
    while(i<=1000000000){
        i++;
    }  
    LocalDateTime time2 = LocalDateTime.now();  
    Duration span = Duration.between(time1, time2);    
    System.out.println("span:" + span);    
    //java 21.02 result: 0.2196
  }
}