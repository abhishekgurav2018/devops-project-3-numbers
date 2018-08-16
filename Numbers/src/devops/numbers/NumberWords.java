package devops.numbers;

public class NumberWords {
	private String[] units = {"Zero","One","Two","Three","Four","Five","Six",
			"Seven", "Eight", "Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen",
			"Sixteen","Seventeen","Eighteen","Nineteen"};
	private String[] tens = {"Twenty","Thirty","Fourty","Fifty",
			"Sixty","Seventy","Eighty","Ninety"};
		
	public String toWords( int number ) {
		String result = null;
		
		if (number == 0) {
			System.exit(0);
		}else if(number < 0) {
			result = "Number out of range";
			return result;
		}
		
		if (number < 20) {
			return units[number];
		}
		
		result = lessThan100(number) == null ? lessThan1000(number) : lessThan100(number);
		
		if (result == null) {
			result = "Number out of range";
		}
		
		return result;
	}
	
	private String lessThan100(int number) {
		if (number >=100)
			return null;
		
		if(number < 20) {
			return units[number];
		}
		
		StringBuilder result = new StringBuilder();
		
		int num = number % 10;
		int dividedValue = (number - num) / 10;
		
		result.append(tens[dividedValue - 2]);
		
		if(num != 0) {
			result.append(" ").append(units[num]);
		}
		
		return result.toString();
	}
	
	private String lessThan1000(int number) {
		if (number >= 1000) {
			return null;
		}
		
		StringBuilder result = new StringBuilder();
		
		int num = number % 100;
		
		int dividedValue = (number - num) / 100;
		
		result.append(units[dividedValue]).append(" ").append("Hundred");
		
		if(num != 0) {
			result.append(" ").append(lessThan100(num));
		}
		
		return result.toString();
	}
		
	
}