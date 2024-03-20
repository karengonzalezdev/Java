public class Operaciones2{
  public static void main(String args[]){
 
  int num_1 = 5, num_dos = 3, resultado = 0;
  int parametro = 3;

  switch(parametro) {

   case 1: resultado = num_1 + num_dos;
           System.out.println("El resultado de la suma es: " + resultado);
      break;

   case 2: resultado = num_1 - num_dos;
           System.out.println("El resultado de la resta es: " + resultado);
      break;

   case 3: resultado = num_1 * num_dos;
           System.out.println("El resultado de la multiplicación es: " + resultado);
      break;

   case 4: resultado = num_1 / num_dos;
           System.out.println("El resultado de la división es: " + resultado);
      break;

   default: System.out.println("Error, la opción no existe");
      break;
  }
 }
}