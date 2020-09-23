package ru.miroque.play.elk;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Slf4j
@Component
@Path("/foo")
public class ApiElk {
    @GET
    @Produces("application/json")
    @Path("/")
    public String getBook() {
        log.info("[noname] -> api");
        log.info("[noname] <- api");
        return "It's goot to see you";
    }
}
