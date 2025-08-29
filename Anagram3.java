class Main
{
public static void Solution(String s)  
{
  for(int i=0;i<s.length();i++) 
  {
      boolean isfound=true;
      char target=s.charAt(i);
     for(int j=0;j<s.length();j++)
     {
       if (i != j && s.charAt(j) == target)
         {
             isfound=false;
             break;
         }
     }
     if(isfound)
     {
         System.out.print(target);
         break;
     }
     else
     {
         System.out.print("Not found");
         break;
     }
  }
}
public static void main(String[] args)
{
    String s="ProPgroammaiinng";
    Main sol=new Main();
    sol.Solution(s);
}
}
