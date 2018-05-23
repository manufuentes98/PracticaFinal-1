package vista;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

public class VistaAccederBuscarCliente extends JPanel{
	public VistaAccederBuscarCliente() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Buscar Cliente");
		lblNewLabel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("David", Font.BOLD, 22));
		add(lblNewLabel, BorderLayout.SOUTH);
		
		JButton button = new JButton("");
		add(button, BorderLayout.CENTER);
	}

  public JPanel VistaAccederBuscarCliente;

}