package controller;

import model.estrutura.grafo.Grafo;

public class GrafoController<T> {
	
	private Grafo<String> grafo = new Grafo<>();
	
	public void teste() {
		
		grafo.link("Nicolas", "Julia");
		grafo.link("Nicolas", "Cida");
		grafo.link("Nicolas", "Thasciane");
		grafo.link("Nicolas", "Erika");
		grafo.link("Thasciane", "Erika");
		grafo.link("Thasciane", "Cida");
		grafo.link("Thasciane", "Julia");
		grafo.link("Julia", "Cida");
		grafo.link("Julia", "Erika");
		grafo.link("Cida", "Erika");
		
		grafo.visualizar();
	}
}