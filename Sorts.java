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
    for (int i = 0; i < loops; i++){//loop back to beginning each time
      swaps = 0;
      for (int j = 0; j < data.length - 1 - i; j++){//stop one before each loop
        //System.out.println("sort...");
        if (data[j] > data[j+1]){//swap if the one on the left is greater
          int temp = data[j+1];
          data[j+1] = data[j];
          data[j] = temp;
          swaps++;
        }
        //System.out.println("Sorting: " + Arrays.toString(data) + i);
      }
      if (swaps == 0){//if there are no swaps in a full loop through, then the array is sorted
        return;
      }
    }
  }

  public static void insertionSort(int[] data){
    for (int i = 1; i < data.length; i++){
      int temp = data[i];
      int position = i;
      for (int j = i-1; data[j] > temp; j--){
        data[j+1] = data[j];
        position = j;
      }
      data[position] = temp;
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
    int length = 5;//Integer.parseInt(args[0]);
    int[] list = new int[length];
    /*for (int i = 0; i < list.length; i++){
      list[i] = (int) (Math.random() * 100);
    }*/
    list[0]=5;
    list[1]=1;
    list[2]=12;
    list[3]=-5;
    list[4]=16;
    //System.out.println("Start: " + Arrays.toString(list));
    bubbleSort(list);
    //System.out.println("End: " + Arrays.toString(list));
    //System.out.println(isSorted(list));
  }

}
