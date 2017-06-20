package com.qlbh.control;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.qlbh.bean.Items;
import com.qlbh.bean.Products;
import com.qlbh.dao.AdditionProductsDao;
import com.qlbh.view.AdditionProductsView;;
public class AdditionProductsControl extends JFrame{
	private static final long serialVersionUID = 1L;
	private AdditionProductsView additionProductsView = null;
	public AdditionProductsControl(){
		super("Thêm hàng hóa");
		additionProductsView = new AdditionProductsView();
		initFrame();
		initAction();
		getAllCategories();
	}
	
	private void initFrame() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(680,420);
		if (additionProductsView == null) {
			additionProductsView = new AdditionProductsView();
		}
		this.setContentPane(additionProductsView);
		// set JFrame ra giua man hinh
		int frameX = (Toolkit.getDefaultToolkit().getScreenSize().width - this
				.getWidth()) / 2;
		int frameY = (Toolkit.getDefaultToolkit().getScreenSize().height - this
				.getHeight()) / 2;
		this.setLocation(frameX, frameY);
		this.setVisible(true);
		
	}
	private void initAction() {
		doSaveAdd();
		doSave();
		doExit();
	}

	
	private void doSaveAdd() {
		
		additionProductsView.doSaveAdd(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Products product =  additionProductsView.getProductsInfo();
				AdditionProductsDao additionProductsDao = new AdditionProductsDao();
					try {
						if(additionProductsDao.insertNewProduct(product)){					
							JOptionPane.showMessageDialog(additionProductsView,
									"Thêm mới thành công");
						}
					} catch (HeadlessException e) {
						e.printStackTrace();
					} catch (SQLException e) {
						e.printStackTrace();
					}
						
				}
		});
	}
	private void doSave() {
		additionProductsView.doSave(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
						JOptionPane.showMessageDialog(additionProductsView,
								"Luu thành cong");						
					}
		});
		
	}
	private void doExit() {	
		additionProductsView.doExit(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 System.exit(0);
					}	
		});
	}

	private void getAllCategories() {
		AdditionProductsDao addDao = new AdditionProductsDao();
		List<Items> item = new ArrayList<>();
		try {
			item = addDao.getCategoryList();
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
		additionProductsView.setDataCategory(item);
	}
	
}
