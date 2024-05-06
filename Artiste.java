package project;

public class Artiste {

//fait par Romano Castro Caio, ?? Mathis, ?? Kamil
public static void main(String[] args) {
	
	//Initialisation des de, pr et po des joueurs
	int D1p1[]= {3,1,0,0,0,0};
	int D2p1[]= new int[12];
	int D3p1[]= new int[12];
	
	
	int D1p2[]= {3,1,0,0,0,0};
	int D2p2[]= new int[12];
	int D3p2[]= new int[12];
	int D1p3[]= {3,1,0,0,0,0};
	int D2p3[]= new int[12];
	int D3p3[]= new int[12];
	
	
	int D1p4[]= {3,1,0,0,0,0};
	int D2p4[]= new int[12];
	int D3p4[]= new int[12];
	
	int PO1=0;
	int PO2=0;
	int PO3=0;
	int PO4=0;
	
	int PR1=0;
	int PR2=0;
	int PR3=0;
	int PR4=0;

	//Variables qui vont prendre le retour des differentes fonctions du jeu et la variable du prix et du joueurs
	int buffer[]= new int[2];
	int eventsBuffer[]=new int [2];
	int price=1;
	int resultsBuffer[] =new int [3];
	int players=0;
	//Loop du debut de la partie
	while(true) {
		if(players==0) {
			System.out.println("Combien de joueurs sont dans la partie (choissisez entre 2 et 4)");
			players=Lire.i();}
		
		//le tableau resultsbuffer prend le retour de la fonction results puis il alterne les valeurs de PO et PR si les conditions ont ete valides
		resultsBuffer=results(D1p1,D2p1,D3p1);
		PO1=PO1+resultsBuffer[1];
		PR1=PR1+resultsBuffer[2];
		if(resultsBuffer[0]==1) {
			System.out.println("Player 1 a entrer dans le shop");
			System.out.println();
			buffer=shop(D1p1,D2p1,D3p1,PO1,price);
			PO1=PO1-buffer[0];
			price=price+buffer[1];
			
		}
		//le tableau events prend le retour de la fonction events puis il alterne les valeurs de PO et PR si les conditions ont ete valides
		eventsBuffer=events(1,PO1,PR1);
		PO1=PO1+eventsBuffer[0];
		PR1=PR1+eventsBuffer[1];
		if (resultsBuffer[1]>0) {
			System.out.println("Player 1 a gagner " +resultsBuffer[1]+"PO");
			System.out.println();
		}
		if (resultsBuffer[2]>0) {
			System.out.println("Player 1 a gagner " +resultsBuffer[2]+"PR");
			System.out.println();
		}
			
		resultsBuffer=results(D1p2,D2p2,D3p2);
		PO2=PO2+resultsBuffer[1];
		PR2=PR2+resultsBuffer[2];
		if(resultsBuffer[0]==1) {
			System.out.println("Player 2 a entrer dans le shop");
			System.out.println();
			buffer=shop(D1p2,D2p2,D3p2,PO2,price);
			PO2=PO2-buffer[0];
			price=price+buffer[1];
		}
		eventsBuffer=events(2,PO2,PR2);
		PO2=PO2+eventsBuffer[0];
		PR2=PR2+eventsBuffer[1];
		if (resultsBuffer[1]>0) {
			System.out.println("Player 2 a gagner " +resultsBuffer[1]+"PO");
			System.out.println();
		}
		if (resultsBuffer[2]>0) {
			System.out.println("Player 2 a gagner " +resultsBuffer[2]+"PR");
			System.out.println();
		}
		
		log(1, PO1, PR1 , D1p1, D2p1, D3p1,2, PO2, PR2, D1p2, D2p2, D3p2);
		
		
		if(players==3) {
			resultsBuffer=results(D1p3,D2p3,D3p3);
			PO3=PO3+resultsBuffer[1];
			PR3=PR3+resultsBuffer[2];
			if(resultsBuffer[0]==1) {
				System.out.println("Player 3 a entrer dans le shop");
				buffer=shop(D1p3,D2p3,D3p3,PO3,price);
				PO3=PO3-buffer[0];
				price=price+buffer[1];
				
			}
			eventsBuffer=events(3,PO3,PR3);
			PO3=PO3+eventsBuffer[0];
			PR3=PR3+eventsBuffer[1];
			if (resultsBuffer[1]>0) {
				System.out.println("Player 3 a gagner " +resultsBuffer[1]+"PO");
				System.out.println();
			}
			if (resultsBuffer[2]>0) {
				System.out.println("Player 3 a gagner " +resultsBuffer[2]+"PR");
				System.out.println();
			}
			log(3, PO3, PR3 , D1p3, D2p3, D3p3,4, PO4, PR4, D1p4, D2p4, D3p4);
		}
		
		if(players>=4) {
			resultsBuffer=results(D1p3,D2p3,D3p3);
			PO3=PO3+resultsBuffer[1];
			PR3=PR3+resultsBuffer[2];
			if(resultsBuffer[0]==1) {
				System.out.println("Player 3 a entrer dans le shop");
				System.out.println();
				buffer=shop(D1p3,D2p3,D3p3,PO3,price);
				PO3=PO3-buffer[0];
				price=price+buffer[1];
				
			}
			eventsBuffer=events(3,PO3,PR3);
			PO3=PO3+eventsBuffer[0];
			PR3=PR3+eventsBuffer[1];
			if (resultsBuffer[1]>0) {
				System.out.println("Player 3 a gagner " +resultsBuffer[1]+"PO");
				System.out.println();
			}
			if (resultsBuffer[2]>0) {
				System.out.println("Player 3 a gagner " +resultsBuffer[2]+"PR");
				System.out.println();
			}
				
			resultsBuffer=results(D1p4,D2p4,D3p4);
			PO4=PO4+resultsBuffer[1];
			PR4=PR4+resultsBuffer[2];
			if(resultsBuffer[0]==1) {
				System.out.println("Player 4 a entrer dans le shop");
				System.out.println();
				buffer=shop(D1p4,D2p4,D3p4,PO4,price);
				PO4=PO4-buffer[0];
				price=price+buffer[1];
			}
			eventsBuffer=events(4,PO4,PR4);
			PO4=PO4+eventsBuffer[0];
			PR4=PR4+eventsBuffer[1];
			if (resultsBuffer[1]>0) {
				System.out.println("Player 4 a gagner " +resultsBuffer[1]+"PO");
				System.out.println();
			}
			if (resultsBuffer[2]>0) {
				System.out.println("Player 4 a gagner " +resultsBuffer[2]+"PR");
				System.out.println();
			}
			log(3, PO3, PR3 , D1p3, D2p3, D3p3,4, PO4, PR4, D1p4, D2p4, D3p4);
			
			
		}
		
		
		if (PR1==20) {
			System.out.println("Le joueur 1 a gagner");
			System.out.println("Le jeu est fini");
			break;
		}
		else if(PR2==20) {
			System.out.println("Le joueur 2 a gagner");
			System.out.println("Le jeu est fini");
			break;
		}
		else if(PR3==20) {
			System.out.println("Le joueur 3 a gagner");
			System.out.println("Le jeu est fini");
			break;
		}
		else if(PR4==20) {
			System.out.println("Le joueur 4 a gagner");
			System.out.println("Le jeu est fini");
			break;
		}
	}
	
}
	//fonction qui compte le numero de faces des de
	public static int checkfaces(int[] D) {
		int i;
		int faces;
		faces=0;
		for(i=0;i<D.length;i++) {	
			if(D[i]!=0 && D[i]!=4) {	
			faces=faces+1;
			}}
		return faces;
	}
	
	
	//roulement des faces d'un des
	public static int roll(int[] D) {
	int faces=checkfaces(D);
	int face = (int) (Math.random() * faces) + 1;
	return D[face-1];
	}
	
	//fonction qui va permetre d'avoir les resultats des PO et des PR et qui permet d'entrer dans le marche
	public static int[] results(int[] D1, int[] D2, int [] D3) {
		int results[]=new int[3];
		int rollBuffer1=roll(D1);
		int rollBuffer2=roll(D3);
		int rollBuffer3=roll(D3);
		if(rollBuffer1==1) {
			//Si le result des dans le index 1 il va modifier les PO du de 1
			results[1]++;
			
		}
		else if(rollBuffer1==3) {
			//permet d'aller dans la fonction Shop
			results[0]=1;
		}
		else if(rollBuffer1==2) {
			//Si le result des dans le index 1 il va modifier les PR du de 1
			results[2]++;
			
		}
		
		if(rollBuffer2==1) {
			//Si le result des dans le index 1 il va modifier les PO du de 2
			results[1]++;
			
		}

		else if(rollBuffer2==2) {
			//Si le result des dans le index 1 il va modifier les PR du de 2
			results[2]++;
			
		}
		
		if(rollBuffer3==1) {
			//Si le result des dans le index 1 il va modifier les PO du de 3
			results[1]++;
			
		
		}
		else if(rollBuffer3==2) {
			//Si le result des dans le index 1 il va modifier les PR du de 3
			results[2]++;
			
		}return results;
	}
		
	//fonction du marche
	public static int[] shop(int[] D1, int[] D2, int [] D3,int PO, int price){
		//Partie du marche qui demande au joueur de selectionner l'action qu'il veut effectuer
		 System.out.println("1.Cout: " + price + "PO : Augmente la valeur de la face \"PO obtenue\" de 1");
	        System.out.println("2.Cout: " + 2*price + "PO : Augmente la valeur de la face \"PR obtenue\" de 1");
	        System.out.println("3.Cout: 10PO : Des supplementaire");
	        System.out.println("4.Pour sortir");
	        System.out.println("PO actuel: " + PO);
	        char input = Lire.c();
	        int input2;
	        int depensesPrice[]= new int [2];
	        
	        switch (input) {
	        
	            case '1':
	                if (PO >= price){
	                   if(checkfaces(D1)<D1.length) {
	                // Fonction qui demande au joueur quel de il souhaite mettre son PO 
	                   System.out.println("Le De 1 a une face de libre, voulez vous ajouter 1 PO ?(O/N) ");}
	                   input2=Lire.c();
	                	if(input2=='O' || input2=='o') {
	                	D1[checkfaces(D1)]=1;   
	                    System.out.println("Vous avez gagner une face de PO");
	                    depensesPrice[0]=depensesPrice[0]+price;
	                	depensesPrice[1]=depensesPrice[1]+price;}
	                	
	                    
	                	else if(input2=='N' || input2=='n') {
	                		if(checkfaces(D2)<D2.length && (D2[0]==4 || D2[0]==1 || D2[0]==2)) {
	    	                System.out.println("Le De 2 a une face de libre, voulez vous ajouter 1 PO ?(O/N) ");}
	                		input2=Lire.c();
	    	                if(input2=='O' || input2=='o') {
	    	                D2[checkfaces(D2)]=1;   
	    	                System.out.println("Vous avez gagner une face de PO");
	    	                depensesPrice[0]=depensesPrice[0]+price;
	    	                depensesPrice[1]=depensesPrice[1]+price;}
	    	                
	    	            else if(input2=='N' || input2=='n') {
		                	if(checkfaces(D3)<D3.length && (D3[0]==4 || D3[0]==1 || D3[0]==2)) {
		    	            System.out.println("Le De 3 a une face de libre, voulez vous ajouter 1 PO ?(O/N) ");}
		                	input2=Lire.c();
		    	            if(input2=='O' || input2=='o') {
		    	            D3[checkfaces(D3)]=1;   
		    	            System.out.println("Vous avez gagner une face de PO");
		    	            depensesPrice[0]=depensesPrice[0]+price;
		    	            depensesPrice[1]=depensesPrice[1]+price;}
	                	}
	                	}
	                }    
	                else{
	                    System.out.println("Il vous manque des fonds pour cela");
	                    shop(D1,D2,D3,PO,price);
	                }
	            break;
	            
	            case '2':
	                if (PO >= (2*price)){
	                	if(checkfaces(D1)<D1.length) {
	                		// Fonction qui demande au joueur quel de il souhaite mettre son PR 
	                		System.out.println("Le De 1 a une face de libre, voulez vous ajouter 1 PR ?(O/N) ");}
		                   input2=Lire.c();
		                	if(input2=='O' || input2=='o') {
		                	D1[checkfaces(D1)]=2;   
		                    System.out.println("Vous avez gagner une face de PR");
		                    depensesPrice[0]=depensesPrice[0]+price;
		                    depensesPrice[1]=depensesPrice[1]+price;}
		                    
		                	else if(input2=='N' || input2=='n') {
		                		if(checkfaces(D2)<D2.length && (D2[0]==4|| D2[0]==1 || D2[0]==2)) {
		    	                System.out.println("Le De 2 a une face de libre, voulez vous ajouter 1 PR ?(O/N) ");}
		                		input2=Lire.c();
		    	                if(input2=='O' || input2=='o') {
		    	                D2[checkfaces(D2)]=2;   
		    	                System.out.println("Vous avez gagner une face de PR");
		    	                depensesPrice[0]=depensesPrice[0]+price;
		    	                depensesPrice[1]=depensesPrice[1]+price;}
		    	                
		    	            else if(input2=='N' || input2=='n') {
			                	if(checkfaces(D3)<D3.length && (D3[0]==4 || D3[0]==1 || D3[0]==2)) {
			    	            System.out.println("Le De 3 a une face de libre, voulez vous ajouter 1 PR ?(O/N) ");}
			                	input2=Lire.c();
			    	            if(input2=='O' || input2=='o') {
			    	            D3[checkfaces(D3)]=2;   
			    	            System.out.println("Vous avez gagner une face de PR");
			    	            depensesPrice[0]=depensesPrice[0]+price;
			    	            depensesPrice[1]=depensesPrice[1]+price;}
		                	}	        
		                }	               	        
	                }
	                else{
	                    System.out.println("Il vous manque des fonds pour cela");
	                    shop(D1,D2,D3,PO,price);
	                }
	                break;
	            case '3':
	            	//partie qui achete un de
	                if (PO >= 10){	                 
	                    PO = PO - 10;
	                    if(D2[0]==0) {
	                    D2[0]=4;	
	                    System.out.println("Des 2 a etait ajouter");
	                    depensesPrice[0]=depensesPrice[0]+10;
	                    }
	                    else if(D3[0]==0) {
		                    D3[0]=4;	
		                    System.out.println("Des 3 a etait ajouter");
		                    depensesPrice[0]=depensesPrice[0]+10;		    
		                    }
	                    }
	                else{
	                    System.out.println("Il vous manque des fonds pour cela");
	                    shop(D1,D2,D3,PO,price);
	                }
	            case '4':
	            	//sort du marche
	                break;
	            default:
	            	//si ne choisir aucun des 4 options retour dans le marche
	                shop(D1,D2,D3,PO,price);
	        }return depensesPrice;
}
	//fonction du historigramme
		public static void log(int player1, int PO1, int PR1, int[] D1_1, int[] D2_1, int[] D3_1, int player2, int PO2, int PR2, int[] D1_2, int[] D2_2, int[] D3_2) {
		    // Print le header
		    System.out.println("._____________________.               ._____________________.");
		    System.out.println("|player " +player1+"             |               |player "+player2+"             |");
		 
		    // Espacement du PO1, PO2, PR1, PR2
		    String spacePO1 = (PO1 >= 10 || PO1<0 ) ? " " : "  ";
		    String spacePR1 = (PR1 >= 10 || PR1<0 ) ? " " : "  ";
		    String spacePO2 = (PO2 >= 10 || PO2<0 ) ? " " : "  ";
		    String spacePR2 = (PR2 >= 10 || PR2<0 ) ? " " : "  ";
		 
		    // Print les stats pour le joueur 1
		    System.out.println("|PO :" + spacePO1 + PO1 + "              |               |PO :" + spacePO2 + PO2 + "              |");
		    System.out.println("|PR :" + spacePR1 + PR1 + "              |               |PR :" + spacePR2 + PR2 + "              |");
		 
		    // Print les faces du D1 pour les 2 joueurs
		    System.out.println("|D1 faces: : " + (checkfaces(D1_1) >= 10 ? " " : "  ") + checkfaces(D1_1) + "      |               |D1 faces: : " + (checkfaces(D1_2) >= 10 ? " " : "  ") + checkfaces(D1_2) + "      |");
		 
		    // Print les faces du D2 pour les 2 joueurs
		    System.out.println("|D2 faces: " + (checkfaces(D2_1) >= 10 ? " " : "  ") + checkfaces(D2_1) + "        |               |D2 faces: " + (checkfaces(D2_2) >= 10 ? " " : "  ") + checkfaces(D2_2) + "        |");
		 
		    // Print les faces du D3 pour les 2 joueurs
		    System.out.println("|D3 faces: " + (checkfaces(D3_1) >= 10 ? " " : "  ") + checkfaces(D3_1) + "        |               |D3 faces: " + (checkfaces(D3_2) >= 10 ? " " : "  ") + checkfaces(D3_2) + "        |");
		 
		    // Print le footer
		    System.out.println("|.___________________.|               |.___________________.|"); 
		    pause();
		}
	    
	//fonction des evenements
	public static int[] events(int player, int PO, int PR) {
		int roll = (int) (Math.random() * 30) + 1;
		int events[]= new int [2];
		if(roll==1) {
			events[0]=-2;
			System.out.println("Player "+player+" Vous avez etes voler de 2 PO par le voleur");
			System.out.println();
		}
		else if (roll==2) {
			events[1]=-3;
			System.out.println("Player "+player+" Il y a eu une polemique sur vous recement, vous avez perdu 3 PR");
			System.out.println();
		}return events;
}
	//fonction qui permet de pauser le jeu apres le historigramme
	public static void pause() {
		int pause=Lire.c();}
}