class Max69Number {
    public int maximum69Number (int num) {
      String s=String.valueOf(num);
      String max=s.replaceFirst("6","9");
      return Integer.parseInt(max);  
    }
}