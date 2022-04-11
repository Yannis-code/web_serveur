package com.uca.gui;

import com.uca.core.StudentCore;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class StudentGUI { 


    public static String getAllGommettes() throws IOException, TemplateException {
        Configuration configuration = _FreeMarkerInitializer.getContext();

        Map<String, Object> input = new HashMap<>();

        input.put("gommettes", StudentCore.getAllGommettes());

        Writer output = new StringWriter();
        Template template = configuration.getTemplate("users/gommettes.ftl");
        template.setOutputEncoding("UTF-8");
        template.process(input, output);

        return output.toString();
    }

    public static String getStudentGommettes(int id) throws IOException, TemplateException {
        Configuration configuration = _FreeMarkerInitializer.getContext();

        Map<String, Object> input = new HashMap<>();

        input.put("gommettes", StudentCore.getStudentGommettes(id));

        Writer output = new StringWriter();
        Template template = configuration.getTemplate("users/studentGommettes.ftl");
        template.setOutputEncoding("UTF-8");
        template.process(input, output);

        return output.toString();
    }


}
