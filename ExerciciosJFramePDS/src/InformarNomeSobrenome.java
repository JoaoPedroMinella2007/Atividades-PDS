import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InformarNomeSobrenome extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtSobrenome;
	private JLabel lblResposta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InformarNomeSobrenome frame = new InformarNomeSobrenome();
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
	public InformarNomeSobrenome() {
		setTitle("Informar nome e sobrenome");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(67, 81, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblSobrenome = new JLabel("Sobrenome");
		lblSobrenome.setBounds(67, 106, 93, 14);
		contentPane.add(lblSobrenome);
		
		txtNome = new JTextField();
		txtNome.setBounds(144, 78, 197, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setBounds(144, 103, 197, 20);
		contentPane.add(txtSobrenome);
		txtSobrenome.setColumns(10);
		
		JLabel lblResposta = new JLabel("");
		lblResposta.setBounds(135, 144, 299, 14);
		contentPane.add(lblResposta);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = txtNome.getText();
				String sobrenome = txtSobrenome.getText();
				
				if(nome.isEmpty()) {
					lblResposta.setText("Por favor, insira seu nome!");
					
				    return;
				
				}
				
				if(sobrenome.isEmpty()) {
					lblResposta.setText("Por favor, insira seu sobrenome!");
				
					return;
				}
				
				try {
					
		            String Mensagem = "Nome completo: " + nome + " " + sobrenome;
		            
		            lblResposta.setText(Mensagem);
		            
		        } catch (Exception ex) {
		        	
		            lblResposta.setText("Ocorreu um erro." + ex.getMessage());
		        }
			}
		});
		btnConfirmar.setBounds(173, 182, 101, 23);
		contentPane.add(btnConfirmar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
			}
		});
		btnFechar.setBounds(173, 227, 101, 23);
		contentPane.add(btnFechar);
		
	}

}
