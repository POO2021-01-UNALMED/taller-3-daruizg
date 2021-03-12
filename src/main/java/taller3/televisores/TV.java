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
	
	// .:MÉTODOS:.
	// CONSTRUCTOR
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		numTV ++;
	}
	
	// GETTERS Y SETTERS
	// control
	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}
	
	// numTV
	public static int getNumTV() {
		return numTV;
	}

	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
	
	// marca
	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	// canal
	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		if ((estado) && (1 <= canal && canal <= 120)) {
			this.canal = canal;
		}
	}
	
	// precio
	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	// volumen
	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		if ((estado) && (0 <= volumen && volumen <= 7)) {
			this.volumen = volumen;
		}
	}
	
	// estado
	public boolean getEstado() {
		return estado;
	}
	
	// OTROS MÉTODOS
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
		if (estado && volumen >= 0) {
			volumen --;
		}
	}
}































