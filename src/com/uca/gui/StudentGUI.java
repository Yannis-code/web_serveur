package com.uca.gui;

import com.uca.core.StudentCore;
import com.uca.core.ClassCore;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class StudentGUI { 

    public static String getAllStudents() throws IOException, TemplateException {
        Configuration configuration = _FreeMarkerInitializer.getContext();

        Map<String, Object> input = new HashMap<>();

        input.put("students", StudentCore.getAllStudents());
        input.put("classes", ClassCore.getAllClasses());

        Writer output = new StringWriter();
        Template template = configuration.getTemplate("teachers/students.ftl");
        template.setOutputEncoding("UTF-8");
        template.process(input, output);

        return output.toString();
    }

}
