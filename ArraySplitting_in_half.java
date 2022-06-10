public class ArraySplitting_in_half {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60,70,80,90,100};
        int[] arr1= new int[5];
        int[] arr2= new int[5];
        int i=0;
        while(i<array.length){
            for(int j=0;j<arr1.length;j++){
                arr1[j]=array[i];
                i++;
            }
            for(int k=0;k<arr2.length;k++){
                arr2[k]=array[i];
                i++;
            }
        }

        System.out.println("Array1:");
        for(i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }

        System.out.println();

        System.out.println("Array2:");
        for(i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
