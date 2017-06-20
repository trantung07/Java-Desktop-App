package com.qlbh.view;

import java.awt.GridBagLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import java.awt.GridBagConstraints;
import javax.swing.border.TitledBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.table.*;
import javax.swing.JLabel;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Font;


public class GoodsView extends JPanel{
	private static final long serialVersionUID = 1L;
	private JTable categoryTable;
	private JButton btnAdd;
	private JButton btnImport;
	private JButton btnExportFile;
	private JPanel pnlButton =null;
	private JScrollPane jScrollPane =null;
	private JLabel lblGoods;
	public GoodsView(){
		super();
		initGoodsView();
	}
	private void initGoodsView() {
		this.setLayout(new BorderLayout());
		this.add(getButton(),BorderLayout.NORTH);
		this.add(getJScrollPane(), BorderLayout.CENTER);
	}
	/**
	 * This method initializes getButton()
	 */
	private JPanel getButton() {
		if(pnlButton ==null){
			pnlButton = new JPanel();
			pnlButton.setLayout(new GridBagLayout());
		
			lblGoods = new JLabel("Hàng hóa");
			lblGoods.setFont(new Font("Tahoma", Font.BOLD, 14));
			GridBagConstraints gbc_lblGoods = new GridBagConstraints();
			gbc_lblGoods.anchor = GridBagConstraints.WEST;
			gbc_lblGoods.insets = new Insets(05, 10, 15, 300);
			gbc_lblGoods.gridx = 0;
			gbc_lblGoods.gridy = 0;
			
			pnlButton.add(lblGoods, gbc_lblGoods);
			
			btnAdd = new JButton("Thêm mới");
			btnAdd.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnAdd.setBackground(Color.ORANGE);
			GridBagConstraints gbc_btnAdd = new GridBagConstraints();
			gbc_btnAdd.insets = new Insets(05, 0, 15, 5);
			gbc_btnAdd.gridx = 2;
			gbc_btnAdd.gridy = 0;
			pnlButton.add(btnAdd, gbc_btnAdd);
			
			btnImport = new JButton("Import");
			btnImport.setFont(new Font("Tahoma", Font.BOLD, 11));
			GridBagConstraints gbc_btnImport = new GridBagConstraints();
			gbc_btnImport.insets = new Insets(05, 0, 15, 5);
			gbc_btnImport.gridx = 3;
			gbc_btnImport.gridy = 0;
			pnlButton.add(btnImport, gbc_btnImport);
			
			btnExportFile = new JButton("Xuất file");
			btnExportFile.setFont(new Font("Tahoma", Font.BOLD, 11));
			GridBagConstraints gbc_btnExportFile = new GridBagConstraints();
			gbc_btnExportFile.insets = new Insets(05, 0, 15, 5);
			gbc_btnExportFile.gridx = 4;
			gbc_btnExportFile.gridy = 0;
			pnlButton.add(btnExportFile, gbc_btnExportFile);
		}
		return pnlButton;
	}
	private Component getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setBorder(BorderFactory.createTitledBorder(null,
					"Danh mục hàng hóa", TitledBorder.DEFAULT_JUSTIFICATION,
					TitledBorder.DEFAULT_POSITION, new Font("Tahoma",
							Font.BOLD, 13), new Color(51, 51, 51)));
			jScrollPane.setViewportView(fillDataCategoryTable());
		}
		return jScrollPane;
	}
	public JTable fillDataCategoryTable() {
			if (categoryTable == null){	
				categoryTable = new JTable();
				
				//set non-editable for JTable
				for (int n = 0; n < categoryTable.getColumnCount(); n++)
				{
				    Class<?> col_class = categoryTable.getColumnClass(n);
				    categoryTable.setDefaultEditor(col_class, null);        // remove editor
				}
			}
			return categoryTable;
		}
	public void setTablemodel(TableModel table) {
		this.categoryTable.setModel(table);
		//this.categoryTable.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
		this.categoryTable.getColumnModel().getColumn(0).setPreferredWidth(10);
		this.categoryTable.getColumnModel().getColumn(1).setPreferredWidth(60);
		this.categoryTable.getColumnModel().getColumn(2).setPreferredWidth(120);
		this.categoryTable.getColumnModel().getColumn(3).setPreferredWidth(80);
		this.categoryTable.getColumnModel().getColumn(4).setPreferredWidth(80);
		this.categoryTable.getColumnModel().getColumn(5).setPreferredWidth(60);
	}
	public void doAdd(ActionListener action){
		this.btnAdd.addActionListener(action);
	}
	public void doImport(ActionListener action){
		this.btnImport.addActionListener(action);
	}
	public void doClickDouble(MouseListener action){
		this.categoryTable.addMouseListener(action);
	}
	
	public int getSelectedRow() {
		return this.categoryTable.getSelectedRow();
	}
}
