package com.liceolapaz.des.MVL;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class InterfazG {

	private JFrame frmConversorDeMonedas;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	boolean esDolar;
	boolean esLibra;
	boolean esYen;
	double resDolar;
	double resYen;
	double resLibra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazG window = new InterfazG();
					window.frmConversorDeMonedas.setVisible(true);
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
		frmConversorDeMonedas = new JFrame();
		frmConversorDeMonedas.setFont(new Font("Ubuntu", Font.PLAIN, 15));
		frmConversorDeMonedas.setTitle("Conversor de monedas");
		frmConversorDeMonedas.setBounds(100, 100, 450, 174);
		frmConversorDeMonedas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConversorDeMonedas.setResizable(false);
		frmConversorDeMonedas.getContentPane().setLayout(null);

		JLabel lblCantidadEn = new JLabel("Cantidad:");
		lblCantidadEn.setFont(new Font("Ubuntu", Font.PLAIN, 15));
		lblCantidadEn.setBounds(35, 22, 93, 34);
		frmConversorDeMonedas.getContentPane().add(lblCantidadEn);

		textField = new JTextField();
		textField.setBounds(111, 30, 124, 19);
		frmConversorDeMonedas.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblResultado = new JLabel("Resultado(EUR):");
		lblResultado.setFont(new Font("Ubuntu", Font.PLAIN, 15));
		lblResultado.setBounds(16, 68, 124, 34);
		frmConversorDeMonedas.getContentPane().add(lblResultado);

		JLabel lblRes = new JLabel("");
		lblRes.setBounds(131, 79, 118, 15);
		frmConversorDeMonedas.getContentPane().add(lblRes);

		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("OptionPane.errorDialog.border.background"));
		panel.setBounds(251, 12, 176, 108);
		frmConversorDeMonedas.getContentPane().add(panel);
		panel.setLayout(null);

		JRadioButton rdbtnYens = new JRadioButton("YENS");
		rdbtnYens.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					esYen = true;

					esLibra = false;
					esDolar = false;
				} catch (NumberFormatException e) {

				}

			}
		});
		buttonGroup.add(rdbtnYens);
		rdbtnYens.setFont(new Font("Ubuntu", Font.PLAIN, 15));

		rdbtnYens.setBackground(UIManager.getColor("OptionPane.errorDialog.border.background"));
		rdbtnYens.setBounds(22, 62, 97, 23);
		panel.add(rdbtnYens);

		JRadioButton rdbtnLibras = new JRadioButton("LIBRAS");
		rdbtnLibras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					esLibra = true;

					esDolar = false;
					esYen = false;
				} catch (NumberFormatException e) {

				}

			}
		});
		buttonGroup.add(rdbtnLibras);
		rdbtnLibras.setFont(new Font("Ubuntu", Font.PLAIN, 15));
		rdbtnLibras.setBackground(UIManager.getColor("OptionPane.errorDialog.border.background"));
		rdbtnLibras.setBounds(22, 35, 97, 23);
		panel.add(rdbtnLibras);

		JRadioButton rdbtnDolar = new JRadioButton("DOLAR");
		rdbtnDolar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					esDolar = true;

					esYen = false;
					esLibra = false;
				} catch (NumberFormatException e) {

				}
			}
		});
		buttonGroup.add(rdbtnDolar);
		rdbtnDolar.setFont(new Font("Ubuntu", Font.PLAIN, 15));
		rdbtnDolar.setBackground(UIManager.getColor("OptionPane.errorDialog.border.background"));
		rdbtnDolar.setBounds(22, 8, 97, 23);
		panel.add(rdbtnDolar);

		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {

					if (esDolar == true) {
						Dolar dolar1 = new Dolar();
						String cantidadDolar = textField.getText();
						dolar1.cantidad = Double.parseDouble(cantidadDolar);
						resDolar = dolar1.calcularEnEuros();
						lblRes.setText(String.format("%.2f", resDolar));
					} else if (esLibra == true) {
						Libras libra1 = new Libras();
						String cantidadLibras = textField.getText();
						libra1.cantidad = Double.parseDouble(cantidadLibras);
						resLibra = libra1.calcularEnEuros();
						lblRes.setText(String.format("%.2f", resLibra));
					} else if (esYen == true) {
						Yen yen1 = new Yen();
						String cantidadYen = textField.getText();
						yen1.cantidad = Double.parseDouble(cantidadYen);
						resYen = yen1.calcularEnEuros();
						lblRes.setText(String.format("%.2f", resYen));
					}
				} catch (Exception e) {

				}

			}
		});
		btnNewButton.setBounds(35, 105, 132, 16);
		frmConversorDeMonedas.getContentPane().add(btnNewButton);
	}
}
