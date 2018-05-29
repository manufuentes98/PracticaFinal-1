package vista;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;

public class VistaAccederPedido extends JPanel {
	private JButton btnConsultarPedidos;
	private VistaEjecutarPedido vistaEjecutarPedido;
	

	public VistaAccederPedido() {
		vistaEjecutarPedido= new VistaEjecutarPedido();
		 btnConsultarPedidos = new JButton("\r\n");
		btnConsultarPedidos.setIcon(new ImageIcon(VistaAccederPedido.class.getResource("/com/sun/javafx/webkit/prism/resources/panIcon.png")));
		btnConsultarPedidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		setLayout(new BorderLayout(0, 0));
		add(btnConsultarPedidos, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("ConsultarPedidos");
		add(lblNewLabel, BorderLayout.SOUTH);
	}

  public VistaEjecutarPedido getVistaEjecutarPedido() {
		return vistaEjecutarPedido;
	}

	public void setVistaEjecutarPedido(VistaEjecutarPedido vistaEjecutarPedido) {
		this.vistaEjecutarPedido = vistaEjecutarPedido;
	}

public JButton getBtnConsultarPedidos() {
		return btnConsultarPedidos;
	}

	public void setBtnConsultarPedidos(JButton btnConsultarPedidos) {
		this.btnConsultarPedidos = btnConsultarPedidos;
	}

	public JPanel getVistaAccederPedido() {
		return VistaAccederPedido;
	}

	public void setVistaAccederPedido(JPanel vistaAccederPedido) {
		VistaAccederPedido = vistaAccederPedido;
	}

public JPanel VistaAccederPedido;

}