import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;

public class Main extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField op1Tf;
	private JTextField op2Tf;
	private JTextField resultTf;
	private JLabel opLabel;
	private JButton plusbtn,minusbtn,dividebtn,multiplybtn,calculatebtn;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 758, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		op1Tf = new JTextField();
		op1Tf.setBounds(40, 91, 139, 62);
		contentPane.add(op1Tf);
		op1Tf.setColumns(10);
		
		op2Tf = new JTextField();
		op2Tf.setColumns(10);
		op2Tf.setBounds(263, 91, 155, 62);
		contentPane.add(op2Tf);
		
		resultTf = new JTextField();
		resultTf.setColumns(10);
		resultTf.setBounds(539, 91, 155, 62);
		contentPane.add(resultTf);
		
		opLabel = new JLabel("");
		opLabel.setHorizontalAlignment(SwingConstants.CENTER);
		opLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		opLabel.setBounds(189, 100, 68, 36);
		contentPane.add(opLabel);
		
		JLabel equal = new JLabel("=");
		equal.setHorizontalAlignment(SwingConstants.CENTER);
		equal.setFont(new Font("Tahoma", Font.PLAIN, 30));
		equal.setBounds(441, 100, 68, 36);
		contentPane.add(equal);
		
		plusbtn = new JButton("+");
		plusbtn.setFont(new Font("Tahoma", Font.PLAIN, 19));
		plusbtn.setBounds(40, 196, 56, 47);
		contentPane.add(plusbtn);
		plusbtn.addActionListener(this);
		
		minusbtn = new JButton("-");
		minusbtn.setFont(new Font("Tahoma", Font.PLAIN, 19));
		minusbtn.setBounds(123, 196, 56, 47);
		contentPane.add(minusbtn);
		minusbtn.addActionListener(this);
		
		multiplybtn = new JButton("*");
		multiplybtn.setFont(new Font("Tahoma", Font.PLAIN, 19));
		multiplybtn.setBounds(40, 262, 56, 47);
		contentPane.add(multiplybtn);
		multiplybtn.addActionListener(this);
		
		dividebtn = new JButton("/");
		dividebtn.setFont(new Font("Tahoma", Font.PLAIN, 19));
		dividebtn.setBounds(123, 262, 56, 47);
		contentPane.add(dividebtn);
		dividebtn.addActionListener(this);
		
		calculatebtn = new JButton("Calculate");
		calculatebtn.setFont(new Font("Tahoma", Font.PLAIN, 19));
		calculatebtn.setBounds(263, 235, 139, 47);
		contentPane.add(calculatebtn);
		calculatebtn.addActionListener(this);
		
		JLabel lblNewLabel = new JLabel("My Calculator");
		lblNewLabel.setForeground(new Color(128, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(279, 10, 139, 30);
		contentPane.add(lblNewLabel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == plusbtn) {
			opLabel.setText("+");
		} else if(e.getSource() == minusbtn) {
			opLabel.setText("-");
		} else if(e.getSource() == dividebtn) {
			opLabel.setText("/");
		} else if(e.getSource() == multiplybtn) {
			opLabel.setText("*");
		} else {
			System.out.println("Calculate");
		}
		
	}
}
