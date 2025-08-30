class Main
{
public static int Solution(int[]array) 
{
    int count=0;
    for(int i=0;i<array.length;i++)
    {
        if(array[i]==0)
        {
            count++;
        }
    }
    return count;
}
public static void main(String[] args)
{
  int[]array={1,0,0,0,1,2,3,4};
  System.out.print(Solution(array));
}
}
