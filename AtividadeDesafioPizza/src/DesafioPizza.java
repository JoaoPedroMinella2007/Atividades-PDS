import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.lang.foreign.Linker.Option;
import java.util.Optional;
import java.awt.event.ActionEvent;

public class DesafioPizza extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DesafioPizza frame = new DesafioPizza();
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
	public DesafioPizza() {
		setTitle("Pizzaria Bela Vista");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ButtonGroup grupo = new ButtonGroup();
		
		JLabel lblNomeCardapio = new JLabel("Pedidos");
		lblNomeCardapio.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNomeCardapio.setBounds(203, 10, 156, 25);
		contentPane.add(lblNomeCardapio);
		
		JCheckBox nbxSabor1 = new JCheckBox("Frango - R$ 40");
		nbxSabor1.setBounds(188, 105, 143, 21);
		contentPane.add(nbxSabor1);
		
		JLabel lblSabores = new JLabel("Sabores");
		lblSabores.setHorizontalAlignment(SwingConstants.CENTER);
		lblSabores.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblSabores.setBounds(203, 63, 79, 13);
		contentPane.add(lblSabores);
		
		JCheckBox nbxSabor2 = new JCheckBox("Calabresa - R$ 35 ");
		nbxSabor2.setBounds(188, 82, 143, 21);
		contentPane.add(nbxSabor2);
		
		JCheckBox nbxSabor3 = new JCheckBox("Coraçãozinho - R$ 35");
		nbxSabor3.setBounds(188, 128, 171, 21);
		contentPane.add(nbxSabor3);
		
		JLabel lblOpcoes = new JLabel("Opção de borda");
		lblOpcoes.setHorizontalAlignment(SwingConstants.LEFT);
		lblOpcoes.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblOpcoes.setBounds(10, 63, 156, 13);
		contentPane.add(lblOpcoes);
		
		JRadioButton rdbtnOpcao1 = new JRadioButton("Com borda recheada - R$ 5");
		rdbtnOpcao1.setBounds(6, 105, 180, 21);
		contentPane.add(rdbtnOpcao1);
		
		JRadioButton rdbtnOpcao2 = new JRadioButton("Sem borda recheada ");
		rdbtnOpcao2.setBounds(6, 128, 180, 21);
		contentPane.add(rdbtnOpcao2);
		
		JLabel lblOpcionais = new JLabel("Opcionais");
		lblOpcionais.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblOpcionais.setHorizontalAlignment(SwingConstants.CENTER);
		lblOpcionais.setBounds(384, 63, 79, 13);
		contentPane.add(lblOpcionais);
		
		JCheckBox chcOpcional1 = new JCheckBox("Milho - R$ 2");
		chcOpcional1.setBounds(384, 82, 93, 21);
		contentPane.add(chcOpcional1);
		
		JCheckBox chcOpcional2 = new JCheckBox("Ervilhas - R$ 2");
		chcOpcional2.setBounds(384, 105, 128, 21);
		contentPane.add(chcOpcional2);
		
		JCheckBox chcOpcional3 = new JCheckBox("Cogumelos - R$ 2");
		chcOpcional3.setBounds(384, 128, 143, 21);
		contentPane.add(chcOpcional3);
		
		JCheckBox chcOpcional4 = new JCheckBox("Cebola - R$ 2");
		chcOpcional4.setBounds(384, 150, 108, 21);
		contentPane.add(chcOpcional4);
		
		JCheckBox chcOpcional5 = new JCheckBox("Alho - R$ 2");
		chcOpcional5.setBounds(384, 173, 108, 21);
		contentPane.add(chcOpcional5);
		
		JCheckBox chcOpcional6 = new JCheckBox("Chocolate - R$ 3");
		chcOpcional6.setBounds(384, 196, 128, 21);
		contentPane.add(chcOpcional6);
		
		JCheckBox chcOpcional7 = new JCheckBox("Morango - R$ 2");
		chcOpcional7.setBounds(384, 219, 128, 21);
		contentPane.add(chcOpcional7);
		
		JCheckBox chcOpcional8 = new JCheckBox("Paçoca - R$ 2");
		chcOpcional8.setBounds(384, 238, 108, 21);
		contentPane.add(chcOpcional8);
		
		JCheckBox chcOpcional9 = new JCheckBox("Batata - R$ 2");
		chcOpcional9.setBounds(384, 261, 108, 21);
		contentPane.add(chcOpcional9);
		
		JLabel lblNomeBorda = new JLabel("(Chocolate)");
		lblNomeBorda.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		lblNomeBorda.setBounds(30, 82, 72, 13);
		contentPane.add(lblNomeBorda);
		
		JLabel lblOpcaoEntrega = new JLabel("Opções de entrega");
		lblOpcaoEntrega.setHorizontalAlignment(SwingConstants.CENTER);
		lblOpcaoEntrega.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblOpcaoEntrega.setBounds(0, 215, 143, 13);
		contentPane.add(lblOpcaoEntrega);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 10));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tele entrega - R$ 20", "Retirar no local ", "Comer no local"}));
		comboBox.setBounds(10, 238, 128, 21);
		contentPane.add(comboBox);
		
		JButton btnFinalizarPedido = new JButton("Finalizar pedido");
		btnFinalizarPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double valorTotal = 0.0; 
				String pedido = "Pedido: \n\nPizza:\n";
				
			if(nbxSabor1.isSelected()) {
				pedido += "Frango (R$40)\n";
				valorTotal += 40.0;
			}
			
			if(nbxSabor2.isSelected()) {
				pedido += "Calabresa (R$35)\n";
				valorTotal += 35.0;
			}
			
			if(nbxSabor3.isSelected()) {
				pedido += "Coraçãozinho (35R$)\n";
				valorTotal += 35.0;
			}
			
			if(rdbtnOpcao1.isSelected()) {
				pedido += " - Com borda (R$5)\n\nOpcionais: \n";
				valorTotal += 5.0;			
			}
			
			if(rdbtnOpcao2.isSelected()) {
				pedido += " - Sem borda (grátis)\n\nOpcionais: \n";
				
			}
			
			boolean OpcionalSelecionado = false;
			
				if (chcOpcional1.isSelected()) {
					 pedido += " - Milho (R$ 2)\n";
			         valorTotal += 2.0;
			            
			         OpcionalSelecionado = true;
				}
		        	 
		        if (chcOpcional2.isSelected()) {
		            pedido += " - Ervilhas (R$ 2)\n";
		            valorTotal += 2.0;
		            
		            OpcionalSelecionado = true;

		        }
		        if (chcOpcional3.isSelected()) {
		            pedido += " - Cogumelos (R$ 2)\n";
		            valorTotal += 2.0;
		            
		            OpcionalSelecionado = true;

		        }
		        if (chcOpcional4.isSelected()) {
		            pedido += " - Cebola (R$ 2)\n";
		            valorTotal += 2.0;
		            
		            OpcionalSelecionado = true;

		        }
		        if (chcOpcional5.isSelected()) {
		            pedido += " - Alho (R$ 2)\n";
		            valorTotal += 2.0;
		            
		            OpcionalSelecionado = true;

		        }
		        if (chcOpcional6.isSelected()) {
		            pedido += " - Chocolate (R$ 3)\n";
		            valorTotal += 3.0;
		            
		            OpcionalSelecionado = true;

		        }
		        if (chcOpcional7.isSelected()) {
		            pedido += " - Morango (R$ 2)\n";
		            valorTotal += 2.0;
		            
		            OpcionalSelecionado = true;

		        }
		        if (chcOpcional8.isSelected()) {
		            pedido += " - Paçoca (R$ 2)\n";
		            valorTotal += 2.0;
		            
		            OpcionalSelecionado = true;

		        }
		        if (chcOpcional9.isSelected()) {
		            pedido += " - Batata (R$ 2)\n";
		            valorTotal += 2.0;
		            
		            OpcionalSelecionado = true;

		        }
		        
		        if(!OpcionalSelecionado){
		        	pedido += "Não há opcionais selecionados. \n";
		        }

		        String entrega = (String) comboBox.getSelectedItem();
		        pedido += "\nEntrega: " + entrega + "\n\n";
		        if (entrega.contains("R$ 20")) {
		            valorTotal += 20.0;
		        }
		        
		        pedido += "Valor Total: R$ " + String.format("%.2f", valorTotal);
		        JOptionPane.showMessageDialog(contentPane, pedido.toString(), "Pedido pronto", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnFinalizarPedido.setBounds(185, 238, 135, 21);
		contentPane.add(btnFinalizarPedido);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(185, 269, 135, 21);
		contentPane.add(btnFechar);
		
		grupo.add(rdbtnOpcao1);
		grupo.add(rdbtnOpcao2);
		
	}
}
