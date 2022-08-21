package com.coffeepoweredcrew.abstractfactory2;

import com.coffeepoweredcrew.abstractfactory2.aws.AwsResourceFactory;
import com.coffeepoweredcrew.abstractfactory2.gcp.GoogleResourceFactory;

public class Client {

    ResourceFactory resourceFactory;

    public Client(ResourceFactory resourceFactory){
        this.resourceFactory = resourceFactory;
    }

    public Instance provisionateResources(Instance.Capacity capacity, int storageMB){
        Instance instance = resourceFactory.createInstance(capacity);
        instance.attachStorage(resourceFactory.createStorage(storageMB));
        return instance;
    }

    public static void main(String[] args) {
        Client client = new Client(new AwsResourceFactory());
        Instance i1 = client.provisionateResources(Instance.Capacity.large, 52000);
        i1.start();
        i1.stop();

        System.out.println("***************************************************");

        client = new Client(new GoogleResourceFactory());
        i1 = client.provisionateResources(Instance.Capacity.micro, 128000);
        i1.start();
        i1.stop();
    	
    }

}
