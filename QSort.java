
public class QSort {
public static void sort(Integer[] a, int left, int right){
        if (left < right){
            Integer pivot = a[right];
            Integer pos = left - 1;
            for (Integer i = left; i < right; i++)
                if (a[i] <= pivot)
                    Swap(a, ++pos, i);
            Swap(a, pos + 1, right);
            sort(a, left, pos);
            sort(a, pos + 1, right);
        }

    }

    public  static void Swap(Integer[] a, int i, int j){
        Integer temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }    
}
