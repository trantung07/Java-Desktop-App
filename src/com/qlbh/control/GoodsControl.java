package com.qlbh.control;

import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import com.qlbh.bean.Products;
import com.qlbh.dao.GoodsDao;
import com.qlbh.model.GoodsModel;
import com.qlbh.view.GoodsView;
import com.qlbh.view.MenuView;

public class GoodsControl extends JFrame{
	private static final long serialVersionUID = 1L;
	private GoodsView goodsView = null;
	private List<Products> goodsList = null;
	private GoodsModel goodsModel =null;
	private GoodsDao goodsDao;
	public GoodsControl(){
		super("Hàng hóa");
		goodsView = new GoodsView();
		goodsList = new Vector<Products>();
		goodsModel = new GoodsModel();
		goodsDao = new GoodsDao();
		try {
			goodsList  = goodsDao.getProductInfo();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			int n = JOptionPane.showConfirmDialog(null, e.getMessage(),
					"Error!!!", JOptionPane.OK_CANCEL_OPTION);
			e.printStackTrace();
			if (JOptionPane.OK_OPTION == n) {
				System.exit(1);
			}
			if (JOptionPane.CANCEL_OPTION == n) {
				System.exit(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// set du lieu cho Model
		goodsModel.setGoodsList(goodsList);
		// set model cho view
		this.goodsView.setTablemodel(goodsModel);		
		initFrame();
		initAction();
	}
	
	private void initFrame() {
		// This method for initializing Frame and set size to the Frame 
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				MenuView menuView = new MenuView();
				setJMenuBar(menuView.initMenuBar());
				this.setContentPane(goodsView);
				
				this.setSize(650, 550);
				if (goodsView == null) {
					goodsView = new GoodsView();
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
		doAdd();
		doClickDouble();
		}
	private void doClickDouble() {
		goodsView.doClickDouble(new MouseAdapter(){
			public void mousePressed(MouseEvent e) {
				
		        JTable table =(JTable) e.getSource();
		        Point p = e.getPoint();
		        int row = table.rowAtPoint(p);
		        if (e.getClickCount() == 2) {
		        	int index = goodsView.getSelectedRow();
					Products product = goodsList.get(index);
					ProductDetailsControl controlProductDetail = new ProductDetailsControl();
					controlProductDetail.setDataProductDetail(product);
		        }
		    }
		});
		
	}

	private void doAdd() {
		goodsView.doAdd(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			new AdditionProductsControl();
		}
		});
	}
	
	public static void main(String[] args) {
		new GoodsControl();
	}
	
}
