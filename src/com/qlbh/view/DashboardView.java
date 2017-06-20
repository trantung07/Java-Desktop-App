package com.qlbh.view;

import javax.swing.JPanel;

import java.awt.GridBagLayout;

public class DashboardView extends JPanel{
	private static final long serialVersionUID = 1L;
	
	public DashboardView(){
		super();
		initDashboardView();
	}
	public void initDashboardView() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		setLayout(gridBagLayout);
	}


	

}
