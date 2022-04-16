package graphes;

public class GrapheMA implements IGraph{
	private boolean[][] ma;

	public GrapheMA(int nbNoeuds) {
		ma = new boolean[nbNoeuds][nbNoeuds];
	}
	
	public int getNbNoeuds() { return ma.length; }
	
	public boolean estNoeudOK(int n) {
		return n >= 1 && n <= getNbNoeuds();
	}
	
	public boolean estArcOK(int a, int b) {
		return estNoeudOK(a) && estNoeudOK(b);
	}
	


	public void ajouterArc(int a, int b) {
		assert estArcOK(a,b);
		assert !ma[a-1][b-1];
		ma[a-1][b-1] = true;
	}
	
	@Override
	public String toString() {
		String s = "";
		for (int i = 1; i <= getNbNoeuds(); ++i) {
			for (int j = 1; j<= getNbNoeuds(); ++j)
				s += valeur(i,j) + " ";
			s+="\n";
		}
		return s;
	}

	public boolean aArc(int a, int b) {
		assert estArcOK(a,b);
		assert estNoeudOK(b);
		return ma[a-1][b-1];
	}
	
	private int valeur(int a, int b) {
		assert estArcOK(a,b);
		return (aArc(a,b))? 1 : 0;
	}

	public int dOut(int n) {
		assert estNoeudOK(n);
		int d = 0;
		for (int i = 1; i <= getNbNoeuds(); ++i)
			if (ma[n-1][i-1])
				++d;
		return d;
	}

	pu	blic int dIn(int n) {
		assert estNoeudOK(n);
		int d = 0;
		for (int i = 1; i <= getNbNoeuds(); ++i)
			if (ma[i-1][n-1])
				++d;
		return d;
	}
}
