package dojo;

import java.util.ArrayList;
import java.util.List;

public class PaginationHelper<T> {

	private List<List<T>> paginas;
	
	private List<T> itens;
	private int totalPorPagina;

	public PaginationHelper(List<T> itens, int totalPorPagina) {
		this.paginas = new ArrayList<List<T>>();
		
		List<T> itensPagina = new ArrayList<T>();
		
		for (T item : itens) {
			if(itensPagina.size() == totalPorPagina){
				paginas.add(itensPagina);
				itensPagina = new ArrayList<T>();
			} else {
				itensPagina.add(item);
			}
		}
		if (!itensPagina.isEmpty())
			paginas.add(itensPagina);
		
		this.itens = itens;
		this.totalPorPagina = totalPorPagina;
	}

	public int pageCount() {
		return paginas.size();
	}

	public int itemCount() {
		return itens.size();
	}
	
	public int pageItemCount(int pagina) {
		return paginas.get(pagina).size();
	}
	
	public int pageIndex(int index) {
		if (index >= 0 && index <= itemCount())
			return index / totalPorPagina;
		else
			return -1;
	}
	
}
