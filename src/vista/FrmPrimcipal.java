package vista;

import java.awt.BorderLayout;
import mantenimientos.gestionCandidato;
import model.candidato;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

public class FrmPrimcipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomCandidato;
	private JTextField txtApeCandidato;
	private JTextField txtAñoReg;
	private JTextField txtNomPartido;
	private JTextField txtIdCandidato;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPrimcipal frame = new FrmPrimcipal();
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
	public FrmPrimcipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCandidato = new JLabel("Candidato");
		lblCandidato.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblCandidato.setBounds(10, 11, 93, 21);
		contentPane.add(lblCandidato);
		
		JLabel lblNombreDelCandidato = new JLabel("Nombre del Candidato:");
		lblNombreDelCandidato.setBounds(29, 94, 133, 14);
		contentPane.add(lblNombreDelCandidato);
		
		JLabel lblApellidoDelCandidato = new JLabel("Apellido del Candidato:");
		lblApellidoDelCandidato.setBounds(29, 128, 126, 14);
		contentPane.add(lblApellidoDelCandidato);
		
		JLabel lblAoDeRegistro = new JLabel("A\u00F1o de Registro:");
		lblAoDeRegistro.setBounds(29, 162, 133, 14);
		contentPane.add(lblAoDeRegistro);
		
		JLabel lblNombreDelPartido = new JLabel("Nombre del Partido:");
		lblNombreDelPartido.setBounds(29, 196, 133, 14);
		contentPane.add(lblNombreDelPartido);
		
		JLabel lblIdDelCandidato = new JLabel("Id del Candidato:");
		lblIdDelCandidato.setBounds(29, 60, 133, 14);
		contentPane.add(lblIdDelCandidato);
		
		txtNomCandidato = new JTextField();
		txtNomCandidato.setBounds(164, 91, 114, 20);
		contentPane.add(txtNomCandidato);
		txtNomCandidato.setColumns(10);
		
		txtApeCandidato = new JTextField();
		txtApeCandidato.setBounds(164, 125, 114, 20);
		contentPane.add(txtApeCandidato);
		txtApeCandidato.setColumns(10);
		
		txtAñoReg = new JTextField();
		txtAñoReg.setBounds(164, 159, 68, 20);
		contentPane.add(txtAñoReg);
		txtAñoReg.setColumns(10);
		
		txtNomPartido = new JTextField();
		txtNomPartido.setBounds(164, 193, 114, 20);
		contentPane.add(txtNomPartido);
		txtNomPartido.setColumns(10);
		
		
		txtIdCandidato = new JTextField();
		txtIdCandidato.setBounds(159, 57, 60, 20);
		contentPane.add(txtIdCandidato);
		txtIdCandidato.setColumns(10);
		
		JButton btnRegistrar = new JButton("Actualizar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// variables
			
				int id;
				String nombre,apellido,año, partido,idd;
			
				
				// entradas
				nombre=txtNomCandidato.getText();
				apellido=txtApeCandidato.getText();
				año=txtAñoReg.getText();
				partido=txtNomPartido.getText();
				id=Integer.parseInt(txtIdCandidato.getText());
				idd= txtIdCandidato.getText();
				// procesos
				candidato c = new candidato();
				c.setNomCandidato(nombre);
				c.setApeCandidato(apellido);
				c.setAnioRegCandidato(año);
				c.setPartido(partido);
				c.setIdCandidato(id);
				//instanciamos la clase 
				
				gestionCandidato gc = new gestionCandidato();
				int ok =gc.Registrar(c);
				// salidas
				
				if(ok==0)
					System.out.println("error");
				else
					System.out.println("registrar");
			
	
				Pattern Nom = Pattern.compile("[A-Za-z]{3,15}");
				Matcher N = Nom.matcher(nombre);
				Matcher A = Nom.matcher(apellido);
				

				Pattern Cod= Pattern.compile("[0-9]{1}");					
				Matcher i = Cod.matcher(idd);
				Matcher añ = Cod.matcher(año);
				
				
				
				
				
				
				
				
			}
		});
		btnRegistrar.setBounds(318, 124, 106, 23);
		contentPane.add(btnRegistrar);
		
		
	}
}
