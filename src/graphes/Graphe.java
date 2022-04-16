package graphes;

import java.util.ArrayList;

public class Graphe {
	private ArrayList<Integer> graph; 
	
	public Graphe(int nb_noeuds) {
		graph = new ArrayList<>();
		
		graph.add(nb_noeuds);
		
		for (int i = 0; i < nb_noeuds; ++i)
			graph.add(0); 
		// On initialise tout nos noeuds avec un  degrée sortant de 0.
		
	}
	
	public int getNbNoeuds() {
		return graph.get(0);
	}
	
	private int getNodeIndex(int n) {
		assert(n > 0 && n <= getNbNoeuds());
		int i = 1;
		
		for (int cpt = 0; cpt < (n-1); ++cpt) {
			i = i + graph.get(i) + 1;
		}
		
		return i;
	}
	
	public void ajouterArc(int parent, int child) {
		int origin_indx = getNodeIndex(parent);
		int arrivee_indx = origin_indx + 
					graph.get(origin_indx) + 1;
		graph.add(arrivee_indx, child);
		
		graph.set(origin_indx, graph.get(origin_indx)+1);
	}
	
	public boolean aArc(int parent, int child) {
		int origin_index = getNodeIndex(parent);
		
		for (int i = origin_index + 1; 
				i <= origin_index + graph.get(origin_index); ++i)
			if (graph.get(i) == child)
				return true;
		
		return false;
	}
	
	public int dOut(int noeud) {
		return graph.get(getNodeIndex(noeud));
	}
	
	// Complexité spaciale 2n et temporelle de n+k
	// mais on évite d'avoir une complexité 
	// temporelle n * k avec k, nombre de noeuds.  
	public int dIn(int noeud) {
		ArrayList<Integer> successeurs = new ArrayList<>(graph);

		for (int i = 1; i <= graph.get(0); ++i)
			successeurs.set(getNodeIndex(i), -1);
		
		successeurs.remove(0);
		
		int cpt = 0;
		for (int i = 0; i < successeurs.size(); ++i)
			if (successeurs.get(i) == noeud)
				++cpt;
		
		return cpt;
			
	}
	
}
