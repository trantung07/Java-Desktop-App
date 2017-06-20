package com.qlbh.view;
import java.awt.*;
import javax.swing.*;
import com.qlbh.bean.Users;
import java.awt.event.ActionListener;


public class LoginView extends JPanel {
	private static final long serialVersionUID = 1L;

	private JTextField txtUsername;
	private JTextField txtPassword;
	private JTextField txtCode;
	private JButton btnLogin;
	private JButton btnRegister;


	public LoginView() {
		super();
		initLoginView();
	}
	
	private void initLoginView() {
		this.setBackground(new Color(0, 162, 232));
		this.setLayout(new GridBagLayout());
		
		JLabel lblUsername = new JLabel("Tài khoản");
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setForeground(new Color(255, 255, 255));
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		txtUsername = new JTextField();
		txtUsername.setColumns(20);
		txtUsername.setText("admin");	
		
		JLabel lblPass = new JLabel("Mật khẩu");
		lblPass.setForeground(new Color(255, 255, 255));
		lblPass.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(5, 127, 419, 29);
		txtPassword.setColumns(20);
		txtPassword.setText("admin");
		
		JLabel lblCode = new JLabel("Mã xác nhận");
		lblCode.setForeground(new Color(255, 255, 255));
		lblCode.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		txtCode = new JTextField();
		txtCode.setBounds(5, 190, 135, 29);
		txtCode.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.PLAIN, 5));
		label.setIcon(new ImageIcon(""));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Nhớ tài khoản");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxNewCheckBox.setForeground(new Color(255, 255, 255));
		chckbxNewCheckBox.setBackground(new Color(0, 162, 232));
		
		btnLogin = new JButton("Đăng nhập");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLogin.setBackground(new Color(34, 139, 34));
		
		btnRegister = new JButton("Đăng ký");
		btnRegister.setBackground(new Color(34, 139, 34));
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRegister.setForeground(new Color(0, 0, 0));
				
		GridBagConstraints gbc_lblUsername = new GridBagConstraints();
		gbc_lblUsername.anchor = GridBagConstraints.WEST;
		gbc_lblUsername.insets = new Insets(0, 0, 10, 5);
		gbc_lblUsername.gridx = 0;
		gbc_lblUsername.gridy = 0;
				
		GridBagConstraints gbc_txtUsername = new GridBagConstraints();
		gbc_txtUsername.anchor = GridBagConstraints.WEST;
		gbc_txtUsername.insets = new Insets(0, 0, 10, 5);
		gbc_txtUsername.gridx = 0;
		gbc_txtUsername.gridy = 1;
		gbc_txtUsername.gridwidth = 2;
		
		GridBagConstraints gbc_lblPass = new GridBagConstraints();
		gbc_lblPass.anchor = GridBagConstraints.WEST;
		gbc_lblPass.insets = new Insets(0, 0, 10, 5);
		gbc_lblPass.gridx = 0;
		gbc_lblPass.gridy = 2;
				
		GridBagConstraints gbc_txtPassword = new GridBagConstraints();
		gbc_txtPassword.anchor = GridBagConstraints.WEST;
		gbc_txtPassword.insets = new Insets(0, 0, 10, 5);
		gbc_txtPassword.gridx = 0;
		gbc_txtPassword.gridy = 3;
		gbc_txtPassword.gridwidth = 2;
				
		GridBagConstraints gbc_lblCode = new GridBagConstraints();
		gbc_lblCode.anchor = GridBagConstraints.WEST;
		gbc_lblCode.insets = new Insets(0, 0, 10, 5);
		gbc_lblCode.gridx = 0;
		gbc_lblCode.gridy = 4;
				
		GridBagConstraints gbc_txtCode = new GridBagConstraints();
		gbc_txtCode.anchor = GridBagConstraints.WEST;
		gbc_txtCode.insets = new Insets(0, 0, 10, 5);
		gbc_txtCode.gridx = 0;
		gbc_txtCode.gridy = 5;
				
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 10, 0);
		gbc_label.gridx = 1;
		gbc_label.gridy = 5;
				
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 10, 5);
		gbc_chckbxNewCheckBox.gridx = 0;
		gbc_chckbxNewCheckBox.gridy = 6;
				
		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.insets = new Insets(0, 0, 0, 5);
		gbc_btnLogin.gridx = 0;
		gbc_btnLogin.gridy = 8;
				
		GridBagConstraints gbc_btnRegister = new GridBagConstraints();
		gbc_btnRegister.gridx = 1;
		gbc_btnRegister.gridy = 8;
		
		this.add(lblUsername, gbc_lblUsername);
		this.add(txtUsername, gbc_txtUsername);
		this.add(lblPass, gbc_lblPass);
		this.add(txtPassword, gbc_txtPassword);
		this.add(lblCode, gbc_lblCode);
		this.add(txtCode, gbc_txtCode);
		this.add(label, gbc_label);
		this.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
		this.add(btnLogin, gbc_btnLogin);
		this.add(btnRegister, gbc_btnRegister);
	}
	public Users getInfoUsers(){
		Users item=new Users();
		
		item.setUserName(txtUsername.getText());
		item.setPassWord(txtPassword.getText());
		return item;
	}
	public void doLogin(ActionListener action) {
		this.btnLogin.addActionListener(action);
	}
	public void doRegister(ActionListener action) {
		this.btnRegister.addActionListener(action);
	}

}
