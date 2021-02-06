import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.ImageIcon;
class  LayoutNulo extends JFrame{
	public LayoutNulo() {
		getContentPane().setLayout(null);//Layout nulo 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1280,720);
		setLocationRelativeTo(null);
		setTitle("Prueba Formulario");
		//Cuadro De Texto 1
		JLabel cdt1 =new JLabel("El formulario clasico incluye todos "
				+ "los campos visibles para esta lista ");
		cdt1.setBounds(0,-70,400,150);
		add(cdt1);
		
		//Cuadro De Texto 2
		JLabel cdt2 =new JLabel("Opciones del formulario "
				+ "Incluya Lo Siguiente");
		cdt2.setBounds(0,-50,400,150);
		add(cdt2);
		
		//ChackBox 1
		JCheckBox Chb1 = new JCheckBox("Un poco sobre ti");
		Chb1.setBounds(0,50,150,20);
		add(Chb1);
		
		//Cuadro de llenado 1
		JTextArea Cdll1 = new JTextArea("Suscribase a nuestra lista de correo");
		Cdll1.setBounds(0,70,225,25);
		add(Cdll1);
		
		//Select button 1
        ButtonGroup bg = new ButtonGroup();
		
		JRadioButton Selectb1 = new JRadioButton("Solo Campos Obligatorios");
		bg.add(Selectb1);
		Selectb1.setBounds(0,100,175,25);
		add(Selectb1);
		
		//Select Button 2
		JRadioButton Selectb2 = new JRadioButton("Todos Los Campos");
		bg.add(Selectb2);
		Selectb2.setBounds(0,125,150,25);
		add(Selectb2);
		
		//Cuadro de texto 3
		JLabel cdt3 =new JLabel("(Editar Campos Oblgaorios en el generagor de formularios)");
		cdt3.setBounds(0,150,335,25);
		add(cdt3);
		
		//Check box 2
		JCheckBox Chb2 = new JCheckBox("Grupo De Campos De Interes");
		Chb2.setBounds(0,180,300,20);
		add(Chb2);
		
		//Check Box 3
		JCheckBox Chb3 = new JCheckBox("Indicador De Campos Obligatorios");
		Chb3.setBounds(0,200,300,20);
		add(Chb3);
		
		//Cuadro de texto 4
		JLabel cdt4 =new JLabel("Establecer ancho de formulario");
		cdt4.setBounds(0,230,300,20);
		add(cdt4);
		
		//Cuadro de llenado 2
		JTextArea Cdll2 = new JTextArea("");
		Cdll2.setBounds(0,245,225,25);
		add(Cdll2);
		
		//Cuadro  de texto 5
		JLabel cdt5 =new JLabel("Mejora La Forma De El Formulario");
		cdt5.setBounds(0,275,300,20);
		add(cdt5);
		
		//Check Box 4
		JCheckBox Chb4 = new JCheckBox("Habilite el Modo de emergencia");
		Chb4.setBounds(0,300,300,20);
		add(Chb4);
		
		//Check Box 5
		JCheckBox Chb5 = new JCheckBox("Desavilita Todo Java Script");
		Chb5.setBounds(0,320,300,20);
		add(Chb5);
		
		//Check box 6
		JCheckBox Chb6 = new JCheckBox("Incluir Links De Archivo");
		Chb6.setBounds(0,340,300,20);
		add(Chb6);
		
		//Check box 7
		JCheckBox Chb7 = new JCheckBox("Incluye Mankey Reguard Link");
		Chb7.setBounds(0,360,300,20);
		add(Chb7);
		
		//Cuadro de texto 6
		JLabel cdt6 =new JLabel("Preview");
		cdt6.setBounds(500,0,300,20);
		add(cdt6);
		
		//Cuadro de texto 7
		JLabel cdt7 =new JLabel("Direccion De Correo");
		cdt7.setBounds(500,20,300,20);
		add(cdt7);
		
		
		//Cuadro De Llenado 3
		JFormattedTextField cdll3 = new JFormattedTextField("");
		cdll3.setBounds(500,40,300,25);
		add(cdll3);
		
		
		//Cuadro de texto  8
		JLabel cdt8 =new JLabel("Primer Nombre");
		cdt8.setBounds(500,60,300,20);
		add(cdt8);
		
		//Cuadro De Llenado 4
		JTextArea Cdll4 = new JTextArea("");
		Cdll4.setBounds(500,80,300,25);
		add(Cdll4);
		
		//Cuadro De Texto 9
		JLabel cdt9 =new JLabel("Ultimo Nombre");
		cdt9.setBounds(500,100,300,20);
		add(cdt9);
		
		//Cuadro De Llenado 5
		JTextArea Cdll5 = new JTextArea("");
		Cdll5.setBounds(500,120,300,25);
		add(Cdll5);
		
		//Cuadro de texto 10
		JLabel cdt10 =new JLabel("Copia Y Pega Tus Links De Sitio Web");
		cdt10.setBounds(500,160,300,20);
		add(cdt10);
		
		//Cuadro De Llenado 6
		JTextArea Cdll6 = new JTextArea("");
		Cdll6.setBounds(500,180,500,400);
		add(Cdll6);
		
		//Boton de sub
		ImageIcon iconobtn = new ImageIcon("src/Imagenes/Boton.png");
		
		
		setVisible(true);
		
		
	}
	
}
public class FormularioPrueba {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new LayoutNulo();
			}
			
		});
	}

}



