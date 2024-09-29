package com.jtk.polban.pbo.pertemuan6.exercise3;

abstract class Sortable{
    public abstract int compare(Sortable b);

    // s == sementara
    // dif == different
    public static void shell_sort(Sortable[] a){
        int n = a.length;
        for (int dif = n / 2; dif > 0; dif /= 2) {
            for (int i = dif; i < n; i++) {
                Sortable s = a[i];
                int j;
                for (j = i; j >= dif && (s.compare(a[j - dif]) < 0); j -= dif) {
                    a[j] = a[j - dif];
                }
                a[j] = s;
            }
        }
    }
}