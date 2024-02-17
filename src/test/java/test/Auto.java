package test;

public class Auto {
	String modelo, marca;
	int precio, registro, cantidadCreados;
	Asiento[] asientos;
	Motor motor;
	
	int cantidadAsientos() {
		int k = 0;
		for (int i = 0;i < this.asientos.length;i++) {
			if (this.asientos[i] != null) {
				k++;
			}
		}
		return k;
	}
	String verficarIntegridad() {
		boolean j;
		for (int i = 0;i < this.asientos.length; i++) {
			if (this.asientos[i] != null) {
				if ((this.asientos[i].registro == this.registro)&&(this.asientos[i].registro == this.motor.registro)) {
					j = true;
				}
				else {
					j = false;
				}
			}
		}
		if ((this.registro != this.motor.registro)||(j == false)) {
			return "Las piezas no son originales";
		}
		else {
			return "Auto original";
		}
	}
}
