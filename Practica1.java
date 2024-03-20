import java.util.Scanner;

public class Practica1{

  public static void main(String[] args){
     int num1, num2, num3;
     Scanner entrada = new Scanner(System.in);

     System.out.println("Ingresa el primer numero");     
     num1 = entrada.nextInt();

     System.out.println("Ingresa el segundo numero");     
     num2 = entrada.nextInt();     

     System.out.println("Ingresa el tercer numero");     
     num3 = entrada.nextInt();

     calcularMayor(num1, num2, num3);
     calcularMenor(num1, num2, num3);
  

}

     private static void calcularMayor(int num1, int num2, int num3){

     if(num1 > num2 && num1 > num3){
     System.out.print(num1 + " es el número mayor y ");
     } else if(num2 > num1 && num2 > num3){
     System.out.print(num2 + " es el número mayor y ");
     } else if(num3 > num1 && num3 > num2){
     System.out.print(num3 + " es el número mayor y ");
     } 
}

     private static void calcularMenor(int num1, int num2, int num3){

     if(num1 < num2 && num1 < num3){
     System.out.print(num1 + " es el número menor");
     } else if(num2 < num1 && num2 < num3){
     System.out.println(num2 + " es el número menor");
     } else if(num3 < num1 && num3 < num2){
     System.out.println(num3 + " es el número menor");
     }
 }

}