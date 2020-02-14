package com.example.demo.web.components;

import com.example.demo.web.util.DefaultSanitizer;
import com.haulmont.cuba.gui.components.data.ConversionException;
import com.haulmont.cuba.web.gui.components.WebRichTextArea;

public class MyRichTextArea extends WebRichTextArea {

    @Override
    protected String convertToPresentation(String modelValue) throws ConversionException {
        return super.convertToPresentation(DefaultSanitizer.sanitize(modelValue));
    }

}
