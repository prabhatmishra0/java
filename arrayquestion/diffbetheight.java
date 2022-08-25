package arrayquestion;


// minimise the maxmise difference between heights
public class diffbetheight {

    public static void main(String[] args) {
        
        int k = 3;
        int n = 5;

        int arr[] = {3, 9, 12, 16, 20};

        // done first opration on array
        for(int i = 0; i<n; i++){
            if(arr[i] > k){
                arr[i] = arr[i]-k;
            } else {
                arr[i] = arr[i]+k; 
            }
        }

        // print array
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // find max in array 
        int max = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        // fint min element 
        int min = max;
        for(int i = 0; i<n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Difference between max and min according array : ");
        System.out.println(max-min);
    }
    
}
