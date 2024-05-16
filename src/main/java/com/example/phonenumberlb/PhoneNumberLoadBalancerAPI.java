package com.example.phonenumberlb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriBuilderFactory;
import org.springframework.web.util.UriComponentsBuilder;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.Map;


public class PhoneNumberLoadBalancerAPI {
//    private final WebClient webClient;
//    @Autowired
//    private ApplicationContext applicationContext;
//    @Autowired
//    LoadBalancerClient loadBalancerClient;
//    PhoneNumberLoadBalancerAPI() {
//        this.webClient = WebClient.builder().build();
//
//
//    }
//    @RequestMapping(value = "/**", method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
//    public ResponseEntity<String> anyPath(@RequestParam(required = false) MultiValueMap<String, String> params, @RequestHeader(required = false) MultiValueMap<String, String> headers, @RequestBody(required = false) String body) {
//        // Request to load balanced resource here
////        System.out.println(loadBalancerClient.choose("example-service"));
//        ServiceInstance serviceInstance = loadBalancerClient.choose("example-service");
//        System.out.println(serviceInstance);
//
//        String s_uri = serviceInstance.getUri().toString();
//        URI uri = serviceInstance.getUri();
//        String nURI = UriComponentsBuilder.fromHttpUrl(s_uri).path("getAllUsersData").queryParams(params).build().toUriString();
//        System.out.println(nURI);
//
//        String contextPath = serviceInstance.getMetadata().get("configPath");
//        ResponseEntity<String> response =
//                    webClient.get().uri(nURI).headers( httpHeadersOnWebClientBeingBuilt -> {
//                        httpHeadersOnWebClientBeingBuilt.addAll( headers );
//                    }).retrieve().toEntity(String.class).onErrorResume(e -> {
//                                if (e instanceof WebClientResponseException responseException) { // Propagate 4xx errors
//                                    if (responseException.getStatusCode().is4xxClientError()) {
//                                        return Mono.error(new ResponseStatusException(responseException.getStatusCode()));
//                                    }
//                                }
//                                return Mono.error(e);
//                            }).block();
//        System.out.println(response);
//        return response;
//    }
}
