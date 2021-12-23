package Processor;

import Requrest.Request;
import Requrest.Response;
import Server.HttpServer;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLStreamHandler;

public class ServletProcess implements IProcessor {

    @Override
    public void process(Request request, Response response) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, ServletException {
        String uri = request.getUri();
        String servletName = uri.substring(uri.lastIndexOf("/") + 1);
        URLClassLoader loader = null;
        URL[] urls = new URL[1];
        URLStreamHandler streamHandler = null;
        File classPath = new File(HttpServer.WEB_ROOT);
        String repository = (new URL("file",null,classPath.getCanonicalPath()+File.separator).toString());
        urls[0] = new URL(null,repository,streamHandler);
        loader = new URLClassLoader(urls);

        Class<?> myClass = loader.loadClass(servletName);

        Servlet servlet = (Servlet) myClass.newInstance();
        servlet.service(request,response);

    }
}
