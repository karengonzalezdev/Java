import javax.swing.*;

public class Formulario4 extends JFrame{

  private JTextField textfield1;
  private JScrollPane scrollpane1;
  private JTextArea textarea1;

  public Formulario4(){
  setLayout(null);
  textfield1 = new JTextField();
  textfield1.setBounds(10,10,200,30);
  add(textfield1);

  textarea1 = new JTextArea();
  scrollpane1 = new JScrollPane(textarea1);
  scrollpane1.setBounds(10,50,400,300);
  add(scrollpane1);
 }

  public static void main(String args[]){
    Formulario4 formulario4 = new Formulario4();
    formulario4.setBounds(0,0,540,400);
    formulario4.setVisible(true);
    formulario4.setResizable(false);
    formulario4.setLocationRelativeTo(null);
}
}