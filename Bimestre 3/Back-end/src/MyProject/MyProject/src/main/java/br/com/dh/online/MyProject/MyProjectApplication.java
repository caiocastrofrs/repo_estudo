package br.com.dh.online.MyProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MyProjectApplication {

	@RequestMapping("/")
	String home() {
		return "<h1 style='color: red;margin: 100px; font-family: Trebuchet MS;font-size: 10000px;display:inline-block;'>Hello World GRANDAÇO</h1>";
	}
	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}

}
