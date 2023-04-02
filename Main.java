class Main {
  public static void main(String[] args) {
    Main main = new Main();
    String s = "Gang", t = "angG";
    System.out.println("Result ="+String.valueOf(main.compareStrings(s,t)));
  }

  /**
   Write a function to accept two string parameters
   and return true if all the letters in first string 
   exist in second string
  */
  public boolean compareStrings(String source, String target){
    for(int i = 0; i < source.length(); i++){
      System.out.println("source char: "+source.charAt(i));
      System.out.println("target indexof: "+target.indexOf(source.charAt(i)));
      if(target.indexOf(source.charAt(i)) == -1 ){
        return false; // EOF or character not found
      }
    }
    for(int j = 0; j < target.length(); j++){
      System.out.println("target char: "+target.charAt(j));
      System.out.println("source indexof: "+source.indexOf(target.charAt(j)));
      if(source.indexOf(target.charAt(j)) == -1){
        return false;//EOF or character not found 
      }
    }
    return true;
  }
}