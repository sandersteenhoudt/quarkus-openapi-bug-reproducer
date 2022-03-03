package com.example;

import com.example.model.Cookie;
import com.example.model.CookieImpl;
import com.example.model.ImmutableImmutablesCookie;
import com.example.model.ImmutablesCookie;
import io.smallrye.common.annotation.Blocking;
import io.smallrye.mutiny.Uni;
import java.util.Collections;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("cookies")
public class CookieResource {

  @GET
  @Path("interface")
  @Blocking
  public List<Cookie> getCookiesAsInterface() {
    return Collections.emptyList();
  }

  @GET
  @Path("implementation")
  @Blocking
  public List<CookieImpl> getCookiesAsImplementation() {
    return Collections.emptyList();
  }


  @GET
  @Path("async")
  public Uni<List<Cookie>> getAsyncCookies() {
    return Uni.createFrom().item(Collections.emptyList());
  }

  @GET
  @Path("immutables/interface")
  public List<ImmutablesCookie> immutablesCookiesAsInterface() {
    return Collections.emptyList();
  }

  @GET
  @Path("immutables/implementation")
  public List<ImmutableImmutablesCookie> immutablesCookiesAsImplementation() {
    return Collections.emptyList();
  }
}
