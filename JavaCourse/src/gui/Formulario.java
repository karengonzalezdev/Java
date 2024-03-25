package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtAltura;
	private JTextField txtPeso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strAltura = txtAltura.getText();
				String strPeso = txtPeso.getText();
				
				Double altura = Double.parseDouble(strAltura);
				Double peso = Double.parseDouble(strPeso);
				Double imc = peso / (altura * altura);
				
				JOptionPane.showMessageDialog(rootPane, "El índice de masa corporal es " + imc);
			}
			
		});
		btnCalcular.setBounds(311, 182, 89, 23);
		contentPane.add(btnCalcular);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(132, 73, 96, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Altura:");
		lblNewLabel.setBounds(71, 76, 76, 14);
		contentPane.add(lblNewLabel);
		
		txtPeso = new JTextField();
		txtPeso.setColumns(10);
		txtPeso.setBounds(132, 120, 96, 20);
		contentPane.add(txtPeso);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setBounds(71, 123, 76, 14);
		contentPane.add(lblPeso);
	}
}
