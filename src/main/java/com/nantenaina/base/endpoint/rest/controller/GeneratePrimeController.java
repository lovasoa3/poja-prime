package com.nantenaina.base.endpoint.rest.controller;

import java.math.BigInteger;
import java.util.Random;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneratePrimeController {

  @GetMapping("/new-prime")
  public BigInteger generatePrime(){
    BigInteger prime = BigInteger.probablePrime(10000,new Random());
    return prime;
  }

}
