package ga.banga.entgeo.config

import io.swagger.v3.oas.models.ExternalDocumentation
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.License
import org.springdoc.core.GroupedOpenApi
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
//@EnableSwagger2
class SwaggerConfig {
//    @Bean
//    fun api(): Docket {
//        return Docket(DocumentationType.SWAGGER_2)
//            .groupName("API")
//            .select()
//            .apis(RequestHandlerSelectors.basePackage("ga.banga.entgeo.api")) //demander à Swagger de ne rien documenter en dehors du package "demat" qui contient notre code
//            .paths(PathSelectors.regex("/api.*")) // permet de passer une expression régulière qui n'accepte que les URI commençant par /agents.
//            .build()
//        //                .apiInfo(apiInfo());
//    }

    @Bean
    fun publicApiV1(): GroupedOpenApi {
        return GroupedOpenApi.builder()
            .group("gabon-geo-v1")
            .pathsToMatch("/api/v1/**")
            .build()
    }
//    @Bean
//    fun publicApiV2(): GroupedOpenApi {
//        return GroupedOpenApi.builder()
//            .group("gabon-geo-v2")
//            .pathsToMatch("/api/v2/**")
//            .build()
//    }

//    @Bean
//    fun adminApi(): GroupedOpenApi {
//        return GroupedOpenApi.builder()
//            .group("springshop-admin")
//            .pathsToMatch("/admin/**")
//            .build()
//    }

    @Bean
    fun springShopOpenAPI(): OpenAPI? {
        return OpenAPI()
            .info(
                Info().title("GabonGeo API")
                    .description("Application de gestion des entites geographiques")
                    .version("v0.0.1")
                    .license(License().name("GPL 2.0").url("https://github.com/bangaromaric/api-geo/blob/main/LICENSE"))
            )
            .externalDocs(
                ExternalDocumentation()
                    .description("Wiki Documentation")
                    .url("#")
            )
    }




//    private fun apiInfo(): ApiInfo {
//        val description = "REST pour la gestion EntGeo"
//        val contact = Contact("Hendi Santika", "http://hendisantika.wordpress.com", "hendisantika@gmail.com")
//
//        return ApiInfoBuilder()
//            .title("REST Entgeo")
//            .description(description)
//            .termsOfServiceUrl("github")
//            .license("ANINF")
//            .licenseUrl("")
//            .contact(contact)
//            .version("1.0") //.contact(new Contact("siamak"))
//            .build()
//    }
}