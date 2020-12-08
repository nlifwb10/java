package study.sanghoon;

import java.io.File;
import java.io.IOException;

//import java.util.Date;

//import java.util.Date;

public class Memo_8�� {
	
	
	/*	
	  
	  �� ���α׷� ����
	  - ������ ���� : ������ �� �� �߻��ϴ� ����
	  - ��Ÿ�� ���� : ���� �� �� �߻��ϴ� ����
	  - ���� ���� : �ۼ� �ǵ��� �ٸ��� ����
	  
	  �� ��Ÿ�� ���� �ΰ���
	  - ���� : �̾��� ����
	  - ����  : �ɰ��� ����
	  
	   �� Exception �� RuntimeException 
	   - Exception : ������� �Ǽ��� ���� ������ ���ο� ���� �߻��ϴ� ����
	   - RuntimeExceptionŬ������ : ���α׷����� �Ǽ��� �߻��ϴ� ����
	  
	  �� try - catch��
	  - ���ܹ߻� catch���� ���� ù��°���� Ȯ���Ѵ����� ������ ��������.
	        ���࿡ ������ catch�� ��ã��. �ٵ� ������ �ٽú�������.
	  - ����ó���� ���ϸ� ���������� ���α׷� ���ᰡ��!!!!
	  ex) try {
	  			System.out.print(0/0) ->ArithmeticException���߻�
	  	  } catch (ArithmeticException ae){
	  	  	
	  	  } catch (Exception e ){
	  	   -->Exception�� �Ǹ��������;��Ѵ�. ��� ���ܸ� ó���ϹǷ�..	  	  
	  	    
	  	  }
	  	  
	   �� printStackTrace() �� getMessage()
	   - printStackTrace() : ���ܹ߻� ����� ȣ�⽺��(Call Stack)�� �־��� �޼����� ������ ���� �޽����� ȭ�鿡 ����Ѵ�.
	   - getMessage() : �߻��� ����Ŭ������ �ν��Ͻ��� ����� �޽����� ���� �� �ִ�.
	   
	   
	   �� ��Ƽ catch��
	   - ������ ���� catch���� �ϳ��� ��ģ ��
	   - catch (ExceptionA | ExceptionB e)
	   - ���� -> catch (ParentException | ChildException e) // ����! �θ��ڽ� ���� x
	   - �ֳ��ϸ� ParentException ������ ChildException �� �Ƚᵵ��! �θ�Ŭ�����ξ���� ������?������..�ε�
	   
	   �� ���� �߻���Ű��
	   1. ������ new�� �̿��ؼ� �߻���Ű���� ����Ŭ������ ��ü�� �������
	   2. Ű���� throw�� �̿��ؼ� ���ܸ� �߻���Ų��.
	   ex) Exception e = new Exception("���Ƿ� �߻�!");
	   	   throw e;
	    
	    �� checked ���� , unchecked ����
	    - checked ���� : �����Ϸ��� ���� ó�� ���θ� üũ (���� ó�� �ʼ�)--> Exception 
	    - unchecked ���� : �����Ϸ��� ���� ó�� ���θ� üũ ����(���� ó�� ����) --> RuntimeException
	      
	    ��  �޼��忡 ���� �����ϱ�
	    - ���ܸ� ó���ϴ� ��� : try-catch�� , ���� �����ϱ� ,���� ,�̷��� 3�������������.
	    - ����� try-catch ���� ���µ� catch���� �ƹ��͵� �Ⱦ��°���
	    
	    ��  ���� �Ǵ�����
	    - ���ܸ� catch������ throw e; �ؼ� �ٽ� �߻���Ű��(ȣ���Ѱ�����)
	    	  
	     ��  ����� ����
	    - �� ���ܰ� �ٸ� ���ܸ� �߻���ų �� �ִ�.
	    - ���� A�� ���� B�� �߻���Ű�� A�� B�� ���� ����(cause exception)
	    - ������ ? ���� ���ܸ� �ϳ��� ��� �ٷ�����ؼ� ����ȿ��ܸ� ����.
	    - checked ���ܸ� -> unchecked ���ܷ� �����Ҷ� �����!
	    
	  
	      
	    
	*/

	public static void main(String[] args) {
		
		try {
			System.out.println(0/0);
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			System.out.println("���̳θ�");
		}
		System.out.println("��");
		
	}
	
}



