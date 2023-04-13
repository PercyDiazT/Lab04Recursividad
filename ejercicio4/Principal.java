import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Agenda arr = new Agenda();
		interfaz(arr);
		/*Scanner obj  = new Scanner(System.in);
		Tarea a = new Tarea();
		a.ingresar();
		arr.add(a);
		int position = arr.buscar(arr, 0, arr.getF1().size(), a.getCodigo());
		System.out.println(position);
		if(position != -1) {
			System.out.println(arr.getF1().get(position).toString());
			System.out.println("Tarea eliminada");
		}
		else
			System.out.println("Tarea no encontrada");*/
		
		
	 }
	public static void interfaz(Agenda arr) {
		System.out.println("Bievenido a su agenda personal\n"
				+ "1. Agregar tarea\n2. Ver todas las tareas\n3. Eliminar tarea\n4. Buscar tarea\n5. Salir");
		int cont = 1;
		while(cont !=0) {
			System.out.println("Dame una opcion: ");
			Scanner obj  = new Scanner(System.in);
			int opc = obj.nextInt();
			switch(opc) {
				case 1:
					Tarea a = new Tarea();
					a.ingresar();
					arr.add(a);
					break;
				case 2:
					System.out.println(arr.toString());
					break;
				case 3:
					System.out.println("Introduce el codigo de la tarea a eliminar: ");
					int cod = obj.nextInt();
					int position = arr.buscar(arr, 0, arr.getF1().size(), cod);
					if(position != -1) {
						System.out.println(arr.getF1().get(position).toString());
						arr.getF1().remove(position);
						System.out.println("Tarea eliminada");
					}
					break;
				case 4:
					System.out.println("Introduce el codigo de la tarea a buscar: ");
					int cod2 = obj.nextInt();
					int position2 = arr.buscar(arr, 0, arr.getF1().size(), cod2);
					if(position2 != -1) {
						System.out.println(arr.getF1().get(position2).toString());
					}
					else
						System.out.println("Tarea no encontrada");
					break;
				case 5:
					cont = 0;
					break;
			}
		}
	}
}
