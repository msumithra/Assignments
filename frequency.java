class main{
private static int useRecursion(
  String someString, char searchedChar, int index) {
    if (index >= someString.length()) {
        return 0;
    }
    
    int count = someString.charAt(index) == searchedChar ? 1 : 0;
    return count + useRecursion(
      someString, searchedChar, index + 1);
}
}

