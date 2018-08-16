package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() { 
		numberWords = new NumberWords() ;
	}
	
	@Test
	public void numberOutOfRangeReturnsError() {
		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( -1 ) ) ;
	}
	
	@Test
	public void numberEqualToOne() {
		Assert.assertEquals( "One", "One", numberWords.toWords(1) ) ;
	}
	
	@Test
	public void numberLessThanTen() {
		Assert.assertEquals( "Nine", "Nine", numberWords.toWords(9)) ;
	}
	
	@Test
	public void numberLessThanNineteen() {
		Assert.assertEquals( "Eighteen", "Eighteen", numberWords.toWords(18 )) ;
	}
	
	@Test
	public void numberEqualToNineteen() {
		Assert.assertEquals( "Nineteen", "Nineteen", numberWords.toWords(19)) ;
	}
	
	@Test
	public void numberEqualToTwenty() {
		Assert.assertEquals( "Twenty", "Twenty", numberWords.toWords(20) ) ;
	}
	
	@Test
	public void numberFifty() {
		Assert.assertEquals("Fifty","Fifty", numberWords.toWords(50));
	}
	
	@Test
	public void numberFiftySeven() {
		Assert.assertEquals("Fifty Seven", "Fifty Seven", numberWords.toWords(57));
	}
	
	@Test
	public void numberGreaterThanTwenty() {
		Assert.assertEquals("Twenty One", "Twenty One", numberWords.toWords(21)) ;
	}
	
	@Test
	public void numberTwoDigit() {
		Assert.assertEquals( "Eighty Two", "Eighty Two", numberWords.toWords(82) ) ;
	}
	
	@Test
	public void numberLessThanHundred() {
		Assert.assertEquals( "Nighty Nine", "Ninety Nine", numberWords.toWords(99) ) ;
	}
	
	@Test
	public void numberEqualToHundred() {
		Assert.assertEquals( "One Hundred", "One Hundred", numberWords.toWords(100) ) ;
	}
	
	@Test
	public void numberGreaterThanHundred() {
		Assert.assertEquals( "One Hundred One", "One Hundred One", numberWords.toWords(101) ) ;
	}
	
	@Test
	public void numberLessThanThousand() {
		Assert.assertEquals("Nine Hundred Ninety Nine", "Nine Hundred Ninety Nine", numberWords.toWords(999)) ;
	}
	
	@Test
	public void numberOutOfRangeReturnsErrorGreaterThanThousand() {
		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( 1000 ) ) ;
	}
	
}
