class BubbleSort 
{ 
    void bubbleSort(String arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j].compareTo(arr[j+1]) > 0)
                { 
                    // swap arr[j+1] and arr[i] 
                    String temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
    } 
  
    void printArray(String arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; i++) 
            System.out.println(arr[i] + " "); 
        System.out.println(); 
    } 
  
    public static void main(String[] args)
    { 
        BubbleSort ob = new BubbleSort(); 
        String[] arr = {"The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog."};
        ob.bubbleSort(arr); 
        System.out.println("Sorted array"); 
        ob.printArray(arr); 
	}
}
    