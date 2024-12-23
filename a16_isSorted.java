class a16_isSorted{
    public static void main(String[] args) {
        int [] arr={89,90,99,100,8,9};
        boolean ans=isSort(arr,0);
        System.out.println(ans);
    }
    static boolean isSort(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1]&&isSort(arr, index+1);
    }
}
