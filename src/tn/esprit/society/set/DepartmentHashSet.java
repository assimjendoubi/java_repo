package tn.esprit.society.set;

import tn.esprit.society.set.Departement;
import tn.esprit.society.set.IDepartement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.*;
public class DepartmentHashSet implements IDepartement<Departement> {
    Set<Departement> Deps = new HashSet<>();
    public void ajouterDepartement(Departement departement) {
        Deps.add(departement);
    }

    public boolean rechercherDepartement(String nom) {
        for (Departement d: Deps) {
            if(d.getNom().equals(nom)) return true;
        }
        return false;
    }

    public boolean rechercherDepartement(Departement departement) {
        return Deps.contains(departement);
    }

    public void supprimerDepartement(Departement departement) {
        Deps.remove(departement);
    }

    public void displayDepartement() {
        Iterator<Departement> it = Deps.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    public TreeSet<Departement> trierDepartementById() {

        return new TreeSet<>(Deps);
    }

}
