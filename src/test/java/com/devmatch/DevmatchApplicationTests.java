package com.devmatch;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.devmatch.model.Person;
import com.devmatch.repository.PersonRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DevmatchApplicationTests {
	
	@Autowired
	private PersonRepository personRepository;

	@Test
	public void contextLoads() {
		Person person = new Person();
		person.setFirstName("Eduardo");
		person.setLastName("Rodrigues");
		personRepository.save(person);
		assertThat(personRepository.count()).isEqualTo(1);
	}

}
