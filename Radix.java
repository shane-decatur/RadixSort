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

  public static void radixSortSimple(SortableLinkedList data){
    SortableLinkedList[] buckets = new SortableLinkedList[10];
    for (int i = 0; i < 10; i++){
      buckets[i] = new SortableLinkedList();
    }
    int passes = 1;
    int dataLength = data.size();
    for (int j = 0; j < passes; j++){
      for (int i = 0; i < dataLength; i++){
        int temp = data.remove(0);
        if (j == 0 && length(temp) > passes) passes = length(temp);
        buckets[nth(temp,j)].add(temp);
      }
      merge(data,buckets);
    }
  }

  public static void radixSort(SortableLinkedList data){
    SortableLinkedList[] buckets = new SortableLinkedList[19];
    for (int i = 0; i < 19; i++){
      buckets[i] = new SortableLinkedList();
    }
    int passes = 1;
    int dataLength = data.size();
    for (int j = 0; j < passes; j++){
      for (int i = 0; i < dataLength; i++){
        int temp = data.remove(0);
        if (j == 0 && length(temp) > passes) passes = length(temp);
        if (nth(temp, j) == -9) buckets[0].add(temp);
        if (nth(temp, j) == -8) buckets[1].add(temp);
        if (nth(temp, j) == -7) buckets[2].add(temp);
        if (nth(temp, j) == -6) buckets[3].add(temp);
        if (nth(temp, j) == -5) buckets[4].add(temp);
        if (nth(temp, j) == -4) buckets[5].add(temp);
        if (nth(temp, j) == -3) buckets[6].add(temp);
        if (nth(temp, j) == -2) buckets[7].add(temp);
        if (nth(temp, j) == -1) buckets[8].add(temp);
        if (nth(temp, j) == 0) buckets[9].add(temp);
        if (nth(temp, j) == 1) buckets[10].add(temp);
        if (nth(temp, j) == 2) buckets[11].add(temp);
        if (nth(temp, j) == 3) buckets[12].add(temp);
        if (nth(temp, j) == 4) buckets[13].add(temp);
        if (nth(temp, j) == 5) buckets[14].add(temp);
        if (nth(temp, j) == 6) buckets[15].add(temp);
        if (nth(temp, j) == 7) buckets[16].add(temp);
        if (nth(temp, j) == 8) buckets[17].add(temp);
        if (nth(temp, j) == 9) buckets[18].add(temp);
      }
      merge(data,buckets);
    }
  }

}
