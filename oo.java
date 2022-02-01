public class oo
{
    public static void main()
    {
        int arr[]={1,2,3,4,5};int s=0;
        for(int i=0;i<arr.length;i++)
        {
            s=(arr[i]+s);
        }
        System.out.println("The sum of array is "+s);
        int avg=s/arr.length;
        System.out.println(avg);
        System.out.println(s);
    }
}