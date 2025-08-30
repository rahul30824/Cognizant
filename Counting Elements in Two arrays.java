import java.util.Arrays;
class Main
{
public static int[] Solution(int[] array1,int[] array2)    
{
  int[] array3=new int[array1.length+array2.length];
  int k=0;
  int [] result=new int[array3.length/2];
  for(int i=0;i<array1.length;i++)
  {
      array3[k++]=array1[i];
  }
  for(int j=0;j<array2.length;j++)
  {
      array3[k++]=array2[j];
  }
  for(int i=0;i<array3.length/2;i++)
  {
      int count=0;
for(int j=i+1;j<array3.length;j++)
{
    if(array3[j]<=array3[i])
    {
        count++;
    }
}
result[i]=count;
  }
  return result;
}
public static void main(String[] args)
{
    int[]array1={1,2,3,4,7,9};
    int[]array2={0,1,2,1,1,4};
    System.out.print(Arrays.toString(Solution(array1,array2)));
}
}
