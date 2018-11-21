package streamExercise3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		
		List<String> myName = Arrays.asList("hello", "my", "name", "is", "dave");
		
		Optional<String> newMyName = myName.stream().reduce((part1, part2) -> part1 + " " + part2);
		
		newMyName.ifPresent(System.out::println);
		
		// using the joining method: String newMyName = myName.stream().collect(Collectors.joining(" "));
		
		//System.out.println(newMyName);
		
	}

}
