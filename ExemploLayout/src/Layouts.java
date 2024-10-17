import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;
import javax.swing.JMenuBar;
import javax.swing.JTextPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Layouts extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Layouts frame = new Layouts();
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
	public Layouts() {
		
		JComboBox comboBox = new JComboBox();
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblResultado = new JLabel("Selecione uma opção");
		lblResultado.setBounds(147, 32, 147, 14);
		getContentPane().add(lblResultado);
		
		JButton btnMostrar = new JButton("Mostrar seleção");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String opcaoSelecionada = (String) comboBox.getSelectedItem();
				lblResultado.setText("Selecionado: " + opcaoSelecionada);
			}
		});
		btnMostrar.setBounds(141, 175, 131, 23);
		getContentPane().add(btnMostrar);
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Gaspar", "Blumenau ", "Florianopolis", "Calmón", "Criciuma", "Joinville", "Itajaí"}));
		comboBox.setBounds(140, 51, 120, 22);
		getContentPane().add(comboBox);

	}
}
