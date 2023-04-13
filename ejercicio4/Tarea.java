import java.util.Scanner;

public class Tarea {
	private String titulo;
	private int codigo;
	private String descripcion;
	
	public Tarea() {
		super();
	}
	
	public void ingresar() {
		Scanner obj  = new Scanner(System.in);
		System.out.println("Ingresa el titulo: ");
		String ti = obj.nextLine();
		System.out.println("Ingresa la descripcion: ");
		String des = obj.nextLine();
		System.out.println("Ingresa el codigo: ");
		int pri = obj.nextInt();
		setTitulo(ti);
		setDescripcion(des);
		setCodigo(pri);
	}

	public String getTitulo() {
		return titulo;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setCodigo(int prioridad) {
		this.codigo = prioridad;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

	@Override
	public String toString() {
		return "Tarea:\nTitulo: " + this.titulo + "\nCodigo: " + this.codigo + "\nDescripcion: " + this.descripcion;
	}
}
