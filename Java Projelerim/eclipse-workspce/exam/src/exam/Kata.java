package exam;

class Kata {
	  public static String getMiddle(String word) {
	    
	  String str = "";
	  int i = 0 ;
	  
	  if(word.length() % 2 == 0) {
	 
	  i = word.length() / 2;
	  
	  str = str + word.charAt(i - 1) + word.charAt(i);
	  
	  return str;
	  }
	  else {
	  
	  i = word.length() / 2;

	  str = str + word.charAt(i);
	  
	  return str;
	  }  
	  }

	 public static void main(String[] args) {
		 System.out.println(getMiddle("test"));
	 }
	}