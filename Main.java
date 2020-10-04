/**
 *
 * @author 
 */
 import java.util.Scanner;
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a number");
    int number = sc.nextInt();
    int counter = 100;
    while(counter >= number) {
      System.out.println(counter);
      counter = counter -5;
    }
  }
}
