package vista;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;

public class VistaAccederPedido extends JPanel {
	public VistaAccederPedido() {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnConsultarPedidos = new JButton("Consultar Pedidos");
		add(btnConsultarPedidos);
	}

  public JPanel VistaAccederPedido;

}