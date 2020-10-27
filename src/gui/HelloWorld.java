package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.JEditorPane;
import javax.swing.JMenuBar;
import javax.swing.JProgressBar;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.BoxLayout;

public class HelloWorld extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloWorld frame = new HelloWorld();
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
	public HelloWorld() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 200, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(3, 3));
		setContentPane(contentPane);
		//contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JTree tree = new JTree();
		contentPane.add(tree);
		
		JEditorPane editorPane = new JEditorPane();
		contentPane.add(editorPane);
		
		JProgressBar progressBar = new JProgressBar();
		contentPane.add(progressBar);
		
		JLabel howdy = makeHowdyLabel();
		contentPane.add(howdy);
	}

	private JLabel makeHowdyLabel() {
		JLabel howdy = new JLabel("ho there");
		howdy.setFont(new Font("Marker Felt", Font.BOLD, 26));
		howdy.setOpaque(true);
		howdy.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		howdy.setToolTipText("say hello");
		howdy.setBackground(Color.BLUE);
		howdy.setVerticalAlignment(SwingConstants.TOP);
		howdy.setForeground(Color.CYAN);
		return howdy;
	}
	
	

}
