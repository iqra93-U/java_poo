package tp07;

import java.util.Scanner;

import tp06.Sport;
import tp06.Type;

public class main {

	public static void main(String[] args) {
		Sport foot = new Sport("Football", Type.EQUIPE, true, "Jeu en équipe de 11 avec un balon. Le but est de faire rentrer le balon dans le but adverse");
		Sport natation = new Sport("Natation", Type.INDIVIDUEL, true, "Epreuve de nage sur uen distance prédéfinie");
		Sport tennis = new Sport("Tennis", Type.INDIVIDUEL_ET_EQUIPE, true, "Jeu individuelle ou par 2 avec une raquette et une bale, sur une terrai apelé cours");
		
		foot.afficher();
		natation.afficher();
		tennis.afficher();

		
		Scanner sc = new Scanner(System.in);
		Sport sportAjout = new Sport();
		System.out.println("Nom du sport à ajouter ? ");
		sportAjout.setNom(sc.nextLine());
		System.out.println("Description du sport à ajouter ? ");
		sportAjout.setDescription(sc.nextLine());
		System.out.println("Actif (y/n) ?");
		if (sc.nextLine().equals("y"))
			sportAjout.setActif(true);
		else sportAjout.setActif(false);
		System.out.println("Type (indiv/equip/both) ?");
		if (sc.nextLine().equals("indiv"))
			sportAjout.setType(Type.INDIVIDUEL);
		else if  (sc.nextLine().equals("equip"))
			sportAjout.setType(Type.EQUIPE);
		else
			sportAjout.setType(Type.INDIVIDUEL_ET_EQUIPE);
		sportAjout.afficher();
		
		
		// ---------------- V1 ----------------
		String[] listSports = {foot.getNom(), natation.getNom(), tennis.getNom(), sportAjout.getNom()};
		System.out.println("------------ VERSION 1 ------------");
		for (String nomSport: listSports) {
			System.out.println(nomSport);
		}


		
		// ---------------- V2 ----------------
		natation.setActif(false);
		Sport[] listSports2 = {foot, natation, tennis, sportAjout};
		System.out.println("------------ VERSION 2 ------------");
		for (Sport sport: listSports2) {
			if (sport.isActif())
				System.out.println(sport.getNom());
		}
	}

}
