import java.util.Arrays;
public class Sorts{
  public static void selectionSort(int[] ary){
    for (int i = 0; i < ary.length - 1; i++){
      System.out.println("Sorting: " + Arrays.toString(ary));
      int idxSmall = i;
      for (int j = i; j < ary.length; j++){
        if (ary[j] < ary[idxSmall]){
          idxSmall = j;
        }
      }
      int temp = ary[idxSmall];
      ary[idxSmall] = ary[i];
      ary[i] = temp;
    }
  }

  public static boolean isSorted(int[] ary){
    for(int i = 0; i < ary.length - 1; i++){
      if (ary[i] > ary[i+1]){
        return false;
      }
    }
    return true;
  }

  public static void main(String[]args){
    int length = Integer.parseInt(args[0]);
    int[] list = new int[length];
    for (int i = 0; i < list.length; i++){
      list[i] = (int) (Math.random() * 100);
    }
    System.out.println("Start: " + Arrays.toString(list));
    selectionSort(list);
    System.out.println("End: " + Arrays.toString(list));
    System.out.println(isSorted(list));
  }
}
