package com.mercadolibre.config;

public enum Local {
  INSTANCE;

  private final int maxFails = 22;
  private final String defaultMessage = "default response for every transaction";

  public String defaultResponse() {
    return defaultMessage;
  }

  public Integer maxAllowedFailures() {
    return maxFails;
  }
}
