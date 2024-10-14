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

public class CtrlFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private String names[] = { "CTRL_sza.jpg", "CTRLdeluxe_sza.jpg" };
	private Icon icons[] = { new ImageIcon(getClass().getResource(names[0])),
			new ImageIcon(getClass().getResource(names[1])) };
	private boolean deluxe = false;
	private JTextField textField;
	private JTextField textField_1, textField_2, textField_3, textField_4, textField_5, textField_6;
	private JTextField textField_7, textField_8, textField_9, textField_10, textField_11, textField_12;
	private JTextField textField_13, textField_14;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CtrlFrame frame = new CtrlFrame();
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
	public CtrlFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(27, 73, 42));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("SZA");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 40));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(534, 21, 150, 40);
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
		panel_1.setBounds(10, 11, 200, 200);
		panel.add(panel_1);

		JLabel CTRLimage = new JLabel();
		CTRLimage.setBounds(10, 11, 200, 200);
		CTRLimage.setIcon(icons[0]);
		panel_1.add(CTRLimage);

		JLabel CTRL_label = new JLabel();
		if (!deluxe) {
			CTRL_label.setText("CTRL");
			CTRL_label.setHorizontalAlignment(SwingConstants.CENTER);
			CTRL_label.setFont(new Font("Arial", Font.BOLD, 22));
			CTRL_label.setBounds(290, 11, 97, 35);
			panel.add(CTRL_label);
		}
		JLabel lblSupermodel = new JLabel("Supermodel");
		lblSupermodel.setFont(new Font("Arial", Font.PLAIN, 12));
		lblSupermodel.setBounds(60, 230, 210, 30);
		panel.add(lblSupermodel);

		JLabel lblLG = new JLabel("Love Galore (ft Travis Scott)");
		lblLG.setFont(new Font("Arial", Font.PLAIN, 12));
		lblLG.setBounds(60, 260, 210, 30);
		panel.add(lblLG);

		JLabel lblDW = new JLabel("Doves in the Wind (ft Kendrick Lamar)");
		lblDW.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDW.setBounds(60, 290, 210, 30);
		panel.add(lblDW);

		JLabel lblDB = new JLabel("Drew Barrymore");
		lblDB.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDB.setBounds(60, 320, 210, 30);
		panel.add(lblDB);

		JLabel lblProm = new JLabel("Prom");
		lblProm.setFont(new Font("Arial", Font.PLAIN, 12));
		lblProm.setBounds(60, 350, 210, 30);
		panel.add(lblProm);

		JLabel lblTW = new JLabel("The Weekend");
		lblTW.setFont(new Font("Arial", Font.PLAIN, 12));
		lblTW.setBounds(60, 380, 210, 30);
		panel.add(lblTW);

		JLabel lblGG = new JLabel("Go Gina");
		lblGG.setFont(new Font("Arial", Font.PLAIN, 12));
		lblGG.setBounds(60, 410, 210, 30);
		panel.add(lblGG);

		JLabel lblGarden = new JLabel("Garden (Say it like that)");
		lblGarden.setFont(new Font("Arial", Font.PLAIN, 12));
		lblGarden.setBounds(280, 230, 149, 30);
		panel.add(lblGarden);

		JLabel lblBC = new JLabel("Broken Clocks");
		lblBC.setFont(new Font("Arial", Font.PLAIN, 12));
		lblBC.setBounds(280, 260, 149, 30);
		panel.add(lblBC);

		JLabel lblAny = new JLabel("Anything");
		lblAny.setFont(new Font("Arial", Font.PLAIN, 12));
		lblAny.setBounds(280, 290, 149, 30);
		panel.add(lblAny);

		JLabel lblW = new JLabel("Wavy");
		lblW.setFont(new Font("Arial", Font.PLAIN, 12));
		lblW.setBounds(280, 320, 149, 30);
		panel.add(lblW);

		JLabel lblNG = new JLabel("Normal Girl");
		lblNG.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNG.setBounds(280, 350, 149, 30);
		panel.add(lblNG);

		JLabel lblPLB = new JLabel("Pretty little Birds (ft Isaiah)");
		lblPLB.setFont(new Font("Arial", Font.PLAIN, 12));
		lblPLB.setBounds(280, 380, 149, 30);
		panel.add(lblPLB);

		JLabel lbl20 = new JLabel("20 Something");
		lbl20.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl20.setBounds(280, 410, 149, 30);
		panel.add(lbl20);

		JLabel lblNewLabel_1 = new JLabel("Lançado em 9 de junho de 2017 ");
		lblNewLabel_1.setBounds(236, 58, 254, 30);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel2 = new JLabel("O album oficial de estreia da cantora ");
		lblNewLabel2.setBounds(236, 88, 254, 30);
		panel.add(lblNewLabel2);

		JLabel lblNewLabel3 = new JLabel("Com 14 músicas e um total de 49 minutos ");
		lblNewLabel3.setBounds(236, 118, 254, 30);
		panel.add(lblNewLabel3);

		JLabel lblNewLabel4 = new JLabel("Principais genêros: R&B e Soul/neo\r\n Soul");
		lblNewLabel4.setBounds(236, 148, 254, 30);
		panel.add(lblNewLabel4);

		JLabel lblLGA = new JLabel();
		JLabel lbl2AM = new JLabel();
		JLabel lblMiles = new JLabel();
		JLabel lblPerloc = new JLabel();
		JLabel lblTC = new JLabel();
		JLabel lblAkw = new JLabel();
		JLabel lblJodie = new JLabel();

		JButton btnDeluxe = new JButton("Deluxe");
		btnDeluxe.setHorizontalAlignment(SwingConstants.CENTER);
		btnDeluxe.setFont(new Font("Arial", Font.PLAIN, 12));
		btnDeluxe.setBounds(1038, 20, 100, 30);
		btnDeluxe.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!deluxe) {
					deluxe = true;
					CTRLimage.setIcon(icons[0]);
					CTRL_label.setText("CTRL");
					CTRL_label.setHorizontalAlignment(SwingConstants.CENTER);
					CTRL_label.setFont(new Font("Arial", Font.BOLD, 22));
					CTRL_label.setBounds(290, 11, 97, 35);
					panel.add(CTRL_label);

					lblSupermodel.setBounds(60, 230, 210, 30);
					lblLG.setBounds(60, 260, 210, 30);
					lblDW.setBounds(60, 290, 210, 30);
					lblDB.setBounds(60, 320, 210, 30);
					lblProm.setBounds(60, 350, 210, 30);
					lblTW.setBounds(60, 380, 210, 30);
					lblGG.setBounds(60, 410, 210, 30);
					lblGarden.setBounds(280, 230, 149, 30);
					lblBC.setBounds(280, 260, 149, 30);
					lblAny.setBounds(280, 290, 149, 30);
					lblW.setBounds(280, 320, 149, 30);
					lblNG.setBounds(280, 350, 149, 30);
					lblPLB.setBounds(280, 380, 149, 30);
					lbl20.setBounds(280, 410, 149, 30);
					lblLGA.setText(" ");
					lbl2AM.setText(" ");
					lblMiles.setText(" ");
					lblPerloc.setText(" ");
					lblTC.setText(" ");
					lblAkw.setText(" ");
					lblJodie.setText(" ");

					lblNewLabel_1.setText("Lançado em 9 de junho de 2017 ");
					lblNewLabel2.setText("O album oficial de estreia da cantora ");
					lblNewLabel3.setText("Com 14 músicas e um total de 49 minutos ");
					lblNewLabel4.setText("Principais genêros: R&B e Soul/neo\r\n Soul");

				} else {
					deluxe = false;
					CTRLimage.setIcon(icons[1]);

					CTRL_label.setText("CTRL (DELUXE)");
					CTRL_label.setHorizontalAlignment(SwingConstants.CENTER);
					CTRL_label.setFont(new Font("Arial", Font.BOLD, 22));
					CTRL_label.setBounds(261, 11, 200, 35);
					panel.add(CTRL_label);

					lblSupermodel.setBounds(30, 230, 210, 30);
					lblLG.setBounds(30, 260, 150, 30);
					lblDW.setBounds(30, 290, 150, 30);
					lblDB.setBounds(30, 320, 210, 30);
					lblProm.setBounds(30, 350, 210, 30);
					lblTW.setBounds(30, 380, 210, 30);
					lblGG.setBounds(30, 410, 210, 30);
					lblGarden.setBounds(200, 230, 149, 30);
					lblBC.setBounds(200, 260, 149, 30);
					lblAny.setBounds(200, 290, 149, 30);
					lblW.setBounds(200, 320, 149, 30);
					lblNG.setBounds(200, 350, 149, 30);
					lblPLB.setBounds(200, 380, 149, 30);
					lbl20.setBounds(200, 410, 149, 30);

					lblLGA.setText("Love Galore(Alt VERSION");
					lblLGA.setFont(new Font("Arial", Font.PLAIN, 12));
					lblLGA.setBounds(370, 230, 250, 30);
					panel.add(lblLGA);

					lbl2AM.setText("2AM");
					lbl2AM.setFont(new Font("Arial", Font.PLAIN, 12));
					lbl2AM.setBounds(370, 260, 250, 30);
					panel.add(lbl2AM);

					lblMiles.setText("Miles");
					lblMiles.setFont(new Font("Arial", Font.PLAIN, 12));
					lblMiles.setBounds(370, 290, 250, 30);
					panel.add(lblMiles);

					lblPerloc.setText("Prelocator");
					lblPerloc.setFont(new Font("Arial", Font.PLAIN, 12));
					lblPerloc.setBounds(370, 320, 250, 30);
					panel.add(lblPerloc);

					lblTC.setText("Tread Carefully");
					lblTC.setFont(new Font("Arial", Font.PLAIN, 12));
					lblTC.setBounds(370, 350, 250, 30);
					panel.add(lblTC);

					lblAkw.setText("Akward");
					lblAkw.setFont(new Font("Arial", Font.PLAIN, 12));
					lblAkw.setBounds(370, 380, 250, 30);
					panel.add(lblAkw);

					lblJodie.setText("Jodie");
					lblJodie.setFont(new Font("Arial", Font.PLAIN, 12));
					lblJodie.setBounds(370, 410, 250, 30);
					panel.add(lblJodie);

					lblNewLabel_1.setText("Lançado em 9 de junho de 2022 ");
					lblNewLabel2.setText("A versão extendida do album de sucesso");
					lblNewLabel3.setText("Com 21 músicas e um total de 1h e 9 minutos ");
					lblNewLabel4.setText("Principais genêros: R&B e Soul/neo\r\n Soul");
				}
			}

		});

		contentPane.add(btnDeluxe);
		textField = new JTextField();
		textField.setBounds(640, 144, 385, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_7 = new JLabel("Qual seu genero musical favorito?");
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(640, 119, 250, 14);
		contentPane.add(lblNewLabel_7);

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
		textField_6.setBounds(640, 320, 250, 22);
		contentPane.add(textField_6);
		textField_6.setColumns(10);

		textField_7 = new JTextField();
		textField_7.setBounds(640, 340, 250, 22);
		contentPane.add(textField_7);
		textField_7.setColumns(10);

		textField_8 = new JTextField();
		textField_8.setBounds(900, 220, 250, 22);
		contentPane.add(textField_8);
		textField_8.setColumns(10);

		textField_9 = new JTextField();
		textField_9.setBounds(900, 240, 250, 22);
		contentPane.add(textField_9);
		textField_9.setColumns(10);

		textField_10 = new JTextField();
		textField_10.setBounds(900, 260, 250, 22);
		contentPane.add(textField_10);
		textField_10.setColumns(10);

		textField_11 = new JTextField();
		textField_11.setBounds(900, 280, 250, 22);
		contentPane.add(textField_11);
		textField_11.setColumns(10);

		textField_12 = new JTextField();
		textField_12.setBounds(900, 300, 250, 22);
		contentPane.add(textField_12);
		textField_12.setColumns(10);

		textField_13 = new JTextField();
		textField_13.setBounds(900, 320, 250, 22);
		contentPane.add(textField_13);
		textField_13.setColumns(10);

		textField_14 = new JTextField();
		textField_14.setBounds(900, 340, 250, 22);
		contentPane.add(textField_14);
		textField_14.setColumns(10);
		JLabel lblMusicasQueVoc = new JLabel("Musicas que você pode gostar ");
		lblMusicasQueVoc.setForeground(Color.WHITE);
		lblMusicasQueVoc.setFont(new Font("Arial", Font.PLAIN, 22));
		lblMusicasQueVoc.setBounds(640, 182, 332, 24);
		contentPane.add(lblMusicasQueVoc);

		JButton btnEnviar = new JButton("enviar");
		btnEnviar.setBounds(1030, 143, 89, 23);
		contentPane.add(btnEnviar);
		btnEnviar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String genre = textField.getText().toUpperCase();
				if (genre.contains("")) {
					limpaCampos();
				}
				if (genre.contains("R&B")) {
					limpaCampos();
					textField_1.setText(lblSupermodel.getText());
					textField_2.setText(lblLG.getText());
					textField_3.setText(lblDW.getText());
					textField_4.setText(lblDB.getText());
					textField_5.setText(lblProm.getText());
					textField_6.setText(lblGG.getText());
					textField_7.setText(lblGarden.getText());
					textField_8.setText(lblAny.getText());
					textField_9.setText(lblNG.getText());
					textField_10.setText(lbl20.getText());
					textField_11.setText(lbl2AM.getText());
					textField_12.setText(lblPerloc.getText());
					textField_13.setText(lblAkw.getText());
					textField_14.setText(lblJodie.getText());
				}
				if (genre.contains("POP")) {
					limpaCampos();
					textField_1.setText(lblLG.getText());
					textField_2.setText(lblTW.getText());
					textField_3.setText(lblGarden.getText());
					textField_4.setText(lblBC.getText());
					textField_5.setText(lblLGA.getText());

				}
				if (genre.contains("HIP-HOP")) {
					limpaCampos();
					textField_1.setText(lblLG.getText());
					textField_2.setText(lblDW.getText());
					textField_3.setText(lblGG.getText());
					textField_4.setText(lblW.getText());
					textField_5.setText(lbl2AM.getText());
					textField_6.setText(lblLGA.getText());
					textField_7.setText(lblPerloc.getText());
					textField_8.setText(lblJodie.getText());
				}
				if (genre.contains("SOUL")) {
					limpaCampos();
					textField_1.setText(lblSupermodel.getText());
					textField_2.setText(lblDB.getText());
					textField_3.setText(lblProm.getText());
					textField_4.setText(lblNG.getText());
					textField_5.setText(lblPLB.getText());
					textField_6.setText(lbl20.getText());
					textField_7.setText(lblMiles.getText());
					textField_8.setText(lblAkw.getText());
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
		textField_11.setText("");
		textField_12.setText("");
		textField_13.setText("");
		textField_14.setText("");
	}
}
