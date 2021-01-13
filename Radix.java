public class Radix{
  public static int nth(int n, int col){
    int digit = (int)(n % Math.pow(10, col+1));
    return (int)(digit / Math.pow(10,col));
  }

  public static int length(int n){
    return (int)(Math.log10(n)) + 1;
  }

  public static void merge(SortableLinkedList original, SortableLinkedList[] buckets){
    for (int i = 0; i < buckets.length; i++){
      original.extend(buckets[i]);
    }
  }

  public static int maxDigit(SortableLinkedList data){
    int max = 0;
    for (int i = 0; i < data.size(); i++){
      if (data.get(i) > max) max = data.get(i);
    }
    return length(max);
  }

  public static void radixSortSimple(SortableLinkedList data){
    SortableLinkedList[] buckets = new SortableLinkedList[10];
    for (int i = 0; i < 10; i++){
      buckets[i] = new SortableLinkedList();
    }
    for (int j = 0; j < maxDigit(data); j++){
      for (int i = 0; i < data.size(); i++){
        if (nth(data.get(i), j) == 0) buckets[0].add(data.get(i));
        if (nth(data.get(i), j) == 1) buckets[1].add(data.get(i));
        if (nth(data.get(i), j) == 2) buckets[2].add(data.get(i));
        if (nth(data.get(i), j) == 3) buckets[3].add(data.get(i));
        if (nth(data.get(i), j) == 4) buckets[4].add(data.get(i));
        if (nth(data.get(i), j) == 5) buckets[5].add(data.get(i));
        if (nth(data.get(i), j) == 6) buckets[6].add(data.get(i));
        if (nth(data.get(i), j) == 7) buckets[7].add(data.get(i));
        if (nth(data.get(i), j) == 8) buckets[8].add(data.get(i));
        if (nth(data.get(i), j) == 9) buckets[9].add(data.get(i));
        data.remove(i);
        i--;
      }
      merge(data,buckets);
    }
  }
}
