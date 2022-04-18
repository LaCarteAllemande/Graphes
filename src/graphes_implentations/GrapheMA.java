package graphes_implentations;

import graphes.IGraph;

public class GrapheMA implements IGraph{

	private boolean[][] matriceAdjacence;
	
	
	public GrapheMA(int nb_noeuds) {
		matriceAdjacence = new boolean[nb_noeuds][nb_noeuds];
		
		
	}

	public int getNbNoeuds() {
		return matriceAdjacence.length;
	}

	public void ajouterArc(int i, int j) {
		matriceAdjacence[i-1][j-1]=true;

	}

	public boolean aArc(int i, int j) {
		return matriceAdjacence[i-1][j-1];
	}

	public int dOut(int i) {
		int cpt = 0;
		for (boolean b : matriceAdjacence[i-1])
			if (b)
				++cpt;	
		return cpt;
	}

	public int dIn(int i) {
		int cpt = 0;
		for (boolean[] b : matriceAdjacence)
			if (b[i-1])
				++cpt;	
		return cpt;
	}
	
	
	@Override
	public String toString()
	{
		StringBuilder s = new StringBuilder();
		for (boolean[] b : matriceAdjacence)
		{
			for (boolean c : b)
			{
				if(c)
					s.append(1);
				else
					s.append(0);
				
				s.append(" ");
			}
			
			s.append("\n");
		}
		return s.toString();
	}
}
