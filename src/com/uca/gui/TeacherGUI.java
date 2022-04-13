package com.uca.gui;

import com.uca.core.TeacherCore;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class TeacherGUI { 

    public static String getAllTeachers() throws IOException, TemplateException {
        Configuration configuration = _FreeMarkerInitializer.getContext();

        Map<String, Object> input = new HashMap<>();

        input.put("teachers", TeacherCore.getAllTeachers());

        Writer output = new StringWriter();
        Template template = configuration.getTemplate("teachers/teachers.ftl");
        template.setOutputEncoding("UTF-8");
        template.process(input, output);

        return output.toString();
    }

    public static String getLogin() throws IOException, TemplateException {
        Configuration configuration = _FreeMarkerInitializer.getContext();

        Map<String, Object> input = new HashMap<>();

        Writer output = new StringWriter();
        Template template = configuration.getTemplate("users/login.ftl");
        template.setOutputEncoding("UTF-8");
        template.process(input, output);

        return template.toString();
    }

    public static String getLoged() throws IOException, TemplateException {
        Configuration configuration = _FreeMarkerInitializer.getContext();

        Map<String, Object> input = new HashMap<>();

        Writer output = new StringWriter();
        Template template = configuration.getTemplate("teachers/loged.ftl");
        template.setOutputEncoding("UTF-8");
        template.process(input, output);

        return template.toString();
    }

}
