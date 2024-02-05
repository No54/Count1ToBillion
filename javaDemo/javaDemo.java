
public class ConsoleProject {
  public static void main(String[] args) {
    long startTime = System.nanoTime();

    int i = 1;
    while(i<=1000000000){
        i++;
    }

    long endTime = System.nanoTime();
    var span = endTime - startTime;
    System.out.println("span:" + span);
    //java 21.02 result: 0.2151
  }
}