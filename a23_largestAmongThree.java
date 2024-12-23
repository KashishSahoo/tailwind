public class a23_largestAmongThree {
public static void main(String[] args) {
    int a=89;
    int b=475;
    int c=99;
    int ans=greatest(a,b,c);
    System.out.println(ans);
}

static int greatest(int a,int b,int c){
    int k=0;
    if(a>b && a>c){
        k=a;
    }
    if(b>a && b>c){
        k=b;
    }
    if(c>a && c>b){
        k=c;
    }
    return k;
}
static int greatest1(int a,int b,int c){
    int k=0;
    if(a>b && a>c){
     k=a;
    }
    else{
        if(b>c){
            k=b;
        }
        else{
            k=c;
        }
    }
    return k;

}

static int greatest2(int a,int b,int c){
int k=0;

// k=a>b? a>c?a:c : b>c?b:c;
    if(a>b){
        if(a>c){
          k=a;
        }
        else{
            k=c;
        }
    }
    else{
        if(b>c){
            k=b;
        }
        else{
            k=c;
        }
    }
    return k;
}

}
