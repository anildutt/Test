class PalendromDemo{

  public static void main(String[] Args){
    System.out.println("input=" + Args[0]);
    System.out.println(isPalendrom(Args[0]));
  }

  /**
    * Return true if given string is a palendrom.
    * Else return false
    */
  public static boolean isPalendrom(String str){
    if (str == null || str.isEmpty()) 
      return false;

    return (str.equals ( new StringBuilder(str).reverse().toString() ));
  }
}
