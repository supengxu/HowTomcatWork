package Processor;

import Requrest.Request;
import Requrest.Response;

import java.io.IOException;

public class StaticResourceProcessor implements IProcessor {
    @Override
    public void process(Request request, Response response) throws IOException {
        response.sendStaticResource();
    }
}
