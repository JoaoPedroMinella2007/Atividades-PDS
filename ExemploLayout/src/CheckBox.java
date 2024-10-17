import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Font;

public class CheckBox extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckBox frame = new CheckBox();
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
	public CheckBox() {
		setTitle("Teste de checkBox e RadioButton");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		ButtonGroup grupo = new ButtonGroup(); 
		
		JLabel lblNewLabel = new JLabel("Teste de botões");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(137, 24, 232, 14);
		getContentPane().add(lblNewLabel);
		
		JCheckBox chk1 = new JCheckBox("Laranja");
		chk1.setBounds(151, 72, 97, 23);
		getContentPane().add(chk1);
		
		JCheckBox chk2 = new JCheckBox("Goiaba");
		chk2.setBounds(151, 98, 97, 23);
		getContentPane().add(chk2);
		
		JCheckBox chk3 = new JCheckBox("Melancia");
		chk3.setBounds(151, 124, 97, 23);
		getContentPane().add(chk3);
		
		JButton btnValidar = new JButton("Validar");
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String mensagem = "";
				
			if(chk1.isSelected()) {
				mensagem = chk1.getText() + " ";
			}
			if(chk2.isSelected()) {
				mensagem += chk2.getText() + " ";
			}
			if(chk3.isSelected()) {
				mensagem += chk3.getText() + " ";
			}
			
			JOptionPane.showMessageDialog(null, "Você selecionou: " + mensagem);
			
			}
		});
		btnValidar.setBounds(95, 208, 89, 23);
		getContentPane().add(btnValidar);
		
		JRadioButton rbt1 = new JRadioButton("Opção 1");
		rbt1.setBounds(71, 178, 89, 23);
		getContentPane().add(rbt1);
		
		JRadioButton rbt2 = new JRadioButton("Opção 2");
		rbt2.setBounds(162, 178, 86, 23);
		getContentPane().add(rbt2);
		
		JRadioButton rbt3 = new JRadioButton("Opção 3");
		rbt3.setBounds(252, 178, 109, 23);
		getContentPane().add(rbt3);
		
		JButton btnTestarRB = new JButton("Testar Botões");
		btnTestarRB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String mensagem = "Nenhuma opção selecionada!";
				
				if(rbt1.isSelected()) {
					mensagem = "Opção 1 selecionada!";
				}else if(rbt2.isSelected()) {
					mensagem = "Opção 2 selecionada!";
				}else if(rbt3.isSelected()) {
					mensagem = "Opção 3 selecionada!";
				}
				
				JOptionPane.showMessageDialog(null, mensagem);
			}
		});
		btnTestarRB.setBounds(194, 208, 119, 23);
		getContentPane().add(btnTestarRB);
		grupo.add(rbt1);
		grupo.add(rbt2);
		grupo.add(rbt3);
	}
}
