import java.util.Scanner;

public class Substring{
  public static void main(String args[]){

  String original = "", substraccion = "";
  int num_1 = 0, desde = 0, hasta = 0;
  Scanner in = new Scanner(System.in);

  System.out.print("Introduce una cadena de caracteres: ");
  original = in.nextLine();

  num_1 = original.length();

  System.out.println("La cadena " + original + " tiene " + num_1 + " caracteres.");
  System.out.print("Desde donde? ");
  desde = in.nextInt();
  System.out.print("Hasta donde? ");
  hasta = in.nextInt();

  substraccion = original.substring(desde, hasta);
  System.out.println("La nueva cadena es: " + substraccion);
}
}