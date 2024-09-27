import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setTitle("Meu primeiro projeto com JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBounds(60, 187, 65, 23);
		btnFechar.setVerticalAlignment(SwingConstants.BOTTOM);
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnFechar);
		
		JLabel lblSauda = new JLabel("OLÁ, MUNDO");
		lblSauda.setBounds(142, 103, 130, 35);
		lblSauda.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblSauda);
		
		JButton btnTeste1 = new JButton("Teste1");
		btnTeste1.setBounds(135, 188, 65, 23);
		btnTeste1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Bom dia amigos");
			}
		});
		contentPane.add(btnTeste1);
		
		JButton btnTeste2 = new JButton("Teste2");
		btnTeste2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int resposta = JOptionPane.showConfirmDialog(null, "Voce está gostando de programar?",
						"Confirmação", JOptionPane.YES_NO_OPTION);
				
				if(resposta == 0) {
					JOptionPane.showInternalMessageDialog(null, "Que legal! Muito top.", "Resposta SIM", JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showInternalMessageDialog(null, "Que pena! Triste.", "Resposta NÃO", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnTeste2.setBounds(210, 188, 65, 23);
		contentPane.add(btnTeste2);
		
		JButton btnTeste3 = new JButton("Teste3");
		btnTeste3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = JOptionPane.showInputDialog(null, "Qual é o seu nome?", "Entrada de nome",
						JOptionPane.QUESTION_MESSAGE);
				
				JOptionPane.showMessageDialog(null, "Olá, " + nome );
			}
		});
		btnTeste3.setBounds(284, 188, 65, 23);
		contentPane.add(btnTeste3);
	}
}
