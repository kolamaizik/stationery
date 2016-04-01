package by.training.epam.mk;

import java.util.Comparator;

public class SortedByName implements Comparator<Stationery> {
    
    public int compare(Stationery obj1, Stationery obj2) {
         
          String str1 = obj1.getName();
          String str2 = obj2.getName();
         
          return str1.compareTo(str2);
    }
}