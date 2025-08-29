import java.util.Arrays;
class Main
{
public static int[] Solution(int[]array,int k)
{
    reverse(array,0,array.length-1);
    reverse(array,0,k-1);
    reverse(array,k,array.length-1);
    return array;
}
public static void reverse(int[] array,int start,int end)
{
    while(start<end)
    {
        int temp=array[start];
        array[start]=array[end];
        array[end]=temp;
        start++;
        end--;
    }
}
public static void main(String[] args)
{
    int[] array={1,2,3,4,5};
    int k=2;
    System.out.print(Arrays.toString(Solution(array,k)));
}
}
