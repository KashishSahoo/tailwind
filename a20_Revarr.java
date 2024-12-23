public class a20_Revarr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        revarrM2(arr, 0, arr.length);
    }
static void revarr(int arr[], int l, int h) {
    if (l >= h) {
        return;
    }
    int temp = arr[l];
    arr[l] = arr[h];
    arr[h] = temp;
    revarr(arr, l + 1, h - 1);
}

static void revarrM2(int arr[], int i, int n) {
    if (i >= n / 2) {
        return;
    }
    int temp = arr[i];
    arr[i] = arr[n - i - 1];
    arr[n - i - 1] = temp;
    revarrM2(arr, i + 1, n);
}
}

