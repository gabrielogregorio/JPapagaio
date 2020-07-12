import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.Box;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Color;

public class Editar extends JFrame {

	private JPanel contentPane;
	private JTextField textField_titulo;
	private JTextField textField_descricao;
	private JTextField textField_prioridade;
	private JTextField textField_status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Editar frame = new Editar();
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
	public Editar() {
		setTitle("Editar");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				
				
				String sqlPesquisa = "SELECT ID, TITULO, DESCRICAO, PRIORIDADE, STATUS FROM TAREFAS WHERE ID = 1";
				Dados.Consultar(sqlPesquisa);

				if (Dados.objBD.conectaBD()) {
					System.out.println("Conectou ao banco de dados!");
					ResultSet objRes = Dados.objBD.consulta(sqlPesquisa);
					
					try {
						if (objRes.next()) {
							textField_titulo.setText(objRes.getString("TITULO"));
							textField_descricao.setText(objRes.getString("DESCRICAO"));
							textField_prioridade.setText(objRes.getString("PRIORIDADE"));
							textField_status.setText(objRes.getString("STATUS"));
							}
					} catch (Exception e2 ) {
						System.out.println("Deu tudo errado mano, olha só => " + e2);
					}
					 
				} else {
					System.out.println("Erro ao conectar ao banco! "  + Dados.objBD.mensagem());
				}
				
				
				
				//String sqlInsert = "INSERT INTO PESSOAS(EMAIL, NOME, NASCIMENTO, SENHA) VALUES ('aluno@gmail.com', 'Lisa Sobraia', '19970301', '144')";
				//teste.Inserir(sqlInsert);

				//String sqlAtualiza = "update PESSOAS set EMAIL='alunos2@gmail.com', NOME = 'Lisa Sobrano' where SENHA = '144'";
				//teste.Atualizar(sqlAtualiza);
				
				//String sqlExcluir = "DELETE FROM PESSOAS WHERE EMAIL = 'alunos2@gmail.com'";
				//teste.Atualizar(sqlExcluir);
				
				
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		Box verticalBox = Box.createVerticalBox();
		panel.add(verticalBox);
		
		Box horizontalBox = Box.createHorizontalBox();
		verticalBox.add(horizontalBox);
		
		Box verticalBox_1 = Box.createVerticalBox();
		horizontalBox.add(verticalBox_1);
		
		JLabel lblNewLabel_1 = new JLabel("Titulo");
		verticalBox_1.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		
		JPanel panel_1_1_1_1_1_1_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1_1_1_1_1_1_1.setMinimumSize(new Dimension(10, 50));
		verticalBox_1.add(panel_1_1_1_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Descricao");
		verticalBox_1.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		
		JPanel panel_1_1_1_1_1_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1_1_1_1_1_1.setMinimumSize(new Dimension(10, 50));
		verticalBox_1.add(panel_1_1_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Status");
		verticalBox_1.add(lblNewLabel_1_1_1_1);
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		
		JPanel panel_1_1_1_1_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1_1_1_1_1.setMinimumSize(new Dimension(10, 50));
		verticalBox_1.add(panel_1_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Prioridade    ");
		verticalBox_1.add(lblNewLabel_1_1_1);
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		
		Box verticalBox_2 = Box.createVerticalBox();
		horizontalBox.add(verticalBox_2);
		
		textField_titulo = new JTextField();
		verticalBox_2.add(textField_titulo);
		textField_titulo.setColumns(10);
		
		JPanel panel_1_1_1_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1_1_1_1.setMinimumSize(new Dimension(10, 50));
		verticalBox_2.add(panel_1_1_1_1_1_1_1_1);
		
		textField_descricao = new JTextField();
		verticalBox_2.add(textField_descricao);
		textField_descricao.setColumns(10);
		
		JPanel panel_1_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1_1.setMinimumSize(new Dimension(10, 50));
		verticalBox_2.add(panel_1_1_1_1_1_1);
		
		textField_status = new JTextField();
		verticalBox_2.add(textField_status);
		textField_status.setColumns(10);
		
		JPanel panel_1_1_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1_1_1.setMinimumSize(new Dimension(10, 50));
		verticalBox_2.add(panel_1_1_1_1_1_1_1);
		
		textField_prioridade = new JTextField();
		verticalBox_2.add(textField_prioridade);
		textField_prioridade.setColumns(10);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setMinimumSize(new Dimension(10, 200));
		verticalBox.add(panel_1_1_1_1);
		
		JPanel panel_2 = new JPanel();
		verticalBox.add(panel_2);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(255, 51, 51));
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(102, 153, 51));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String sqlInsert = "UPDATE TAREFAS SET "
								+ "TITULO = '" + textField_titulo.getText().toString() + "', "
								+ "DESCRICAO = '" +  textField_descricao.getText().toString() + "', "
								+ "PRIORIDADE = " +  textField_prioridade.getText().toString() + ", "
								+ "STATUS = '" +  textField_status.getText().toString() + "' "
							+ " WHERE id = 1";
				
				System.out.println(sqlInsert);
						
				Dados.Inserir(sqlInsert);

			}
		});
		panel_2.add(btnNewButton);
	}

}
