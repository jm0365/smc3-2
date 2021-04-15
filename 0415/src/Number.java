import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        System.out.print("10개의 랜덤 숫자 중 하나를 맞춰보세요(1~50까지): ");
	        Scanner sc=new Scanner(System.in);
	        int num=sc.nextInt();
	        int []arr=new int[10];
	        int diff=0;
	        for(int a=0; a<10; a++){
	            arr[a]=(int)(Math.random()*50+1);
	        	System.out.print(arr[a]+" ");
	        }
	        System.out.println();
	        
	        for(int i=0; i<10; i++){
	        	if(arr[i] == num) {
	        	   System.out.println("당첨! 일치하는 숫자가 있습니다.");
	        	   diff = 1;
	        	}
	        }
	        if(diff==0) System.out.println("꽝! 다음기회에~");
	}
}


