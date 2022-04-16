package graphes;

import java.util.ArrayList;

public class GrapheLA implements IGraph{
	private ArrayList<Integer>[] liste;
	
	@SuppressWarnings("unchecked")
	public GrapheLA(int nb_noeuds) {
		liste = new ArrayList[nb_noeuds];
		
		for (int i = 0; i < nb_noeuds; ++i)
			liste[i] = new ArrayList<Integer>();
	}

	public int getNbNoeuds() {
		return liste.length;
	}

	public void ajouterArc(int i, int j) {
		liste[i-1].add(j);
	}

	public boolean aArc(int i, int j) {
		return liste[i-1].contains(j);
	}

	public int dOut(int i) {
		return liste[i-1].size();
	}

	public int dIn(int i) {
		int cpt = 0;
		for (ArrayList<Integer> ar : liste)
			if (ar.contains(i))
				++cpt;
			
		return cpt;
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		
		Integer i = 1;
		for (ArrayList<Integer> succ : liste) {
			s.append( i.toString() + " -> ");
			for (Integer noeud : succ)
				s.append(noeud.toString() + " ");
			s.append("\n");
			++i;
		}
		
		return s.toString();
	}
}
