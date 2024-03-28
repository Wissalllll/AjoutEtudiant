package Service;

import DAO.EtudiantDAO;
import Helpers.IdGenerateur;
import Modele.Etudiant;

public class EtudiantService {
	private  EtudiantDAO etudiantDAO;
    private  IdGenerateur idGenerateur;

    public EtudiantService(EtudiantDAO etudiantDAO, IdGenerateur idGenerateur) {
        this.etudiantDAO = etudiantDAO;
        this.idGenerateur = idGenerateur; 
        }
    public void ajouterEtudiant(Etudiant etudiant) {
        etudiant.setId(idGenerateur.genererId());
        }

}
