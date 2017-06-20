package com.qlbh.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

import com.qlbh.bean.Items;
import com.qlbh.bean.Products;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.Font;

public class ProductDetailsView extends JPanel{
	private static final long serialVersionUID = 1L;
	private JPanel infoPanel;
	private JPanel stockCardPanel;
	private JPanel inventoryPanel;
	private JPanel pnlDetails =null;
	private JPanel pnlButton=null;
	private JPanel pnlButton2=null;
	private JLabel lblProductName;
	private JLabel lblSellDirectly;
	private JLabel lblNoPoints;
	private JLabel lblProductID;
	private JLabel lblCategory;
	private JLabel lblProductType;
	private JLabel lblInventory;
	private JLabel lblSellingPrice;
	private JLabel lblFundsPrice;
	private JLabel lblDescription;
	private JLabel lblNote;
	private JTextField txtProductId;
	private JComboBox txtCategoryName;
	private JTextField txtProductType;
	private JTextField txtInventory;
	private JTextField txtSellingPrice;
	private JTextField txtDescription;
	private JTextField txtNote;
	private JTextField txtFundsPrice;
	private JButton btnStop;
	private JButton btnPrintBarcode;
	private JButton btnUpdate;
	private JButton btnDelete;
	private JButton btnExportFile;
	private JScrollPane jScrollPane=null;
	private JScrollPane jScrollPane1=null;
	private JTable stockCardTable=null;
	private JTable inventoryTable =null;
	public ProductDetailsView(){
		super();
		initProductDetailsView();
	}
	private void initProductDetailsView() {
		this.setLayout(new BorderLayout());
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		add(tabbedPane, BorderLayout.CENTER);
		
		infoPanel = new JPanel();
		tabbedPane.addTab("Thông tin", null, infoPanel, "Thông Tin");
		infoPanel.setLayout(new BorderLayout());
		infoPanel.add(getDetails(), BorderLayout.CENTER);
		infoPanel.add(getButtons(), BorderLayout.SOUTH);
		
		stockCardPanel = new JPanel();
		tabbedPane.addTab("Thẻ kho", null, stockCardPanel, "Thẻ Kho");
		stockCardPanel.setLayout(new BorderLayout());
		stockCardPanel.add(getJScrollPane(),BorderLayout.CENTER);
		stockCardPanel.add(getButton2(),BorderLayout.SOUTH);
		
		inventoryPanel = new JPanel();
		tabbedPane.addTab("Tồn kho", null, inventoryPanel, "Tồn Kho");
		inventoryPanel.setLayout(new BorderLayout());
		inventoryPanel.add(getJScrollPane1(),BorderLayout.CENTER);
	}
	
	// Noi dung Panel Thong tin
	private JPanel getDetails() {
		if(pnlDetails ==null){
			pnlDetails = new JPanel();
			
			pnlDetails.setLayout(new GridBagLayout());
			
			lblProductName = new JLabel();
			lblProductName.setFont(new Font("Tahoma", Font.BOLD, 13));
			GridBagConstraints gbc_lblTomCat = new GridBagConstraints();
			gbc_lblTomCat.insets = new Insets(0, 0, 10, 5);
			gbc_lblTomCat.gridx = 0;
			gbc_lblTomCat.gridy = 0;
						
			lblSellDirectly = new JLabel();
			GridBagConstraints gbc_lblSellDirectly = new GridBagConstraints();
			gbc_lblSellDirectly.insets = new Insets(0, 0, 10, 5);
			gbc_lblSellDirectly.gridx = 0;
			gbc_lblSellDirectly.gridy = 2;
//						
//			lblNoPoints = new JLabel("Không tích điểm");
//			GridBagConstraints gbc_lblNoPoints = new GridBagConstraints();
//			gbc_lblNoPoints.insets = new Insets(0, 20, 10, 5);
//			gbc_lblNoPoints.gridx = 2;
//			gbc_lblNoPoints.gridy = 2;
			
			lblProductID = new JLabel("Mã hàng hóa");
			GridBagConstraints gbc_lblProductID = new GridBagConstraints();
			gbc_lblProductID.anchor = GridBagConstraints.WEST;
			gbc_lblProductID.insets = new Insets(0, 10, 10, 5);
			gbc_lblProductID.gridx = 3;
			gbc_lblProductID.gridy = 3;
						
			txtProductId = new JTextField();
			GridBagConstraints gbc_txtProductId = new GridBagConstraints();
			gbc_txtProductId.insets = new Insets(0, 10, 10, 5);
			gbc_txtProductId.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtProductId.gridx = 4;
			gbc_txtProductId.gridy = 3;
			txtProductId.setColumns(10);
			
			lblCategory = new JLabel("Nhóm hàng");
			GridBagConstraints gbc_lblProductGroup = new GridBagConstraints();
			gbc_lblProductGroup.anchor = GridBagConstraints.WEST;
			gbc_lblProductGroup.insets = new Insets(0, 10, 10, 5);
			gbc_lblProductGroup.gridx = 3;
			gbc_lblProductGroup.gridy = 4;
					
			txtCategoryName = new JComboBox();
			GridBagConstraints gbc_txtProductGroup = new GridBagConstraints();
			gbc_txtProductGroup.insets = new Insets(0, 10, 10, 5);
			gbc_txtProductGroup.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtProductGroup.gridx = 4;
			gbc_txtProductGroup.gridy = 4;
					
			lblProductType = new JLabel("Loại hàng");
			GridBagConstraints gbc_lblProductType = new GridBagConstraints();
			gbc_lblProductType.anchor = GridBagConstraints.WEST;
			gbc_lblProductType.insets = new Insets(0, 10, 10, 5);
			gbc_lblProductType.gridx = 3;
			gbc_lblProductType.gridy = 5;
						
			txtProductType = new JTextField();
			GridBagConstraints gbc_txtProductType = new GridBagConstraints();
			gbc_txtProductType.insets = new Insets(0, 10, 10, 5);
			gbc_txtProductType.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtProductType.gridx = 4;
			gbc_txtProductType.gridy = 5;
			txtProductType.setColumns(10);
			
			lblInventory = new JLabel("Định mức tồn");
			GridBagConstraints gbc_lblQuota = new GridBagConstraints();
			gbc_lblQuota.anchor = GridBagConstraints.WEST;
			gbc_lblQuota.insets = new Insets(0, 10, 10, 5);
			gbc_lblQuota.gridx = 3;
			gbc_lblQuota.gridy = 6;
					
			txtInventory = new JTextField();
			GridBagConstraints gbc_txtQuota = new GridBagConstraints();
			gbc_txtQuota.insets = new Insets(0, 10, 10, 5);
			gbc_txtQuota.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtQuota.gridx = 4;
			gbc_txtQuota.gridy = 6;
			txtInventory.setColumns(10);
			
			lblSellingPrice = new JLabel("Giá bán");
			GridBagConstraints gbc_lblSellingPrice = new GridBagConstraints();
			gbc_lblSellingPrice.anchor = GridBagConstraints.WEST;
			gbc_lblSellingPrice.insets = new Insets(0, 10, 10, 5);
			gbc_lblSellingPrice.gridx = 3;
			gbc_lblSellingPrice.gridy = 7;
			
			txtSellingPrice = new JTextField();
			GridBagConstraints gbc_txtSellingPrice = new GridBagConstraints();
			gbc_txtSellingPrice.insets = new Insets(0, 10, 10, 5);
			gbc_txtSellingPrice.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtSellingPrice.gridx = 4;
			gbc_txtSellingPrice.gridy = 7;
			txtSellingPrice.setColumns(10);
			
			lblFundsPrice = new JLabel("Giá vốn");
			GridBagConstraints gbc_lblFundsPrice = new GridBagConstraints();
			gbc_lblFundsPrice.anchor = GridBagConstraints.WEST;
			gbc_lblFundsPrice.insets = new Insets(0, 10, 10, 5);
			gbc_lblFundsPrice.gridx = 3;
			gbc_lblFundsPrice.gridy = 8;
			
			txtFundsPrice = new JTextField();
			GridBagConstraints gbc_txtFundsPrice = new GridBagConstraints();
			gbc_txtFundsPrice.insets = new Insets(0, 10, 10, 5);
			gbc_txtFundsPrice.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtFundsPrice.gridx = 4;
			gbc_txtFundsPrice.gridy = 8;
			txtFundsPrice.setColumns(10);
			
			lblDescription = new JLabel("Mô tả");
			GridBagConstraints gbc_lblDescription = new GridBagConstraints();
			gbc_lblDescription.anchor = GridBagConstraints.WEST;
			gbc_lblDescription.insets = new Insets(0, 10, 10, 5);
			gbc_lblDescription.gridx = 5;
			gbc_lblDescription.gridy = 3;
				
			txtDescription = new JTextField();
			GridBagConstraints gbc_txtDescription = new GridBagConstraints();
			gbc_txtDescription.insets = new Insets(0, 10, 10, 0);
			gbc_txtDescription.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtDescription.gridx = 6;
			gbc_txtDescription.gridy = 3;
			txtDescription.setColumns(10);
			
			lblNote = new JLabel("Ghi chú đặt hàng");
			GridBagConstraints gbc_lblNote = new GridBagConstraints();
			gbc_lblNote.anchor = GridBagConstraints.WEST;
			gbc_lblNote.insets = new Insets(0, 10, 10, 5);
			gbc_lblNote.gridx = 5;
			gbc_lblNote.gridy = 4;
				
			txtNote = new JTextField();
			GridBagConstraints gbc_txtNote = new GridBagConstraints();
			gbc_txtNote.insets = new Insets(0, 10, 10, 0);
			gbc_txtNote.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtNote.gridx = 6;
			gbc_txtNote.gridy = 4;
			txtNote.setColumns(10);
			
			pnlDetails.add(lblProductName, gbc_lblTomCat);
			pnlDetails.add(lblSellDirectly, gbc_lblSellDirectly);
//			pnlDetails.add(lblNoPoints, gbc_lblNoPoints);
			pnlDetails.add(lblProductID, gbc_lblProductID);
			pnlDetails.add(txtProductId, gbc_txtProductId);
			pnlDetails.add(lblCategory, gbc_lblProductGroup);
			pnlDetails.add(txtCategoryName, gbc_txtProductGroup);
			pnlDetails.add(lblProductType, gbc_lblProductType);
			pnlDetails.add(txtProductType, gbc_txtProductType);
			pnlDetails.add(lblInventory, gbc_lblQuota);
			pnlDetails.add(txtInventory, gbc_txtQuota);
			pnlDetails.add(lblSellingPrice, gbc_lblSellingPrice);
			pnlDetails.add(txtSellingPrice, gbc_txtSellingPrice);
			pnlDetails.add(lblFundsPrice, gbc_lblFundsPrice);
			pnlDetails.add(txtFundsPrice, gbc_txtFundsPrice);
			pnlDetails.add(lblDescription, gbc_lblDescription);
			pnlDetails.add(txtDescription, gbc_txtDescription);
			pnlDetails.add(lblNote, gbc_lblNote);
			pnlDetails.add(txtNote, gbc_txtNote);
		}
		return pnlDetails;
	}
	private JPanel getButtons() {
		if(pnlButton ==null){
			pnlButton = new JPanel();
			pnlButton.setLayout(new FlowLayout());
			
			btnUpdate = new JButton("Cập nhật");
			pnlButton.add(btnUpdate);
			
			btnPrintBarcode = new JButton("In mã vạch");
			pnlButton.add(btnPrintBarcode);
			
			btnStop = new JButton("Ngừng kinh doanh");
			pnlButton.add(btnStop);
			
			btnDelete = new JButton("Xóa");
			pnlButton.add(btnDelete);
		}
		return pnlButton;
	}
	// Noi dung Panel Thẻ kho
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setViewportView(getStockCardTable());
			
		}
		return jScrollPane;
	}
	
	private JTable getStockCardTable() {
		if (stockCardTable == null){
			Object data[][] ={
					{"HD320001", "Bán hàng", "10/03/2017 0:00", "140,000", "-12", 2},
					{"HD320002", "Nhập hàng", "11/04/2017 0:00", "140,000", "15", 3},
					{"HD320003", "Bán hàng", "30/03/2017 0:00", "140,000", "-11", 1},
					{"HD320004", "Nhập hàng", "20/03/2017 0:00", "140,000", "17",0},
					{"HD320005", "Bán hàng", "28/02/2017 0:00", "140,000", "-7", 4},
					{"HD320006", "Nhập hàng", "10/01/2017 0:00", "140,000", "5", 2},
					{"HD320007", "Bán hàng", "27/01/2017 0:00", "140,000", "-5", 3},
					{"HD320008", "Nhập hàng", "10/02/2017 0:00", "140,000", "7", 1}
			};
			Object colname[] ={
					"Chứng từ","Phương thức","Thời gian","Giá vốn","Số lượng","Tồn cuối"
			};
			
			stockCardTable = new JTable(data,colname);
			//set non-editable for Table
			for (int n = 0; n < stockCardTable.getColumnCount(); n++)
			{
			    Class<?> col_class = stockCardTable.getColumnClass(n);
			    stockCardTable.setDefaultEditor(col_class, null);        // remove editor
			}
			stockCardTable.setRowHeight(30);
			stockCardTable.setShowVerticalLines(false);
			stockCardTable.getColumnModel().getColumn(0).setPreferredWidth(50);
			stockCardTable.getColumnModel().getColumn(1).setPreferredWidth(200);
			stockCardTable.getColumnModel().getColumn(2).setPreferredWidth(60);
			stockCardTable.getColumnModel().getColumn(3).setPreferredWidth(40);
			stockCardTable.getColumnModel().getColumn(4).setPreferredWidth(40);
			stockCardTable.getColumnModel().getColumn(5).setPreferredWidth(40);
			
			DefaultTableCellRenderer rightAlignment = new DefaultTableCellRenderer();
			rightAlignment.setHorizontalAlignment( SwingConstants.RIGHT );
			stockCardTable.getColumnModel().getColumn(2).setCellRenderer( rightAlignment );
			stockCardTable.getColumnModel().getColumn(3).setCellRenderer( rightAlignment );
			stockCardTable.getColumnModel().getColumn(4).setCellRenderer( rightAlignment );
			stockCardTable.getColumnModel().getColumn(5).setCellRenderer( rightAlignment );
		}
		return stockCardTable;
	}
	private JPanel getButton2() {
		if(pnlButton2 == null){
			pnlButton2 = new JPanel();
			pnlButton2.setLayout(new GridBagLayout());
			
			btnExportFile = new JButton("Xuất file");
			GridBagConstraints gbc_btnExportFile = new GridBagConstraints();
			gbc_btnExportFile.insets = new Insets(5, 0, 15, 0);
			gbc_btnExportFile.gridx = 0;
			gbc_btnExportFile.gridy = 0;
			pnlButton2.add(btnExportFile, gbc_btnExportFile);
		}
		return pnlButton2;
	}
	// Noi dung Panel Ton Kho
	private JScrollPane getJScrollPane1() {
		if (jScrollPane1 == null) {
			jScrollPane1 = new JScrollPane();
			jScrollPane1.setViewportView(getInventoryTable());
		}
		return jScrollPane1;
	}
	private JTable getInventoryTable() {
		if(inventoryTable==null){
			Object data1[][] ={
					{null,8,0},
					{"Chi nhánh trung tâm",8,0}
			};
			Object colname1[] ={
					"Chi nhánh","Tồn kho","Đặt hàng"
			};
			inventoryTable = new JTable(data1,colname1);
			//set non-editable for Table
			for (int n = 0; n < inventoryTable.getColumnCount(); n++)
			{
			    Class<?> col_class = inventoryTable.getColumnClass(n);
			    inventoryTable.setDefaultEditor(col_class, null);        // remove editor
			}
			inventoryTable.setRowHeight(30);
			inventoryTable.setShowVerticalLines(false);
			inventoryTable.getColumnModel().getColumn(0).setPreferredWidth(300);
			inventoryTable.getColumnModel().getColumn(1).setPreferredWidth(40);
			inventoryTable.getColumnModel().getColumn(2).setPreferredWidth(40);
			
			DefaultTableCellRenderer rightAlignment = new DefaultTableCellRenderer();
			rightAlignment.setHorizontalAlignment( SwingConstants.RIGHT );
			inventoryTable.getColumnModel().getColumn(2).setCellRenderer( rightAlignment );
			inventoryTable.getColumnModel().getColumn(1).setCellRenderer( rightAlignment );

		}
		return inventoryTable;
	}
	
	public void setDataProductDetail(Products product) {
		txtProductId.setText(product.getProductID());
		lblProductName.setText(product.getProductName());
		txtSellingPrice.setText(product.getSellingPrice().toString());
		txtFundsPrice.setText(product.getFundsPrice().toString());
		txtInventory.setText(product.getInventory().toString());
		//txtCategoryName.setText(String.valueOf(product.getCategoryID()).toString());
	}
	public Products getUpdateProductInfo(){
		Products product = new Products();
		product.setProductID(txtProductId.getText());
		product.setSellingPrice(Double.parseDouble(txtSellingPrice.getText()));
		product.setFundsPrice(Double.parseDouble(txtFundsPrice.getText()));
		product.setInventory(Double.parseDouble(txtInventory.getText()));
		Items item = (Items) txtCategoryName.getSelectedItem();
		product.setCategoryID(item.getId());
		return product;
	}
	public void deleteProduct(ActionListener action) {
		this.btnDelete.addActionListener(action);
	}
	public void updateProduct(ActionListener action) {
		this.btnUpdate.addActionListener(action);
	}
	
	public void setDataCategory(List<Items> category) {
		txtCategoryName.setModel(new DefaultComboBoxModel(category.toArray()));
//		Products item = new Products();		
//		GoodsView goodsView = new GoodsView();
//		int index = goodsView .getSelectedRow();
//		txtCategoryName.setSelectedIndex((index+1));
	}
}
