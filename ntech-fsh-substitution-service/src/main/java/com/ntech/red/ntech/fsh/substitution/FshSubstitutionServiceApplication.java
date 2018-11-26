package com.ntech.red.ntech.fsh.substitution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class FshSubstitutionServiceApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(FshSubstitutionServiceApplication.class, args);
    }
}
