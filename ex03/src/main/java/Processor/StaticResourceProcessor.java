package Processor;

import Requrest.Request;
import Requrest.Response;
import connector.http.HttpRequest;
import connector.http.HttpResponse;

import javax.servlet.ServletException;
import java.io.IOException;

public class StaticResourceProcessor implements IProcessor {


    @Override
    public void process(HttpRequest request, HttpResponse response) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, ServletException {
        response.sendStaticResource();
    }
}
