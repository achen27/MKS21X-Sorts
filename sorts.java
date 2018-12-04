public class sorts {
  public static void selectionsort(int[] ary){
    for (int i = 0; i < ary.length; i++){
      int idxSmall = 0;
      for (int j = i + 1; j < ary.length; j++){
        if (ary[j] < small){
          idxSmall = j;
        }
      }
      int temp = ary[j];
      ary[j] = ary[i];
      ary[i] = temp;
    }
  }
}
