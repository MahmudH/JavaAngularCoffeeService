package com.coffeeservice;

import com.coffeeservice.resources.CoffeeServiceResource;
import com.mongodb.MongoClient;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.assets.AssetsBundle;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

public class CoffeeService extends Service<CoffeeServiceConfiguration>{

    public static void main(String[] args) throws Exception {
        new CoffeeService().run(args);
    }

    public void initialize(Bootstrap<CoffeeServiceConfiguration> bootstrap) {
        AssetsBundle bundle = new AssetsBundle("/html", "/");
        bootstrap.addBundle(bundle);
    }

    public void run(CoffeeServiceConfiguration coffeeServiceConfiguration, Environment environment) throws Exception {
        environment.addResource(new CoffeeServiceResource(new MongoClient()));
    }
}
