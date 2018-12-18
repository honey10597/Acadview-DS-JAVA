class finding_char_string {
  public static void main(String[] args) {
    String s="acadview";
    String find="a";
    int count=0;

    int i=0;
    while(i!=s.length())
    {
    switch(s.charAt(i))
    {
      case 'a':
      count++;
    }
    i++;
    }
    System.out.println(count);
  }
}