package java_04_���ǹ�_�ݺ���;

public class Memo {
	
	/*
	 
	��  str.equals("yes") -> ��ҹ��� ����
	��  str.equalsIgnoreCase("yes") -> ��ҹ��� ���о���
	
	��switch��
	 - ���ǹ��� ������ if������ ��������
	 - (���ǽ�) ����� ���� �Ǵ� ���ڿ��̾�� �Ѵ�.
	 - case���� ���� ���� ���(��������) , ���ڿ��� �����ϸ�, �ߺ������ʾƾ��Ѵ�.
	�� switch���� if������ �����̰���
	��if���� switch������ ���� �ȵɋ��� ����(�������ǋ�����..)
	
	��Math.random();
	 - 0.0 <= Math.ramdom() < 1.0
	 - ���ϴ� ���� ������ ����¹�
	   ex) 1~10���� ����
	    -> (int)(Math.ramdom()*10)+1
	    
	��    do-while��
	 - �ּ� �ѹ��̻� ������ ������
	 - �Է��� ������ ����ϴ°� ����
	 
	�� break��
	 - �ڽ��� ���� �ϳ��� �ݺ����� �������´�. 
	
	�� continue��
	 - �ڽ��� ���Ե� �ݺ��� ������ �̵�-�����ݺ����� �Ѿ 
	
	�� �̸����� �ݺ��� break;
	 - �ݺ����� �̸��� ���̰� break �ݺ����̸�; -> �ش� �̸� �ݺ����� �������´�. 
	 - �����ִٴ� �������˰�����! ���� ��������.
	
	*/
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	
//		for(int i=0;i<5;i++) {
//			for(int j =0;j<10;j++) {
//				System.out.printf("*");
//			}
//			System.out.println();
//		}
		int i = 0;
		while(5>i) {
			System.out.println("*****");
			i++;
		}
	}

}
