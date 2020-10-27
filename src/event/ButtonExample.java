package event;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ButtonExample extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonExample frame = new ButtonExample();
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
	public ButtonExample() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		//contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton toggleButton = new JButton("Toggle");
		
		toggleButton.setOpaque(true);
		toggleButton.setBorderPainted(false);
		toggleButton.setBackground(Color.CYAN);
		
		toggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(e);
				if(Color.BLUE.equals(toggleButton.getBackground())) {
					toggleButton.setBackground(Color.RED);
				} else {
						
					toggleButton.setBackground(Color.BLUE);
				}
			}
		});
		
		toggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(e);
				toggleButton.setText("thank you");
			}
		});
		
		
		
		contentPane.add(toggleButton, BorderLayout.CENTER);
		
		
		
		
	}

}
