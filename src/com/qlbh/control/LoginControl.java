package com.qlbh.control;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import com.qlbh.view.LoginView;
import com.qlbh.bean.Users;
import com.qlbh.dao.LoginDao;

public class LoginControl extends JFrame{
	private static final long serialVersionUID = 1L;
	private LoginView loginView = null;
	public LoginControl() {
		super("Form Login");
		loginView = new LoginView();
		initFrame();
		initAction();
	}
	
	private void initFrame() {
		// This method for initializing Frame and set size to the Frame 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 451, 334);
		
		if (loginView == null) {
			loginView = new LoginView();
		}
		this.setContentPane(loginView);
		
		// set JFrame ra giua man hinh
		int frameX = (Toolkit.getDefaultToolkit().getScreenSize().width - this
				.getWidth()) / 2;
		int frameY = (Toolkit.getDefaultToolkit().getScreenSize().height - this
				.getHeight()) / 2;
		this.setLocation(frameX, frameY);
		this.setVisible(true);
	}

	private void initAction() {
		doLogin();
		doRegister();
		
	}

	private void doRegister() {
		loginView.doRegister(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				new RegisterControl();
			}
		});
	}
	private void doLogin() {
		loginView.doLogin(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				Users user =  loginView.getInfoUsers();
				LoginDao loginDao = new LoginDao();
				try {
					if(loginDao.getUserbyUsernamePassword(user.getUserName(),user.getPassWord())){
							JOptionPane.showMessageDialog(loginView,
									"Chúc mừng bạn đã đăng nhập thành công");
							new CreationTemplateDataControl();
							
						}else {
							JOptionPane.showMessageDialog(loginView,"Sai Username hoặc Password!");
						}
				} catch (HeadlessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new LoginControl();
	}
}
