package com.jakbie.springbootimageuploader.gui;

import com.jakbie.springbootimageuploader.model.Image;
import com.jakbie.springbootimageuploader.repo.ImageRepo;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import java.util.List;

@Route("gallery")
public class GalleryGui extends VerticalLayout {

    private ImageRepo imageManager;

    public GalleryGui(ImageRepo imageManager) {
        this.imageManager = imageManager;
        Label labelTitle = new Label("Gallery");
        add(labelTitle);
        List<Image> all = imageManager.findAll();
        all.stream().forEach(element -> {
            com.vaadin.flow.component.html.Image image =
                    new com.vaadin.flow.component.html.Image(element.getImageAddress(), "brak");
            add(image);
        } );
    }
}
