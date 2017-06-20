package com.qlbh.control;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import com.qlbh.view.CreationTemplateDataView;

public class CreationTemplateDataControl extends JFrame{
	private static final long serialVersionUID = 1L;
	private CreationTemplateDataView creationTemplateDataView = null;
	public CreationTemplateDataControl() {
		super("Tạo Dữ liệu mẫu");
		creationTemplateDataView = new CreationTemplateDataView();
		initFrame();
		initAction();
	}
	
	private void initFrame() {
		// This method for initializing Frame and set size to the Frame 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(450, 350);
		if (creationTemplateDataView == null) {
			creationTemplateDataView = new CreationTemplateDataView();
		}
		this.setContentPane(creationTemplateDataView);
		// set JFrame ra giua man hinh
		int frameX = (Toolkit.getDefaultToolkit().getScreenSize().width - this
				.getWidth()) / 2;
		int frameY = (Toolkit.getDefaultToolkit().getScreenSize().height - this
				.getHeight()) / 2;
		this.setLocation(frameX, frameY);
		this.setVisible(true);
	}
	private void initAction() {
		doCreate();
		doCancel();
	}
	private void doCreate() {
		creationTemplateDataView.doCreate (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				new DashboardControl();
			}
		});
	}
	private void doCancel() {
		creationTemplateDataView.doCancel(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 System.exit(0);
					}	
		});
	}	
}
