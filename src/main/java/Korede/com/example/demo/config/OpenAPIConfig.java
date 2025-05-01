package Korede.com.example.demo.config;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {
    @Bean
    public OpenAPI studentsAPI(){
        return new OpenAPI().info(new Info().title("Student API").version("1.0").description("Student application shii"));
    }
}
