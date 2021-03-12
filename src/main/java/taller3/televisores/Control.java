package taller3.televisores;

public class Control {
	
	// ATRIBUTOS
	// De instancia
	private TV tv;
	
	// MÉTODOS
	// Getters y Setters
	public TV getTv() {
		return tv;
	}

	public void setTv(TV tv) {
		this.tv = tv;
	}
	
	// enlazar
	public void enlazar(TV tv) {
		this.tv = tv;
		tv.setControl(this);
	}
	
	// turnOn
	public void turnOn() {
		tv.turnON();
	}
	
	// turnOff
	public void turnOff() {
		tv.turnOff();
	}
	
	// canalUp
	public void canalUp() {
		tv.canalUp();
	}

	// canalDown
	public void canalDown() {
		tv.canalDown();
	}

	// volumenUp
	public void volumenUp() {
		tv.volumenUp();
	}

	// volumenDown
	public void volumenDown() {
		tv.volumenDown();
	}

	// setCanal
	public void setCanal(int canal) {
		if (1 <= canal && canal <= 120) {
			tv.setCanal(canal);
		}
	}
}











