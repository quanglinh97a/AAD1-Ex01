package com.quanglinhit.view;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import com.quanglinhit.entity.FCLass;

public class JavaSwing extends JFrame {
	JTextField txtId, txtName, txtGender, txtBirthday, txtEmail, txtPhone, txtRollNumber, txtClassName;
	JButton btnSend, btnReset;
	ButtonGroup genderGroup;
	JRadioButton radMale, radFeMale;
	JComboBox cboTeacher, cboClass;
	public JavaSwing(){
		addControls();
		addEvents();
	}
	public void addControls() {
		JFrame frame=new JFrame("Form");
		frame.setSize(800, 600);
		frame.setLayout(null);
		
		JPanel pnLogin=new JPanel();
//		pnLogin.setBorder(BorderFactory.createBevelBorder(1));
		Border border=BorderFactory.createLineBorder(Color.cyan, 1);
		TitledBorder titleBorder=BorderFactory.createTitledBorder("Form Thông Tin Học Viên");
		pnLogin.setBorder(titleBorder);
		pnLogin.setBounds(50, 50, 680, 460);
		pnLogin.setLayout(null);
		frame.add(pnLogin);
		
		JLabel lblId=new JLabel("ID: ");
		lblId.setBounds(100, 50, 100, 30);
		pnLogin.add(lblId);
		
		txtId=new JTextField();
		txtId.setBounds(200, 50, 400, 30);
		pnLogin.add(txtId);
		
		JLabel lblName=new JLabel("Name: ");
		lblName.setBounds(100, 90, 100, 30);
		pnLogin.add(lblName);
		
		txtName=new JTextField();
		txtName.setBounds(200, 90, 400, 30);
		pnLogin.add(txtName);
		
		JLabel lblGender=new JLabel("Gender: ");
		lblGender.setBounds(100, 130, 100, 30);
		pnLogin.add(lblGender);
		
		radMale=new JRadioButton("Male ");
		radMale.setBounds(200, 130, 100, 30);
		pnLogin.add(radMale);
		
		radFeMale=new JRadioButton("FeMale ");
		radFeMale.setBounds(300, 130, 100, 30);
		pnLogin.add(radFeMale);
		genderGroup=new ButtonGroup();
		genderGroup.add(radMale);
		genderGroup.add(radFeMale);
		
		JLabel lblEmail=new JLabel("Email: ");
		lblEmail.setBounds(100, 170, 100, 30);
		pnLogin.add(lblEmail);
		
		txtEmail=new JTextField();
		txtEmail.setBounds(200, 170, 400, 30);
		pnLogin.add(txtEmail);
		
		JLabel lblPhone=new JLabel("Phone: ");
		lblPhone.setBounds(100, 210, 100, 30);
		pnLogin.add(lblPhone);
		
		txtPhone=new JTextField();
		txtPhone.setBounds(200, 210, 400, 30);
		pnLogin.add(txtPhone);
		
		JLabel lblBirthday=new JLabel("Birthday: ");
		lblBirthday.setBounds(100, 250, 100, 30);
		pnLogin.add(lblBirthday);
		
		txtBirthday=new JTextField();
		txtBirthday.setBounds(200, 250, 400, 30);
		pnLogin.add(txtBirthday);
		
		JLabel lblRollNumber=new JLabel("Roll number: ");
		lblRollNumber.setBounds(100, 290, 100, 30);
		pnLogin.add(lblRollNumber);
		
		txtRollNumber=new JTextField();
		txtRollNumber.setBounds(200, 290, 400, 30);
		pnLogin.add(txtRollNumber);
		
		JLabel lblNameClass=new JLabel("Class name: ");
		lblNameClass.setBounds(100, 330, 100, 30);
		pnLogin.add(lblNameClass);
		
//		FCLass []cl1=new FCLass(101, "C1603G");
//		FCLass cl2=new FCLass(102, "C1605L");
//		FCLass cl3=new FCLass(103, "C1608I");
//		FCLass cl4=new FCLass(104, "C1702G");
//		FCLass cl5=new FCLass(105, "C1703L");
//		FCLass cl6=new FCLass(106, "T1707A");
//		ArrayList<FCLass> fc=new ArrayList<>();
//		fc.add(cl1);
//		fc.add(cl2);
//		fc.add(cl3);
//		fc.add(cl4);
//		fc.add(cl5);
//		fc.add(cl6);
		
		String []arrClass={"C1603G","C1605L","C1608I","C1702G","C1703L","T1707A"};
		cboClass=new JComboBox(arrClass);
		cboClass.setBounds(200, 330, 400, 30);
		pnLogin.add(cboClass);
		
		JLabel lblTeacher=new JLabel("Teacher: ");
		lblTeacher.setBounds(100, 370, 100, 30);
		pnLogin.add(lblTeacher);
		
		String []arrTeacher={"GV. Thành Đạt","GV. Xuân Hùng","GV. Kim Thi","GV. Nguyễn Tuân"};
		cboTeacher=new JComboBox(arrTeacher);
		cboTeacher.setBounds(200, 370, 400, 30);
		pnLogin.add(cboTeacher);
		
		
		btnReset=new JButton("Reset");
		btnReset.setBounds(340, 410, 100, 30);
		pnLogin.add(btnReset);
		
		btnSend=new JButton("Send");
		btnSend.setBounds(450, 410, 100, 30);
		pnLogin.add(btnSend);
		
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void addEvents() {
		btnSend.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getInformation();
			}
		});
	}
	protected void getInformation() {
		String msg=txtId.getText()+"\n";
		msg+=txtName.getText()+"\n";
		
		String gender="";
		if (radMale.isSelected()) {
			gender=radMale.getText();
		} else {
			gender=radFeMale.getText();
			
		}
		msg+=gender;
		JOptionPane.showMessageDialog(null, msg);
	}

}
