package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;

public class VistaAccederAltaCliente extends JPanel{
	public VistaAccederAltaCliente() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblAltaCliente = new JLabel("Alta Cliente");
		lblAltaCliente.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblAltaCliente.setFont(new Font("David", Font.BOLD, 22));
		lblAltaCliente.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblAltaCliente, BorderLayout.SOUTH);
		
		JButton button = new JButton("");
		add(button, BorderLayout.CENTER);
	}

  public JPanel VistaAccederAltaCliente;

}