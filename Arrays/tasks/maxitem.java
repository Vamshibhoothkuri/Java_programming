package Arrays.tasks;

public class maxitem {
    public static void main(String[] args) {
        int[] ar={1};
        System.out.println(max(ar));
        System.out.println(maxrange(ar,3,5));

    }
    //Max in the complete array
    static int max(int[] ar) {
        if(ar.length==0){
            return -1;
        }
        int maxv=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>maxv){
                maxv=ar[i];
            }
        }
        return maxv;
    }
    //max in certain range
    static int maxrange(int[] ar,int s,int e){
        if(e<s || ar==null || ar.length<e){
            return -1;
        }
        int maxv=0;
        for(int i=s;i<=e;i++){
            if(ar[i]>maxv){
                maxv=ar[i];
            }
        }
        return maxv;
    }
}
