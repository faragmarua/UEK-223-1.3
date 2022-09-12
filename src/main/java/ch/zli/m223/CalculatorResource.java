package ch.zli.m223;



import javax.ws.rs.GET;

import javax.ws.rs.Path;

import javax.ws.rs.Produces;

import javax.ws.rs.core.MediaType;




@Path("/calculator")

public class CalculatorResource {



@GET

@Produces(MediaType.TEXT_PLAIN)

public String helloCalc() {

    return "This is a calculator";

}



@Path("/{zahl1}/{zahl2}")

@GET

public int calcTwoNumbers(int zahl1, int zahl2) {

    return zahl1 + zahl2;

}

    

}