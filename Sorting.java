import java.util.Arrays;
class Sorting{

    public static void main(){

        System.out.println("");

        int arr[]={34444,675,34,33,76,35,99,565,34,23,21,11};

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int temp;
                
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}