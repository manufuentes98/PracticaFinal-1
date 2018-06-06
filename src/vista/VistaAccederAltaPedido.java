package vista;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;

public class VistaAccederAltaPedido extends JPanel {
	private JButton btnAccederAltaPedido;
	private VistaEjecutarAltaPedido vistaEjecutarAltaPedido;

	public VistaAccederAltaPedido() {
		vistaEjecutarAltaPedido = new VistaEjecutarAltaPedido();
		btnAccederAltaPedido = new JButton("");
		setLayout(new BorderLayout(0, 0));
		add(btnAccederAltaPedido);

		JLabel lblNewLabel = new JLabel("Alta Pedido");
		lblNewLabel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblNewLabel.setFont(new Font("David", Font.BOLD, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel, BorderLayout.SOUTH);
	}

	public JButton getBtnAccederAltaPedido() {
		return btnAccederAltaPedido;
	}

	public void setBtnAccederAltaPedido(JButton btnAccederAltaPedido) {
		this.btnAccederAltaPedido = btnAccederAltaPedido;
	}

	public JPanel getVistaAccederAltaPedido() {
		return vistaEjecutarAltaPedido;
	}

	public VistaEjecutarAltaPedido getVistaEjecutarAltaPedido() {
		return vistaEjecutarAltaPedido;
	}

}