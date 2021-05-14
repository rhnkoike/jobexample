package org.acme.getting.started;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class Batch implements QuarkusApplication {

    @Override
    public int run(String... args) throws Exception {
        Thread.sleep(10000);
        System.out.println("Success Batch Execution.");
        return 0;
    }
    
}
