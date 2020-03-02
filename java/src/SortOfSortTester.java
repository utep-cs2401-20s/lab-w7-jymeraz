import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class SortOfSortTester {
  @Test
  public void test1(){
    int[] a = {8, 7, 3, 2, 5};
    SortOfSort test = new SortOfSort();
    test.sortOfSort(a);
    for(int i = 0; i < a.length; i++){
      System.out.print(a[i]);
    }
  }
}
