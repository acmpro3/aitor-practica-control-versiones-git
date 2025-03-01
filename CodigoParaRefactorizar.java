public class CodigoParaRefactorizar {

	public double calculoIva(double precioBase, double porcentajeIva) {
		return precioBase + (precioBase * porcentajeIva / 100);
	}

	public double calculoIvaConDescuento(double precioBase, double porcentajeIva, double porcentajeDescuento) {
		double precioConIva = calculoIva(precioBase, porcentajeIva);
		return precioConIva - (precioConIva * porcentajeDescuento / 100);
	}

	public int diasMes(int mes, int anio) {
		int[] dias31 = {1, 3, 5, 7, 8, 10, 12};
		for (int i = 0; i < dias31.length; i++) {
			if (mes == dias31[i]) return 31;
		}
		if (mes == 2) {
			if ((anio % 400 == 0) || ((anio % 4 == 0) && (anio % 100 != 0))) {
				return 29;
			} else {
				return 28;
			}
		}
		return 30;
	}

	public double subidaPrecio(double precioBase, double subida) {
		precioBase = precioBase + subida;
		double precioConIVA = calculoIva(precioBase, 21);
		return precioConIVA;
	}

	public void mostrarPrecios(double precioBase, double precioConIVA) {
		System.out.println("El nuevo precio base es " + precioBase);
		System.out.println("El precio con IVA es " + precioConIVA);
	}
}