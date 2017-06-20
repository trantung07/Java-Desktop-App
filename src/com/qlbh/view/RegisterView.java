package com.qlbh.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;


import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.qlbh.bean.Users;

import javax.swing.JButton;

public class RegisterView extends JPanel{
	private static final long serialVersionUID = 1L;
	private JButton btnSubmit =null;
	private JTextField txtFullName;
	private JTextField txtPhone;
	private JTextField txtUserName;
	private JTextField txtPassWord;
	private JTextField txtRePass;
	
	/**
	 * This is the default constructor
	 */
	public RegisterView() {
		super();
		initialize();
	}
	private void initialize() {
		
		this.setLayout(new GridBagLayout());
		
	
		JLabel lblFullName = new JLabel("Họ tên:");
		GridBagConstraints gbc_lblFullName = new GridBagConstraints();
		gbc_lblFullName.anchor = GridBagConstraints.WEST;
		gbc_lblFullName.insets = new Insets(0, 0, 10, 5);
		gbc_lblFullName.gridx = 2;
		gbc_lblFullName.gridy = 0;
		
		
		txtFullName = new JTextField();
		txtFullName.setColumns(22);
		GridBagConstraints gbc_txtfullname = new GridBagConstraints();
		gbc_txtfullname.anchor = GridBagConstraints.WEST;
		gbc_txtfullname.gridwidth = 2;
		gbc_txtfullname.insets = new Insets(0, 0, 5, 5);
		gbc_txtfullname.gridx = 2;
		gbc_txtfullname.gridy = 1;
		
		
		
		JLabel lblPhone = new JLabel("SĐT:");
		GridBagConstraints gbc_lblPhone = new GridBagConstraints();
		gbc_lblPhone.anchor = GridBagConstraints.WEST;
		gbc_lblPhone.insets = new Insets(0, 0, 10, 5);
		gbc_lblPhone.gridx = 2;
		gbc_lblPhone.gridy = 2;
		
		
		txtPhone = new JTextField();
		GridBagConstraints gbc_txtphone = new GridBagConstraints();
		gbc_txtphone.anchor = GridBagConstraints.WEST;
		gbc_txtphone.gridwidth = 2;
		gbc_txtphone.insets = new Insets(0, 0, 5, 5);
		gbc_txtphone.gridx = 2;
		gbc_txtphone.gridy = 3;
		txtPhone.setColumns(22);
		
		JLabel lblUserName = new JLabel("Tài khoản:");
		GridBagConstraints gbc_lblUserName = new GridBagConstraints();
		gbc_lblUserName.anchor = GridBagConstraints.WEST;
		gbc_lblUserName.insets = new Insets(0, 0, 10, 5);
		gbc_lblUserName.gridx = 2;
		gbc_lblUserName.gridy = 4;
		
		
		txtUserName = new JTextField();
		GridBagConstraints gbc_txtusername = new GridBagConstraints();
		gbc_txtusername.anchor = GridBagConstraints.WEST;
		gbc_txtusername.gridwidth = 2;
		gbc_txtusername.insets = new Insets(0, 0, 5, 5);
		gbc_txtusername.gridx = 2;
		gbc_txtusername.gridy = 5;
		txtUserName.setColumns(22);
		
		
		JLabel lblPassword = new JLabel("Mật khẩu:");
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.anchor = GridBagConstraints.WEST;
		gbc_lblPassword.insets = new Insets(0, 0, 10, 5);
		gbc_lblPassword.gridx = 2;
		gbc_lblPassword.gridy = 6;
		
		txtPassWord = new JPasswordField();
		GridBagConstraints gbc_txtPass = new GridBagConstraints();
		gbc_txtPass.insets = new Insets(0, 0, 5, 5);
		gbc_txtPass.gridx = 2;
		gbc_txtPass.gridy = 7;
		txtPassWord.setColumns(10);
		
		JLabel lblRePass = new JLabel("Nhập lại Mật khẩu:");
		GridBagConstraints gbc_lblRePass = new GridBagConstraints();
		gbc_lblRePass.anchor = GridBagConstraints.WEST;
		gbc_lblRePass.insets = new Insets(0, 0, 10, 5);
		gbc_lblRePass.gridx = 3;
		gbc_lblRePass.gridy = 6;
		
		
		txtRePass = new JPasswordField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.WEST;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 7;
		txtRePass.setColumns(11);
		
		btnSubmit = new JButton("Xác nhận");
		GridBagConstraints gbc_btnSubmit = new GridBagConstraints();
		gbc_btnSubmit.anchor = GridBagConstraints.WEST;
		gbc_btnSubmit.insets = new Insets(0, 0, 10, 5);
		gbc_btnSubmit.gridx = 2;
		gbc_btnSubmit.gridy = 9;
		
		
		
		add(lblFullName, gbc_lblFullName);
		add(txtFullName, gbc_txtfullname);
		add(lblPhone, gbc_lblPhone);
		add(txtPhone, gbc_txtphone);
		add(lblUserName, gbc_lblUserName);
		add(txtUserName, gbc_txtusername);
		add(lblPassword, gbc_lblPassword);
		add(txtPassWord, gbc_txtPass);
		add(lblRePass, gbc_lblRePass);
		add(txtRePass, gbc_textField);
		add(btnSubmit, gbc_btnSubmit);
	}
	public Users getUserInfo(){
		Users item=new Users();
		
		item.setUserName(txtUserName.getText());
		item.setPassWord(txtPassWord.getText());
		item.setFullName(txtFullName.getText());
		item.setPhone(txtPhone.getText());
		item.setRePass(txtRePass.getText());
		return item;
	}
	// Register event for button register
	public void doRegister(ActionListener action) {
		this.btnSubmit.addActionListener(action);
	} 
}
