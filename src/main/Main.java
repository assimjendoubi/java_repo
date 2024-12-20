package main;


import tn.esprit.society.interfacesFonctionnelles.Student;
import tn.esprit.society.interfacesFonctionnelles.StudentManagement;
import tn.esprit.society.list.Employee;
import tn.esprit.society.map.AffectationHashMap;
import tn.esprit.society.set.Departement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Création de la liste d'étudiants
        List<Student> students = Arrays.asList(
                new Student(3, "samar", 22),
                new Student(1, "mohamed", 25),
                new Student(4, "sousou", 20),
                new Student(2, "fatma", 23)
        );

        // Instanciation de StudentManagement
        StudentManagement management = new StudentManagement();

        // Test 1 : displayStudents
        System.out.println("--- Test 1 : Affichage de tous les étudiants ---");
        management.displayStudents(students, student ->
                System.out.println("Étudiant : " + student.getNom() + ", Âge : " + student.getAge())
        );

        // Test 2 : displayStudentsByFilter (Étudiants de plus de 22 ans)
        System.out.println("\n--- Test 2 : Affichage des étudiants de plus de 22 ans ---");
        management.displayStudentsByFilter(
                students,
                student -> student.getAge() > 22,
                student -> System.out.println("Étudiant > 22 ans : " + student.getNom())
        );

        // Test 3 : returnStudentsNames
        System.out.println("\n--- Test 3 : Récupération des noms d'étudiants ---");
        String studentsNames = management.returnStudentsNames(
                students,
                Student::getNom
        );
        System.out.println("Noms des étudiants : " + studentsNames);

        // Test 4 : createStudent
        System.out.println("\n--- Test 4 : Création d'un nouvel étudiant ---");
        Student newStudent = management.createStudent(() ->
                new Student(5, "Eve", 21)
        );
        System.out.println("Nouvel étudiant créé : " + newStudent);

        // Test 5 : sortStudentsById
        System.out.println("\n--- Test 5 : Tri des étudiants par ID ---");
        List<Student> sortedStudents = management.sortStudentsById(
                students,
                Comparator.comparingInt(Student::getId)
        );
        System.out.println("Étudiants triés par ID :");
        sortedStudents.forEach(System.out::println);

        // Test 6 : convertToStream
        System.out.println("\n--- Test 6 : Conversion en Stream et filtrage ---");
        List<String> studentNamesAbove22 = management.convertToStream(students)
                .filter(student -> student.getAge() > 22)
                .map(Student::getNom)
                .toList();

        System.out.println("Noms des étudiants de plus de 22 ans :");
        studentNamesAbove22.forEach(System.out::println);
    }
}