package graphes;

import java.util.List;

public interface IPCC {
	public boolean estOK(IGraph g);
	public List<Integer> plusCourtChemin(IGraph g, int noeudA, int noeudB); //nul a chier
	
}
