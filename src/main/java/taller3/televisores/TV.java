package taller3.televisores;


public class TV {
	
	// ATRIBUTOS
	// De instancia
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private int volumen = 1;
	private Control control;
	private boolean estado;
	
	// De clase
	private static int numTV = 0;
	
	// MÉTODOS
	// Constructor
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		numTV ++;
	}
	
	// Getters y Setters
	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}
	
	public static int getNumTV() {
		return numTV;
	}

	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
	
	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	// turnOn: "Encender TV"
	public void turnON() {
		estado = true;
	}
	
	// turnOff: "Apagar TV"
	public void turnOff() {
		estado = false;
	}
	
	// canalUP
	public void canalUp() {
		if (estado && canal <= 120) {
			canal ++;
		}
	}
	
	// canalDown
	public void canalDown() {
		if (estado && canal >= 1) {
			canal --;
		}
	}
	
	// volumenUp
	public void volumenUp() {
		if (estado && volumen <= 7) {
			volumen ++;
		}
	}
	
	// volumenDown
	public void volumenDown() {
		if (estado && volumen >= 1) {
			volumen --;
		}
	}
}































