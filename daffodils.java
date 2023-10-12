import java.util.Scanner;
public class daffodils{
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
		System.out.println("请输入一个整数: ");
        int x = num.nextInt();
           int a = x%10;      // 判断x的个位数
		   int b = x/10%10;   // 判断x的十位数
		   int c = x/100;	  // 判断x的百位数
	    if(x>=100&&x<1000){
		   if(a*a*a+b*b*b+c*c*c==x){
		       System.out.printf("%d是水仙花数",x);
		   }
		   else{
		       System.out.printf("%d不是水仙花数",x);
		   }
		}
		else{
		    System.out.printf("%d不是水仙花数",x);
		}
	}	
}