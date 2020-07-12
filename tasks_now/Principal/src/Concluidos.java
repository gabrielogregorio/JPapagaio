import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.Box;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Color;

public class Concluidos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Concluidos frame = new Concluidos();
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
	public Concluidos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel superior_botoes = new JPanel();
		contentPane.add(superior_botoes);
		superior_botoes.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("Tarefas");
		superior_botoes.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Concluidas");
		superior_botoes.add(btnNewButton_1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Tasks janela = new Tasks();
				janela.setVisible(true);
				setVisible(false);
			}
		});
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		Box horizontalBox = Box.createHorizontalBox();
		panel.add(horizontalBox);
		
		Box verticalBox = Box.createVerticalBox();
		horizontalBox.add(verticalBox);
		
		JLabel lblNewLabel_1_1 = new JLabel("Fazer o sistema d");
		verticalBox.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Fazer o sistema de conexão remota");
		verticalBox.add(lblNewLabel_1_1_1);
		
		Box verticalBox_1 = Box.createVerticalBox();
		horizontalBox.add(verticalBox_1);
		
		JButton btnNewButton_4_1_1_1 = new JButton("X");
		btnNewButton_4_1_1_1.setBackground(new Color(238, 238, 238));
		btnNewButton_4_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_4_1_1_1.setForeground(Color.RED);
		btnNewButton_4_1_1_1.setName("xddd");
		verticalBox_1.add(btnNewButton_4_1_1_1);
		
		JButton btnNewButton_4_1_1 = new JButton("X");
		btnNewButton_4_1_1.setBackground(new Color(238, 238, 238));
		btnNewButton_4_1_1.setForeground(Color.RED);
		btnNewButton_4_1_1.setName("xddd");
		verticalBox_1.add(btnNewButton_4_1_1);
		//objRes.getString("ID"));
		btnNewButton_4_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JButton botao = (JButton) arg0.getSource();
				System.out.println( botao.getName().toString() );

				String sqlInsert = "DELETE FROM TAREFAS WHERE ID = " + botao.getName().toString();

  				System.out.println(sqlInsert);
         		Dados.Inserir(sqlInsert);
				setVisible(true);
			}
		});
	
			//}
		///} catch (Exception e2 ) {
			//System.out.println("Deu tudo errado mano, olha só = " + e2);
		//}
		 
	///} else {
		//System.out.println("Erro ao conectar ao banco! "  + Dados.objBD.mensagem());
	///}
	
	
	
	
	


	}

}
