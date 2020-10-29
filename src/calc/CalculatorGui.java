package calc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import java.awt.GridLayout;
import java.util.Arrays;
import java.util.List;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorGui extends JFrame {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = -2197392123713898912L;
	private JPanel contentPane;
	private Calculator calculator = new Calculator();
	private JLabel lblOutput;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGui frame = new CalculatorGui();
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
	public CalculatorGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lblOutput = new JLabel("Output");
		lblOutput.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblOutput, BorderLayout.NORTH);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.compute();
				lblOutput.setText(calculator.displayString());
				//System.out.println(calculator);
			}
		});
		contentPane.add(btnEqual, BorderLayout.SOUTH);
		
		JPanel panelButton = new JPanel();
		contentPane.add(panelButton, BorderLayout.CENTER);
		panelButton.setLayout(new GridLayout(4, 4, 0, 0));
		
		JButton btnNewButton = new JButton("C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calculator = new Calculator();
				
				lblOutput.setText(" ");
			}
		});
		contentPane.add(btnNewButton, BorderLayout.WEST);
		
		JButton btnPi = new JButton("Pi");
		btnPi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.digit(Double.toString(Math.PI));
				lblOutput.setText(calculator.displayString());
			}
		});
		
		contentPane.add(btnPi, BorderLayout.EAST);
		
		for(String digit : Arrays.asList("0","1","2","3","4","5","6","7","8" ,"9","0",".")) {
			JButton button = digitButtonFactory(digit);
			panelButton.add(button);
		}
		
		for(String op : Arrays.asList("+", "-", "*", "/")) {
			JButton btn = operationButtonFactory(op);
			panelButton.add(btn);
			
		}

	}

	private JButton digitButtonFactory(String digit) {
		JButton btn = new JButton(digit);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.digit(digit);
				lblOutput.setText(calculator.displayString());
				//System.out.println(calculator);
			}
		});
		return btn;
	}

	private JButton operationButtonFactory(String op) {
		JButton btn = new JButton(op);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.operation(op);
				lblOutput.setText(calculator.displayString());
				//System.out.println(calculator);
			}
		});
		return btn;
	}

}
