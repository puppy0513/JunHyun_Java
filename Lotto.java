import java.util.Random;
import java.util.Scanner;


public class Lotto {

	public static void main(String[] args) {
		
		int array[] = new int[7];			// ��÷��ȣ �迭
		int lotto[] = new int[7];			// user�� �Է��ϴ� �ζǹ�ȣ
		
		int hit = 0;						// user�� ���� �ζǰ���
		
		Scanner s1 = new Scanner(System.in);
		System.out.print("�ζ� ��ȣ�� �Է��ϼ���(1 ~ 45): ");
		
		for(int i = 0 ; i < lotto.length ; i++)
		{
			lotto[i] = s1.nextInt();
			if(lotto[i] > 45 || lotto[i] < 1)
			{
				System.out.println("1 �� 45 ������ ���� �Է��ϼ���");
				i--;
			}
		}
	
		System.out.print("��÷��ȣ�� : ");
		for(int i = 0 ; i < array.length ; i++)
		{
			Random r1 = new Random();
			int num = r1.nextInt(44)+1;
			array[i] =num;
			System.out.print(num + " ");
		}
		System.out.println(" �Դϴ�.");
		
		for(int i = 0; i < 7 ; i++) {
			for(int j = 0; j < 7 ; j++)
				if(lotto[i] == array[j])
						hit++;
		}
		switch(hit) {
		case 0 : System.out.println("�˼��մϴ�. ���Դϴ�.");
			break;
		case 1 : System.out.println("�˼��մϴ�. ���Դϴ�.");
			break;
		case 2 : System.out.println("�˼��մϴ�. ���Դϴ�.");
			break;
		case 3 : System.out.println("���ϵ帳�ϴ�. 5�� ��÷�Դϴ�!");
			break;
		case 4 : System.out.println("���ϵ帳�ϴ�. 4�� ��÷�Դϴ�!");
			break;
		case 5 : System.out.println("���ϵ帳�ϴ�. 3�� ��÷�Դϴ�!");
			break;
		case 6 : System.out.println("���ϵ帳�ϴ�. 2�� ��÷�Դϴ�!");
			break;
		case 7 : System.out.println("���ϵ帳�ϴ�. 1�� ��÷�Դϴ�!");
			break;
		}
		System.out.println(hit +"�� ���߼̽��ϴ�. ");
	}

}
