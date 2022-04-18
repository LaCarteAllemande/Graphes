package graphes;

import java.util.List;

public interface IPCC {
	boolean estOK(IGraph g);
	
	List<Integer> plusCourtChemin(IGraph g, int noeudA, int noeudB);
	
}
