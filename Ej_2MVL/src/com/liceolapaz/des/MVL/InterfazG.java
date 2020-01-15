package com.liceolapaz.des.MVL;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JRadioButton;
import java.awt.Insets;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.text.spi.NumberFormatProvider;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class InterfazG {
	double doubleLado1;
	String lado1;
	double doubleLado2;
	String lado2;
	double doubleLado3;
	String lado3;
	double doubleAltura;
	String altura;
	String apotema;
	double doubleApotema;
	String nLados;
	int intNlados;
	boolean tr = false;
	boolean rec = false;
	boolean cuad = false;
	boolean pol = false;
	

	private JFrame frmCalcularreaY;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField lado1field;
	private JTextField lado2field;
	private JTextField lado3field;
	private JTextField alturafield;
	private JTextField apotemafield;
	private JTextField nladosfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazG window = new InterfazG();
					window.frmCalcularreaY.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterfazG() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalcularreaY = new JFrame();
		frmCalcularreaY.setTitle("Calcular área y perímetro de figura geométrica");
		frmCalcularreaY.setBounds(100, 100, 450, 300);
		frmCalcularreaY.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalcularreaY.setResizable(false);
		frmCalcularreaY.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(39, 140, 374, 86);
		frmCalcularreaY.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblApotema = new JLabel("Apotema:");
		
		lblApotema.setBounds(12,39, 66, 15);
		
		
		apotemafield = new JTextField();
		apotemafield.setBounds(83, 35, 66, 19);
		
		apotemafield.setColumns(10);
		
		JLabel lblNLados = new JLabel("Nº Lados: ");
		lblNLados.setBounds(183, 12, 70, 15);
		
		
		
		nladosfield = new JTextField();
		nladosfield.setBounds(257, 10, 66, 19);
		nladosfield.setColumns(10);
		
		
		JLabel lblAltura = new JLabel("Altura : ");
		lblAltura.setBounds(183, 12, 66, 15);
		
		
		alturafield = new JTextField();
		alturafield.setBounds(238, 10, 66, 19);
		alturafield.setColumns(10);
		 
		
		JLabel lblLado = new JLabel("Lado 1 :");
		lblLado.setBounds(12, 12, 66, 15);
		
		
		lado1field = new JTextField();
		lado1field.setBounds(75, 10, 66, 19);
		lado1field.setColumns(10);
		
		JLabel lblLado_1 = new JLabel("Lado 2 :");
		lblLado_1.setBounds(12, 39, 66, 15);
		
		
		JLabel lblLado_2 = new JLabel("Lado 3 : ");
		lblLado_2.setBounds(12, 66, 66, 15);
		
		
		lado2field = new JTextField();
		lado2field.setBounds(75, 37, 66, 19);
		lado2field.setColumns(10);
		
		lado3field = new JTextField();
		lado3field.setBounds(75, 64, 66, 19);
		lado3field.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(199, 25, 102, 15);
		frmCalcularreaY.getContentPane().add(lblResultado);
		
		JLabel lblrea = new JLabel("Área:");
		lblrea.setBounds(251, 52, 66, 15);
		frmCalcularreaY.getContentPane().add(lblrea);
		
		JLabel lblPermetro = new JLabel("Perímetro:");
		lblPermetro.setBounds(251, 99, 90, 15);
		frmCalcularreaY.getContentPane().add(lblPermetro);
		
	    JLabel lblResarea = new JLabel("ResArea");
		lblResarea.setBounds(290, 52, 66, 15);
		frmCalcularreaY.getContentPane().add(lblResarea);
		
		JLabel lblResperi = new JLabel("ResPeri");
		lblResperi.setBounds(331, 99, 66, 15);
		frmCalcularreaY.getContentPane().add(lblResperi);
		
		
		
		JLabel lblFigura = new JLabel("Figura:");
		lblFigura.setBounds(39, 25, 49, 15);
		frmCalcularreaY.getContentPane().add(lblFigura);
		
		JRadioButton rdbtnTriangulo = new JRadioButton("Triángulo");
		rdbtnTriangulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				panel.removeAll();
				panel.add(lblLado);	
				panel.add(lblLado_1);
				panel.add(lblLado_2);
				panel.add(lblAltura);
				panel.add(lado1field);
				panel.add(lado2field);
				panel.add(lado3field);
				panel.add(alturafield);
				tr = true;
				rec = false;
				cuad = false;
				pol = false;
				
				
				
				
				panel.repaint();
				
				
			}
		});
		
		buttonGroup.add(rdbtnTriangulo);
		rdbtnTriangulo.setBounds(39, 48, 90, 23);
		frmCalcularreaY.getContentPane().add(rdbtnTriangulo);
		
		JRadioButton rdbtnRectngulo = new JRadioButton("Rectángulo");
		rdbtnRectngulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.removeAll();
				panel.add(lblLado);	
				panel.add(lblAltura);
				panel.add(lado1field);
				panel.add(alturafield);
				panel.repaint();
				rec = true;
				tr = false;
				
				cuad = false;
				pol = false;
				
			}
		});
		
		buttonGroup.add(rdbtnRectngulo);
		rdbtnRectngulo.setBounds(39, 71, 102, 23);
		frmCalcularreaY.getContentPane().add(rdbtnRectngulo);
		
		JRadioButton rdbtnCuadrado = new JRadioButton("Cuadrado");
		rdbtnCuadrado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				panel.removeAll();
				panel.add(lblLado);
				panel.add(lado1field);
				panel.repaint();
				cuad = true;
				
				tr = false;
				rec = false;
				
				pol = false;
				
				
			}

		});
		
		buttonGroup.add(rdbtnCuadrado);
		rdbtnCuadrado.setBounds(39, 95, 91, 23);
		frmCalcularreaY.getContentPane().add(rdbtnCuadrado);
		
		JRadioButton rdbtnLado = new JRadioButton("Polígono");
		rdbtnLado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.removeAll();
				panel.add(lblApotema);
				panel.add(nladosfield);
				panel.add(lblNLados);
				panel.add(apotemafield);
				panel.add(lblLado);
				panel.add(lado1field);
				panel.repaint();
				pol = true;
				tr = false;
				rec = false;
				cuad = false;
				
				
				
				
			}
			
		});
		buttonGroup.add(rdbtnLado);
		rdbtnLado.setBounds(39, 120, 84, 23);
		frmCalcularreaY.getContentPane().add(rdbtnLado);
		
		JButton btnIntroducir = new JButton("Introducir");
		btnIntroducir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 
				 
				 
				 try {
					if (tr==true) {
						 lado1 = lado1field.getText();
						 doubleLado1 = Double.parseDouble(lado1);
						 lado2 = lado2field.getText();
						 doubleLado2 = Double.parseDouble(lado2);
						 lado3 = lado3field.getText();
						 doubleLado3 = Double.parseDouble(lado3);
						 altura = alturafield.getText();
						 doubleAltura = Double.parseDouble(altura);
						 Triangulo tr1 = new Triangulo(doubleLado1, doubleLado2, doubleLado3, doubleAltura);
						double areaTr1 = tr1.calcularArea();
						double perTr1 =  tr1.calcularPerimetro();
						lblResarea.setText(String.valueOf(areaTr1));
						lblResperi.setText(String.valueOf(perTr1));
						
					 }
					 else if (rec==true) {
						 lado1 = lado1field.getText();
						 doubleLado1 = Double.parseDouble(lado1);
						 altura = alturafield.getText();
						 doubleAltura = Double.parseDouble(altura);
						Rectangulo rec1 = new Rectangulo(doubleLado1, doubleAltura);
						double areaRec1 = rec1.calcularArea();
						double perRec1=rec1.calcularPerimetro();
						lblResarea.setText(String.valueOf(areaRec1));
						lblResperi.setText(String.valueOf(perRec1));
					
					 }
					  else if (cuad==true) {
						 lado1 = lado1field.getText();
						 doubleLado1 = Double.parseDouble(lado1);
						Cuadrado cuad1 = new Cuadrado(doubleLado1);
							double areaCuad1 = cuad1.calcularArea();
							double perCuad1=cuad1.calcularPerimetro();
							lblResarea.setText(String.valueOf(areaCuad1));
							lblResperi.setText(String.valueOf(perCuad1));
							
						 
					 }
					 else if (pol==true) {
						 lado1 = lado1field.getText();
						 doubleLado1 = Double.parseDouble(lado1);
						 apotema = apotemafield.getText();
						 doubleApotema = Double.parseDouble(apotema);
						nLados = nladosfield.getText();
						intNlados = Integer.parseInt(nLados);
						Poligono pol1 = new Poligono(doubleLado1, doubleApotema, intNlados);
						
							double areaPol1 = pol1.calcularArea();
							double perPol1=pol1.calcularPerimetro();
							lblResarea.setText(String.valueOf(areaPol1));
							lblResperi.setText(String.valueOf(perPol1));
							
					 }
				} catch (NumberFormatException e) {
					
					
				}
				
				 
			
				
			}
		});
		btnIntroducir.setBounds(324, 238, 114, 25);
		frmCalcularreaY.getContentPane().add(btnIntroducir);
	}
}
