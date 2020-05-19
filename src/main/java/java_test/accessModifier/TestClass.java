package java_test.accessModifier;

public class TestClass {
	public Integer pValue;
	
	protected Integer proValue;
	
	private Integer privateValue;
	
	public Integer getPrivateValue() {
		return privateValue;
	}

	public void setPrivateValue(Integer privateValue) {
		this.privateValue = privateValue;
	}

	public TestClass (Integer value) {
		this.pValue = value;
		this.proValue = value;
		this.privateValue = value;
	}
}
