class ass1_ques4_subsequences {
  public static void main(String[] args) {
    String s="cat";
    int i=0,j=0;
    for(i=0;i<s.length();i++)
    {
      for(j=i+1;j<=s.length();j++)
      {
        System.out.println(s.substring(i,j));
      }
    }
  }
}