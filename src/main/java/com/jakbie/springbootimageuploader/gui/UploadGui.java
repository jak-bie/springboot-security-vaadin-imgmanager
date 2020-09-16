package com.jakbie.springbootimageuploader.gui;

import com.jakbie.springbootimageuploader.ImageManager;
import com.jakbie.springbootimageuploader.model.Image;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route("upload")
public class UploadGui extends VerticalLayout {

    ImageManager imageManager;

    @Autowired
    public UploadGui(ImageManager imageManager) {
        this.imageManager = imageManager;

        Label label = new Label();
        Label labelTitle = new Label("Image uploader");
        add(labelTitle);
        TextField textField = new TextField();
        Button button = new Button("upload");
        button.addClickListener(clickEvent ->
        {
            String uploadedImage = imageManager.uploadFileAndSaveToDb(textField.getValue());
            //Image image = new Image(uploadedImage);
            label.setText("Image upload successful!");
            add(label);
        });
        add(textField);
        add(button);
    }

}
