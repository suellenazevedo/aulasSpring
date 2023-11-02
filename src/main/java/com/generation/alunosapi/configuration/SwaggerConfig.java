package com.generation.alunosapi.configuration;

import org.springdoc.core.customizers.OpenApiCustomizer;
import org.springframework.context.annotation.*;

import io.swagger.v3.oas.models.*;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.responses.ApiResponses;

@Configuration
public class SwaggerConfig {
	
	@Bean
	OpenAPI springAlunosApiOpenApi() {
		return new OpenAPI()
				.info(new Info()
						.title("Alunos API")
						.description("API de Alunos")
						.version("v0.0.1")
						.contact(new Contact()
								.name("Suellen Azevedo")
								.url("https://github.com/suellenazevedo")
								.email("suellen.azevedo13@gmail.com")));
						
	}
	
	@Bean
	OpenApiCustomizer customerGlobalHeaderOpenApiCustomiser() {
		
		return openApi -> {
			openApi.getPaths().values().forEach(pathItem -> pathItem.readOperations()
					.forEach(operation -> {
						
						ApiResponses apiResponses = operation.getResponses();
						
						apiResponses.addApiResponse("200", createApiResponse("Operação Sucedida"));
						apiResponses.addApiResponse("201", createApiResponse("Aluno Criado"));
						apiResponses.addApiResponse("204", createApiResponse("Aluno Excluido"));
						apiResponses.addApiResponse("400", createApiResponse("Erro na Requisição"));
						apiResponses.addApiResponse("401", createApiResponse("Operação Sucedida"));
						apiResponses.addApiResponse("403", createApiResponse("Acesso Negado"));
						apiResponses.addApiResponse("404", createApiResponse("Aluno não encontrado"));
						apiResponses.addApiResponse("500", createApiResponse("Erro no Servidor"));
					}));
		};
	}

	private ApiResponse createApiResponse(String message) {
		
		return new ApiResponse().description(message);
	}
}
