package com.sept2024.advance_java_concepts.lld1;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LldApplication {

	public static void main(String[] args) {

//		SpringApplication.run(LldApplication.class, args);

		Student Nirmal = new Student();
		Nirmal.name = "Nirmal";
		Nirmal.age = 22;
		Nirmal.psp = 90;

		Student Kumar = new Student();
		Kumar.name = "Kumar";
		Kumar.age = 29;
		Kumar.psp = 85;

		Nirmal.printDetails();
		Kumar.pauseCourse();
	}

}
