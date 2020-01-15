package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;



import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class InterfazG {
	Random random1 = new Random();
	int puntuacion = 0;
	int intentos = 0;
	int cartaJugador;
	int intentosJugador = 0;
	int puntuacionJugador = 0;
	JLabel lblResultadojugador = new JLabel("");
	boolean poderJugar = true;

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JLabel lblCroupier = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazG window = new InterfazG();
					window.frame.setVisible(true);

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
		generarPuntuacionMaquina();
		
		if (puntuacion > 21) {
			lblCroupier.setText("Has ganado! El croupier se ha pasado de 21!");
			poderJugar = false;
			InterfazG.main(null);
		} else if (puntuacion == 21) {
			lblCroupier.setText("Has perdido, el Croupier ha obtenido 21 puntos!");
			poderJugar = false;
			InterfazG.main(null);
		}
		

	}

	public void jugadaJugador() {

		cartaJugador = random1.nextInt(11 - 1 + 1) + 1;
		puntuacionJugador = puntuacionJugador + cartaJugador;
		lblResultadojugador.setText("Tu carta es " + cartaJugador + " y tu puntuación " + puntuacionJugador);

		intentosJugador++;

	}

	public void generarPuntuacionMaquina() {
		while (puntuacion < 15) {
			puntuacion = puntuacion + random1.nextInt(11 - 1 + 1) + 1;
			intentos++;
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setTitle("BlackJack");
		frame.getContentPane().setLayout(null);

		frame.getContentPane().add(lblCroupier);
		lblCroupier.setBounds(29, 61, 390, 39);

		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		panel.setBounds(53, 157, 136, 79);

		panel.setLayout(null);

		JLabel lblSeguirJugando = new JLabel("Jugar?");

		JButton buttonSi = new JButton("Si");
		buttonSi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (poderJugar == true) {
					jugadaJugador();
					if (puntuacionJugador == 21) {
						lblResultadojugador.setText("Has obtenido 21 puntos, has gando!");
poderJugar = false;
					}
					if (puntuacionJugador > 21) {
						lblResultadojugador.setText("Has obtenido más de 21 puntos, has perdido!");
						poderJugar = false;
					}

					lblSeguirJugando.setText("Seguir jugando?");
				}
			}
		});

		lblSeguirJugando.setBounds(12, 12, 153, 15);
		panel.add(lblSeguirJugando);
		buttonSi.setBounds(12, 39, 57, 25);
		panel.add(buttonSi);

		JButton buttonNo = new JButton("No");
		buttonNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
if (poderJugar == true) {
				if (puntuacionJugador > puntuacion) {
					lblResultadojugador.setText("Has ganado al Croupier!");
					poderJugar = false;
				} else if (puntuacionJugador < puntuacion) {
					lblResultadojugador.setText("Has perdido, el Croupier tiene más puntos que tú!");
					poderJugar = false;

				} else if (puntuacionJugador == puntuacion) {
					if (intentos > intentosJugador) {
						lblResultadojugador.setText("Has ganado al Croupier (menos intentos).");
						poderJugar = false;
					} else if (intentos < intentosJugador) {
						lblResultadojugador.setText(
								"Has perdido, sacaste la misma puntuación que el Croupier, pero el ha necesitado menos intentos que tú!");
						poderJugar = false;
					} else {
						lblResultadojugador.setText("Has ganado! (Empate en puntuación e intentos)");
						poderJugar = false;
					}
				}
				}
			}

		});
		buttonNo.setBounds(67, 39, 57, 25);
		panel.add(buttonNo);

		JLabel lblModoDeJuego = new JLabel("Modo de juego:");
		lblModoDeJuego.setBounds(29, 24, 117, 25);
		frame.getContentPane().add(lblModoDeJuego);

		JRadioButton buttonFacil = new JRadioButton("Modo fácil");

		buttonGroup.add(buttonFacil);
		buttonFacil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				frame.getContentPane().add(panel);

				frame.getContentPane().add(lblCroupier);
				lblCroupier.setVisible(true);
				lblCroupier.setText("La puntuación del Croupier es: " + puntuacion);
				frame.repaint();
			}
		});
		buttonFacil.setBounds(149, 25, 144, 23);
		frame.getContentPane().add(buttonFacil);

		JRadioButton buttonNormal = new JRadioButton("Modo normal");
		buttonNormal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.getContentPane().add(panel);
				lblCroupier.setVisible(false);
				frame.repaint();

			}
		});
		buttonGroup.add(buttonNormal);
		buttonNormal.setBounds(297, 25, 144, 23);
		frame.getContentPane().add(buttonNormal);

		lblResultadojugador.setBounds(24, 82, 395, 48);
		frame.getContentPane().add(lblResultadojugador);

		JButton btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InterfazG.main(null);

			}
		});
		btnReiniciar.setBounds(297, 231, 114, 25);
		frame.getContentPane().add(btnReiniciar);

	}

}
