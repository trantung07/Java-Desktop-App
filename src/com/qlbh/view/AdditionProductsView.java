package com.qlbh.view;

import java.awt.GridBagLayout;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import com.qlbh.bean.Items;
import com.qlbh.bean.Products;
import javax.swing.DefaultComboBoxModel;

public class AdditionProductsView extends JPanel{
	private static final long serialVersionUID = 1L;
	private JTextField txtProductId;	
	private JCheckBox chckbxSellingDirectly;
	private JTextField txtFundsPrice;
	private JTextField txtInventory;
	private JTextField txtProductName;
	private JButton btnSave;
	private JButton btnSaveAdd;
	private JButton btnExit;
	private JTextField txtSellingPrice;
	private JComboBox txtCateName;
	
	public AdditionProductsView() {
		super();
		initAdditionProductsView();
	}
	private void initAdditionProductsView() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 151, 117, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0};
		this.setLayout(gridBagLayout);
		
		JLabel lblInfomation = new JLabel("Thông tin");
		GridBagConstraints gbc_lblInfomation = new GridBagConstraints();
		gbc_lblInfomation.insets = new Insets(0, 0, 5, 15);
		gbc_lblInfomation.gridx = 1;
		gbc_lblInfomation.gridy = 0;
		
		
		JLabel lblDescription = new JLabel("Mô tả chi tiết");
		GridBagConstraints gbc_lblDescription = new GridBagConstraints();
		gbc_lblDescription.insets = new Insets(0, 0, 5, 15);
		gbc_lblDescription.gridx = 2;
		gbc_lblDescription.gridy = 0;
		
		
		JLabel lblComponent = new JLabel("Thành phần");
		GridBagConstraints gbc_lblComponent = new GridBagConstraints();
		gbc_lblComponent.insets = new Insets(0, 0, 5, 5);
		gbc_lblComponent.gridx = 3;
		gbc_lblComponent.gridy = 0;
		
		
		JLabel lblProductID = new JLabel("Mã hàng hóa");
		GridBagConstraints gbc_lblProductID = new GridBagConstraints();
		gbc_lblProductID.anchor = GridBagConstraints.WEST;
		gbc_lblProductID.insets = new Insets(10, 10, 5, 5);
		gbc_lblProductID.gridx = 1;
		gbc_lblProductID.gridy = 1;
		
		
		txtProductId = new JTextField();
		GridBagConstraints gbc_txtProductID = new GridBagConstraints();
		gbc_txtProductID.gridwidth = 2;
		gbc_txtProductID.insets = new Insets(10, 0, 5, 5);
		gbc_txtProductID.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtProductID.gridx = 2;
		gbc_txtProductID.gridy = 1;
		
		
		JLabel lblProductName = new JLabel("Tên hàng");
		GridBagConstraints gbc_lblProductName = new GridBagConstraints();
		gbc_lblProductName.anchor = GridBagConstraints.WEST;
		gbc_lblProductName.insets = new Insets(10, 10, 5, 5);
		gbc_lblProductName.gridx = 1;
		gbc_lblProductName.gridy = 2;
		
		
		txtProductName = new JTextField();
		GridBagConstraints gbc_txtProductName = new GridBagConstraints();
		gbc_txtProductName.gridwidth = 2;
		gbc_txtProductName.insets = new Insets(10, 0, 5, 5);
		gbc_txtProductName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtProductName.gridx = 2;
		gbc_txtProductName.gridy = 2;
		
		
		JLabel lblProductGroup = new JLabel("Nhóm hàng");
		GridBagConstraints gbc_lblProductGroup = new GridBagConstraints();
		gbc_lblProductGroup.anchor = GridBagConstraints.WEST;
		gbc_lblProductGroup.insets = new Insets(10, 10, 5, 5);
		gbc_lblProductGroup.gridx = 1;
		gbc_lblProductGroup.gridy = 3;
		
        txtCateName = new JComboBox();
		GridBagConstraints gbc_txtProductGroup = new GridBagConstraints();
		gbc_txtProductGroup.gridwidth = 2;
		gbc_txtProductGroup.insets = new Insets(10, 0, 5, 5);
		gbc_txtProductGroup.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtProductGroup.gridx = 2;
		gbc_txtProductGroup.gridy = 3;
		
		
		JLabel lblSellingPrice = new JLabel("Giá bán");
		GridBagConstraints gbc_lblSellingPrice = new GridBagConstraints();
		gbc_lblSellingPrice.anchor = GridBagConstraints.WEST;
		gbc_lblSellingPrice.insets = new Insets(10, 10, 5, 5);
		gbc_lblSellingPrice.gridx = 1;
		gbc_lblSellingPrice.gridy = 4;
		
		//NumberFormat amountFormat = NumberFormat.getNumberInstance();
		txtSellingPrice = new JTextField();
//		String text = txtSellingPrice.getText();
//		int xaxis1 = Integer.parseInt(text);
		GridBagConstraints gbc_txtSellingPrice = new GridBagConstraints();
		gbc_txtSellingPrice.gridwidth = 2;
		gbc_txtSellingPrice.insets = new Insets(10, 0, 5, 5);
		gbc_txtSellingPrice.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSellingPrice.gridx = 2;
		gbc_txtSellingPrice.gridy = 4;
		
		
		JLabel lblFundsPrice = new JLabel("Giá vốn");
		GridBagConstraints gbc_lblFundsPrice = new GridBagConstraints();
		gbc_lblFundsPrice.anchor = GridBagConstraints.WEST;
		gbc_lblFundsPrice.insets = new Insets(10, 10, 5, 5);
		gbc_lblFundsPrice.gridx = 1;
		gbc_lblFundsPrice.gridy = 5;
		
		
		txtFundsPrice = new JTextField();
		GridBagConstraints gbc_txtFundsPrice = new GridBagConstraints();
		gbc_txtFundsPrice.gridwidth = 2;
		gbc_txtFundsPrice.insets = new Insets(10, 0, 5, 5);
		gbc_txtFundsPrice.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFundsPrice.gridx = 2;
		gbc_txtFundsPrice.gridy = 5;
		
		JLabel lblInventory = new JLabel("Tồn kho");
		GridBagConstraints gbc_lblInventory = new GridBagConstraints();
		gbc_lblInventory.anchor = GridBagConstraints.WEST;
		gbc_lblInventory.insets = new Insets(10, 10, 5, 5);
		gbc_lblInventory.gridx = 1;
		gbc_lblInventory.gridy = 6;
			
		txtInventory = new JTextField();
		GridBagConstraints gbc_txtInventory = new GridBagConstraints();
		gbc_txtInventory.gridwidth = 2;
		gbc_txtInventory.insets = new Insets(10, 0, 5, 5);
		gbc_txtInventory.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtInventory.gridx = 2;
		gbc_txtInventory.gridy = 6;
		
		chckbxSellingDirectly = new JCheckBox("Được bán trực tiếp");
		GridBagConstraints gbc_chckbxSellingDirectly = new GridBagConstraints();
		gbc_chckbxSellingDirectly.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxSellingDirectly.gridx = 5;
		gbc_chckbxSellingDirectly.gridy = 6;
		
		JComboBox ComboAttribute = new JComboBox();
		ComboAttribute.setModel(new DefaultComboBoxModel(new String[] {"Theo dõi thuộc tính (màu sắc, kích thước)", "1", "2", "3"}));
		GridBagConstraints gbc_ComboAttribute = new GridBagConstraints();
		gbc_ComboAttribute.gridwidth = 3;
		gbc_ComboAttribute.insets = new Insets(20, 10, 5, 0);
		gbc_ComboAttribute.fill = GridBagConstraints.HORIZONTAL;
		gbc_ComboAttribute.gridx = 1;
		gbc_ComboAttribute.gridy = 7;
		
		JComboBox comboBoxCalculatingUnit = new JComboBox();
		comboBoxCalculatingUnit.setModel(new DefaultComboBoxModel(new String[] {"Đơn vị tính", "chiếc", "bộ"}));
		GridBagConstraints gbc_comboBoxCalculatingUnit = new GridBagConstraints();
		gbc_comboBoxCalculatingUnit.insets = new Insets(10, 10, 5, 0);
		gbc_comboBoxCalculatingUnit.gridwidth = 3;
		gbc_comboBoxCalculatingUnit.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxCalculatingUnit.gridx = 1;
		gbc_comboBoxCalculatingUnit.gridy = 8;
			
		 btnSave = new JButton("Lưu");
		GridBagConstraints gbc_btnSave = new GridBagConstraints();
		gbc_btnSave.insets = new Insets(10, 0, 0, 5);
		gbc_btnSave.gridx = 5;
		gbc_btnSave.gridy = 9;
			
		 btnSaveAdd = new JButton("Lưu & Thêm mới");
	
		GridBagConstraints gbc_btnSaveAdd = new GridBagConstraints();
		gbc_btnSaveAdd.insets = new Insets(10, 10, 0, 5);
		gbc_btnSaveAdd.gridx = 6;
		gbc_btnSaveAdd.gridy = 9;
		
		 btnExit = new JButton("Thoát");
		GridBagConstraints gbc_btnExit = new GridBagConstraints();
		gbc_btnExit.insets = new Insets(10, 10, 0, 5);
		gbc_btnExit.gridx = 7;
		gbc_btnExit.gridy = 9;
		
		add(lblInfomation, gbc_lblInfomation);
		add(lblDescription, gbc_lblDescription);
		add(lblComponent, gbc_lblComponent);
		add(lblProductID, gbc_lblProductID);
		add(txtProductId, gbc_txtProductID);
		add(lblProductName, gbc_lblProductName);
		add(txtProductName, gbc_txtProductName);
		add(lblProductGroup, gbc_lblProductGroup);
		add(txtCateName, gbc_txtProductGroup);
		add(lblSellingPrice, gbc_lblSellingPrice);
		add(txtSellingPrice, gbc_txtSellingPrice);
		add(lblFundsPrice, gbc_lblFundsPrice);
		add(txtFundsPrice, gbc_txtFundsPrice);
		add(lblInventory, gbc_lblInventory);
		add(txtInventory, gbc_txtInventory);
		add(chckbxSellingDirectly, gbc_chckbxSellingDirectly);
		add(ComboAttribute, gbc_ComboAttribute);
		add(comboBoxCalculatingUnit, gbc_comboBoxCalculatingUnit);
		add(btnSave, gbc_btnSave);
		add(btnSaveAdd, gbc_btnSaveAdd);
		add(btnExit, gbc_btnExit);
	}

	public  Products getProductsInfo(){
		Products products=new Products();
		products.setProductID(txtProductId.getText());
		products.setProductName(txtProductName.getText());
		Items item = (Items) txtCateName.getSelectedItem();
		products.setCategoryID(item.getId());
		products.setCategoryName(item.getDescription());
		products.setSellingPrice(Double.parseDouble(txtSellingPrice.getText()));
		products.setFundsPrice(Double.parseDouble(txtFundsPrice.getText()));
		products.setInventory(Double.parseDouble(txtInventory.getText()));
		products.setStatus(chckbxSellingDirectly.isSelected());
		return products;
	}
	
	
	public void doSave(ActionListener action) {
		this.btnSave.addActionListener(action);
	}
	public void doSaveAdd(ActionListener action) {
		this.btnSaveAdd.addActionListener(action);
	}
	public void doExit(ActionListener action) {
		this.btnExit.addActionListener(action);
	}
	
	public void setDataCategory(List<Items> categories) {
		txtCateName.setModel(new DefaultComboBoxModel(categories.toArray()));
//		txtCateName.setSelectedIndex(2);
	}
	
}
