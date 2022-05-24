package COMPETENCIA_5;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Pagar extends JFrame {

	static JPanel contentPane;
	static JTextField txtcliente2;
	static JTextField txtespecie2;
	static JTextField txtraza2;
	static JTextField txttotal2;
	static JTextField lblespecie2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pagar frame = new Pagar();
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
	public Pagar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 472);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 250, 210));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVeterinariaElCoyote = new JLabel("VETERINARIA EL COYOTE");
		lblVeterinariaElCoyote.setForeground(new Color(0, 0, 139));
		lblVeterinariaElCoyote.setFont(new Font("SimSun-ExtB", Font.BOLD | Font.ITALIC, 13));
		lblVeterinariaElCoyote.setBounds(207, 11, 213, 24);
		contentPane.add(lblVeterinariaElCoyote);
		
		JLabel lblCliente = new JLabel("CLIENTE");
		lblCliente.setBounds(23, 111, 52, 24);
		contentPane.add(lblCliente);
		
		txtcliente2 = new JTextField();
		txtcliente2.setBounds(102, 113, 128, 20);
		contentPane.add(txtcliente2);
		txtcliente2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ESPECIFICACIONES");
		lblNewLabel.setBounds(259, 85, 112, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("RAZA");
		lblNewLabel_1.setBounds(23, 179, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtespecie2 = new JTextField();
		txtespecie2.setBounds(259, 110, 184, 118);
		contentPane.add(txtespecie2);
		txtespecie2.setColumns(10);
		
		txtraza2 = new JTextField();
		txtraza2.setBounds(102, 169, 128, 35);
		contentPane.add(txtraza2);
		txtraza2.setColumns(10);
		
		JLabel lblTotalAPagar = new JLabel("TOTAL A PAGAR");
		lblTotalAPagar.setBounds(73, 269, 102, 14);
		contentPane.add(lblTotalAPagar);
		
		txttotal2 = new JTextField();
		txttotal2.setBounds(205, 264, 128, 24);
		contentPane.add(txttotal2);
		txttotal2.setColumns(10);
		
		JLabel gracias = new JLabel("");
		gracias.setBounds(23, 294, 420, 58);
		contentPane.add(gracias);
		
		
		JButton btnPagar = new JButton("PAGAR");
		btnPagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ImageIcon foto = new ImageIcon("C:\\Users\\zaira\\Pictures\\Uplay\\gracias.png");
				Icon icono = new ImageIcon(foto.getImage().getScaledInstance(gracias.getWidth(),gracias.getHeight(), Image.SCALE_DEFAULT));
				gracias.setIcon(icono);
				
				JOptionPane.showMessageDialog(null, "POR FAVOR RETIRE SU NOTA","NOTA",JOptionPane.INFORMATION_MESSAGE); 

				
			}
		});
		btnPagar.setBounds(58, 372, 88, 24);
		contentPane.add(btnPagar);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(331, 372, 88, 24);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(23, 11, 102, 89);
		contentPane.add(lblNewLabel_2);
		ImageIcon foto = new ImageIcon("C:\\Users\\zaira\\Pictures\\Uplay\\logoo.png");
		Icon icono = new ImageIcon(foto.getImage().getScaledInstance(lblNewLabel_2.getWidth(),lblNewLabel_2.getHeight(), Image.SCALE_DEFAULT));
		lblNewLabel_2.setIcon(icono);
		
		JLabel lblespecie = new JLabel("ESPECIE");
		lblespecie.setBounds(23, 146, 69, 14);
		contentPane.add(lblespecie);
		
		lblespecie2 = new JTextField();
		lblespecie2.setBounds(102, 141, 128, 20);
		contentPane.add(lblespecie2);
		lblespecie2.setColumns(10);
		
		JLabel label = new JLabel("MEDICO VETERINARIO ZOOTECNISTA");
		label.setFont(new Font("Sitka Text", Font.ITALIC, 11));
		label.setBounds(207, 35, 245, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("VETERINARIOS: HUGO MARLONN LOPEZ Y ZAIRA YHAEL REGALADO");
		label_1.setFont(new Font("Trebuchet MS", Font.ITALIC, 11));
		label_1.setBounds(128, 47, 385, 14);
		contentPane.add(label_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(287, 407, 46, 14);
		contentPane.add(lblNewLabel_3);
	}
}
