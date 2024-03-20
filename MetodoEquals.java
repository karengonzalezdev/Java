import java.util.Scanner;

public class MetodoEquals{
  public static void main(String args[]){

  String nombre_1 = "", nombre_2 = "";
  Scanner entrada = new Scanner(System.in);

  System.out.print("Primer nombre: ");
  nombre_1 = entrada.nextLine();

  System.out.print("Segundo nombre: ");
  nombre_2 = entrada.nextLine();  

  if(nombre_1.equalsIgnoreCase(nombre_2) ){
  System.out.println("Los nombres son iguales");
} else {
  System.out.println("Los nombres son diferentes");
}
}
}