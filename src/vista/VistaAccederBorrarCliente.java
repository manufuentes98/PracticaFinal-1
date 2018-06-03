package vista;

import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class VistaAccederBorrarCliente extends JPanel {
	private JButton btnBorrarCliente;
	private VistaEjecutarBorrarCliente VistaEjecutarBorrarCliente = new VistaEjecutarBorrarCliente();

	public VistaAccederBorrarCliente() {
		setLayout(new BorderLayout(0, 0));

		btnBorrarCliente = new JButton("");
		add(btnBorrarCliente, BorderLayout.CENTER);

		JLabel lblBorrarCliente = new JLabel("Borrar Cliente");
		lblBorrarCliente.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblBorrarCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblBorrarCliente.setFont(new Font("David", Font.BOLD, 22));
		add(lblBorrarCliente, BorderLayout.SOUTH);
	}

	public JButton getBtnBorrarCliente() {
		return btnBorrarCliente;
	}

	public JTextField getTxtId() {
		return VistaEjecutarBorrarCliente.getTxtId();
	}

	public JTextField getTxtNombre() {
		return VistaEjecutarBorrarCliente.getTxtNombre();
	}

	public JButton getBtnValidar() {
		return VistaEjecutarBorrarCliente.getBtnValidar();
	}

	public JLabel getLblMensaje() {
		return VistaEjecutarBorrarCliente.getLblMensaje();
	}

	public VistaEjecutarBorrarCliente getVistaEjecutarBorrarCliente() {
		return VistaEjecutarBorrarCliente;
	}
}