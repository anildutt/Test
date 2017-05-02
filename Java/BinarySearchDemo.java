class BinarySearchDemo{
  //Demo
  public static void main(String[] Args){
    final int input[] = {1,3,5,6,8};

    for (int i = 0 ; i<=9; i++)
    System.out.println( i + " found at index=" + binarySearch(input, i));
  }

  /** Binary search on sorted int array */ 
  public static int binarySearch(int[] arr, int elem){
    int low = 0, high = arr.length-1;
    if(high == 0) return -1;

    while(low <= high){
      int mid = (low + high) / 2;
      if(arr[mid] == elem) return mid;
      else if (arr[mid] > elem) high = mid - 1;
      else low = mid + 1;
    }
    return -1;
  }
}
