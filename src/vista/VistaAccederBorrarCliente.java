package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class VistaAccederBorrarCliente extends JPanel{
	public VistaAccederBorrarCliente() {
		setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("");
		add(btnNewButton, BorderLayout.CENTER);
		
		JLabel lblBorrarCliente = new JLabel("Borrar Cliente");
		lblBorrarCliente.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblBorrarCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblBorrarCliente.setFont(new Font("David", Font.BOLD, 22));
		add(lblBorrarCliente, BorderLayout.SOUTH);
	}

  public JPanel VistaAccederBorrarCliente;

}