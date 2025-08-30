class Main
{
    public static void Solution(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            boolean isfound=true;
            for(int j=i+1;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    isfound=false;
                }
            }
            if(isfound)
            {
                System.out.print(str.charAt(i));
               break;
            }
        }
    }
public static void main(String[] args)
{
   String str="greeksforgreeks";
   Main sol=new Main();
  sol.Solution(str);
   
}
}
