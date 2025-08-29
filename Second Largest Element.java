class Main
{
public static int Solution(int[] array)   
{
   int first=Integer.MIN_VALUE;
   int second=Integer.MIN_VALUE;
   
   for(int i=0;i<array.length;i++)
   {
       if(array[i]>first)
       {
           second=first;
           first=array[i];
       }
       else if(array[i]>second && array[i]<first)
       {
           second=array[i];
       }
   }
   if(second==Integer.MIN_VALUE) return -1;
   else
   {
       return second;
   }
}
public static void main(String[] args)
{
    int[] array={10,10,11};
    System.out.print(Solution(array));
    
}
}
