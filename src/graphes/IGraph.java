package graphes;

public interface IGraph {
	
	/* @brief donne le nombre de noeuds dans un graphe
	 * @returns le nb de noeuds
	 */
	int getNbNoeuds();

	/* @brief ajoute un arc d'un arc vers un autre arc
	 * @param[in] i l'arc d'origine de l'arc
	 * @param[in] j l'arc d'arivée de l'arc
	 * @pre i et j sont des noeuds du graphe
	 */
	void ajouterArc(int i, int j);

	/* @brief indique si un arc existe d'un noeud vers un autre
	 * @param[in] i l'arc d'origine de l'arc
	 * @param[in] j l'arc d'arivée de l'arc
	 * @returns si l'arc existe
	 * @pre i et j sont des noeuds du graphe
	 */
	boolean aArc(int i, int j);

	/* @brief donne le degrée sortant d'un noeud
	 * @param[in] i le noeud
	 * @returns le degrée sortant/le nombre de succésseurs
	 */
	int dOut(int i);
	
	/* @brief donne le degrée entrant d'un noued
	 * @param[in] i le noeud
	 * @returns le degrée entrant/le nombre de prédécesseurs
	 */
	int dIn(int i);

	/* @brief indique si un graphe a des poids lié à ses arcs 
	 * @returns si le graphe est pondéré
	 */
	boolean estPondere();

	/* @brief donne le poid d'un arc 
	 * @param[in] i,j les noeuds d'origine et de destination
	 * @returns le poid 
	 */
	int ArcPoid(int i, int j);

	@Override
	String toString();
	
}
