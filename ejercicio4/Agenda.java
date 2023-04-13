import java.util.ArrayList;

public class Agenda{
	private ArrayList<Tarea> f1 = new ArrayList<Tarea>();
	
	public Agenda() {
		super();
	}
	
	public void add(Tarea W1) {
		f1.add(W1);
	}

	public ArrayList<Tarea> getF1() {
		return f1;
	}

	public void setF1(ArrayList<Tarea> f1) {
		this.f1 = f1;
	}

	int buscar(Agenda arr, int lo, int hi, int x) {
		 if (hi >= lo && lo < arr.getF1().size()) {
			 int mid = lo + (hi - lo) / 2;
			 if (arr.getF1().get(mid).getCodigo() == x)
				 return mid;
			 if (arr.getF1().get(mid).getCodigo() > x )
				 return buscar(arr, lo, mid - 1, x);
			 return buscar(arr, mid + 1, hi, x);
		 }
		 return -1;
	}
	
	@Override
	public String toString() {
		String s = String.format("%-8s\t%-12s\t%-30s","Codigo","Titulo","Descripcion")+"\n";
		for (int i = 0; i < f1.size(); i++) {
            if (f1 != null) {
            	s += String.format("%-8d\t%-12s\t%-30s",f1.get(i).getCodigo(),
            			f1.get(i).getTitulo(),f1.get(i).getDescripcion())+"\n";
            } 
        }
		return s;
	}
}
