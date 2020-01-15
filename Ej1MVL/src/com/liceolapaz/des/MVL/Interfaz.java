package com.liceolapaz.des.MVL;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Interfaz {
	int aleatorio;
	JLabel lblHola = new JLabel("");
	
	
	private JFrame frmPiedraPapelTijera;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Interfaz window = new Interfaz();
					window.frmPiedraPapelTijera.setVisible(true);
					
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */


	public Interfaz() { 
		
		
		aleatorio= numeroAleatorio();
		initialize();
		
		
		
		
		

	}
	
	

	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPiedraPapelTijera = new JFrame();
		frmPiedraPapelTijera.setTitle("Piedra Papel Tijera Lagarto Spock");
		frmPiedraPapelTijera.setBounds(100, 100, 450, 300);
		frmPiedraPapelTijera.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPiedraPapelTijera.setResizable(false);

		JLabel lblResultado = new JLabel("Resultado:");

		JLabel lblResultadofinal = new JLabel();

		JLabel lblSeleccionaJugada = new JLabel("Selecciona jugada:");

		JLabel lblJugada = new JLabel("Jugada máquina:");

		JButton btnPiedra = new JButton("Piedra");
		btnPiedra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
if (aleatorio == 1 ) {lblResultadofinal.setText("Empate!");
lblResultadofinal.setForeground(Color.black);}

else if (aleatorio == 3 | aleatorio == 4) {
					lblResultadofinal.setText("Ganaste!");
					lblResultadofinal.setForeground(Color.green);
				} else {
					lblResultadofinal.setText("Perdiste!");
					lblResultadofinal.setForeground(Color.red);
				}
				mostrarJugadaMáquina();
				aleatorio= numeroAleatorio();
				
			}

		});

		JButton btnPapel = new JButton("Papel");
		btnPapel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (aleatorio == 2 ) {lblResultadofinal.setText("Empate!");
				lblResultadofinal.setForeground(Color.black);}
				else if (aleatorio == 1 | aleatorio == 5) {
					lblResultadofinal.setText("Ganaste!");
					lblResultadofinal.setForeground(Color.green);
				} else {
					lblResultadofinal.setText("Perdiste");
					lblResultadofinal.setForeground(Color.red);
				}
				mostrarJugadaMáquina();
				aleatorio= numeroAleatorio();
				
			}
		});

		JButton btnTijera = new JButton("Tijera");
		btnTijera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (aleatorio == 3 ) {lblResultadofinal.setText("Empate!");
				lblResultadofinal.setForeground(Color.black);}
				else if (aleatorio == 2 | aleatorio == 4) {
					lblResultadofinal.setText("Ganaste!");
					lblResultadofinal.setForeground(Color.green);
				} else {
					lblResultadofinal.setText("Perdiste!");
					lblResultadofinal.setForeground(Color.red);
				}
				mostrarJugadaMáquina();
				aleatorio= numeroAleatorio();
			}
		});

		JButton btnLagarto = new JButton("Lagarto");
		btnLagarto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			if (aleatorio == 4 ) {lblResultadofinal.setText("Empate!");
			lblResultadofinal.setForeground(Color.black);}
			else if (aleatorio == 2 | aleatorio == 5) {
					lblResultadofinal.setText("Ganaste!");
					lblResultadofinal.setForeground(Color.green);
				} else {
					lblResultadofinal.setText("Perdiste!");
					lblResultadofinal.setForeground(Color.red);
				}
				mostrarJugadaMáquina();
				aleatorio= numeroAleatorio();
				
			}

		});

		JButton btnSpock = new JButton("Spock");
		btnSpock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (aleatorio == 5 ) {lblResultadofinal.setText("Empate!");
				lblResultadofinal.setForeground(Color.black);}
				else if (aleatorio == 1 | aleatorio == 3) {
					lblResultadofinal.setText("Ganaste!");
					lblResultadofinal.setForeground(Color.green);
				} else {
					lblResultadofinal.setText("Perdiste");
					lblResultadofinal.setForeground(Color.red);
				}
				mostrarJugadaMáquina();
				aleatorio= numeroAleatorio();
			}
		});

		GroupLayout groupLayout = new GroupLayout(frmPiedraPapelTijera.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(36)
							.addComponent(lblSeleccionaJugada))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(44)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnLagarto, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnTijera, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnPapel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnPiedra, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnSpock, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addGap(104)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(12)
							.addComponent(lblHola))
						.addComponent(lblJugada)
						.addComponent(lblResultado)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(12)
							.addComponent(lblResultadofinal)))
					.addContainerGap(66, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(21)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSeleccionaJugada)
						.addComponent(lblJugada))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(btnPiedra)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnPapel))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblHola)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblResultado)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnTijera)
						.addComponent(lblResultadofinal, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnLagarto)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSpock)
					.addContainerGap(65, Short.MAX_VALUE))
		);
		frmPiedraPapelTijera.getContentPane().setLayout(groupLayout);
	}
	public  int numeroAleatorio() {
		Random generador = new Random(); // Constructor de generadores de números aleatorios.
		return generador.nextInt(5 - 1 + 1) + 1;
	}
	private void mostrarJugadaMáquina() {

		if (aleatorio == 1) {
			lblHola.setText("Piedra");
		} else if (aleatorio == 2) {
			lblHola.setText("Papel");
		} else if (aleatorio == 3) {
			lblHola.setText("Tijera");
		} else if (aleatorio == 4) {
			lblHola.setText("Lagarto");
		} else if (aleatorio == 5) {
			lblHola.setText("Spock");
		}

	}
	
}
