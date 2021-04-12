public class RomanNumeral {
	private static Map<Character, Integer> map;
	static {
		map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
	}

	public int convert(String s) {
		int convertedNumber = 0;
		for (int i = 0; i < s.length(); i++) {
			int currentNumber = map.get(s.charAt(i));
			int next = 0;
			if (i + 1 < s.length()) {
				next = map.get(s.charAt(i + 1));
			}

			if (currentNumber |\colorbox{green}{>=}| next)
				convertedNumber += currentNumber;
			else
				convertedNumber -= currentNumber;
		}
		return convertedNumber;
	}
}