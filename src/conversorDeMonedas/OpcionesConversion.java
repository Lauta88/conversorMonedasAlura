package conversorDeMonedas;

import javax.swing.JOptionPane;

public class OpcionesConversion {
	ConversorDeMonedas monedas = new ConversorDeMonedas();
	
	public void ConvertirMonedas(double valor) {
		String opcion = (JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero", "Monedas",
			JOptionPane.PLAIN_MESSAGE, null, new Object[]
			{"De Pesos a Dolar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen", "De Pesos a Won Coreano", "De Dolar a Peso", "De Euro a Peso", "De Libra a Pesos", "De Yen a Pesos", "De Won Coreano a Pesos"},
			"Seleccion"	)).toString();
		switch(opcion) {
		case "De Pesos a Dolar": 
			monedas.ConvertirPesosArgentinosADolares(valor);
			break;
		case "De Pesos a Euro": 
			monedas.ConvertirPesosArgentinosAEuros(valor);
			break;	
		case "De Pesos a Libras":
			monedas.ConvertirPesosArgentinosALibras(valor);
			break;	
		case  "De Pesos a Yen":
			monedas.ConvertirPesosArgentinosAYenes(valor);
			break;
		case "De Pesos a Won Coreano":
			monedas.ConvertirPesosArgentinosAWones(valor);
			break;
		case "De Dolar a Peso":{
			monedas.ConvertirDolaresAPesosArgentinos(valor);
			break;
			}
		case "De Euro a Peso":
			monedas.ConvertirEurosAPesosArgentinos(valor);
			break;
		case "De Libra a Pesos":{
			monedas.ConvertirLibrasAPesosArgentinos(valor);
			break;
			}
		case  "De Yen a Pesos":
			monedas.ConvertirYenesAPesosArgentinos(valor);
			break;
		case "De Won Coreano a Pesos":
			monedas.ConvertirWonesAPesosArgentinos(valor);
			break;
		}
	}
	
}
