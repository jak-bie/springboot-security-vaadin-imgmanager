package com.jakbie.springbootimageuploader.gui;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("gallery")
public class GalleryGui extends VerticalLayout {

    public GalleryGui() {
        Label labelTitle = new Label("in progress...");
        add(labelTitle);
    }
}
