package tn.esprit.society.map;

import tn.esprit.society.list.Employee;
import tn.esprit.society.set.Departement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.*;

public class AffectationHashMap {
    Map<Employee, Departement> employeDep = new HashMap<>();

    public void ajouterEmployeDepartement(Employee e, Departement d){
        employeDep.put(e,d);
    }
    public void afficherEmployesEtDepartements(){
        for(Map.Entry<Employee,Departement> e : employeDep.entrySet()){
            System.out.println(e.getKey().getName() + " " + e.getKey().getLastName() + " is in the " + e.getValue().getNom()+ " Departement");
        }
    }

    public void supprimerEmploye(Employee e){
        employeDep.remove(e);
    }
    public void supprimerEmployeEtDepartement(Employee e, Departement d){
        Departement dep = employeDep.get(e);
        if(d.equals(dep)){
            supprimerEmploye(e);
        }
    }
    public void afficherEmployes(){
        /*for(Employe e : employeDep.keySet()){
            System.out.println(e);
        }
         */
        Set<Employee> keys = employeDep.keySet();
        Iterator<Employee> it = keys.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    public void afficherDepartements(){
        /*for(Departement d : employeDep.values()){
            System.out.println(d);
        }*/
        Collection<Departement> values = employeDep.values();
        Iterator<Departement> it = values.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    public boolean rechercherEmploye(Employee e){
        return employeDep.containsKey(e);
    }
    public boolean rechercherDepartement(Departement d){
        return employeDep.containsValue(d);
    }
    public TreeMap<Employee, Departement> trierMap(){
       /* Comparator<Employe> c = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getID()- o2.getID();
            }
        };
        TreeMap<Employe, Departement> tree = new TreeMap<>(c);
        tree.putAll(employeDep);
        return tree;*/
        return new TreeMap<>(employeDep);
    }
}
