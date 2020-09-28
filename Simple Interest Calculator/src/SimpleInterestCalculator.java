import java.math.BigDecimal;


public class SimpleInterestCalculator {
	 
	BigDecimal principal;
	BigDecimal interest;
	
	public SimpleInterestCalculator(String principal,String interest) {
		this.principal =new BigDecimal(principal);
		this.interest =new BigDecimal (interest).divide(new BigDecimal (100));
	}

	public BigDecimal CalculateTotalValue(int noOfYears) {
		BigDecimal noOfYearsBigDecimal = new BigDecimal (noOfYears);
		BigDecimal sum = principal.add(principal
							.multiply(interest)
							.multiply(noOfYearsBigDecimal));
				return sum;
				
		
	}
	
}
