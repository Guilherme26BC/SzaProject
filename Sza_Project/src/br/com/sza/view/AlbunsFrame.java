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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class AlbunsFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton ZButton, SOSButton, CTRLButton;
	private JPanel ZPanel;
	private JPanel CTRLPanel;
	private JPanel SOSPanel;
	private JPanel SOSImagePanel;
	private String names[] = {"CTRL_sza.jpg", "SOS_sza.jpg" };
	private Icon icons[] = { new ImageIcon(getClass().getResource(names[0])),
			new ImageIcon(getClass().getResource(names[1]))};
	private JLabel lblAlbuns;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlbunsFrame frame = new AlbunsFrame();
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
	public AlbunsFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 230, 140));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("SZA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 40));
		lblNewLabel.setBounds(525, 20, 150, 40);
		contentPane.add(lblNewLabel);

		lblAlbuns = new JLabel("Albuns");
		lblAlbuns.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlbuns.setFont(new Font("Arial", Font.PLAIN, 35));
		lblAlbuns.setBounds(525, 73, 150, 40);
		contentPane.add(lblAlbuns);

		CTRLPanel = new JPanel();
		CTRLPanel.setBackground(new Color(238, 232, 170));
		CTRLPanel.setBounds(202, 138, 330, 425);
		contentPane.add(CTRLPanel);

		SOSPanel = new JPanel();
		SOSPanel.setBackground(new Color(238, 232, 170));
		SOSPanel.setBounds(668, 138, 330, 425);
		contentPane.add(SOSPanel);

		CTRLButton = new JButton("Saiba Mais!");
		SOSButton = new JButton("Saiba Mais!");


		CTRLButton.setBounds(115, 351, 100, 30);
		CTRLButton.setHorizontalAlignment(SwingConstants.CENTER);
		CTRLButton.setFont(new Font("Arial", Font.PLAIN, 12));
		CTRLButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				CtrlFrame.main(null);
			}
		});

		SOSButton.setBounds(115, 351, 100, 33);
		SOSButton.setHorizontalAlignment(SwingConstants.CENTER);
		SOSButton.setFont(new Font("Arial", Font.PLAIN, 12));
		SOSButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				SosFrame.main(null);;
			}
		});



		CTRLPanel.setLayout(null);
		CTRLPanel.add(CTRLButton);

		JPanel CTRLImagePanel = new JPanel();
		CTRLImagePanel.setBounds(40, 30, 250, 220);
		CTRLPanel.add(CTRLImagePanel);

		JLabel CTRLImage = new JLabel();
		CTRLImage.setBounds(40, 30, 250, 220);
		CTRLImage.setIcon(icons[0]);
		CTRLImagePanel.add(CTRLImage);

		lblNewLabel_3 = new JLabel("Lançado em 9 de Junho de 2017");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(70, 297, 203, 30);
		CTRLPanel.add(lblNewLabel_3);

		lblNewLabel_4 = new JLabel("CTRL");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 17));
		lblNewLabel_4.setBounds(137, 256, 57, 30);
		CTRLPanel.add(lblNewLabel_4);

		SOSPanel.setLayout(null);
		SOSPanel.add(SOSButton);

		SOSImagePanel = new JPanel();
		SOSImagePanel.setBounds(40, 30, 250, 220);
		SOSPanel.add(SOSImagePanel);

		JLabel SOSImage = new JLabel();
		SOSImage.setBounds(40, 30, 250, 220);
		SOSImage.setIcon(icons[1]);
		SOSImagePanel.add(SOSImage);

		lblNewLabel_5 = new JLabel("SOS");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 17));
		lblNewLabel_5.setBounds(137, 256, 57, 30);
		SOSPanel.add(lblNewLabel_5);

		lblNewLabel_6 = new JLabel("Lançado em 9 de Dezembo de 2022");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(63, 297, 230, 30);
		SOSPanel.add(lblNewLabel_6);

		JButton btnVoltar = new JButton("Sair");
		btnVoltar.setHorizontalAlignment(SwingConstants.CENTER);
		btnVoltar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnVoltar.setBounds(62, 20, 100, 30);
		btnVoltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});
		contentPane.add(btnVoltar);

	}
}

