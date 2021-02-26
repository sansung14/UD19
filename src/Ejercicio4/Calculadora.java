package Ejercicio4;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;


public class Calculadora extends JFrame {

	public static void main(String[] args) {
		Calculadora ventana = new Calculadora();
	}

	
	private JPanel contentPane;
    private static DecimalFormat df2 = new DecimalFormat("#.##");

    
    
	public Calculadora() {
		
		setTitle("Titulo de la ventana");
		setBounds(400, 400, 280, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		
		//2 operandos i un resultado con JTextField
		JTextField operando1 = new JTextField();
		operando1.setBounds(60, 20,50,20);
		JTextField operando2 = new JTextField();
		operando2.setBounds(110, 20,50,20);
		JTextField resultado = new JTextField();
		resultado.setBounds(160, 20,50,20);
		resultado.setEditable(false);
		
		
		//6 botones de + - X / = i Salir
		JButton btn = new JButton("+");
		btn.setBounds(60, 40, 50, 20);
		JButton btn2 = new JButton("-");
		btn2.setBounds(110, 40, 50, 20);
		JButton btn3 = new JButton("X");
		btn3.setBounds(60, 60, 50, 20);
		JButton btn4 = new JButton("/");
		btn4.setBounds(110, 60, 50, 20);
		JButton btn5 = new JButton("=");
		btn5.setBounds(160, 40, 50, 20);
		JButton btn6 = new JButton("S.");
		btn6.setBounds(160, 60, 50, 20);

		
		//2 labels para mostrar i guardar el operando
		JLabel op = new JLabel("Operando:");
		op.setBounds(60, 80,80,50);
		JLabel op1 = new JLabel();
		op1.setBounds(130, 80,50,50);
		
		contentPane.add(op);
		contentPane.add(op1);

		contentPane.add(operando1);
		contentPane.add(operando2);
		contentPane.add(resultado);

		contentPane.add(btn);
		contentPane.add(btn2);
		contentPane.add(btn3);
		contentPane.add(btn4);
		contentPane.add(btn5);
		contentPane.add(btn6);




		setVisible(true);
		
		
		
		//6 objetos de los para calcular i Salir de la aplicacion
		btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {              
                 op1.setText(btn.getText());
            }

		});
		btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {              
                op1.setText(btn2.getText());
            }

		});
		btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {              
                op1.setText(btn3.getText());
            }

		});
		btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {              
                op1.setText(btn4.getText());
            }

		});
		btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {  
            	if(op1.getText().equals("+")) {
            		int total = Integer.parseInt(operando1.getText())+Integer.parseInt(operando2.getText());
                    resultado.setText(Integer.toString(total));
            	}
            	if(op1.getText().equals("-")) {
            		int total = Integer.parseInt(operando1.getText())-Integer.parseInt(operando2.getText());
                    resultado.setText(Integer.toString(total));
            	}
            	if(op1.getText().equals("X")) {
            		int total = Integer.parseInt(operando1.getText())*Integer.parseInt(operando2.getText());
                    resultado.setText(Integer.toString(total));
            	}
            	if(op1.getText().equals("/")) {
            		double total = Double.parseDouble(operando1.getText())/Double.parseDouble(operando2.getText());
                    resultado.setText(df2.format(total));
            	}
            }

		});
		btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
        		System.exit(0);
            }

		});

	}
	
}
