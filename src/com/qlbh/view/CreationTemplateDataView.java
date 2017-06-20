package com.qlbh.view;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import javax.swing.JTextArea;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;

public class CreationTemplateDataView extends JPanel{
	private static final long serialVersionUID = 1L;
	private JButton btnCreate;
	private JButton btnCancel;

	public CreationTemplateDataView() {
		super();
		initCreationTemplateDataView();
	}
	public void initCreationTemplateDataView() {
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{183, 125};
		this.setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Xin chào, Guest");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		
		JTextArea txtrLoremIpsumIs = new JTextArea();
		txtrLoremIpsumIs.setBackground(new Color(240,240,240));
		txtrLoremIpsumIs.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtrLoremIpsumIs.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industry."
				+ "\r\nLorem Ipsum has been the industry's standard, \r\nwhen an unknown printer specimen book."
				+ "\n\r\nLiên hệ Hotline 18008168 (miễn phí) để biết thêm chi tiết."
				+ "\r\nVui lòng chọn Bỏ qua nếu không muốn khởi tạo.");
		
		btnCreate = new JButton("Tạo dữ liệu mẫu");
		btnCreate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCreate.setBackground(new Color(93,186,0));
		btnCreate.setForeground(Color.WHITE);
		btnCreate.setMargin(new Insets(5, 5, 5, 5));
		
		btnCancel = new JButton("Bỏ Qua");
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCancel.setBackground(new Color(123,123,123));
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setMargin(new Insets(5, 5, 5, 5));

		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		
		GridBagConstraints gbc_txtrLoremIpsumIs = new GridBagConstraints();
		gbc_txtrLoremIpsumIs.insets = new Insets(0, 0, 5, 0);
		gbc_txtrLoremIpsumIs.anchor = GridBagConstraints.WEST;
		gbc_txtrLoremIpsumIs.gridwidth = 2;
		gbc_txtrLoremIpsumIs.gridx = 0;
		gbc_txtrLoremIpsumIs.gridy = 1;
		
		GridBagConstraints gbc_btnCreate = new GridBagConstraints();
		gbc_btnCreate.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnCreate.insets = new Insets(20, 0, 0, 0);
		gbc_btnCreate.gridx = 0;
		gbc_btnCreate.gridy = 3;
		
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnCancel.insets = new Insets(20, 0, 0, 0);
		gbc_btnCancel.gridx = 1;
		gbc_btnCancel.gridy = 3;
		
		add(lblNewLabel, gbc_lblNewLabel);
		add(txtrLoremIpsumIs, gbc_txtrLoremIpsumIs);
		add(btnCreate, gbc_btnCreate);
		add(btnCancel, gbc_btnCancel);
	}
	public void doCreate(ActionListener action) {
		this.btnCreate.addActionListener(action);
	}
	public void doCancel(ActionListener action) {
		this.btnCancel.addActionListener(action);
	}
	
}
