package conversorTemperatura;

import javax.swing.JOptionPane;

public class ConversorDeTemperatura {
	
	public void ConvertirCelsiusAFahrenheit(double valor) {
		 double gradoFahrenheit = (valor * 9/5) + 32;
		 gradoFahrenheit = (double) Math.round(gradoFahrenheit * 100) / 100;
		 JOptionPane.showMessageDialog(null, "Es igual a " + gradoFahrenheit + " grados Fahrenheit");
	}
	
	public void ConvertirCelsiusAKelvin(double valor) {
		 double gradoKelvin = valor + 273.15;
		 gradoKelvin = (double) Math.round(gradoKelvin * 100) / 100;
		 JOptionPane.showMessageDialog(null, "Es igual a " + gradoKelvin + " grados Kelvin");
	}
	
	public void ConvertirFahrenheitACelsius(double valor) {
		 double gradoCelsius = (valor - 32) * 5/9;
		 gradoCelsius = (double) Math.round(gradoCelsius * 100) / 100;
		 JOptionPane.showMessageDialog(null, "Es igual a " + gradoCelsius + " grados Celsius");
	}
	
	public void ConvertirKelvinACelsius(double valor) {
		 double gradoCelsius = valor - 273.15 ;
		 gradoCelsius = (double) Math.round(gradoCelsius * 100) / 100;
		 JOptionPane.showMessageDialog(null, "Es igual a " + gradoCelsius + " grados Celsius");
	}

}
