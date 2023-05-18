package com.mercadolibre.handlers;

import io.javalin.http.Context;

public class Purchase {

  public static Object process(Context ctx) {
    return ctx.json("WIP");
  }
}
