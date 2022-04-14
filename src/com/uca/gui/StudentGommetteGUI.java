package com.uca.gui;

import com.uca.core.*;
import com.uca.dao.*;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class StudentGommetteGUI { 

    public static String getStudentGommettes(int id) throws IOException, TemplateException {
        Configuration configuration = _FreeMarkerInitializer.getContext();

        Map<String, Object> input = new HashMap<>();

        input.put("studentGommettes", StudentGommetteCore.getStudentGommettes(id));
        input.put("particularStudent", new StudentDAO().getStudentById(id));

        Writer output = new StringWriter();
        Template template = configuration.getTemplate("users/studentGommettesID.ftl");
        template.setOutputEncoding("UTF-8");
        template.process(input, output);

        return output.toString();
    }

    public static String getAllStudentGommettes() throws IOException, TemplateException {
        Configuration configuration = _FreeMarkerInitializer.getContext();

        Map<String, Object> input = new HashMap<>();

        input.put("studentGommettes", StudentGommetteCore.getAllStudentGommettes());

        Writer output = new StringWriter();
        Template template = configuration.getTemplate("users/studentGommettes.ftl");
        template.setOutputEncoding("UTF-8");
        template.process(input, output);

        return output.toString();
    }
}
