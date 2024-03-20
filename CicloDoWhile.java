public class CicloDoWhile{
  public static void main(String args[]){

int i = 1000;

  do{
	System.out.print(i + ", ");
  i-=200;
} while (i >= 200);
	System.out.print(i);
}
}