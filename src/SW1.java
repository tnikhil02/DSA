import java.util.*;

public class SW1 {
    public void fun(ArrayList <Integer> v,int k){
        int f=0,r=0,sum=0,ff=0,rr=0,maxlen=0;
        while(r<v.size()){
            sum+=v.get(r);
            while(sum>k){
                sum-=v.get(f);
                f++;
            }
            if(sum<=k){
                if(maxlen<(r-f+1)){
                    maxlen=r-f+1;
                    rr=r;
                    ff=f;
                }
            }
            r++;
        }
        for(int i=ff;i<=rr;i++){
            System.out.print(v.get(i)+" ");
        }
    }
    public static void main(String[] args){
        SW1 obj=new SW1();
        ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(1, 2, 3, 1, 1, 1, 4));
        int k=5;
        obj.fun(arr,k);

    }
}
