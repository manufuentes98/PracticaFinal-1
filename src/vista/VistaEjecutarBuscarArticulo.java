package vista;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class VistaEjecutarBuscarArticulo extends JPanel{

	private JTextField textFieldBuscar;
	private JTextField textFieldDescripcion;
	private JTextField textFieldPrecio;
	
	public VistaEjecutarBuscarArticulo() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		
		JLabel lblIntroduceElTexto = new JLabel("Introduce el texto:");
		lblIntroduceElTexto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblIntroduceElTexto);
		
		textFieldBuscar = new JTextField();
		panel.add(textFieldBuscar);
		textFieldBuscar.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane,BorderLayout.CENTER);
		String[] nombresColumnas = {"Nombre"};
		String data[][]={{"1"}};	
		JTable table = new JTable(new DefaultTableModel(data,nombresColumnas));
		table.setEnabled(false);
		scrollPane.setViewportView(table);
		
		JPanel panel_2 = new JPanel();
		add(panel_2, BorderLayout.SOUTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {0, 30, 30, 30, 0, 0, 0, 30, 30, 30};
		gbl_panel.rowHeights = new int[] {0, 30, 30, 30, 30, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		panel_2.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("Descripcion:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		panel_2.add(lblNewLabel, gbc_lblNewLabel);
		
		textFieldDescripcion = new JTextField();
		textFieldDescripcion.setEditable(false);
		GridBagConstraints gbc_textFieldDescripcion = new GridBagConstraints();
		gbc_textFieldDescripcion.gridheight = 3;
		gbc_textFieldDescripcion.gridwidth = 3;
		gbc_textFieldDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldDescripcion.fill = GridBagConstraints.BOTH;
		gbc_textFieldDescripcion.gridx = 4;
		gbc_textFieldDescripcion.gridy = 1;
		panel_2.add(textFieldDescripcion, gbc_textFieldDescripcion);
		textFieldDescripcion.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.EAST;
		gbc_lblPrecio.insets = new Insets(0, 0, 0, 5);
		gbc_lblPrecio.gridx = 3;
		gbc_lblPrecio.gridy = 5;
		panel_2.add(lblPrecio, gbc_lblPrecio);
		
		textFieldPrecio = new JTextField();
		textFieldPrecio.setEditable(false);
		GridBagConstraints gbc_textFieldPrecio = new GridBagConstraints();
		gbc_textFieldPrecio.gridwidth = 3;
		gbc_textFieldPrecio.insets = new Insets(0, 0, 0, 5);
		gbc_textFieldPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldPrecio.gridx = 4;
		gbc_textFieldPrecio.gridy = 5;
		panel_2.add(textFieldPrecio, gbc_textFieldPrecio);
		textFieldPrecio.setColumns(10);
	}

	public JTextField getTextFieldBuscar() {
		return textFieldBuscar;
	}

	public JTextField getTextFieldDescripcion() {
		return textFieldDescripcion;
	}

	public JTextField getTextFieldPrecio() {
		return textFieldPrecio;
	}

}