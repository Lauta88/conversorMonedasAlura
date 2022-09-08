package conversorTemperatura;

import javax.swing.JOptionPane;

public class OpcionesConversionTemperatura {
	ConversorDeTemperatura grados = new ConversorDeTemperatura();
	
	public void ConvertirGrados(double valor) {
		String opcion = (JOptionPane.showInputDialog(null, "Elije entre que sistemas de temperaturas deseas convertir", "Grados",
			JOptionPane.PLAIN_MESSAGE, null, new Object[]
			{"De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Fahrenheit a Celsius", "De Kelvin a Celsius"},
			"Seleccion"	)).toString();
		switch(opcion) {
		case "De Celsius a Fahrenheit": 
			grados.ConvertirCelsiusAFahrenheit(valor);
			break;
		case "De Celsius a Kelvin": 
			grados.ConvertirCelsiusAKelvin(valor);
			break;	
		case "De Fahrenheit a Celsius":
			grados.ConvertirFahrenheitACelsius(valor);
			break;	
		case  "De Kelvin a Celsius":
			grados.ConvertirKelvinACelsius(valor);
			break;

		}
	}
}
