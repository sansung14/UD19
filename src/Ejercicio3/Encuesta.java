package Ejercicio3;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;


public class Encuesta extends JFrame {
	
	public static void main(String[] args) {
		Encuesta ventana = new Encuesta();
	}

	private JPanel contentPane;
	
	public Encuesta() {
		
		setTitle("Titulo de la ventana");
		setBounds(400, 400, 300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel etiqueta = new JLabel("Elije un Sistema Operativo:");
		etiqueta.setBounds(60, 20,200,20);
		
		ButtonGroup G = new ButtonGroup();

		
		JRadioButton radio = new JRadioButton("Windows", false);
		radio.setBounds(60,40,100,20);
		JRadioButton radio2 = new JRadioButton("Linux", false);
		radio2.setBounds(60,60,100,20);
		JRadioButton radio3 = new JRadioButton("Mac", false);
		radio3.setBounds(60,80,100,20);
		
		G.add(radio);
		G.add(radio2);
		G.add(radio3);

		JLabel etiqueta2 = new JLabel("Elije un Sistema Operativo:");
		etiqueta2.setBounds(60, 110,200,20);
		
		
		JCheckBox check = new JCheckBox("Programación", false);
		check.setBounds(60,130,140,20);
		JCheckBox check2 = new JCheckBox("Diseño gráfico", false);
		check2.setBounds(60,150,140,20);
		JCheckBox check3 = new JCheckBox("Administración", false);
		check3.setBounds(60,170,140,20);
		
		
		JLabel etiqueta3 = new JLabel("Horas dedicadas al ordenador:");
		etiqueta3.setBounds(60,200,200,20);
		
		JSlider horas = new JSlider(0,10);
		horas.setMajorTickSpacing(10);
		horas.setMinorTickSpacing(1);
		horas.setPaintTicks(true);
		horas.setPaintLabels(true);
		Font font = new Font("Serif", Font.ITALIC, 15);
		horas.setFont(font);
		horas.setBounds(100, 230, 100, 40);

		
		JButton btnPulsame = new JButton("Añadir");
		btnPulsame.setBounds(100, 280, 100, 20);

		contentPane.add(btnPulsame);
		contentPane.add(radio);
		contentPane.add(radio2);
		contentPane.add(radio3);
		contentPane.add(check);
		contentPane.add(check2);
		contentPane.add(check3);
		contentPane.add(horas);
		contentPane.add(etiqueta);
		contentPane.add(etiqueta2);
		contentPane.add(etiqueta3);


		setVisible(true);
		
		
		//Recoge los datos seleccionado de los JRadioButton, JCheckbox y JSlider i los muestra por pantalla.
		btnPulsame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	String mostrar="Elección:\n";
            	if(radio.isSelected()) {
                    mostrar+=radio.getText()+"\n";                
            	}
            	if(radio2.isSelected()) {
                    mostrar+=radio2.getText()+"\n";                  
            	}
            	if(radio3.isSelected()) {
                    mostrar+=radio3.getText()+"\n";                  
            	}
            	if(check.isSelected()) {
                    mostrar+=check.getText()+"\n";                  
            	}
            	if(check2.isSelected()) {
                    mostrar+=check2.getText()+"\n";                  
            	}
            	if(check3.isSelected()) {
                    mostrar+=check3.getText()+"\n";                  
            	}
            	mostrar+="Horas: "+horas.getValue();
                JOptionPane.showMessageDialog(null, mostrar);                
                 
            }

		});

	}
}
