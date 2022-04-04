import java.util.Arrays;
class arr {
    public static void main(String[] args){
        // int age = 30;
        // System.out.println(age);

        // syntax of an array  
        // data_type[] array_name = new data_type[size_of_array]

        int[] ages = new int[5];
        ages[0] = 22;
        ages[1] = 27;
        ages[2] = 24;
        ages[3] = 26;
        ages[4] = 30;

        // if you put 
        // only varible name in java than it's print the jargan 
        // value it's not print the hole array 

        // System.out.println(ages[1]);

        // java me koi bhi varible 0 or null initialies hota hai 

        // Array function ✋ (length)
        // array_name.length gives you the length of an array
        // ex: ages.length

        // sort ✋
        // Arrays.sort(array_name)
        // System.out.println(ages[3]);
        Arrays.sort(ages);
        // System.out.println(ages[3]);

        // 1D array ✋
        // int[] marks = {93, 97, 92, 95};


        // 2d Array ✋✋
        // int[][] roll_mark = {{1,2,3,4,5},{97,98,93,94,91}};
        // System.out.println(roll_mark[1][1]);
    }
}
