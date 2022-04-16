package graphes;

import java.util.List;

public interface PCC {
	public boolean estOK(IGraph g);
	public List<Integer> plusCourtChemin(IGraph g, int noeudA, int noeudB);
	
}
