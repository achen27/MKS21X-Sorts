import java.util.Arrays;
public class Sorts{
  /**Selection sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void selectionSort(int[] data){
    for (int i = 0; i < data.length - 1; i++){//runs through list once
      int idxSmall = i;
      for (int j = i; j < data.length; j++){//consecutive smallest number is places in sucessive slots
        if (data[j] < data[idxSmall]){
          idxSmall = j;
        }
      }
      int temp = data[idxSmall];
      data[idxSmall] = data[i];
      data[i] = temp;
      //System.out.println("Sorting: " + Arrays.toString(ary));
    }
  }

  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    int swaps = 0;
    int loops = data.length;
    for (int i = 0; i < loops; i++){
      swaps = 0;
      for (int j = 0; j < data.length - 1 - i; j++){
        //System.out.println("sort...");
        if (data[j] > data[j+1]){
          int temp = data[j+1];
          data[j+1] = data[j];
          data[j] = temp;
          swaps++;
        }
      }
      if (swaps == 0){
        return;
      }
      System.out.println("Sorting: " + Arrays.toString(data) + i);
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
    /*for (int i = 0; i < list.length; i++){
      list[i] = (int) (Math.random() * 100);
    }*/
    System.out.println("Start: " + Arrays.toString(list));
    bubbleSort(list);
    System.out.println("End: " + Arrays.toString(list));
    System.out.println(isSorted(list));
  }

}
