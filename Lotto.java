import java.util.Random;
import java.util.Scanner;


public class Lotto {

	public static void main(String[] args) {
		
		int array[] = new int[7];			// 당첨번호 배열
		int lotto[] = new int[7];			// user가 입력하는 로또번호
		
		int hit = 0;						// user가 맞춘 로또개수
		
		Scanner s1 = new Scanner(System.in);
		System.out.print("로또 번호를 입력하세요(1 ~ 45): ");
		
		for(int i = 0 ; i < lotto.length ; i++)
		{
			lotto[i] = s1.nextInt();
			if(lotto[i] > 45 || lotto[i] < 1)
			{
				System.out.println("1 과 45 사이의 값을 입력하세요");
				i--;
			}
		}
	
		System.out.print("당첨번호는 : ");
		for(int i = 0 ; i < array.length ; i++)
		{
			Random r1 = new Random();
			int num = r1.nextInt(44)+1;
			array[i] =num;
			System.out.print(num + " ");
		}
		System.out.println(" 입니다.");
		
		for(int i = 0; i < 7 ; i++) {
			for(int j = 0; j < 7 ; j++)
				if(lotto[i] == array[j])
						hit++;
		}
		switch(hit) {
		case 0 : System.out.println("죄송합니다. 꽝입니다.");
			break;
		case 1 : System.out.println("죄송합니다. 꽝입니다.");
			break;
		case 2 : System.out.println("죄송합니다. 꽝입니다.");
			break;
		case 3 : System.out.println("축하드립니다. 5등 당첨입니다!");
			break;
		case 4 : System.out.println("축하드립니다. 4등 당첨입니다!");
			break;
		case 5 : System.out.println("축하드립니다. 3등 당첨입니다!");
			break;
		case 6 : System.out.println("축하드립니다. 2등 당첨입니다!");
			break;
		case 7 : System.out.println("축하드립니다. 1등 당첨입니다!");
			break;
		}
		System.out.println(hit +"개 맞추셨습니다. ");
	}

}
