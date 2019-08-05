package com.example.demo;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/* System.out.println("Spring standalone Projects"); */
		Employe em = new Employe();
		/*
		 * em.setEmpid(2); System.out.println(em.getEmpid()); em.setName("Sai");
		 * System.out.println(em.getName()); em.setDesgiantion("Software developwe");
		 * System.out.println(em.getDesgiantion()); em.setDoj(new Date());
		 * System.out.println(em.getDoj());
		 * 
		 * employeeRepository.save(em);
		 * 
		 * System.out.println("Success");
		 */
		
		List<Employe> eList = employeeRepository.findAll();
		eList.forEach(System.out::println);
	}

}
