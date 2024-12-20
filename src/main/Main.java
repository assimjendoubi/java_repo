package main;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Employee emp = new Employee(1,"samar" ,"cherni" ,"info",1);
        Employee emp2 = new Employee(2,"mohamed" ,"cherni" ,"gestion",2);
        Employee emp3 = new Employee(3,"nada" ,"bk" ,"info",3);
        SocieteArrayList list = new SocieteArrayList();
        list.ajouterEmploye(emp3);
        list.ajouterEmploye(emp2);
        list.ajouterEmploye(emp);
        //System.out.println(list.getEmployes());
        System.out.println(list.rechercherEmploye(emp3));
        System.out.println(list.rechercherEmploye("Mohamed"));
        list.supprimerEmploye(emp3);
        list.displayEmploye();
        list.trierEmployeParId();
        list.displayEmploye();
        list.trierEmployeParNomDépartementEtGrade();
        list.displayEmploye();*/

        System.out.println("================= BICONSUMER TEST =================");
        /*Elle représente une opération qui prend deux arguments et ne renvoie aucun résultat.
        Son importance réside dans les cas où vous souhaitez exécuter une action sur deux objets sans avoir besoin de retourner une valeur.*/
        System.out.println(" ***** EXEMPLE 1 *********");
        List<Integer> lista = new ArrayList<Integer>();
        List<Integer> listb = new ArrayList<Integer>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        listb.add(4);
        listb.add(5);
        listb.add(6);
        BiConsumer<List<Integer>, List<Integer>> equals = new BiConsumer<List<Integer>, List<Integer>>() {

            @Override
            public void accept(List<Integer> integers, List<Integer> integers2) {
                if (integers.equals(integers2)) {
                    System.out.println("Equals");

                }
                else {
                    System.out.println("Not Equals");
                }
            }

        };

        equals.accept(lista, listb);

        System.out.println(" ***** EXEMPLE 2 *********");
        BiConsumer<Integer, Integer> addition = (a,b) -> System.out.println("adder" + (a + b));
        BiConsumer<Integer, Integer> subtraction = (a,b) -> System.out.println("substraction" + (a - b));
        BiConsumer<Integer, Integer> multiplication = (a,b) -> System.out.println("multiplier" + (a * b));
        BiConsumer<Integer, Integer> division = (a,b) -> System.out.println("divider" + (a / b));

        addition.accept(12,2);
        subtraction.accept(12,2);
        multiplication.accept(12,2);
        division.accept(12,2);
        System.out.println("                     ************************************");
        addition.andThen(subtraction).accept(12,2);
        subtraction.andThen(addition).accept(12,2);


        System.out.println("  ***** EXEMPLE 3 *********");
        Map<Integer,String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
        BiConsumer<Integer ,String> biMap = (k,v)-> System.out.println("key "+k+" value "+v);
        //biMap.accept(1,"A");
        map.forEach(biMap);

    }
}
