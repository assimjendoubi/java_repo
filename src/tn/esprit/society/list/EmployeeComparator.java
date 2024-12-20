package tn.esprit.society.list;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        int compareName = e1.name.toLowerCase().compareTo(e2.name);
        if (compareName != 0) return compareName;

        int compareDep = e1.depName.toLowerCase().compareTo(e2.depName);
        if (compareDep != 0) return compareDep;

        return Integer.compare(e1.grade, e2.grade);
    }
}
