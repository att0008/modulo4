package Grafico.tussam;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;


 // Importa JOptionPane para mostrar mensajes

public class tussam_tarjetas_claro extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JComboBox<String> tussam_meses_estudiante;
    private JTextField tussam_cantidad_estudiante; // Campo de texto para la cantidad

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	tussam_tarjetas_claro frame = new tussam_tarjetas_claro();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public tussam_tarjetas_claro() 
    {
    	//PAGINA
			setIconImage(Toolkit.getDefaultToolkit().getImage(tussam_tarjetas_claro.class.getResource("/Fotos/logo.png")));
			setTitle("Transporte Sevilla");
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setBounds(100, 100, 500, 700);
			contentPane = new JPanel();
			contentPane.setBorder(null);
			setContentPane(contentPane);
			contentPane.setLayout(null);
			setResizable(false);
		
			//CENTRAR
				setLocationRelativeTo(null);
       
		//FONDO
			JLabel tussam_fondo = new JLabel(" ");
			tussam_fondo.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
			tussam_fondo.setBounds(0, 0, 484, 700);
			ImageIcon iconotussam_fondo =new ImageIcon(getClass().getResource("/Fotos/fondo_claro.png"));
			ImageIcon imagentussam_fondo =new ImageIcon(iconotussam_fondo.getImage().getScaledInstance(tussam_fondo.getWidth(), tussam_fondo.getHeight(), Image.SCALE_SMOOTH));
			tussam_fondo.setIcon(imagentussam_fondo);
			
		//LOGO
		    JLabel tussam_logo = new JLabel(" ");
		    tussam_logo.setBounds(21, 22, 154, 34);
		    ImageIcon iconotussam_logo =new ImageIcon(getClass().getResource("/Fotos/tussam_logo.png"));
		    ImageIcon imagentussam_logo =new ImageIcon(iconotussam_logo.getImage().getScaledInstance(tussam_logo.getWidth(), tussam_logo.getHeight(), Image.SCALE_SMOOTH));
		    
		//TÍTULO ESTUDIANTE
		    JLabel tussam_titulo_estudiante = new JLabel("ESTUDIANTE");
		    tussam_titulo_estudiante.setHorizontalAlignment(SwingConstants.CENTER);
		    tussam_titulo_estudiante.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
		    tussam_titulo_estudiante.setBounds(31, 149, 133, 24);
		    contentPane.add(tussam_titulo_estudiante);
		    
		//TITULO RECARGA
		    JLabel tussam_titulo_estudiante_recarga = new JLabel("RECARGAR");
		    tussam_titulo_estudiante_recarga.setHorizontalAlignment(SwingConstants.CENTER);
		    tussam_titulo_estudiante_recarga.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
		    tussam_titulo_estudiante_recarga.setBounds(185, 149, 133, 24);
		    contentPane.add(tussam_titulo_estudiante_recarga);
		    tussam_logo.setIcon(imagentussam_logo);
		    contentPane.add(tussam_logo);
		    
		//BANNER
		    JLabel tussam_banner = new JLabel(" ");
		    tussam_banner.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		    tussam_banner.setBounds(0, 0, 524, 78);
		    ImageIcon iconotussam_banner =new ImageIcon(getClass().getResource("/Fotos/tussam_banner.png"));
		    ImageIcon imagentussam_banner =new ImageIcon(iconotussam_banner.getImage().getScaledInstance(tussam_banner.getWidth(), tussam_banner.getHeight(), Image.SCALE_SMOOTH));
		    tussam_banner.setIcon(imagentussam_banner);
		    contentPane.add(tussam_banner);
		    
		//TARJETA ESTUDIANTE
		    JLabel tussam_tarjetas_estudiante = new JLabel(" ");
		    tussam_tarjetas_estudiante.setBounds(21, 161, 154, 191);
		    ImageIcon iconotussam_tarjetas_estudiante =new ImageIcon(getClass().getResource("/Fotos/tussam_tarjetas_estudiante.png"));
		    ImageIcon imagentussam_tarjetas_estudiante =new ImageIcon(iconotussam_tarjetas_estudiante.getImage().getScaledInstance(tussam_tarjetas_estudiante.getWidth(), tussam_tarjetas_estudiante.getHeight(), Image.SCALE_SMOOTH));
		    tussam_tarjetas_estudiante.setIcon(imagentussam_tarjetas_estudiante);
		    contentPane.add(tussam_tarjetas_estudiante);      
		        
		//TITULO MES
	        JLabel tussam_titulo_estudiante_mes = new JLabel("Seleccione el mes:");
	        tussam_titulo_estudiante_mes.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
	        tussam_titulo_estudiante_mes.setHorizontalAlignment(SwingConstants.LEFT);
	        tussam_titulo_estudiante_mes.setBounds(185, 184, 133, 24);
	        contentPane.add(tussam_titulo_estudiante_mes);
       
        //COMBOX MESES
	        String[] meses = 
	        {
	            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
	            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
	        };
	        tussam_meses_estudiante = new JComboBox<>(meses);
	        tussam_meses_estudiante.setBounds(185, 212, 133, 24); // Cambiar las coordenadas según sea necesario
	        contentPane.add(tussam_meses_estudiante);
       
        //TITULO CANTIDAD
	        JLabel tussam_titulo2_estudiante = new JLabel("Cantidad a recargar:");
	        tussam_titulo2_estudiante.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
	        tussam_titulo2_estudiante.setHorizontalAlignment(SwingConstants.LEFT);
	        tussam_titulo2_estudiante.setBounds(185, 247, 133, 24);
	        contentPane.add(tussam_titulo2_estudiante);
       
        //INTRODUCIR CANTIDAD
	        tussam_cantidad_estudiante = new JTextField();
	        tussam_cantidad_estudiante.setBounds(185, 275, 133, 24);
	        contentPane.add(tussam_cantidad_estudiante);
       
        //BOTON RECARGA
	        JButton tussam_estudiante_recargar = new JButton("Recargar");
	        tussam_estudiante_recargar.setBounds(185, 310, 133, 24);
	        tussam_estudiante_recargar.addActionListener(e -> {
	            String mesSeleccionado = (String) tussam_meses_estudiante.getSelectedItem();
	            String cantidadTexto = tussam_cantidad_estudiante.getText();
	            // Validar la entrada de cantidad
	            if (!cantidadTexto.isEmpty()) 
	            {
	                try 
	                {
	                    double cantidad = Double.parseDouble(cantidadTexto);
	                    JOptionPane.showMessageDialog(this, "Has recargado " + cantidad + " euros para el mes de " + mesSeleccionado, "Recarga Exitosa", JOptionPane.INFORMATION_MESSAGE);
	                } 
	                catch (NumberFormatException ex) 
	                {
	                    JOptionPane.showMessageDialog(this, "Por favor, introduce una cantidad válida.", "Error", JOptionPane.ERROR_MESSAGE);
	                }
	            } 
	            else 
	            {
	                JOptionPane.showMessageDialog(this, "Por favor, introduce una cantidad.", "Error", JOptionPane.ERROR_MESSAGE);
	            }
	        });
	        contentPane.add(tussam_estudiante_recargar);
       
	    //AL FINAL PARA VER LOS BOTONES
	        contentPane.add(tussam_fondo);
    }
}