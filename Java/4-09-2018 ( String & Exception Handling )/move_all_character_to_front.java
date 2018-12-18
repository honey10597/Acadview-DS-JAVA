class move_all_character_to_front {
  public static void main(String[] args) {
   String s="Geeksf!@orgeek@s A#$ c%o^mputer s****cience p#o@rtal fo@r ge%eks";
   String a="",b="";
   for(int i=0;i<s.length();i++)
   {
     if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)==' ')
     {
       a+=s.charAt(i);
     }else{
       b+=s.charAt(i);
     }
   }
   a=a+b;
   System.out.println(a);
  }
}