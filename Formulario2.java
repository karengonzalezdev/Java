import javax.swing.*;
import java.awt.event.*;

public class Formulario2 extends JFrame implements ActionListener{

  JButton boton1;
  public Formulario2(){
    setLayout(null);
    boton1 = new JButton("Cerrar");
    boton1.setBounds(300,250,100,30);
    add(boton1);
    boton1.addActionListener(this);
  }

  public void actionPerformed(ActionEvent hola){
    if(hola.getSource() == boton1){
      System.exit(0);
   }
  }

  public static void main(String args[]){
  Formulario2 formulario2 = new Formulario2();
  formulario2.setBounds(0,0,450,350);
  formulario2.setVisible(true);
  formulario2.setResizable(false);
  formulario2.setLocationRelativeTo(null);
  }
 }