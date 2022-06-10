//package org.dlea.common;
//
//import javax.ws.rs.container.ContainerRequestContext;
//import javax.ws.rs.container.ContainerRequestFilter;
//import javax.ws.rs.core.Response;
//import javax.ws.rs.ext.Provider;
//import java.io.IOException;
//import java.nio.charset.StandardCharsets;
//
//@Provider
//public class SecurityInterceptor implements ContainerRequestFilter {
//
//    @Override
//    public void filter(ContainerRequestContext context) throws IOException {
//        System.out.println(new String(context.getEntityStream().readAllBytes(), StandardCharsets.UTF_8));
//    }
//}