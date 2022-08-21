package com.coffeepoweredcrew.abstractfactory2.gcp;

import com.coffeepoweredcrew.abstractfactory2.Instance;
import com.coffeepoweredcrew.abstractfactory2.ResourceFactory;
import com.coffeepoweredcrew.abstractfactory2.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {


    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int storageMb) {
        return new GoogleCloudStorage(storageMb);
    }
}
