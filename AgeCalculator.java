import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {

	public static void main(String[] args)
	{
		
		LocalDate today = LocalDate.now();
		LocalDate birthDate = LocalDate.of(1989, 11, 12);
		int years = Period.between(birthDate, today).getYears();
		System.out.println(years);

	}

}
