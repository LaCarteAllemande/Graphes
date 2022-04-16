package graphes;

public interface IGraph {
	public int getNbNoeuds();

	public void ajouterArc(int i, int j);

	public boolean aArc(int i, int j);

	public int dOut(int i);

	public int dIn(int i);
	
	// toString
}
