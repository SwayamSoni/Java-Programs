import java.util.*;
class Poonagram
{
    public static void main()
    {
        String s="SILENT";
        String s2="LISTEN";
        char arr1[]=new char[s.length()];
        char arr2[]=new char[s2.length()];
        for(int i=0;i<s.length();i++){

            arr1[i]=s.charAt(i);

        }
        for(int i=0;i<s2.length();i++){

            arr2[i]=s2.charAt(i);

        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
            
        boolean b = false;
        for(int i=0;i<arr1.length;i++){

            if(arr1[i]!=arr2[i]){
                b = true;
                break;
            }

        }
        
        if(b){
            
            System.out.println("nakko");
        }else{
            System.out.println("hakko");
        }
        
        
    }

}