package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import graphes.GrapheMA;
import graphes.PCCDijkstra;

class DijskstraTest {
	
	private final int NB_NOEUDS_3_1 = 9;
	private final int NB_NOEUDS_3_2 = 10;
	@Test
	void exerice3_1() {
		GrapheMA g = new GrapheMA(NB_NOEUDS_3_1);
		PCCDijkstra pcc = new PCCDijkstra();
		
		String[] corrigee= new String[NB_NOEUDS_3_1];
				
		corrigee[0]="";
		corrigee[1]="";
		corrigee[2]="";
		corrigee[3]="";
		corrigee[4]="";
		corrigee[5]="";
		corrigee[6]="";
		corrigee[7]="";
		corrigee[8]="";
		
		g.ajouterArc(1,3,2);
		g.ajouterArc(1,4,1);
		g.ajouterArc(4,3,5);
		g.ajouterArc(4,5,3);
		g.ajouterArc(5,3,1);
		g.ajouterArc(4,2,3);
		g.ajouterArc(2,7,3);
		g.ajouterArc(7,2,2);
		g.ajouterArc(5,7,3);
		g.ajouterArc(5,8,7);
		g.ajouterArc(8,7,2);
		g.ajouterArc(7,6,1);
		g.ajouterArc(9,8,10);
		
		
		for (int i=0; i<NB_NOEUDS_3_1; ++i)
		{
			assertEquals(corrigee[i], pcc.plusCourtChemin(g, 0, i));
		}
	}
		
	@Test
	void exerice3_2() {
		GrapheMA g = new GrapheMA(NB_NOEUDS_3_1);
		PCCDijkstra pcc = new PCCDijkstra();

		String[] corrigee= new String[NB_NOEUDS_3_1];

		corrigee[0]="";
		corrigee[1]="";
		corrigee[2]="";
		corrigee[3]="";
		corrigee[4]="";
		corrigee[5]="";
		corrigee[6]="";
		corrigee[7]="";
		corrigee[8]="";

		g.ajouterArc(1,2,8);
		g.ajouterArc(1,4,1);
		g.ajouterArc(4,3,5);
		g.ajouterArc(4,5,3);
		g.ajouterArc(5,3,1);
		g.ajouterArc(4,2,3);
		g.ajouterArc(2,7,3);
		g.ajouterArc(7,2,2);
		g.ajouterArc(5,7,3);
		g.ajouterArc(5,8,7);
		g.ajouterArc(8,7,2);
		g.ajouterArc(7,6,1);
		g.ajouterArc(9,8,10);


		for (int i=0; i<NB_NOEUDS_3_1; ++i)
		{
			assertEquals(corrigee[i], pcc.plusCourtChemin(g, 0, i));
		}
	}

}
