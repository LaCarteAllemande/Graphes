package graphes;

import java.util.ArrayList;

public class GrapheLA {
	private ArrayList<ArrayList<Integer>> la;
	
	public GrapheLA(int nbNoeuds) {
		la = new ArrayList<>();
		for (int i = 0; i < nbNoeuds; ++i)
			la.add(new ArrayList<>());
	}

	public int getNbNoeuds() {
		return la.size();
	}
	
	public boolean estArcOK(int a, int b) {
		return estNoeudOK(a) && estNoeudOK(b);
	}
	
	public boolean estNoeudOK(int n) {
		return n >= 1 && n <= getNbNoeuds();
	}

	public void ajouterArc(int a, int b) {
		assert ! aArc(a,b);
		la.get(a-1).add(b);
	}

	public boolean aArc(int a, int b) {
		assert estArcOK(a,b);
		return la.get(a-1).contains(b);
	}
	
	@Override
	public String toString() {
		String s = "";
		for(int i = 0; i< la.size(); ++i) {
			s+= (i+1) + " -> ";
			for (Integer j : la.get(i)) 
				s+= j + " ";
			s+="\n";
		}
		return s;
	}

	public int dOut(int n) {
		assert estNoeudOK(n);
		return la.get(n-1).size();
	}

	public int dIn(int n) {
		assert estNoeudOK(n);
		int d = 0;
		for(int i = 0; i< la.size(); ++i)
			if (la.get(i).contains(n))
				++d;
		return d;
	}
}
