package org.govnorganization.bookmanager.bookmweb.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

  @Value("${app.base-url:http://localhost:8080}")
  private String baseUrl;

  @Bean
  public OpenAPI customOpenAPI() {
    return new OpenAPI()
        .info(
            new Info()
                .title("Book Manager API")
                .version("1.0")
                .description("API " + "для управления книгами"))
        .servers(List.of(new Server().url(baseUrl).description("Current server")))
        .addSecurityItem(new SecurityRequirement().addList("basicAuth"))
        .components(
            new io.swagger.v3.oas.models.Components()
                .addSecuritySchemes(
                    "basicAuth",
                    new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("basic")));
  }
}
