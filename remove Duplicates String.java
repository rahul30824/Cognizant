class Main
{
public static void main(String[] args)
{
    String str="XYXYXYYX";
    String unique="";
    for(int i=0;i<str.length();i++)
    {
        char target=str.charAt(i);
        boolean duplicate=false;
        for(int j=0;j<i;j++)
        {
            if(target==str.charAt(j))
            {
                duplicate=true;
                break;
            }
        }
        if(!duplicate)
        {
            unique=unique+str.charAt(i);
        }
    }
    System.out.print(unique.length());
}
}
