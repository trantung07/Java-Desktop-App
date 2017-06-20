package com.qlbh.view;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuView{
	private JMenu menuOverview;
	private JMenu menuGoods;
	private JMenuItem mnitemCategory;
	private JMenuItem mnitemSetPrice;
	private JMenuItem mnitemInventory;
	private JMenu menuExchange;
	private JMenuItem mnitemBill;
	private JMenuItem mnitemReturn;
	private JMenuItem mnitemImport;
	private JMenuItem mnitemReturnImported;
	private JMenuItem mnitemExport;
	private JMenu menuPartners;
	private JMenuItem mnitemCustomer;
	private JMenuItem mnitemSupplier;
	private JMenu menuReport;
	private JMenu menuCashBook;
	
	public JMenuBar initMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		menuBar.setMargin((new Insets(5, 50, 15, 15)));
		
		menuOverview = new JMenu("Tổng quan");
		menuOverview.setPreferredSize(new Dimension(80,25));
		
		
		menuGoods = new JMenu("Hàng hóa");
		menuGoods.setPreferredSize(new Dimension(80,25));
			
		mnitemCategory = new JMenuItem("Danh mục");
		mnitemCategory.setSelected(true);
		
		mnitemSetPrice = new JMenuItem("Thiết lập giá");

		mnitemInventory = new JMenuItem("Kiểm kho");
		
		menuExchange = new JMenu("Giao dịch");
		menuExchange.setPreferredSize(new Dimension(80,25));
		
		
		mnitemBill = new JMenuItem("Hóa đơn");
		mnitemBill.setSelected(true);
		
		
		mnitemReturn = new JMenuItem("Trả hàng");
		mnitemReturn.setSelected(true);
		
		
		mnitemImport = new JMenuItem("NHập hàng");
		mnitemImport.setSelected(true);
		
		
		mnitemReturnImported = new JMenuItem("Trả hàng nhập");
		mnitemReturnImported.setSelected(true);
		
		
		mnitemExport = new JMenuItem("Xuất hủy");
		mnitemExport.setSelected(true);
		
		
		menuPartners = new JMenu("Đối tác");
		menuPartners.setPreferredSize(new Dimension(80,25));
		
		
		mnitemCustomer = new JMenuItem("Khách hàng");
		mnitemCustomer.setSelected(true);
		
		
		mnitemSupplier = new JMenuItem("Nhà cung cấp");
		mnitemSupplier.setSelected(true);
		
		
		menuCashBook = new JMenu("Sổ quỹ");
		menuCashBook.setPreferredSize(new Dimension(80,25));
		
		
		menuReport = new JMenu("Báo cáo");
		menuReport.setPreferredSize(new Dimension(80,25));
		
		
		menuBar.add(menuOverview);
		menuBar.add(menuGoods);
		menuBar.add(menuExchange);
		menuBar.add(menuPartners);
		menuBar.add(menuCashBook);
		menuBar.add(menuReport);
		
		menuGoods.add(mnitemCategory);
		menuGoods.add(mnitemSetPrice);
		menuGoods.add(mnitemInventory);
		menuPartners.add(mnitemCustomer);
		menuPartners.add(mnitemSupplier);
		menuExchange.add(mnitemBill);
		menuExchange.add(mnitemReturn);
		menuExchange.add(mnitemImport);
		menuExchange.add(mnitemReturnImported);
		menuExchange.add(mnitemExport);
		return menuBar;
	}
	public void doClickCateMenu(ActionListener action){
		this.mnitemCategory.addActionListener(action);
	}
	
}
