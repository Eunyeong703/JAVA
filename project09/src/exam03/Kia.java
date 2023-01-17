package exam03;

public interface Kia {
	// 자동차에 필요한 제품의 일부분
	// 타이어 4개, 엔진 1개, 문 5개
	public static final int TIRE = 4;
	public static final int ENGINE = 1;
	int DOOR = 5;
	
	public abstract String getTire();
	String engineInfo();
	String doorInfo();
}
