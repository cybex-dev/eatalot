package controllers;

public class $model;format="Camel"$ControllerTest extends WithApplication {

    @Override
    protected Application provideApplication() {
        return new GuiceApplicationBuilder().build();
    }

    @Test
    public void test$model;format="Camel"$Get() {
        RequestBuilder request = new RequestBuilder()
                .method(GET)
                .uri("/$model;format="camel"$");

        Result result = route(app, request);
        assertEquals(OK, result.status());
    }

    @Test
    public void test$model;format="Camel"$Post() {
        HashMap<String, String> formData = new HashMap<>();
        formData.put("name", "play");
        formData.put("age", "4");
        RequestBuilder request = addCSRFToken(new RequestBuilder()
                .header(Http.HeaderNames.HOST, "localhost")
                .method(POST)
                .bodyForm(formData)
                .uri("/$model;format="camel"$"));

        Result result = route(app, request);
        assertEquals(SEE_OTHER, result.status());
    }

}
