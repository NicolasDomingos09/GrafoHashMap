package model.estrutura.grafo;

import java.util.*;

public class Grafo<T> {
	
	private HashMap<T, ArrayList<T>> vertices = new HashMap<>();
	
	public void add(T novo) {
		vertices.put(novo, new ArrayList<>());
	}
	
	public void link(T origem, T destino) {
		if(!getVertices().containsKey(origem))
			add(origem);
		if(!getVertices().containsKey(destino))
			add(destino);
		
		getVertices().get(origem).add(destino);
		getVertices().get(destino).add(origem);
	}
	
	public void removeKey(T key) {
		getVertices().remove(key);
	}
	
	public void removeLink(T origem, T destino) {
		getVertices().get(origem).remove(destino);
	}
	
	public HashMap<T, ArrayList<T>> getVertices(){
		return vertices;
	}
	
	public void visualizar() {
		for(T pessoa : getVertices().keySet()) {
			System.out.println(pessoa + ": " + getVertices().get(pessoa));
		}
	}
}
