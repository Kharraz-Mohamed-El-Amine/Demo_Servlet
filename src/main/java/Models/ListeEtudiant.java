package Models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListeEtudiant {
    private List<Etudiant> list_etd;

    public ListeEtudiant() {
        list_etd = new ArrayList<>();
        list_etd.add(new Etudiant("123", "Alami", "Yassine", "GI"));
        list_etd.add(new Etudiant("124", "Alaoui", "Hanane", "GSTR"));
        list_etd.add(new Etudiant("125", "Ali", "Said", "GI"));
        list_etd.add(new Etudiant("126", "Badr", "Youssra", "GSTR"));
    }

    public List<Etudiant> getList_etd() {
        return list_etd;
    }

    public void setList_etd(List<Etudiant> list_etd) {
        this.list_etd = list_etd;
    }

    public List<Etudiant> getByFiliere(String filiere) {
        List<Etudiant> list_filiere = new ArrayList<>();
        Iterator<Etudiant> it = list_etd.iterator();

        while (it.hasNext()) {
            Etudiant e = it.next();
            if (e.getFiliere().equalsIgnoreCase(filiere)) {
                list_filiere.add(e);
            }
        }

        return list_filiere;
    }
}