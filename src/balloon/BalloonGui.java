package balloon;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class BalloonGui extends JFrame {

	private JPanel contentPane;
	private JLabel lblResult;
	private BalloonPanel balloonPanel;
	private Random rand = new Random();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BalloonGui frame = new BalloonGui();
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
	public BalloonGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton btnCompare = buttonFactory();
		panel.add(btnCompare);
		
		lblResult = labelFactory();
		panel.add(lblResult);
		
		balloonPanel = balloonPanelFactory();
		contentPane.add(balloonPanel, BorderLayout.CENTER);
	}

	private BalloonPanel balloonPanelFactory() {
		BalloonPanel balloonPanel = new BalloonPanel();
		return balloonPanel;
	}

	private JLabel labelFactory() {
		JLabel lblResul = new JLabel("Result");
		return lblResul;
	}
	
	private Balloon generateBallon() {
		BalloonType[] types = BalloonType.values();
		BalloonType type = types[rand.nextInt(types.length)];
		
		BalloonSize[] sizes = BalloonSize.values();
		BalloonSize size = sizes[rand.nextInt(sizes.length)];
		
		return new Balloon(type, size);
		
	}

	private JButton buttonFactory() {
		JButton btnCompare = new JButton("Compare");
		btnCompare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				balloonPanel.setLeftBalloon(generateBallon());
				balloonPanel.setRightBalloon(generateBallon());
				
				Balloon balloon1 = balloonPanel.getLeftBalloon();
				Balloon balloon2 = balloonPanel.getRightBalloon();
				
				if(balloon1.equals(balloon2)) {
					lblResult.setText("EQUALS");
				} else {
					lblResult.setText("Not equal");
				}
				
				
					
			}
		});
		return btnCompare;
	}

}
