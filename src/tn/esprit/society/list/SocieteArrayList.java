package tn.esprit.society.list;

import tn.esprit.society.interfaces.IGestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SocieteArrayList implements IGestion<Employee> {
   private List<Employee> employes = new ArrayList<>();

   public List<Employee> getEmployes() {
      return employes;
   }

   @Override
   public void ajouterEmploye(Employee employee) {
      employes.add(employee);
      System.out.println("Employé ajouté : " + employee);

   }

   @Override
   public boolean rechercherEmploye(String nom) {
      for (int i = 0; i < employes.size(); i++) {
         System.out.println(employes.get(i).getName());
         if (nom.toLowerCase().equals(employes.get(i).getName().toLowerCase())) {
            return true;
         }
      }
      return false;
   }


   @Override
   public boolean rechercherEmploye(Employee employee) {
      return employes.contains(employee);
   }

   @Override
   public void supprimerEmploye(Employee employee) {
      if (employes.remove(employee)) {
         System.out.println("Employé supprimé : " + employee);
      } else {
         System.out.println("Employé introuvable : " + employee);
      }
   }


   @Override
   public void displayEmploye() {
      System.out.println(this.employes);
   }

   @Override
   public void trierEmployeParId() {
      Collections.sort(this.employes);
      System.out.println("Liste triée par ID (compareTo).");

   }

   @Override
   public void trierEmployeParNomDépartementEtGrade() {
      Collections.sort(employes ,new EmployeeComparator());
      System.out.println("Liste triée par nom, département et grade.");

   }

}