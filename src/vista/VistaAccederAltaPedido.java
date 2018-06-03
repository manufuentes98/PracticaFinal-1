package vista;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class VistaAccederAltaPedido extends JPanel {
	private JButton btnAccederAltaPedido;
	private VistaEjecutarAltaPedido vistaEjecutarAltaPedido;

	public VistaAccederAltaPedido() {
		vistaEjecutarAltaPedido = new VistaEjecutarAltaPedido();
		btnAccederAltaPedido = new JButton("");
		// ImageIcon imageIcon= new ImageIcon(new File(pathname))
		btnAccederAltaPedido.setIcon(new ImageIcon(VistaAccederAltaPedido.class
				.getResource("/com/sun/javafx/webkit/prism/resources/mediaVolumeThumb.png")));
		btnAccederAltaPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		setLayout(new BorderLayout(0, 0));
		add(btnAccederAltaPedido);

		JLabel lblNewLabel = new JLabel("Alta Pedido");
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