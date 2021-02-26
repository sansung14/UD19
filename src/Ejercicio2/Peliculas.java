package Ejercicio2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Ejercicio1.Saludador;

public class Peliculas extends JFrame {

	public static void main(String[] args) {
		Peliculas ventana = new Peliculas();
	}

	private JPanel contentPane;
	
	public Peliculas() {
		
		setTitle("Titulo de la ventana");
		setBounds(400, 400, 450, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		JLabel etiqueta = new JLabel("Escribe el titulo de una pelicula:");
		etiqueta.setBounds(60, 20,200,20);
		JTextField textField = new JTextField();
		textField.setBounds(60, 80,180,20);
		JButton btnPulsame = new JButton("Añadir");
		btnPulsame.setBounds(100, 120, 100, 20);
		JLabel etiqueta2 = new JLabel("Peliculas");
		etiqueta2.setBounds(300, 20,200,20);

		
		JComboBox<String> combo = new JComboBox<>();
		combo.setBounds(300, 50,100,20);

		contentPane.add(btnPulsame);
		contentPane.add(textField);
		contentPane.add(etiqueta);
		contentPane.add(etiqueta2);
		contentPane.add(combo);

		setVisible(true);
		
		
		//Objeto que recoge el nombre introducido y lo añade a lista deplegable.
		btnPulsame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                combo.addItem(textField.getText());                
                 
            }

		});
	}
	
}
