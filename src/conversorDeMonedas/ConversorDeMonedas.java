package conversorDeMonedas;

import javax.swing.JOptionPane;

public class ConversorDeMonedas {
	
	public void ConvertirPesosArgentinosADolares(double valor) {
		 double monedaDolar = valor / 275;
		 monedaDolar = (double) Math.round(monedaDolar * 100) / 100;
		 JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + "Dolares");
	}
	
	public void ConvertirPesosArgentinosAEuros(double valor) {
		 double monedaEuro = valor / 272;
		 monedaEuro = (double) Math.round(monedaEuro * 100) / 100;
		 JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + "Euros");
	}
	
	public void ConvertirPesosArgentinosALibras(double valor) {
		 double monedaLibra = valor / 313;
		 monedaLibra = (double) Math.round(monedaLibra * 100) / 100;
		 JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + "Libras");
	}
	
	public void ConvertirPesosArgentinosAYenes(double valor) {
		 double monedaYen = valor / 1.90;
		 monedaYen = (double) Math.round(monedaYen * 100) / 100;
		 JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + "Yenes");
	}
	
	public void ConvertirPesosArgentinosAWones(double valor) {
		 double monedaWon = valor / 0.20;
		 monedaWon = (double) Math.round(monedaWon * 100) / 100;
		 JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + "Wones");
	}
	
	public void ConvertirDolaresAPesosArgentinos(double valor) {
		 double monedaPeso = valor * 273.72;
		 monedaPeso = (double) Math.round(monedaPeso * 100) / 100;
		 JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPeso + "Pesos");
	}
	
	public void ConvertirEurosAPesosArgentinos(double valor) {
		 double monedaPeso = valor * 272.25;
		 monedaPeso = (double) Math.round(monedaPeso * 100) / 100;
		 JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPeso + "Pesos");
	}
	
	public void ConvertirLibrasAPesosArgentinos(double valor) {
		 double monedaPeso = valor * 313.68;
		 monedaPeso = (double) Math.round(monedaPeso * 100) / 100;
		 JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPeso + "Pesos");
	}
	
	public void ConvertirYenesAPesosArgentinos(double valor) {
		 double monedaPeso = valor * 313.68;
		 monedaPeso = (double) Math.round(monedaPeso * 100) / 100;
		 JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPeso + "Pesos");
	}
	
	public void ConvertirWonesAPesosArgentinos(double valor) {
		 double monedaPeso = valor * 0.20;
		 monedaPeso = (double) Math.round(monedaPeso * 100) / 100;
		 JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPeso + "Pesos");
	}
}
