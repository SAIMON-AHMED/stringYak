/*
Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.


stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"
*/

public String stringYak(String str) {

 String result = "";
  
 for (int i=0; i<str.length(); i++) {
   if (str.charAt(i) == 'y') {
     str = str.replace("yak", "");
   }
 }
  return str;
}
