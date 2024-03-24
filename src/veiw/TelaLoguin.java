package veiw;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class TelaLoguin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_Usuario;
	private JPasswordField passwordField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLoguin frame = new TelaLoguin();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaLoguin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 446);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(84, 92, 107));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 197, 205));
		panel.setBounds(60, 10, 317, 363);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Ususario");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel.setBounds(22, 74, 101, 30);
		panel.add(lblNewLabel);

		JLabel lblLastname = new JLabel("Senha");
		lblLastname.setFont(new Font("Arial", Font.PLAIN, 18));
		lblLastname.setBounds(22, 162, 101, 30);
		panel.add(lblLastname);

		JLabel lblNewLabel_3 = new JLabel("Tela de Loguin");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(48, 21, 168, 43);
		panel.add(lblNewLabel_3);

		textField_Usuario = new JTextField();
		textField_Usuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_Usuario.setColumns(10);
		textField_Usuario.setBounds(44, 122, 212, 30);
		panel.add(textField_Usuario);

		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textField_Usuario.getText() != null && !textField_Usuario.getText().isEmpty()
						&& passwordField.getPassword() != null && passwordField.getPassword().length >= 6) {

					JOptionPane.showMessageDialog(btnNewButton, "Informações válidas");
				} else {

					JOptionPane.showMessageDialog(btnNewButton, "Por favor, preencha todos os campos.");
				}
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton.setBounds(74, 260, 168, 38);
		panel.add(btnNewButton);

		passwordField = new JPasswordField();
		passwordField.setBounds(48, 202, 208, 38);
		panel.add(passwordField);
	}
}
