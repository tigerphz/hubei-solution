package system.manager.web;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebApplicationTests {

	List<Student> datas;

	@Before
	public void init() {
		Random random = new Random();

		datas = new ArrayList<>();

		for (int i = 0; i <= 100; i++) {
			datas.add(new Student("student" + i, random.nextInt(50) + 50));
		}
	}

	@Test
	public void test() {
		List<String> studentList = datas.stream()
				.filter(x -> x.getScore() > 85)
				.sorted(Comparator.comparing(Student::getScore).reversed())
				.map(Student::getName)
				.collect(Collectors.toList());

		studentList.stream().forEach(System.out::println);
	}

	@Test
	public void testUnlimitStream1(){
		Stream.iterate(0,x->x+1).limit(10).forEach(System.out::println);
		//Stream.iterate(0,x->x).limit(10).forEach(System.out::println);
		//Stream.iterate(0,x->x).limit(10).forEach(System.out::println);与如下代码意思是一样的
		//Stream.iterate(0, UnaryOperator.identity()).limit(10).forEach(System.out::println);
	}

	@Test
	public void testMap() {
		String[] arr = new String[]{"yes", "YES", "no", "NO"};
		Arrays.stream(arr).map(x -> x.toLowerCase()).forEach(x -> {
			System.out.println(x);
			System.out.println(x);
		});
	}

	@Test
	public void testFlapMap1() {
		String[] arr1 = {"a", "b", "c", "d"};
		String[] arr2 = {"e", "f", "c", "d"};
		String[] arr3 = {"h", "j", "c", "d"};
		// Stream.of(arr1, arr2, arr3).flatMap(x -> Arrays.stream(x)).forEach(System.out::println);
		Stream.of(arr1, arr2, arr3).flatMap(Arrays::stream).forEach(System.out::println);
	}

	@Test
	public void contextLoads() {
	}

	public class Student {

		public Student(String name, Integer score) {
			this.name = name;
			this.score = score;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getScore() {
			return score;
		}

		public void setScore(Integer score) {
			this.score = score;
		}

		private String name;
		private Integer score;
	}
}


