package project11;

// ���� ���� ó���� �ϱ� ���ؼ��� �ݵ�� Exception�� ��ӹ޾ƾ� �Ѵ�.
public class SubException extends Exception {
	public SubException(String msg) { 
		super(msg); // �ܺο��� �޾ƿ��� �����͸� Exception���� �������ش�.
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage() + " ������ 0 ~ 100���� �Դϴ�.";
	}
}
