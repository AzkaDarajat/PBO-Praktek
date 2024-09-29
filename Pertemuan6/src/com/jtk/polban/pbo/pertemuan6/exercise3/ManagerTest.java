package com.jtk.polban.pbo.pertemuan6.exercise3;

public class ManagerTest{
    public static void main (String[] args){
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 3000000, 1, 10, 1989);
        staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 2000000, 1, 11, 1993);
        int i;
        for (i = 0; i < 3; i++) staff[i].raiseSalary(5);
        System.out.println("Sebelum Sorting");
        for (i = 0; i < 3; i++) staff[i].print();
        System.out.println();

        // Melakukan Sorting
        Sortable.shell_sort(staff);
        System.out.println("Setelah Sorting: ");
        for (i = 0; i < 3; i++) staff[i].print();
    }
}