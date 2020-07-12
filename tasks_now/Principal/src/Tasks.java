import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.Box;
import java.awt.Component;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.FlowLayout;

public class Tasks extends JFrame {
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tasks frame = new Tasks();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Tasks() {
		setTitle("Inicio");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel superior_botoes = new JPanel();
		contentPane.add(superior_botoes, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("Tarefas");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		superior_botoes.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Concluidas");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Concluidos janela = new Concluidos();
				janela.setVisible(true);
				setVisible(false);
				
			}
		});
		superior_botoes.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		Box verticalBox_1 = Box.createVerticalBox();
		panel_1.add(verticalBox_1);
							
							Box horizontalUmConteudo_1 = Box.createHorizontalBox();
							horizontalUmConteudo_1.setBackground(Color.WHITE);
							verticalBox_1.add(horizontalUmConteudo_1);
							
							JPanel panel_2 = new JPanel();
							panel_2.setBackground(Color.WHITE);
							horizontalUmConteudo_1.add(panel_2);
							
							JLabel lblNewLabel_1_1_1 = new JLabel("Lael4trrttrrttedgd g");
							panel_2.add(lblNewLabel_1_1_1);
							
							JButton btnNewButton_2_2_1_1 = new JButton("+");
							btnNewButton_2_2_1_1.setForeground(Color.WHITE);
							btnNewButton_2_2_1_1.setBackground(new Color(255, 69, 0));
							panel_2.add(btnNewButton_2_2_1_1);
							
							JButton btnNewButton_3_1_1_1 = new JButton("-");
							btnNewButton_3_1_1_1.setForeground(Color.WHITE);
							btnNewButton_3_1_1_1.setBackground(new Color(100, 149, 237));
							panel_2.add(btnNewButton_3_1_1_1);
							
							JButton btnNewButton_4_1_1_1 = new JButton("X");
							btnNewButton_4_1_1_1.setName("name2");
							btnNewButton_4_1_1_1.setForeground(Color.WHITE);
							btnNewButton_4_1_1_1.setBackground(Color.RED);
							panel_2.add(btnNewButton_4_1_1_1);
							
							JButton btnNewButton_5_1_1_1 = new JButton("OK");
							btnNewButton_5_1_1_1.setName("name");
							btnNewButton_5_1_1_1.setForeground(Color.WHITE);
							btnNewButton_5_1_1_1.setBackground(new Color(0, 128, 0));
							panel_2.add(btnNewButton_5_1_1_1);
							
							Box horizontalUmConteudo = Box.createHorizontalBox();
							horizontalUmConteudo.setBackground(Color.WHITE);
							verticalBox_1.add(horizontalUmConteudo);
							
							JPanel panel = new JPanel();
							panel.setBackground(new Color(255, 255, 255));
							horizontalUmConteudo.add(panel);
							
							JLabel lblNewLabel_1_1 = new JLabel("Lael4trrttrrttedgd g");
							panel.add(lblNewLabel_1_1);
							
							JButton btnNewButton_2_2_1 = new JButton("+");
							panel.add(btnNewButton_2_2_1);
							btnNewButton_2_2_1.setForeground(new Color(255, 255, 255));
							btnNewButton_2_2_1.setBackground(new Color(255, 69, 0));
							
							JButton btnNewButton_3_1_1 = new JButton("-");
							panel.add(btnNewButton_3_1_1);
							btnNewButton_3_1_1.setForeground(new Color(255, 255, 255));
							btnNewButton_3_1_1.setBackground(new Color(100, 149, 237));
							
							JButton btnNewButton_4_1_1 = new JButton("X");
							panel.add(btnNewButton_4_1_1);
							btnNewButton_4_1_1.setBackground(new Color(255, 0, 0));
							btnNewButton_4_1_1.setForeground(new Color(255, 255, 255));
							btnNewButton_4_1_1.setName("name2");
							
							JButton btnNewButton_5_1_1 = new JButton("OK");
							panel.add(btnNewButton_5_1_1);
							btnNewButton_5_1_1.setForeground(new Color(255, 255, 255));
							btnNewButton_5_1_1.setBackground(new Color(0, 128, 0));
							btnNewButton_5_1_1.setName("name");
		
		Box horizontalBox = Box.createHorizontalBox();
		contentPane.add(horizontalBox, BorderLayout.WEST);
				
				//}
			///} catch (Exception e2 ) {
				//System.out.println("Deu tudo errado mano, olha só = " + e2);
			//}
			 
		///} else {
		///	System.out.println("Erro ao conectar ao banco! "  + Dados.objBD.mensagem());
///		}

		JPanel inferior = new JPanel();
		contentPane.add(inferior, BorderLayout.SOUTH);
		
		JButton btnNewButton_2_1 = new JButton("+");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Adicionar janela = new Adicionar();
				setVisible(false);
				janela.setVisible(true);
			}
		});
		inferior.add(btnNewButton_2_1);
		
		JLabel lblAdicionarNovaTarefa = new JLabel("Adicionar nova tarefa");
		inferior.add(lblAdicionarNovaTarefa);
	}
}
