import java.lang.Math;
public class RadixSort{
  public static int nth(int n, int col){
    return (int)(n % Math.pow(10, col+1));
  }

  public static int length(int n){
    return (int)(Math.log10(n));
  }

  public static void merge(MyLinkedList original, MyLinkedList[] buckets){

  }
}
