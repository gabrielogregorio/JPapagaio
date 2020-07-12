import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JDesktopPane;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class testeScrool extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testeScrool frame = new testeScrool();
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
	public testeScrool() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		  JFrame frame = new JFrame();
		  
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		
		Box verticalBox = Box.createVerticalBox();
		panel.add(verticalBox);
		
		JPanel panel_1_1 = new JPanel();
		verticalBox.add(panel_1_1);
		
		Box horizontalConteudo_1_1_1_1_1 = Box.createHorizontalBox();
		horizontalConteudo_1_1_1_1_1.setBackground(Color.WHITE);
		panel_1_1.add(horizontalConteudo_1_1_1_1_1);
		
		JPanel panel_post1_1_1_1_1_1_1 = new JPanel();
		panel_post1_1_1_1_1_1_1.setBackground(Color.WHITE);
		horizontalConteudo_1_1_1_1_1.add(panel_post1_1_1_1_1_1_1);
		
		JLabel lblTitulo_1_1_1_1_1_1 = new JLabel("TITULO");
		panel_post1_1_1_1_1_1_1.add(lblTitulo_1_1_1_1_1_1);
		
		JButton btnSob_1_1_1_1_1_1 = new JButton("+");
		btnSob_1_1_1_1_1_1.setName("ID");
		btnSob_1_1_1_1_1_1.setForeground(Color.WHITE);
		btnSob_1_1_1_1_1_1.setBackground(new Color(255, 69, 0));
		panel_post1_1_1_1_1_1_1.add(btnSob_1_1_1_1_1_1);
		
		JButton btnSub_1_1_1_1_1_1 = new JButton("-");
		btnSub_1_1_1_1_1_1.setName("ID");
		btnSub_1_1_1_1_1_1.setForeground(Color.WHITE);
		btnSub_1_1_1_1_1_1.setBackground(new Color(100, 149, 237));
		panel_post1_1_1_1_1_1_1.add(btnSub_1_1_1_1_1_1);
		
		JButton btnX_1_1_1_1_1_1 = new JButton("X");
		btnX_1_1_1_1_1_1.setName("ID");
		btnX_1_1_1_1_1_1.setForeground(Color.WHITE);
		btnX_1_1_1_1_1_1.setBackground(Color.RED);
		panel_post1_1_1_1_1_1_1.add(btnX_1_1_1_1_1_1);
		
		JButton btnOk_1_1_1_1_1_1 = new JButton("OK");
		btnOk_1_1_1_1_1_1.setName("ID");
		btnOk_1_1_1_1_1_1.setForeground(Color.WHITE);
		btnOk_1_1_1_1_1_1.setBackground(new Color(0, 128, 0));
		panel_post1_1_1_1_1_1_1.add(btnOk_1_1_1_1_1_1);
		
	       JScrollPane scrollPane2 = new JScrollPane(panel);
		scrollPane2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		  contentPane.setPreferredSize(new Dimension(500, 400));
		  contentPane.add(scrollPane2);
		  frame.setContentPane(contentPane);
		  frame.pack();
		  frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		  frame.setVisible(true);
	}

}
