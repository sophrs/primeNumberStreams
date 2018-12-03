package primesStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeStreams {
	
	public static void main(String[] args) {
		
		List<Integer>numbers = Arrays.asList(10,7,3,9,11);
		
		List<Integer>primes = numbers.stream().filter(prime -> {
				{ for (int i =2; i< prime ;i++) {
					if (prime %i == 0) 
						return false;}
				
				return true;
				}}).sorted().collect(Collectors.toList());
		
		
		System.out.println(numbers);
		System.out.println(primes);
				}
		
	
		
		
	



	}
	