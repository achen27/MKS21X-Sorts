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
    int loops = data.length;
    boolean swaps;
    for (int i = 0; i < loops; i++){//loop back to beginning each time
      swaps = false;
      for (int j = 0; j < data.length - 1 - i; j++){//stop one before each loop
        //System.out.println("sort...");
        if (data[j] > data[j+1]){//swap if the one on the left is greater
          int temp = data[j+1];
          data[j+1] = data[j];
          data[j] = temp;
          swaps = true;
        }
        //System.out.println("Sorting: " + Arrays.toString(data) + i);
      }
      if (!swaps){//if there are no swaps in a full loop through, then the array is sorted
        return;
      }
    }
  }

  public static void insertionSort(int[] data){
    for (int i = 1; i < data.length; i++){
      //System.out.println("Sorting: " + Arrays.toString(data) + "i: "+ i);
      int temp = data[i];
      int j = i;
      /*for (j = i-1; j >= 0 && data[j] > temp; j--){
        //System.out.println("Sorting: " + Arrays.toString(data) + "j: "+ j);
        data[j+1] = data[j];
      }
      data[j+1] = temp;*/
      while (j > 0 && data[j-1] > temp){//shift until the number on the left is not larger
        data[j] = data[j-1];
        j--;
      }
      data[j] = temp;
      //System.out.println("Sorting: " + Arrays.toString(data) + "i: "+ i);
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
    //System.out.println("Start: " + Arrays.toString(list));
    insertionSort(list);

    //System.out.println("End: " + Arrays.toString(list));
    //System.out.println(isSorted(list));
  }

}
