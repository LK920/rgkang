package sub2;
/*
 * date : 2020/05/01
 * name : ������
 * contest : For �ݺ��� �ǽ��ϱ�
 */

public class ForTest {
	public static void main(String[] args) {
		
		//for(�ʱ��; ���ǽ�; ������) {}
		for(int i =1 ; i<=2 ; i++) {
			System.out.println("Hello Java!");
			}
		// for �ݺ��� ���� ��� : ���� i�� 1�̰� i�� 2���� ������ ���̸� ����ϰ�, i++�� ���� i�� 2�� �ǰ� 2�� �� i�� 2�� ������ ���̴�.
		// �ٽ� �����Ͽ� 3�̸�� ������ ������ 2���� ����� �����.
		
		
		//1���� 10���� ��
		int sum = 0;
		for(int k =1 ; k<=10; k++) {
			sum += k;
		}
		System.out.println("1���� 10���� �� : "+sum);
		
		//1���� 10���� ¦����
		int eSum = 0;
		for(int k = 1; k<=10; k++) {
			if( k % 2 == 0) {
				eSum +=k;	
			}
		}
		System.out.println("1���� 10���� ¦���� : "+eSum);

		//���� for 
		for(int a=1; a<=3; a++) {
			System.out.println("a : "+a);
			for(int b=1;b<=5; b++) {
				System.out.println("b : "+b);	
			}
		}
		//������
		for(int x = 2 ; x<=3;x++) {
			System.out.println(x+"��");
			for(int y = 1;y<=9;y++ ) {
				int z  = x * y;
				System.out.println(x+" x "+y+" = "+z);
			}
		}
		//�� �ﰢ�� I
		for(int start = 1; start <=10 ; start++) {
			
			for(int end=1; end <= start; end++) {
				System.out.print("��");
			}
			System.out.print("\n");
		}
		//�� �ﰢ��I ����
		for(int start = 10; start >=1 ; start--) {
			
			for(int end=1; end <= start; end++) {
				System.out.print("��");
			}
			System.out.print("\n");
		}
		//�� �ﰢ�� II
		for(int a = 1; a<=5; a++) {
			
			for(int b= 1; b<=5-a;b++) {
				System.out.print("��");
			}
			for(int c =1; c<=a; c++) {
				System.out.print("��");
			}
			System.out.println();
		}
	}

}