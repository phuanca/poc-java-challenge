package com.mercadolibre;

import com.mercadolibre.config.Local;
import com.mercadolibre.router.Router;
import io.javalin.Javalin;

public class Main {
  public static void main(String[] args) {
    var app = Javalin.create();

    var router = new Router();

    router.addEndpoints(app);

    System.out.println(Local.INSTANCE.maxAllowedFailures());
    System.out.println(Local.INSTANCE.defaultResponse());

    app.start(7070);

  }
}