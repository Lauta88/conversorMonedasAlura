package principal;

import javax.swing.JOptionPane;

import conversorDeMonedas.OpcionesConversion;
import conversorTemperatura.OpcionesConversionTemperatura;

public class Principal {
	
	public static void main(String[] args) {
		
		OpcionesConversion conversion = new OpcionesConversion();
		OpcionesConversionTemperatura conversionGrados = new OpcionesConversionTemperatura();
		
		while(true) {
			String opciones = JOptionPane.showInputDialog(null, "Seleccione una opción de conversion", "Menú", JOptionPane.PLAIN_MESSAGE, null, 
					new Object[] {"Conversor de Monedas", "Conversor de Temperatura"}, "Elegir").toString();
			switch (opciones) {
			case "Conversor de Monedas":
				String input = JOptionPane.showInputDialog(null, "Ingrese un valor");
				double valorRecibido = Double.parseDouble(input);
				conversion.ConvertirMonedas(valorRecibido);
				
				int respuesta=JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
				if(JOptionPane.OK_OPTION == respuesta) {
					System.out.println("Selecciona opción Afirmativa");
				} else {
					JOptionPane.showMessageDialog(null, "Programa Terminado");
					System.exit(0);
				}
				
				break;
			
			case "Conversor de Temperatura":
				String input2 = JOptionPane.showInputDialog(null, "Ingrese un valor");
				double valorRecibido2 = Double.parseDouble(input2);
				conversionGrados.ConvertirGrados(valorRecibido2);	
				
				
				int respuesta2=JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
				if(JOptionPane.OK_OPTION == respuesta2) {
					System.out.println("Selecciona opción Afirmativa");
				} else {
					JOptionPane.showMessageDialog(null, "Programa Terminado");
					System.exit(0);
				}
				
				break;

			}
		
		}
		
	}

}
