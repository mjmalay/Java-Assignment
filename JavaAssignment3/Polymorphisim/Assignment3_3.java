/*3) Write a program to sort 10 numbers in the array using following sorting algorithm and method
overloading?
        a) merge sort
        b) quick sort
        c) heap sort */


        interface ISort
        {
            public void sort(int[] arr , String str);
        }
        class Sort
        {
            public Sort(int arr[], String sort)
            {
                if(sort.equals("mergesort"))
                {
                    System.out.println("Mergesort : ");
                    MergeSort m = new MergeSort();
                    m.sort(arr, sort);
                    printArray(arr);
                }
                else if(sort.equals("quicksort"))
                {
                    System.out.println("Quicksort : ");
                    QuickSort q = new QuickSort();
                    q.sort(arr, sort);
                    printArray(arr);
                }
                else if(sort.equals("heapsort"))
                {
                    System.out.println("Heapsort : ");
                    HeapSort h = new HeapSort();
                    h.sort(arr, sort);
                    printArray(arr);
                }
                else{
                    System.out.println("Invalid sort");
                }
            }
            public void printArray(int arr[])
            {
                for(int i=0; i<arr.length; i++)
                {
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }      
        }
        class MergeSort implements ISort 
        {
            public void sort(int[] arr, String str) 
            {
                if (str.equals("mergesort")) 
                {
                    mergesort(arr, 0, arr.length - 1);
                }
            }
            public void mergesort(int arr[], int l, int r)
            {
                if(l<r)
                {
                    int m = (l+r)/2;
                    mergesort(arr, l, m);
                    mergesort(arr, m+1, r);
                    merge(arr, l, m, r);
                }
            }
            public void merge(int arr[], int l, int m, int r)
            {
                int n1 = m-l+1;
                int n2 = r-m;
                int L[] = new int[n1];
                int R[] = new int[n2];
                for(int i=0; i<n1; i++){
                L[i] = arr[l+i];
            }
            for(int j=0; j<n2; j++)
            {
                R[j] = arr[m+1+j];
            }
            int i=0, j=0;
            int k = l;
            while(i<n1 && j<n2)
            {
                if(L[i]<=R[j])
                {
                    arr[k] = L[i];
                    i++;
                }
                else
                {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }
            while(i<n1)
            {
                arr[k] = L[i];
                i++;
                k++;
            }
            while(j<n2) 
            {
                arr[k] = R[j];
                j++;
                k++;
            }
        }
    }
            
    class QuickSort implements ISort 
    {
        public void sort(int[] arr, String str) 
        {
            if (str.equals("mergesort")) 
            {
                quicksort(arr, 0, arr.length - 1);
            }     
        }
        public void quicksort(int arr[], int low, int high)
        {
            if(low<high)
            {
                int pi = partition(arr, low, high);
                quicksort(arr, low, pi-1);
                quicksort(arr, pi+1, high);
            }
        }
        public int partition(int arr[], int low, int high)
        {
            int pivot = arr[high];
            int i = (low-1);
            for(int j=low; j<high; j++)
            {
                if(arr[j]<=pivot)
                {
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            int temp = arr[i+1];
            arr[i+1] = arr[high];
            arr[high] = temp;
            return i+1;
        }
    }
    class HeapSort implements ISort 
    {
        public void sort(int[] arr, String str) 
        {
            if (str.equals("heapsort")) 
            {
                heapsort(arr);
            }
        }
        public void heapsort(int arr[])
        {
            int n = arr.length;
            for(int i=n/2-1; i>=0; i--)
            {
                heapify(arr, n, i);
            }
            for(int i=n-1; i>=0; i--)
            {
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
                heapify(arr, i, 0);
            }
        }
        public void heapify(int arr[], int n, int i)
        {
            int largest = i;
            int l = 2*i+1;
            int r = 2*i+2;
            if(l<n && arr[l]>arr[largest])
            {
               largest = l;
            }
            if(r<n && arr[r]>arr[largest])
            {
                largest = r;
            }
            if(largest!=i)
            {
                int swap = arr[i];
                arr[i] = arr[largest];
                arr[largest] = swap;
                heapify(arr, n, largest);
            }
        }
    }            

        public class Assignment3_3 
        {
            public static void main(String[] args) {
                
                    int[] arr = {9 , 8 ,7,6,5,4,3,2,1 , 10};
                    int[] arr2 = {9 , 8 ,7,6,5,4,3,2,1 , 10};
                    int[] arr3 = {9 , 8 ,7,6,5,4,3,2,1 , 10};
                    Sort s = new Sort(arr, "mergesort");
                    Sort s1 = new Sort(arr2, "quicksort");
                    Sort s2 = new Sort(arr3, "heapsort");
                    
            }
        }

