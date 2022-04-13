package com.uca.gui;

import com.uca.core.GommetteCore;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class GommetteGUI { 


    public static String getAllGommettes() throws IOException, TemplateException {
        Configuration configuration = _FreeMarkerInitializer.getContext();

        Map<String, Object> input = new HashMap<>();

        input.put("gommettes", GommetteCore.getAllGommettes());

        Writer output = new StringWriter();
        Template template = configuration.getTemplate("users/gommettes.ftl");
        template.setOutputEncoding("UTF-8");
        template.process(input, output);

        return output.toString();
    }

    public static String getAllGommettesTeacher() throws IOException, TemplateException {
        Configuration configuration = _FreeMarkerInitializer.getContext();

        Map<String, Object> input = new HashMap<>();

        input.put("gommettes", GommetteCore.getAllGommettes());

        Writer output = new StringWriter();
        Template template = configuration.getTemplate("teachers/gommettes.ftl");
        template.setOutputEncoding("UTF-8");
        template.process(input, output);

        return output.toString();
    }

}
