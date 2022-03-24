public class InsertionSort { 
    void sort(int arr[]){ 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
            int contador;
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
                contador++;
            } 
            arr[j + 1] = key; 
        } 
    } 
  
  
    public static void main(String args[]) { 
        int arr[] = { 12, 11, 13, 5, 6 }; 
  
        InsertionSort ob = new InsertionSort(); 
        ob.sort(arr); 
        
        System.out.println(arr);
        System.out.println(contador);
    } 
    
}
