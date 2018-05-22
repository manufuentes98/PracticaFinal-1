package vista;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;

public class VistaAccederAltaPedido extends JPanel {
	public VistaAccederAltaPedido() {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton = new JButton("Alta Pedido");
		add(btnNewButton);
	}

  public JPanel VistaAccederAltaPedido;
}