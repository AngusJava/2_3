import java.util.Random;
import java.lang.Math;

// wyswietl albo policz sumę pieciu liczb (wygenerowanych losowo z zakresu)
public class Main {
  public static void main(String[] args) {
    Random liczby = new Random();
    int suma = 0;
    for (int i = 0; i < 5; i++) {
      int liczbyLosowe = liczby.nextInt(100);
      // DEBUG System.out.println("Random Number1: " + liczbyLosowe);
      int kwadrat = liczbyLosowe;
      liczbyLosowe = (int) Math.pow(kwadrat, 2);
      suma = suma + liczbyLosowe;
      System.out.println("Random Number: " + liczbyLosowe);
    }
    System.out.println("suma= " + suma);
  }
}