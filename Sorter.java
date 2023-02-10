
public class Sorter{
    public static void main(String[] args) {

      

    
    }

    
    public static void Insertionsort(int arr[]){
      int n = arr.length;
      for (int i = 1; i < n; ++i) {
          int key = arr[i];
          int j = i - 1;

          /* Move elements of arr[0..i-1], that are
             greater than key, to one position ahead
             of their current position */
          while (j >= 0 && arr[j] > key) {
              arr[j + 1] = arr[j];
              j = j - 1;
          }
          arr[j + 1] = key;
      }
  }

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
          // Find the minimum in the list[i..list.length-1]
          double currentMin = list[i];
          int currentMinIndex = i;
    
          for (int j = i + 1; j < list.length; j++) {
            if (currentMin > list[j]) {
              currentMin = list[j];
              currentMinIndex = j;
            }
          }
    
          // Swap list[i] with list[currentMinIndex] if necessary;
          if (currentMinIndex != i) {
            list[currentMinIndex] = list[i];
            list[i] = currentMin;
          }
        }
      }
      public static void sort(double[] array){
        selectionSort(array);
      }
      
}



