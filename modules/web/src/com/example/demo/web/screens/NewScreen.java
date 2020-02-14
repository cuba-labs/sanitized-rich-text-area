package com.example.demo.web.screens;

import com.haulmont.cuba.gui.components.RichTextArea;
import com.haulmont.cuba.gui.screen.Screen;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("sta_NewScreen")
@UiDescriptor("new-screen.xml")
public class NewScreen extends Screen {

    @Inject
    private RichTextArea richTextArea;

    @Subscribe
    public void onInit(InitEvent event) {
        richTextArea.setValue("<b onmouseover=alert('1')>click me</b>");
    }
}
