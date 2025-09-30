import java.io.*;
import java.util.*;

public class Contest {
    static final int MOD = 1_000_000_007;
    static int MAXN = 200_000;
    static long[] fact;
    static long[] ifact;

    static long modPow(long a, long e){
        long r = 1;
        while(e>0){
            if((e&1)==1) r = (r*a)%MOD;
            a = (a*a)%MOD;
            e >>= 1;
        }
        return r;
    }

    static void precompute(int n){
        MAXN = Math.max(MAXN, n);
        fact = new long[MAXN+1];
        ifact = new long[MAXN+1];
        fact[0]=1;
        for(int i=1;i<=MAXN;i++) fact[i] = fact[i-1]*i%MOD;
        ifact[MAXN] = modPow(fact[MAXN], MOD-2);
        for(int i=MAXN;i>0;i--) ifact[i-1] = ifact[i]*i%MOD;
    }

    static long nCr(int n, int r){
        if(r<0 || r>n) return 0;
        return fact[n]*ifact[r]%MOD*ifact[n-r]%MOD;
    }

    public static void main(String[] args) throws Exception{
        FastScanner fs = new FastScanner(System.in);
        int t = fs.nextInt();
        int totalN = 0;
        int[] ns = new int[t];
        int[] ms = new int[t];
        int[][] ks = new int[t][];
        for(int tc=0; tc<t; tc++){
            int n = fs.nextInt();
            int m = fs.nextInt();
            ns[tc]=n; ms[tc]=m;
            totalN += n;
            for(int i=0;i<n;i++) fs.nextInt(); // tasks are distinct; values unused
            int[] k = new int[m];
            for(int i=0;i<m;i++) k[i]=fs.nextInt();
            ks[tc]=k;
        }
        precompute(totalN);

        StringBuilder out = new StringBuilder();
        for(int tc=0; tc<t; tc++){
            int n = ns[tc];
            int[] k = ks[tc];
            long res = fact[n];
            for(int i=0;i<k.length;i++){
                res = res * ifact[k[i]] % MOD;
            }
            out.append(res).append('\n');
        }
        System.out.print(out.toString());
    }

    static class FastScanner {
        BufferedInputStream in;
        byte[] buffer = new byte[1<<16];
        int ptr = 0, len = 0;
        FastScanner(InputStream is){ in = new BufferedInputStream(is); }
        int read(){
            if(ptr>=len){
                try{ len = in.read(buffer); } catch(IOException e){ e.printStackTrace(); }
                ptr=0;
                if(len<=0) return -1;
            }
            return buffer[ptr++];
        }
        int nextInt() throws IOException {
            int c = read();
            while (c != -1 && c <= 32) c = read();
            if (c == -1) throw new EOFException();
            int sgn = 1;
            if (c == '-') { sgn = -1; c = read(); }
            int val = 0;
            while (c > 32) { val = val*10 + (c - '0'); c = read(); }
            return val * sgn;
        }
    }
}