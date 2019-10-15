/* Licensed under Apache-2.0 */
package com.grafana.api.exceptions;

import okhttp3.ResponseBody;

import java.io.IOException;

public class GrafanaException extends Exception {

  public static GrafanaException withErrorBody(ResponseBody body) throws IOException {
    return body != null
        ? new GrafanaException("Unexpected Grafana error; " + body.string())
        : new GrafanaException("Unexpected Grafana error");
  }

  public GrafanaException(String message) {
    super(message);
  }

  public GrafanaException(String message, Throwable cause) {
    super(message, cause);
  }
}