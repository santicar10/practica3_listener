package com.example.practica3_listener;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class AplicationListener implements ServletContextListener, ServletRequestListener, HttpSessionListener {
    private ServletContext servletContext;

    public AplicationListener() {
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        sce.getServletContext().log("inicia la aplicación!");
        servletContext = sce.getServletContext();
        servletContext.setAttribute("mensaje", "Hola a todos desde la application!");

        //establece el mensaje a un attribute de el context del servleet
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        servletContext.log("inicializando el request!");
        sre.getServletRequest().setAttribute("mensaje", "guardando algún valor para el request");

        // establece el mensaje a un atributo de la peticion del servlet
    }
}

