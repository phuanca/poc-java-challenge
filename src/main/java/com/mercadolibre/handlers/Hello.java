package com.mercadolibre.handlers;

import io.javalin.http.Context;

public class Hello {

  public static Object sayHello(Context ctx) {
    return ctx.json("Hello Buddy!");
  }
}
