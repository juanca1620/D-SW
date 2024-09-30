package Verificator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReporteVerificator {
	
	public static boolean validadrStringFecha (String fecha) {
		String regex = "^\\d{2}-(0[1-9]|1[0-2])-(19|20)\\d{2}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(fecha);
		return matcher.matches();
	}
	
	public boolean isCantidadHuevosValida (int cantidadHuevos) {
		return cantidadHuevos > 0;
	}
}
