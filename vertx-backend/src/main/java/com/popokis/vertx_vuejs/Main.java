package com.popokis.vertx_vuejs;

import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.StaticHandler;

/**
 * @author nicolas.vargas
 */
public final class Main {

    public static final Vertx vertx = Vertx.vertx();

    private Main() {}

    public static void main(String[] args) {
        String addr = System.getenv("VV_HTTP_ADDR");
        String port = System.getenv("VV_HTTP_PORT");
        HttpServer httpServer = vertx.createHttpServer();
        Router router = Router.router(vertx);

        router.route("/*").handler(StaticHandler.create("public"));

        httpServer.requestHandler(router).listen(Integer.parseInt(port), addr);
    }
}
