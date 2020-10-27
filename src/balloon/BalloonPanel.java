package balloon;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.EmptyBorder;

public class BalloonPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5089626702684136878L;
	
	Balloon leftBalloon = new Balloon(BalloonType.AIR, BalloonSize.M);
	Balloon rightBalloon = new Balloon(BalloonType.AIR, BalloonSize.XL);

	private JLabel lblBalloon1;

	private JLabel lblBalloon2;

	private JLabel leftBalloonType;

	private JLabel rightBalloonType;

	
	

	/**
	 * @return the leftBalloon
	 */
	public Balloon getLeftBalloon() {
		return leftBalloon;
	}

	/**
	 * @param leftBalloon the leftBalloon to set
	 */
	public void setLeftBalloon(Balloon leftBalloon) {
		this.leftBalloon = leftBalloon;
		lblBalloon1.setIcon(getIcon(this.leftBalloon));
		leftBalloonType.setText(this.leftBalloon.getType().name());
	}

	/**
	 * @param rightBalloon the rightBalloon to set
	 */
	public void setRightBalloon(Balloon rightBalloon) {
		lblBalloon2.setIcon(getIcon(this.rightBalloon));
		this.rightBalloon = rightBalloon;
		rightBalloonType.setText(this.rightBalloon.getType().name());
	}

	/**
	 * @return the rightBalloon
	 */
	public Balloon getRightBalloon() {
		return rightBalloon;
	}

	/**
	 * Create the panel.
	 */
	public BalloonPanel() {
		setBorder(new EmptyBorder(10, 10, 10, 10));
		setLayout(new GridLayout(0, 2, 10, 0));
		
		JPanel leftPanel = new JPanel();
		add(leftPanel);
		
			lblBalloon1 = lblFactory1();
			leftPanel.add(lblBalloon1);
			{
				leftBalloonType = new JLabel("New label");
				leftPanel.add(leftBalloonType);
			}
		
		
		JPanel rightPanel = new JPanel();
		add(rightPanel);
		
			lblBalloon2 = lblfactory2();
			rightPanel.add(lblBalloon2);
			{
				rightBalloonType = new JLabel("New label");
				rightPanel.add(rightBalloonType);
			}
		

	}

	private JLabel lblfactory2() {
		JLabel lblBalloon2 = new JLabel("");
		lblBalloon2.setIcon(new ImageIcon(BalloonPanel.class.getResource("/balloon/images/balloon60.jpg")));
		lblBalloon2.setOpaque(true);
		lblBalloon2.setHorizontalAlignment(SwingConstants.CENTER);
		lblBalloon2.setBackground(Color.WHITE);
		return lblBalloon2;
	}

	private JLabel lblFactory1() {
		JLabel lblBalloon1 = new JLabel("");
		lblBalloon1.setIcon(new ImageIcon(BalloonPanel.class.getResource("/balloon/images/balloon40.jpg")));
		lblBalloon1.setOpaque(true);
		lblBalloon1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBalloon1.setBackground(Color.WHITE);
		return lblBalloon1;
	}
	
	private ImageIcon getIcon(Balloon b) {
		String path = "";
		switch (b.getSize()) {
		case XS:
			path =  "/balloon/images/balloon20.jpg";
			break;
		case S:
			path =  "/balloon/images/balloon40.jpg";
			break;
		case M:
			path =  "/balloon/images/balloon60.jpg";
			break;
		case L:
			path =  "/balloon/images/balloon80.jpg";
			break;
		case XL:
			path =  "/balloon/images/balloon100.jpg";
			break;
		default:
			path = "";
			break;
		}
		
		return new ImageIcon(BalloonPanel.class.getResource(path));
	}

	

}
