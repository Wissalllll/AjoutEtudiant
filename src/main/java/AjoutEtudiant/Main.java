package AjoutEtudiant;


import java.util.Scanner;

import DAO.EtudiantDAO;
import DAO.MysqlEtudiantDAO;
import Helpers.AutoIncrementGenerateur;
import Helpers.IdGenerateur;
import Modele.Etudiant;
import Service.EtudiantService;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Veuillez entrer le nom de l'étudiant : ");
        String nom = scanner.nextLine();
        System.out.print("Veuillez entrer le prénom de l'étudiant : ");
        String prenom = scanner.nextLine();
        EtudiantDAO etudiantDAO = new MysqlEtudiantDAO(); 
        IdGenerateur idGenerateur = new AutoIncrementGenerateur(); 
        EtudiantService etudiantService = new EtudiantService(etudiantDAO, idGenerateur);
        

        Etudiant etudiant = new Etudiant();
        etudiant.setNom(nom);
        etudiant.setPrenom(prenom);
        etudiantService.ajouterEtudiant(etudiant);
        
        System.out.println("Étudiant ajouté avec succès : ");
        System.out.println("Nom : " + etudiant.getNom());
        System.out.println("Prénom : " + etudiant.getPrenom());
        System.out.println("ID de l'étudiant : " + etudiant.getId());
        
        scanner.close();
    }
}
