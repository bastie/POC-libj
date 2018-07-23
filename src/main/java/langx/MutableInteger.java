/**
 * 
 */
package langx;

/**
 * @author Sͬeͥbͭaͭsͤtͬian
 *
 */
public class MutableInteger extends Number {
	
	private int value = 0;

	public MutableInteger() {
		this(0);
	}
	
	public MutableInteger(int newIntValue) {
		this.setValue(newIntValue);
	}
	
	public void setValue (int newIntValue) {
		this.value = newIntValue;
	}
	
	@Override
	public int intValue() {
		return value;
	}

	@Override
	public long longValue() {
		return value;
	}

	@Override
	public float floatValue() {
		return value;
	}

	@Override
	public double doubleValue() {
		return value;
	}

	@Override
	public int hashCode() {
		return this.intValue();
	}
	
	@Override
	public String toString() {
		return Integer.toString(this.intValue());
	}
	
	public static MutableInteger valueOf (int newIntValue) {
		return new MutableInteger(newIntValue);
	}
	
	public Integer integerValue () {
		return Integer.valueOf(this.intValue());
	}
}
