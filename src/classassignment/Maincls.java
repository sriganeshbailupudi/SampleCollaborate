package classassignment;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Maincls {
		public static void main(String [] args) {
			Student s1 = new Student(1, "sg", "civil", 19);
			Student s2 = new Student(2, "sri", "bio-mech", 22);
			Student s3 = new Student(3, "bailu", "it", 18);
			Student s4 = new Student(4, "ganesh", "eee", 20);
			Student s5 = new Student(5, "hey", "ece", 20);
			
			List<Student> student = Arrays.asList(s1,s2,s3,s4,s5);
			Map<String, List<Integer>> map = student.stream().collect(Collectors.groupingBy(Student::getDept,Collectors.mapping(Student::getId, Collectors.toList())));	
			Map<String, List<Integer>> map1 = student.stream().collect(Collectors.groupingBy(Student::getName,Collectors.mapping(Student::getId, Collectors.toList())));	
			Map<Integer, List<Integer>> map2 = student.stream().collect(Collectors.groupingBy(Student::getAge,Collectors.mapping(Student::getId, Collectors.toList())));	
			
			System.out.println(map);
			System.out.println(map1);
			System.out.println(map2);
		}
}
