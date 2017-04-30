package m2;
import java.io.*;
public class M2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double x, eps, sum, f, n, p;
        System.out.print("Введите x (0<|x|<1):");
        x=Double.parseDouble(br.readLine ());
        System.out.print("Введите точность (eps):");
       eps=Double.parseDouble(br.readLine ());
       f=Math.cos(x)/(x*x)+0.5;
       sum=1/(x*x);
       p=x*x/(2*3*4);
       n=4;
       while (Math.abs(p)>=eps){
           sum=sum+p;
           p=p*(-1)*x*x/((n+1)*(n+2));
           n=n+2;
       }
       System.out.println("x="+x+"\neps="+eps+"\nf="+f+"\nsum="+sum);
    }    
}
