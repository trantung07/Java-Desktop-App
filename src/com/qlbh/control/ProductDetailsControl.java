package com.qlbh.control;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.qlbh.bean.Items;
import com.qlbh.bean.Products;
import com.qlbh.dao.AdditionProductsDao;
import com.qlbh.dao.ProductDetailsDao;
import com.qlbh.view.ProductDetailsView;

public class ProductDetailsControl extends JFrame{
	private static final long serialVersionUID = 1L;
	private ProductDetailsView productDetailsView =null;
	
	public ProductDetailsControl(){
		super("Chi tiết sản phẩm");
		productDetailsView = new ProductDetailsView();
		initFrame();
		initAction();
		getAllCategory();
	}

	private void initFrame() {
		// This method for initializing Frame and set size to the Frame 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(productDetailsView);
		
		this.setSize(750, 350);
		if (productDetailsView == null) {
			productDetailsView = new ProductDetailsView();
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
		deleteProduct();
		updateProduct();
	}

	private void updateProduct() {
		productDetailsView.updateProduct(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				Products product = productDetailsView.getUpdateProductInfo();
				ProductDetailsDao productDetailsDao = new ProductDetailsDao();
				try {
					if(productDetailsDao.updateProduct(product)){
						JOptionPane.showMessageDialog(productDetailsView,
								"Đã cập nhật SP thành công");
					}
				} catch (HeadlessException e2) {
					e2.printStackTrace();
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
			}
		});
		
	}

	private void deleteProduct() {
		productDetailsView.deleteProduct(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int n = JOptionPane.showConfirmDialog(productDetailsView,
						"Bạn có chắc chắn muốn xóa sản phẩm?",
						"Xóa sản phẩm?", JOptionPane.OK_CANCEL_OPTION);
				if (n == JOptionPane.OK_OPTION){
					Products product = productDetailsView.getUpdateProductInfo();
					ProductDetailsDao productDetailsDao = new ProductDetailsDao();
					try {
						if(productDetailsDao.deleteProduct(product)){
							JOptionPane.showMessageDialog(productDetailsView,
									"Đã xóa thành công");
						}
					} catch (HeadlessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
	}
	
	private void getAllCategory() {
		AdditionProductsDao addDao = new AdditionProductsDao();
		List<Items> item = new ArrayList<>();
		try {
			item = addDao.getCategoryList();
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
		productDetailsView.setDataCategory(item);
	}

	public void setDataProductDetail(Products product) {
		productDetailsView.setDataProductDetail(product);
		// goi dao get list category
		// product detailview.set list category cho combobox (tao moi method set list)
	}
	
}
