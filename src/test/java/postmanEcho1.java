package ru.netology.rest;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

class  postmanEcho1{
    @Test
    void shouldReturnABody() {
// Given - When - Then
// Предусловия
given()
  .baseUri("https://postman-echo.com")
  .body("some value")
.when()
  .post("/post")
// Проверки
.then()
  .statusCode(200)
  .body("data", equalTo("some value"))
;
    }
}
