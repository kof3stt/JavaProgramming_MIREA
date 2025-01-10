package task1;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTester {
    public static void main(String[] args) {
        ArrayList<Student> data = new ArrayList<>();
        setArray(data);
        System.out.println(" Сортировка вставками: ");
        insertSort(data);
        System.out.println(data);

        data.clear();
        setArray(data);
        System.out.println(" Быстрая сортировка: ");
        quickSort(data,0,data.size()-1);
        System.out.println(data);

        data.clear();
        setArray(data);
        System.out.println(" Сортировка слиянием: ");
        sort(data,0,data.size()-1);
        System.out.println(data);
    }
    public static void insertSort(ArrayList<Student> data){
        for (int left = 0; left < data.size(); left++) {
            Student value = data.get(left);
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value.compareTo(data.get(i)) > 0) {
                    data.set(i + 1, data.get(i));
                } else {
                    break;
                }
            }
            data.set(i + 1, value);
        }
    }

    public static void quickSort(ArrayList<Student> data, int low, int high) {
        if (data.isEmpty())
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        Student opora = data.get(middle);
        int i = low, j = high;
        while (i <= j)
        {
            while (data.get(i).compareTo(opora)<0)
            {
                i++;
            }
            while (data.get(j).compareTo(opora)>0)
            {
                j--;
            }
            if (i <= j)
            {
                Collections.swap(data,i,j);
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(data, low, j);
        if (high > i)
            quickSort(data, i, high);
    }

    public static void merge(ArrayList<Student> data, int l, int m, int r)
        {
            int n1 = m - l + 1;
            int n2 = r - m;
            ArrayList<Student> L = new ArrayList<>();
            ArrayList<Student> R = new ArrayList<>();
            for (int i = 0; i < n1; ++i)
                L.add(data.get(l+i));
            for (int j = 0; j < n2; ++j)
                R.add(data.get(m+1+j));
            int i = 0, j = 0;
            int k = l;
            while (i < n1 && j < n2) {
                if (L.get(i).compareTo(R.get(j)) < 0) {
                    data.set(k,L.get(i));
                    i++;
                }
                else {
                    data.set(k,R.get(j));
                    j++;
                }
                k++;
            }
            while (i < n1) {
                data.set(k,L.get(i));
                i++;
                k++;
            }
            while (j < n2) {
                data.set(k,R.get(j));
                j++;
                k++;
            }
        }
    public static void sort(ArrayList<Student> data, int l, int r)
    {
        if (l < r) {
            int m = (l + r) / 2;
            sort(data, l, m);
            sort(data, m + 1, r);
            merge(data, l, m, r);
        }
    }

        public static void setArray(ArrayList<Student> data){
        data.add(new Student("Егор", "Леонидов", "ИКБО-04-22", 2, "Программная инженерия", 5.0));
        data.add(new Student("Леонид", "Егоров", "ИКБО-04-22", 2, "Программная инженерия", 6.0));
        data.add(new Student("Влад", "Кликушин", "ИКБО-04-22", 2, "Программная инженерия", 4.92));
        data.add(new Student("Андрей", "Распутин", "ИКБО-99-22", 2, "Программная инженерия", 4.88));
        data.add(new Student("Андрей", "Иванников", "ИКБО-98-22", 2, "Программная инженерия", 4.87));
        data.add(new Student("Григорий", "Косов", "ИКБО-07-22", 2, "Программная инженерия", 4.0));
    }




}
