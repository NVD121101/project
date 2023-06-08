package mta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class EMSApplication {
  public static void main(String[] args) {
    SpringApplication.run(EMSApplication.class, args);

  }

}
