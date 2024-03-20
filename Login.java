import java.util.Scanner;

public class Login{
  public static void main(String args[]){

  String usuario = "", password = "";
  Scanner entrada = new Scanner(System.in);

  System.out.print("Nombre de usuario: ");
  usuario = entrada.nextLine();

  System.out.print("Password: ");
  password = entrada.nextLine();  

  if(usuario.equals("karen") && password.equals("12345")){
  System.out.println("Inicio de sesión correcto");
} else {
  System.out.println("Nombre de usuario o contraseña incorrectos");
}
}
}