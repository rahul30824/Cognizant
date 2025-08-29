import java.util.Arrays;
class Main
{
public static int []Solution(int[] array)
{
    int[]s=new int[array.length];
    for(int i=0;i<array.length;i++)
    {
        int count=0;
        int target=array[i];
        for(int j=i+1;j<array.length;j++)
        {
            if(array[j]<target)
            {
                count++;
            }
        }
            s[i]=count;
    }
    return s;
}
public static void main(String[] args)
{
    int[] array={12,1,2,3,0,11,4};
    System.out.print(Arrays.toString(Solution(array)));
}
}
