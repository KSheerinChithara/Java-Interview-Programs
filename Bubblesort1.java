import java.util.Arrays;

public class Bubblesort1 {
    public static void main(String[] args)
    {
        int a[] = {10,4,6,3,2,4,3,2,1,2,3,9,-10,-1};
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]>a[i+1])
            {
                int temp = a[i];
                a[i]= a[i+1];
                a[i+1]=temp;
                i=-1;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
