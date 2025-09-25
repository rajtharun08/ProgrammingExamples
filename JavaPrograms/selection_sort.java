public class selection_sort {
    public static void selectionSort(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            int minIndex=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[minIndex])
                {
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr={4,2,1,46,0,19,9};
        for(int i=0;i<arr.length;i++)
        {
        System.out.print(arr[i]);
        }
        selectionSort(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
        System.out.print(arr[i]);
        }
    }
}
