package com.qlbh.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

import com.qlbh.bean.Items;
import com.qlbh.bean.Products;

public class GoodsModel extends AbstractTableModel{
	
	public List<Products> getGoodsList() {
		return goodsList;
	}
	
	private String[] header = {"STT", "Mã hàng hóa", "Tên hàng", "Giá bán", "Giá vốn","Tồn kho" };
	private List<Products> goodsList = null;
	//private List<Items> additionList=null;
	private static final long serialVersionUID = 1L;
	
	public void setGoodsList(List<Products> goodsList) {
		this.goodsList = goodsList;
		fireTableDataChanged();
	}	
	
//	public void setAdditionList(List<Items> additionList) {
//		this.additionList = additionList;
//		fireTableDataChanged();
//	}
	
	@Override
	public int getColumnCount() {
		return header.length;
	}

	@Override
	public int getRowCount() {
		return goodsList == null ? 0 : goodsList.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Products product = goodsList.get(rowIndex);
		switch (columnIndex) {
		case 0:
			return rowIndex + 1;
		case 1:
			return product.getProductID();
		case 2:
			return product.getProductName();
		case 3:
			return product.getSellingPrice();
		case 4:
			return product.getFundsPrice();
		case 5:
			return product.getInventory();
		default:
			return "";
		}
	}
	
	@Override
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
		case 0:
			return Integer.class;
		case 1:
			return String.class;
		case 2:
			return String.class;
		case 3:
			return Double.class;
		case 4:
			return Double.class;
		case 5:
			return Double.class;
		default:
			return String.class;
		}
	}

	@Override
	public String getColumnName(int column) {
		return header[column];
	}

}
