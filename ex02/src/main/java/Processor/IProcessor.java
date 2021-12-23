package Processor;


import Requrest.Request;
import Requrest.Response;

import javax.servlet.ServletException;
import java.io.IOException;

public interface IProcessor {

    public void process(Request request, Response response) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, ServletException;
}
