package com.mercadolibre.router;

import com.mercadolibre.handlers.Hello;
import com.mercadolibre.handlers.Purchase;
import io.javalin.Javalin;

public class Router {

  public void addEndpoints(Javalin app) {

    app.get("/hello", Hello::sayHello);
    app.post("/purchase", Purchase::process);

  }
}
