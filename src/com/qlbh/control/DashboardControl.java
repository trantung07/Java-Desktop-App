package com.qlbh.control;


import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import com.qlbh.view.DashboardView;
import com.qlbh.view.MenuView;


public class DashboardControl extends JFrame{
	private static final long serialVersionUID = 1L;
	private DashboardView dashboardView = null;
	private MenuView menuView ;
	public DashboardControl(){
		super();
		dashboardView = new DashboardView();
		menuView = new MenuView();
		initFrame();
		initAction();
	}
	
	private void initFrame() {
		// This method for initializing Frame and set size to the Frame 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setJMenuBar(menuView.initMenuBar());
		this.setContentPane(dashboardView);
		
		this.setSize(650, 350);
		if (dashboardView == null) {
			dashboardView = new DashboardView();
		}

		// set JFrame ra giua man hinh
		int frameX = (Toolkit.getDefaultToolkit().getScreenSize().width - this
				.getWidth()) / 2;
		int frameY = (Toolkit.getDefaultToolkit().getScreenSize().height - this
				.getHeight()) / 2;
		this.setLocation(frameX, frameY);
		this.setVisible(true);
	}
	private void initAction() {
		doClickCateMenu();
		
	}

	private void doClickCateMenu() {
		menuView.doClickCateMenu(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GoodsControl();
				
			}
		});
	}


}
