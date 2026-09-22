import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Component;
import java.awt.Point;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 200, 850, 420);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setLocation(new Point(10, 100));
		contentPane.setAlignmentY(Component.TOP_ALIGNMENT);
		contentPane.setAlignmentX(Component.RIGHT_ALIGNMENT);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Hola Mundo");
		lblNewLabel.setSize(264, 61);
		lblNewLabel.setAlignmentX(100.0f);
		lblNewLabel.setAlignmentY(200.0f);
		lblNewLabel.setLabelFor(lblNewLabel);
		lblNewLabel.setLocation(new Point(344, 100));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBackground(new Color(255, 0, 0));
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Tocame_Papu");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.addMouseListener(new MouseAdapter() {
			//Estar encima del boton
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("Caliente");
			}
			@Override
			//estar Afuera del boton
			public void mouseExited(MouseEvent e) {
				btnNewButton.setText("Tocame");
				System.out.println("Frio");
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Te Quemaste");
				btnNewButton.setText("Gemido Aaagggghhhh");
				
			}
		});
		btnNewButton.setBounds(387, 173, 166, 45);
		contentPane.add(btnNewButton);
	}
}
