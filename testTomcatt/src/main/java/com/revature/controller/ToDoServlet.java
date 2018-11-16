package com.revature.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.beans.ToDo;

public class ToDoServlet extends HttpServlet {
    
    /**
     * 
     */	
    private static final long serialVersionUID = -7950849995569747989L;

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException { 
        ToDo todo = new ToDo();
        todo.setName("Clean Room");
        todo.setPriority(0);
        
/*        int i = Integer.parseInt(req.getParameter("id"));
        
        if (i >= 10) {
        	res.setStatus(404);
        	return;
        }
        */
        System.out.println(req.getParameter("id"));
        System.out.println(req.getParameter("priority"));
        ObjectMapper mapper = new ObjectMapper();
        res.setHeader("Content-Type", "application/json");
        mapper.writeValue(res.getOutputStream(), todo);
    }
    
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
    	ServletConfig sc = getServletConfig();
    	System.out.println(sc.getInitParameter("Days"));
    	
    	System.out.println(getServletContext().getInitParameter("Age"));
    	
    	ToDo newTodo = new ObjectMapper().readValue(req.getReader(), ToDo.class);
    	System.out.println(newTodo);
    }
    
}

