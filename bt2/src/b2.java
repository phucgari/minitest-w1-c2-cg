public class b2 {
    public static void main(String[] args) {
        double []arr={5,4,2,1,7,6,8};
        double max=arr[0];
        int maxIndex=0;
        double total=0;
        for (int i = 0; i < arr.length; i++) {
            total+=arr[i];
            if(arr[i]>max){
                max=arr[i];
                maxIndex=i;
            }
        }
        System.out.println("sum of arr is "+total);
        System.out.println("the highest number is "+max);
    }
}
