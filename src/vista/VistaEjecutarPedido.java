package vista;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import java.awt.Color;

public class VistaEjecutarPedido extends JPanel {
	public VistaEjecutarPedido() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblPedidos = new JLabel("PEDIDOS");
		lblPedidos.setOpaque(true);
		lblPedidos.setBackground(new Color(153, 204, 255));
		lblPedidos.setForeground(new Color(0, 102, 153));
		lblPedidos.setHorizontalAlignment(SwingConstants.CENTER);
		lblPedidos.setFont(new Font("MV Boli", Font.BOLD, 20));
		add(lblPedidos, BorderLayout.NORTH);
		
		table = new JTable();
		add(table, BorderLayout.CENTER);
	}

  private JPanel VistaEjecutarPedido;
  private JTable table;
public JTable getTable() {
	return table;
}
public void setTable(JTable table) {
	this.table = table;
}
public JPanel getVistaEjecutarPedido() {
	return VistaEjecutarPedido;
}
public void setVistaEjecutarPedido(JPanel vistaEjecutarPedido) {
	VistaEjecutarPedido = vistaEjecutarPedido;
}

}