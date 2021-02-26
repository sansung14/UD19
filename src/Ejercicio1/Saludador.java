package Ejercicio1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Saludador extends JFrame {

	private JPanel contentPane;
	
	public static void main(String[] args) {
		Saludador ventana = new Saludador();
	}
	
	
	//Aplicacion para introducir el nombre i dar la bienvenida.
	public Saludador() {
		
		setTitle("Titulo de la ventana");
		setBounds(400, 400, 300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		JLabel etiqueta = new JLabel("Escribe un nombre para saludar:");
		etiqueta.setBounds(60, 20,200,20);
		JTextField textField = new JTextField();
		textField.setBounds(60, 80,180,20);
		JButton btnPulsame = new JButton("Saludar");
		btnPulsame.setBounds(100, 120, 100, 20);
		
		contentPane.add(btnPulsame);
		contentPane.add(textField);
		contentPane.add(etiqueta);
		setVisible(true);

		//Objeto para saludar cogiendo el nombre introducido.
		btnPulsame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "¡Hola "+textField.getText()+"!");                
                 
            }

		});
	}
	
}
