package COMPETENCIA_5;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.Caret;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;
import java.awt.SystemColor;

public class Proyecto extends JFrame {

	private JPanel contentPane;
	private JTextField txtraza;
	private JTextField txtcliente;
	private JTextField lblvacuna;
	private JTextField lblesterilizar;
	private JTextField lblconsulta;
	private JTextField lbllesion;
	int vacuna;
	int esti;
	int consulta;
	int lesion;
	String especie;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proyecto frame = new Proyecto();
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
	public Proyecto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 762, 476);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 222, 179));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		JLabel lblVeterinraiaElCoyote = new JLabel("VETERINARIA EL COYOTE");
		lblVeterinraiaElCoyote.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 14));
		lblVeterinraiaElCoyote.setBounds(291, 11, 199, 25);
		contentPane.add(lblVeterinraiaElCoyote);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setFont(new Font("Rockwell", Font.PLAIN, 11));
		lblCliente.setBounds(28, 62, 93, 25);
		contentPane.add(lblCliente);
		
		JLabel lblEspecia = new JLabel("Especie");
		lblEspecia.setFont(new Font("Rockwell", Font.PLAIN, 11));
		lblEspecia.setBounds(28, 98, 94, 25);
		contentPane.add(lblEspecia);
		
		JLabel lblRaza = new JLabel("Raza");
		lblRaza.setFont(new Font("Rockwell", Font.PLAIN, 11));
		lblRaza.setBounds(28, 134, 46, 14);
		contentPane.add(lblRaza);


		JLabel lblespecie = new JLabel("New label");
		lblespecie.setBounds(278, 98, 290, 195);
		contentPane.add(lblespecie);
		
		JComboBox cmbespecie = new JComboBox();
		cmbespecie.setModel(new DefaultComboBoxModel(new String[] {"PERRO", "GATO", "CABALLO", "DINOSAURIO", "NUTRIA", "HAMSTER", "GALLINA", "DRAGON", "OTRO"}));
		cmbespecie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(cmbespecie.getSelectedItem().equals("PERRO")) {
					ImageIcon foto = new ImageIcon("C:\\Users\\zaira\\Pictures\\Uplay\\perro.jpg");
					Icon icono = new ImageIcon(foto.getImage().getScaledInstance(lblespecie.getWidth(),lblespecie.getHeight(), Image.SCALE_DEFAULT));
					lblespecie.setIcon(icono);
				
				}
				if(cmbespecie.getSelectedItem().equals("GATO")) {
					ImageIcon foto = new ImageIcon("C:\\Users\\zaira\\Pictures\\Uplay\\gato.jpg");
					Icon icono = new ImageIcon(foto.getImage().getScaledInstance(lblespecie.getWidth(),lblespecie.getHeight(), Image.SCALE_DEFAULT));
					lblespecie.setIcon(icono);
				}
				if(cmbespecie.getSelectedItem().equals("CABALLO")) {
					ImageIcon foto = new ImageIcon("C:\\Users\\zaira\\Pictures\\Uplay\\caballo.jpg");
					Icon icono = new ImageIcon(foto.getImage().getScaledInstance(lblespecie.getWidth(),lblespecie.getHeight(), Image.SCALE_DEFAULT));
					lblespecie.setIcon(icono);
				}
				if(cmbespecie.getSelectedItem().equals("DINOSAURIO")) {
					ImageIcon foto = new ImageIcon("C:\\Users\\zaira\\Pictures\\Uplay\\dinosaurió.jpg");
					Icon icono = new ImageIcon(foto.getImage().getScaledInstance(lblespecie.getWidth(),lblespecie.getHeight(), Image.SCALE_DEFAULT));
					lblespecie.setIcon(icono);
				}
				if(cmbespecie.getSelectedItem().equals("NUTRIA")) {
					ImageIcon foto = new ImageIcon("C:\\Users\\zaira\\Pictures\\Uplay\\nutria.jpg");
					Icon icono = new ImageIcon(foto.getImage().getScaledInstance(lblespecie.getWidth(),lblespecie.getHeight(), Image.SCALE_DEFAULT));
					lblespecie.setIcon(icono);
				}
				if(cmbespecie.getSelectedItem().equals("HAMSTER")) {
					ImageIcon foto = new ImageIcon("C:\\Users\\zaira\\Pictures\\Uplay\\s.png");
					Icon icono = new ImageIcon(foto.getImage().getScaledInstance(lblespecie.getWidth(),lblespecie.getHeight(), Image.SCALE_DEFAULT));
					lblespecie.setIcon(icono);
				}
				if(cmbespecie.getSelectedItem().equals("DRAGON")) {
					ImageIcon foto = new ImageIcon("C:\\Users\\zaira\\Pictures\\Uplay\\vaca.jpg");
					Icon icono = new ImageIcon(foto.getImage().getScaledInstance(lblespecie.getWidth(),lblespecie.getHeight(), Image.SCALE_DEFAULT));
					lblespecie.setIcon(icono);
				}
				if(cmbespecie.getSelectedItem().equals("GALLINA")) {
					ImageIcon foto = new ImageIcon("C:\\Users\\zaira\\Pictures\\Uplay\\gallina.jpg");
					Icon icono = new ImageIcon(foto.getImage().getScaledInstance(lblespecie.getWidth(),lblespecie.getHeight(), Image.SCALE_DEFAULT));
					lblespecie.setIcon(icono);
				}
				if(cmbespecie.getSelectedItem().equals("OTRO")) {
					ImageIcon foto = new ImageIcon("C:\\Users\\zaira\\Pictures\\Uplay\\animales.jpg");
					Icon icono = new ImageIcon(foto.getImage().getScaledInstance(lblespecie.getWidth(),lblespecie.getHeight(), Image.SCALE_DEFAULT));
					lblespecie.setIcon(icono);
				}
			}
		});
		
		JLabel lblSintoma = new JLabel("Servicio");
		lblSintoma.setFont(new Font("Rockwell", Font.PLAIN, 11));
		lblSintoma.setBounds(28, 169, 109, 14);
		contentPane.add(lblSintoma);
		
		txtraza = new JTextField();
		txtraza.setBounds(80, 131, 157, 27);
		contentPane.add(txtraza);
		txtraza.setColumns(10);
		
		txtcliente = new JTextField();
		txtcliente.setBounds(80, 64, 157, 25);
		contentPane.add(txtcliente);
		txtcliente.setColumns(10);
		
		JEditorPane txtespecificacion = new JEditorPane();
		txtespecificacion.setForeground(new Color(0, 0, 0));
		txtespecificacion.setBackground(new Color(255, 255, 255));
		txtespecificacion.setBounds(10, 332, 211, 94);
		contentPane.add(txtespecificacion);
		
		
		JCheckBox txtvacuna = new JCheckBox("Vacunacion");
		txtvacuna.setFont(new Font("Rockwell", Font.PLAIN, 11));
		txtvacuna.setBackground(new Color(176, 224, 230));
		txtvacuna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(cmbespecie.getSelectedItem().equals("PERRO")) {
					if(txtvacuna.isSelected()) {
					vacuna =120;
					lblvacuna.setText("$"+vacuna);
				}
					else {
						vacuna =0;
						lblvacuna.setText("$"+vacuna);
					}
				}
				if(cmbespecie.getSelectedItem().equals("GATO")) {
					if(txtvacuna.isSelected()) {
						vacuna =100;
						lblvacuna.setText("$"+vacuna);
					}
						else {
							vacuna =0;
							lblvacuna.setText("$"+vacuna);
						}
				}
				if(cmbespecie.getSelectedItem().equals("CABALLO")) {
					if(txtvacuna.isSelected()) {
						vacuna =200;
						lblvacuna.setText("$"+vacuna);
					}
						else {
							vacuna =0;
							lblvacuna.setText("$"+vacuna);
						}
				}
				if(cmbespecie.getSelectedItem().equals("DINOSAURIO")) {
					if(txtvacuna.isSelected()) {
						vacuna =10000;
						lblvacuna.setText("$"+vacuna);
					}
						else {
							vacuna =0;
							lblvacuna.setText("$"+vacuna);
						}
				}
				if(cmbespecie.getSelectedItem().equals("GALLINA")) {
					if(txtvacuna.isSelected()) {
						vacuna =50;
						lblvacuna.setText("$"+vacuna);
					}
						else {
							vacuna =0;
							lblvacuna.setText("$"+vacuna);
						}
				}
				if(cmbespecie.getSelectedItem().equals("HAMSTER")) {
					if(txtvacuna.isSelected()) {
						vacuna =60;
						lblvacuna.setText("$"+vacuna);
					}
						else {
							vacuna =0;
							lblvacuna.setText("$"+vacuna);
						}
				}
				if(cmbespecie.getSelectedItem().equals("NUTRIA")) {
					if(txtvacuna.isSelected()) {
						vacuna =200;
						lblvacuna.setText("$"+vacuna);
					}
						else {
							vacuna =0;
							lblvacuna.setText("$"+vacuna);
						}
				}
				if(cmbespecie.getSelectedItem().equals("DRAGON")) {
					if(txtvacuna.isSelected()) {
						vacuna =2000000;
						lblvacuna.setText("$"+vacuna);
					}
						else {
							vacuna =0;
							lblvacuna.setText("$"+vacuna);
						}
				}
				if(cmbespecie.getSelectedItem().equals("OTRO")) {
					if(txtvacuna.isSelected()) {
						vacuna =208;
						lblvacuna.setText("$"+vacuna);
					}
						else {
							vacuna =0;
							lblvacuna.setText("$"+vacuna);
						}
				}
				
			}
		});
		txtvacuna.setBounds(24, 190, 97, 23);
		contentPane.add(txtvacuna);
		
		JCheckBox txtesterilizar = new JCheckBox("Esterilizacion");
		txtesterilizar.setFont(new Font("Rockwell", Font.PLAIN, 11));
		txtesterilizar.setBackground(new Color(176, 224, 230));
		txtesterilizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(cmbespecie.getSelectedItem().equals("PERRO")) {
					if(txtesterilizar.isSelected()) {
						esti =600;
						lblesterilizar.setText("$"+esti);
					}
						else {
							esti =0;
							lblesterilizar.setText("$"+esti);
						}
				}
				
				if(cmbespecie.getSelectedItem().equals("GATO")) {
					if(txtesterilizar.isSelected()) {
						esti =500;
						lblesterilizar.setText("$"+esti);
					}
						else {
							esti =0;
							lblesterilizar.setText("$"+esti);
						}
				}
				
				if(cmbespecie.getSelectedItem().equals("CABALLO")) {
					if(txtesterilizar.isSelected()) {
						esti =900;
						lblesterilizar.setText("$"+esti);
					}
						else {
							esti =0;
							lblesterilizar.setText("$"+esti);
						}
				}
	
				if(cmbespecie.getSelectedItem().equals("DINOSAURIO")) {
					if(txtesterilizar.isSelected()) {
						esti =250000;
						lblesterilizar.setText("$"+esti);
					}
						else {
							esti =0;
							lblesterilizar.setText("$"+esti);
						}
				}
			
				if(cmbespecie.getSelectedItem().equals("GALLINA")) {
					if(txtesterilizar.isSelected()) {
						esti =150;
						lblesterilizar.setText("$"+esti);
					}
						else {
							esti =0;
							lblesterilizar.setText("$"+esti);
						}
				}
			
				if(cmbespecie.getSelectedItem().equals("HAMSTER")) {
					if(txtesterilizar.isSelected()) {
						esti =100;
						lblesterilizar.setText("$"+esti);
					}
						else {
							esti =0;
							lblesterilizar.setText("$"+esti);
						}
				}
		
				if(cmbespecie.getSelectedItem().equals("NUTRIA")) {
					if(txtesterilizar.isSelected()) {
						esti =400;
						lblesterilizar.setText("$"+esti);
					}
						else {
							esti =0;
							lblesterilizar.setText("$"+esti);
						}
				}
				
				if(cmbespecie.getSelectedItem().equals("DRAGON")) {
					if(txtesterilizar.isSelected()) {
						esti =5000000;
						lblesterilizar.setText("$"+esti);
					}
						else {
							esti =0;
							lblesterilizar.setText("$"+esti);
						}
				}	
				if(cmbespecie.getSelectedItem().equals("OTRO")) {
					if(txtesterilizar.isSelected()) {
						esti =500;
						lblesterilizar.setText("$"+esti);
					}
						else {
							esti =0;
							lblesterilizar.setText("$"+esti);
						}
				}	
				
			}
		});
		txtesterilizar.setBounds(24, 216, 97, 23);
		contentPane.add(txtesterilizar);
		
		JCheckBox txtconsulta = new JCheckBox("Consulta");
		txtconsulta.setFont(new Font("Rockwell", Font.PLAIN, 11));
		txtconsulta.setBackground(new Color(176, 224, 230));
		txtconsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(cmbespecie.getSelectedItem().equals("PERRO")) {
					if(txtconsulta.isSelected()) {
						consulta =100;
						lblconsulta.setText("$"+consulta);
					}
						else {
							consulta =0;
							lblconsulta.setText("$"+consulta);
						}
				}
				
				if(cmbespecie.getSelectedItem().equals("GATO")) {
					if(txtconsulta.isSelected()) {
						consulta =80;
						lblconsulta.setText("$"+consulta);
					}
						else {
							consulta =0;
							lblconsulta.setText("$"+consulta);
						}
				}
				if(cmbespecie.getSelectedItem().equals("CABALLO")) {
					if(txtconsulta.isSelected()) {
						consulta =150;
						lblconsulta.setText("$"+consulta);
					}
						else {
							consulta =0;
							lblconsulta.setText("$"+consulta);
						}
				}
				if(cmbespecie.getSelectedItem().equals("GALLINA")) {
					if(txtconsulta.isSelected()) {
						consulta =50;
						lblconsulta.setText("$"+consulta);
					}
						else {
							consulta =0;
							lblconsulta.setText("$"+consulta);
						}
				}
				if(cmbespecie.getSelectedItem().equals("HAMSTER")) {
					if(txtconsulta.isSelected()) {
						consulta =40;
						lblconsulta.setText("$"+consulta);
					}
						else {
							consulta =0;
							lblconsulta.setText("$"+consulta);
						}
				}
				if(cmbespecie.getSelectedItem().equals("DINOSAURIO")) {
					if(txtconsulta.isSelected()) {
						consulta =5000;
						lblconsulta.setText("$"+consulta);
					}
						else {
							consulta =0;
							lblconsulta.setText("$"+consulta);
						}
				}
				if(cmbespecie.getSelectedItem().equals("DRAGON")) {
					if(txtconsulta.isSelected()) {
						consulta =10000;
						lblconsulta.setText("$"+consulta);
					}
						else {
							consulta =0;
							lblconsulta.setText("$"+consulta);
						}
				}
				if(cmbespecie.getSelectedItem().equals("NUTRIA")) {
					if(txtconsulta.isSelected()) {
						consulta =100;
						lblconsulta.setText("$"+consulta);
					}
						else {
							consulta =0;
							lblconsulta.setText("$"+consulta);
						}
				}
				if(cmbespecie.getSelectedItem().equals("OTRO")) {
					if(txtconsulta.isSelected()) {
						consulta =100;
						lblconsulta.setText("$"+consulta);
					}
						else {
							consulta =0;
							lblconsulta.setText("$"+consulta);
						}
				}
				
			}
		});
		txtconsulta.setBounds(24, 242, 97, 23);
		contentPane.add(txtconsulta);
		
		JCheckBox txtlesion = new JCheckBox("Lesiones ");
		txtlesion.setFont(new Font("Rockwell", Font.PLAIN, 11));
		txtlesion.setBackground(new Color(176, 224, 230));
		txtlesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(cmbespecie.getSelectedItem().equals("PERRO")) {
					if(txtlesion.isSelected()) {
						lesion =200;
						lbllesion.setText("$"+lesion);
					}
						else {
							lesion =0;
							lbllesion.setText("$"+lesion);
						}
				}
				if(cmbespecie.getSelectedItem().equals("GATO")) {
					if(txtlesion.isSelected()) {
						lesion =100;
						lbllesion.setText("$"+lesion);
					}
						else {
							lesion =0;
							lbllesion.setText("$"+lesion);
						}
				}
					if(cmbespecie.getSelectedItem().equals("CABALLO")) {
						if(txtlesion.isSelected()) {
							lesion =400;
							lbllesion.setText("$"+lesion);
						}
							else {
								lesion =0;
								lbllesion.setText("$"+lesion);
							}
					}
					if(cmbespecie.getSelectedItem().equals("HAMSTER")) {
						if(txtlesion.isSelected()) {
							lesion =10;
							lbllesion.setText("$"+lesion);
						}
							else {
								lesion =0;
								lbllesion.setText("$"+lesion);
							}
					}
					if(cmbespecie.getSelectedItem().equals("DRAGON")) {
						if(txtlesion.isSelected()) {
							lesion =1000000;
							lbllesion.setText("$"+lesion);
						}
							else {
								lesion =0;
								lbllesion.setText("$"+lesion);
							}
					}
					if(cmbespecie.getSelectedItem().equals("DINOSAURIO")) {
						if(txtlesion.isSelected()) {
							lesion =500000;
							lbllesion.setText("$"+lesion);
						}
							else {
								lesion =0;
								lbllesion.setText("$"+lesion);
							}
					}
					if(cmbespecie.getSelectedItem().equals("NUTRIA")) {
						if(txtlesion.isSelected()) {
							lesion =150;
							lbllesion.setText("$"+lesion);
						}
							else {
								lesion =0;
								lbllesion.setText("$"+lesion);
							}
					}
					if(cmbespecie.getSelectedItem().equals("OTRO")) {
						if(txtlesion.isSelected()) {
							lesion =250;
							lbllesion.setText("$"+lesion);
						}
							else {
								lesion =0;
								lbllesion.setText("$"+lesion);
							}
					}
			}
		});
		txtlesion.setBounds(24, 268, 97, 23);
		contentPane.add(txtlesion);
		
		JLabel lblEspecificaciones = new JLabel("ESPECIFICACIONES");
		lblEspecificaciones.setFont(new Font("Rockwell", Font.PLAIN, 11));
		lblEspecificaciones.setBounds(28, 307, 109, 14);
		contentPane.add(lblEspecificaciones);
		
	
		JButton btnTratar = new JButton("TRATAR");
		btnTratar.setForeground(new Color(0, 0, 0));
		btnTratar.setBackground(new Color(175, 238, 238));
		btnTratar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int calcular, to=0;
					Pagar t = new Pagar();
					t.setVisible(true);
					
					Pagar.txtcliente2.setText(txtcliente.getText());
					Pagar.txtraza2.setText(txtraza.getText());
					calcular = lesion+consulta+esti+vacuna;
					Pagar.txttotal2.setText("$"+calcular);
					Pagar.txtespecie2.setText(txtespecificacion.getText());
					
					especie= cmbespecie.getSelectedItem().toString();
					Pagar.lblespecie2.setText((String) cmbespecie.getSelectedItem());
					
		
					
					
					
					
				
			}
		});
		btnTratar.setBounds(520, 323, 162, 68);
		contentPane.add(btnTratar);
		
		JLabel lblMedicoBeterinarioZootecnista = new JLabel("MEDICO VETERINARIO ZOOTECNISTA");
		lblMedicoBeterinarioZootecnista.setFont(new Font("Sitka Text", Font.ITALIC, 11));
		lblMedicoBeterinarioZootecnista.setBounds(291, 35, 245, 14);
		contentPane.add(lblMedicoBeterinarioZootecnista);
		
		JLabel lblBartolomeoPancracioNaruto = new JLabel("VETERINARIOS: HUGO MARLONN LOPEZ Y ZAIRA YHAEL REGALADO");
		lblBartolomeoPancracioNaruto.setFont(new Font("Trebuchet MS", Font.ITALIC, 11));
		lblBartolomeoPancracioNaruto.setBounds(212, 47, 385, 14);
		contentPane.add(lblBartolomeoPancracioNaruto);
		
		JButton btnsalir = new JButton("SALIR");
		btnsalir.setForeground(new Color(0, 0, 0));
		btnsalir.setBackground(new Color(175, 238, 238));
		btnsalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnsalir.setBounds(262, 323, 172, 68);
		contentPane.add(btnsalir);
	
		cmbespecie.setBounds(80, 100, 157, 20);
		contentPane.add(cmbespecie);
		
		lblvacuna = new JTextField();
		lblvacuna.setBounds(135, 191, 86, 20);
		contentPane.add(lblvacuna);
		lblvacuna.setColumns(10);
		
		lblesterilizar = new JTextField();
		lblesterilizar.setBounds(135, 217, 86, 20);
		contentPane.add(lblesterilizar);
		lblesterilizar.setColumns(10);
		
		lblconsulta = new JTextField();
		lblconsulta.setBounds(135, 243, 86, 20);
		contentPane.add(lblconsulta);
		lblconsulta.setColumns(10);
		
		lbllesion = new JTextField();
		lbllesion.setBounds(135, 269, 86, 20);
		contentPane.add(lbllesion);
		lbllesion.setColumns(10);
		
		JLabel lblCosto = new JLabel("Costo");
		lblCosto.setFont(new Font("Rockwell", Font.PLAIN, 11));
		lblCosto.setBounds(158, 169, 46, 14);
		contentPane.add(lblCosto);
		
		JLabel logo = new JLabel("New label");
		logo.setBounds(578, 11, 162, 126);
		contentPane.add(logo);
		ImageIcon foto = new ImageIcon("C:\\Users\\zaira\\Pictures\\Uplay\\logoo.png");
		Icon icono = new ImageIcon(foto.getImage().getScaledInstance(logo.getWidth(),logo.getHeight(), Image.SCALE_DEFAULT));
		logo.setIcon(icono);
		
		JLabel huella = new JLabel("New label");
		huella.setBounds(694, 388, 46, 38);
		contentPane.add(huella);
		ImageIcon imagen = new ImageIcon("C:\\Users\\zaira\\Pictures\\Uplay\\huella.png");
		Icon iconoo = new ImageIcon(imagen.getImage().getScaledInstance(huella.getWidth(),huella.getHeight(), Image.SCALE_DEFAULT));
		huella.setIcon(iconoo);
	}
}
