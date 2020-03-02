public class SortOfSort {
  public void sortOfSort(int[] integerArray){
    int max = 0;
    int k = 0;
    int j = 1;
    
    while (k < integerArray.length) {
      for (int i = 0; i < integerArray.length - k; i++) {
        if (integerArray[i] > integerArray[max]) {
          max = i;
        }
      }
      for(int i = 0; i < integerArray.length; i++){
        System.out.print(integerArray[i]);
      }
      System.out.println();
      swap(integerArray, max, integerArray.length - j);
      k++;
      j++;
    }
  }
  public void swap(int[] integerArray, int largest, int toSwap){
    int temp = integerArray[largest];
    integerArray[largest] = integerArray[toSwap];
    integerArray[toSwap] = temp;
  }
}
