package Testhere;

public class Prims {
	private int value1 = 1;
	private String value2 = "abc";
	private int value3 = 3;
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("-------------------");
		sb.append("\nValue1:").append(value1);
		sb.append("\nValue2:").append(value2);
		sb.append("\nValue3:").append(value3);
		sb.append("\n-------------------");
		return sb.toString();
	}

	public int getValue1() {
		return value1;
	}

	public void setValue1(int value1) {
		this.value1 = value1;
	}

	public String getValue2() {
		return value2;
	}

	public void setValue2(String value2) {
		this.value2 = value2;
	}

	public int getValue3() {
		return value3;
	}

	public void setValue3(int value3) {
		this.value3 = value3;
	}
	
	
}
