public class Promedio{
  public static void main(String args[]){
 
   int num_uno = 5;
   int num_dos = 5;
   int num_tres = 5;	
   int promedio = 0; 

   promedio = (num_uno + num_dos + num_tres) / 3;
  if (promedio >= 6){
   System.out.println("aprobó con: " + promedio);
   } else {
   System.out.println("reprobó con: " + promedio);
  }
 }
}