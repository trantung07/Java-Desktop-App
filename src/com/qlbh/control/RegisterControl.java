package com.qlbh.control;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.qlbh.bean.Users;
import com.qlbh.dao.RegisterDao;
import com.qlbh.view.RegisterView;

public class RegisterControl extends JFrame{
	private static final long serialVersionUID = 1L;

	private RegisterView registerView = null;
	
	public RegisterControl() {
		super("Form Register");
		registerView = new RegisterView();
		initFrame();
		initAction();
	}
	public void huyFrameDangNhap() {
//		this.dispose();
	}
	
	private void initFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(450, 350);
		if (registerView == null) {
			registerView = new RegisterView();
		}
		this.setContentPane(registerView);
		// set JFrame ra giua man hinh
		int frameX = (Toolkit.getDefaultToolkit().getScreenSize().width - this
				.getWidth()) / 2;
		int frameY = (Toolkit.getDefaultToolkit().getScreenSize().height - this
				.getHeight()) / 2;
		this.setLocation(frameX, frameY);
		this.setVisible(true);
	}

	private void initAction() {
		doRegister();
	}

	private void doRegister() {
		// TODO Auto-generated method stub
		registerView.doRegister(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				Users user =  registerView.getUserInfo();
				RegisterDao registerDao = new RegisterDao();
				try {
					if(user.getRePass().equals(user.getPassWord())){
						if(registerDao.insertNewUserInfo(user)){
								JOptionPane.showMessageDialog(registerView,
									"Chúc mừng bạn đã đăng ký thành công");
									new LoginControl();
						}
					} else {
						JOptionPane.showMessageDialog(registerView,
								"Hãy nhập lại đúng Password");							
					}
				} catch (HeadlessException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});
	}

}
