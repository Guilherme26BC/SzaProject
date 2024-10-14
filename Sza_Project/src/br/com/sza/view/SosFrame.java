package br.com.sza.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class SosFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private String names[] = { "SOS_sza.jpg" };
	private Icon icons[] = { new ImageIcon(getClass().getResource(names[0])) };
	private JTextField textField;
	private JTextField textField_1, textField_2, textField_3, textField_4, textField_5, textField_6;
	private JTextField textField_7, textField_8, textField_9, textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SosFrame frame = new SosFrame();
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
	public SosFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(43, 60, 80));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("SZA");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 40));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(525, 20, 150, 40);
		contentPane.add(lblNewLabel);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setHorizontalAlignment(SwingConstants.CENTER);
		btnVoltar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnVoltar.setBounds(62, 20, 100, 30);
		contentPane.add(btnVoltar);
		btnVoltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				AlbunsFrame af = new AlbunsFrame();
				af.main(null);
			}
		});

		JPanel panel = new JPanel();
		panel.setBounds(62, 118, 500, 455);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 171, 161);
		panel.add(panel_1);

		JLabel SOSImage = new JLabel();
		SOSImage.setBounds(10, 11, 171, 161);
		SOSImage.setIcon(icons[0]);
		panel_1.add(SOSImage);

		JLabel lblNewLabel_1 = new JLabel("SOS");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 22));
		lblNewLabel_1.setBounds(290, 11, 97, 35);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Lançado em 9 de dezembro de 2022");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(236, 43, 254, 30);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Com 23 músicas e 1 hora e 8 minutos ");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(236, 63, 254, 30);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Principais generos musicais:");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(236, 93, 254, 30);
		panel.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("R&B, Pop, hip-hop, trap");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(236, 123, 254, 30);
		panel.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("SOS");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(20, 183, 149,30);
		panel.add(lblNewLabel_6);

		JLabel lblNewLabel_6_1 = new JLabel("Kill Bill");
		lblNewLabel_6_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6_1.setBounds(20, 212, 149,30);
		panel.add(lblNewLabel_6_1);

		JLabel lblNewLabel_6_2 = new JLabel("Seek & Destroy\r\n");
		lblNewLabel_6_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6_2.setBounds(20, 241, 149,30);
		panel.add(lblNewLabel_6_2);

		JLabel lblNewLabel_6_3 = new JLabel("Low");
		lblNewLabel_6_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6_3.setBounds(20, 271, 149,30);
		panel.add(lblNewLabel_6_3);

		JLabel lblNewLabel_6_4 = new JLabel("Love Language\r\n");
		lblNewLabel_6_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6_4.setBounds(20, 302, 149,30);
		panel.add(lblNewLabel_6_4);

		JLabel lblNewLabel_6_5 = new JLabel("Blind\r\n");
		lblNewLabel_6_5.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6_5.setBounds(20, 333, 149,30);
		panel.add(lblNewLabel_6_5);

		JLabel lblNewLabel_6_6 = new JLabel("Used (ft Don Toliver)");
		lblNewLabel_6_6.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6_6.setBounds(20, 363, 149,30);
		panel.add(lblNewLabel_6_6);

		JLabel lblNewLabel_6_7 = new JLabel("Snooze");
		lblNewLabel_6_7.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6_7.setBounds(20, 392, 149,30);
		panel.add(lblNewLabel_6_7);

		JLabel lblNewLabel_6_8 = new JLabel("Notice Me\r\n");
		lblNewLabel_6_8.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6_8.setBounds(20, 423, 149,30);
		panel.add(lblNewLabel_6_8);

		JLabel lblNewLabel_6_9 = new JLabel("Gone Girl");
		lblNewLabel_6_9.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6_9.setBounds(195, 183, 149,30);
		panel.add(lblNewLabel_6_9);

		JLabel lblNewLabel_6_10 = new JLabel("Smoking on my Ex Pack");
		lblNewLabel_6_10.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6_10.setBounds(195, 212, 149,30);
		panel.add(lblNewLabel_6_10);

		JLabel lblNewLabel_6_11 = new JLabel("Ghost in the Machine (ft phoebe)");
		lblNewLabel_6_11.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6_11.setBounds(195, 241, 149,30);
		panel.add(lblNewLabel_6_11);

		JLabel lblNewLabel_6_12 = new JLabel("F2F");
		lblNewLabel_6_12.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6_12.setBounds(195, 271, 149,30);
		panel.add(lblNewLabel_6_12);

		JLabel lblNewLabel_6_13 = new JLabel("Nobody Gets Me");
		lblNewLabel_6_13.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6_13.setBounds(195, 302, 149,30);
		panel.add(lblNewLabel_6_13);

		JLabel lblNewLabel_6_14 = new JLabel("Conceited\r\n");
		lblNewLabel_6_14.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6_14.setBounds(195, 333, 149,30);
		panel.add(lblNewLabel_6_14);

		JLabel lblNewLabel_6_15 = new JLabel("Special");
		lblNewLabel_6_15.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6_15.setBounds(195, 363, 149,30);
		panel.add(lblNewLabel_6_15);

		JLabel lblNewLabel_6_16 = new JLabel("Too Late");
		lblNewLabel_6_16.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6_16.setBounds(195, 392, 149,30);
		panel.add(lblNewLabel_6_16);

		JLabel lblNewLabel_6_17 = new JLabel("Far");
		lblNewLabel_6_17.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6_17.setBounds(195, 423, 149,30);
		panel.add(lblNewLabel_6_17);

		JLabel lblNewLabel_6_18 = new JLabel("Shirt");
		lblNewLabel_6_18.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6_18.setBounds(365, 183, 149,30);
		panel.add(lblNewLabel_6_18);

		JLabel lblNewLabel_6_19 = new JLabel("Open Arms (ft Travis Scott)");
		lblNewLabel_6_19.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6_19.setBounds(365, 212, 115,30);
		panel.add(lblNewLabel_6_19);

		JLabel lblNewLabel_6_20 = new JLabel("I Hate U");
		lblNewLabel_6_20.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6_20.setBounds(365, 241, 149,30);
		panel.add(lblNewLabel_6_20);

		JLabel lblNewLabel_6_21 = new JLabel("Good Days");
		lblNewLabel_6_21.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6_21.setBounds(365, 271, 149,30);
		panel.add(lblNewLabel_6_21);

		JLabel lblNewLabel_6_22 = new JLabel("Forgiveless");
		lblNewLabel_6_22.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6_22.setBounds(365, 302, 149,30);
		panel.add(lblNewLabel_6_22);

		textField = new JTextField();
		textField.setBounds(640, 144, 385, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_7 = new JLabel("Qual seu genero musical favorito?");
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(640, 119, 250, 14);
		contentPane.add(lblNewLabel_7);

		JButton btnNewButton = new JButton("enviar");
		btnNewButton.setBounds(1030, 143, 89, 23);
		contentPane.add(btnNewButton);

		textField_1 = new JTextField();
		textField_1.setBounds(640, 220, 250, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(640, 240, 250, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(640, 260, 250, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(640, 280, 250, 22);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(640, 300, 250, 22);
		contentPane.add(textField_5);
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setBounds(900, 220, 250, 22);
		contentPane.add(textField_6);
		textField_6.setColumns(10);

		textField_7 = new JTextField();
		textField_7.setBounds(900, 240, 250, 22);
		contentPane.add(textField_7);
		textField_7.setColumns(10);

		textField_8 = new JTextField();
		textField_8.setBounds(900, 260, 250, 22);
		contentPane.add(textField_8);
		textField_8.setColumns(10);

		textField_9 = new JTextField();
		textField_9.setBounds(900, 280, 250, 22);
		contentPane.add(textField_9);
		textField_9.setColumns(10);

		textField_10 = new JTextField();
		textField_10.setBounds(900, 300, 250, 22);
		contentPane.add(textField_10);
		textField_10.setColumns(10);

		JLabel lblMusicasQueVoc = new JLabel("Musicas que você pode gostar ");
		lblMusicasQueVoc.setForeground(Color.WHITE);
		lblMusicasQueVoc.setFont(new Font("Arial", Font.PLAIN, 22));
		lblMusicasQueVoc.setBounds(640, 182, 332, 24);
		contentPane.add(lblMusicasQueVoc);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String genre;
				genre = textField.getText().toUpperCase();

				if (genre.contains("POP")) {
					limpaCampos();
					textField_1.setText("Kill Bill");

					textField_2.setText("Seek & Destroy");

					textField_3.setText("Low");

					textField_4.setText("Notice Me");

					textField_5.setText("F2F");

					textField_6.setText("Too Late");

					textField_7.setText("Shirt");

					textField_8.setText("I Hate U");

				} else {

					if (genre.contains("R&B")) {
						limpaCampos();
						textField_1.setText("Love Language");

						textField_2.setText("Blind");

						textField_3.setText("Snooze");

						textField_4.setText("Gone Girl");

						textField_5.setText("Nobody Gets Me");

						textField_6.setText("Special");

						textField_7.setText("Too Late");

						textField_8.setText("Far");

						textField_9.setText("Open Arms (Feat Travis Scott)");

						textField_10.setText("Good Days");
					} else {

						if (genre.contains("TRAP")) {
							limpaCampos();
							textField_1.setText("Low");

							textField_2.setText("Used");

							textField_3.setText("Notice Me");

							textField_4.setText("Conceited");

							textField_5.setText("Too Late");

							textField_6.setText("Far");

							textField_7.setText("Shirt");

							textField_8.setText("Forgiveless");

							
						} else {

							if (genre.contains("HIP-HOP")) {
								limpaCampos();
								textField_1.setText("SOS");

								textField_2.setText("Low");

								textField_3.setText("Love Language");

								textField_4.setText("Used");

								textField_5.setText("Snooze");

								textField_6.setText("Notice Me");

								textField_7.setText("Smokin on my ex pack tonight");

								textField_8.setText("Conceited");

								textField_9.setText("Open Arms");
								textField_10.setText("Forgiveless");
							} else {
								if (genre.contains("ROCK")) {
									limpaCampos();
									textField_1.setText("F2F");
									

								} else {
									if (genre.contains("ALTERNATIVA")) {
										limpaCampos();
										textField_1.setText("SOS");

										textField_2.setText("Blind");

										textField_3.setText("Ghost in the Machine (feat Phoebe Bridges) ");

										textField_4.setText("Good Days");
										
									}
								}
							}
						}
					}
				}
			}
		});

	}
	public void limpaCampos() {
		textField_1.setText("");
		textField_2.setText("");
		textField_3.setText("");
		textField_4.setText("");
		textField_5.setText("");
		textField_6.setText("");
		textField_7.setText("");
		textField_8.setText("");
		textField_9.setText("");
		textField_10.setText("");
	}
}

