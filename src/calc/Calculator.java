package calc;

public class Calculator {
	StringBuilder op1 = new StringBuilder();
	StringBuilder currentOp = op1;
	StringBuilder op2 = new StringBuilder();
	
	String operation;
	String result;

	
	@Override
	public String toString() {
		return "Calculator [op1=" + op1 + ", op2=" + op2 + ", operation=" + operation + ", result=" + result + "]";
	}
	
	public String displayString() {
		StringBuilder sb = new StringBuilder();
		sb.append(op1);
		if(operation !=  null) {
			sb.append(operation);
		}
		sb.append(op2);
		if(result != null) {
			sb.append("=").append(result);
		}
		return sb.toString();
	}

	public String digit(String d) {
		currentOp.append(d);
		return d;
	}
	
	public String operation(String op) {
		operation = op;
		currentOp = op2;
		return op;
	}
	
	public String compute() {
		Double d1 = Double.parseDouble(op1.toString());
		Double d2 = Double.parseDouble(op2.toString());
		
		
		if("+".equals(operation)) {
			result = Double.toString(d1 + d2);
		} else if("-".equals(operation)) {
			result = Double.toString(d1 - d2);
		} else if("*".equals(operation)) {
			result = Double.toString(d1 * d2);
		} else if("/".equals(operation)) {
			result = Double.toString(d1 / d2);
		}
		
		return result;
	}

}
