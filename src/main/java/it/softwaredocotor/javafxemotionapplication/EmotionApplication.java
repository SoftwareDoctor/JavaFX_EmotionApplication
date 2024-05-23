package it.softwaredocotor.javafxemotionapplication;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EmotionApplication extends Application {

    private EmotionController emotionController;

    @Override
    public void start(Stage primaryStage) {
        emotionController = new EmotionController();
        primaryStage.setTitle("Esplora le Emozioni");

        // Creazione dei bottoni per le emozioni
        Button btnGioia = createButton("Gioia");
        Button btnTristezza = createButton("Tristezza");
        Button btnRabbia = createButton("Rabbia");
        Button btnSorpresa = createButton("Sorpresa");
        Button btnPaura = createButton("Paura");
        Button btnDisgusto = createButton("Disgusto");

        // Creazione del bottone di navigazione
        NavigationButton btnNavigation = new NavigationButton("Scegli la tua emozione");

        // Creazione della toolbar per la spiegazione delle emozioni
        Label lblExplanation = new Label();
        lblExplanation.setWrapText(true);
        ToolBar toolbar = new ToolBar(lblExplanation);
        toolbar.setPadding(new Insets(10));

        // Gestione degli eventi dei bottoni delle emozioni
        btnGioia.setOnAction(event -> lblExplanation.setText(emotionController.getExplanationForEmotion("Gioia")));
        btnTristezza.setOnAction(event -> lblExplanation.setText(emotionController.getExplanationForEmotion("Tristezza")));
        btnRabbia.setOnAction(event -> lblExplanation.setText(emotionController.getExplanationForEmotion("Rabbia")));
        btnSorpresa.setOnAction(event -> lblExplanation.setText(emotionController.getExplanationForEmotion("Sorpresa")));
        btnPaura.setOnAction(event -> lblExplanation.setText(emotionController.getExplanationForEmotion("Paura")));
        btnDisgusto.setOnAction(event -> lblExplanation.setText(emotionController.getExplanationForEmotion("Disgusto")));

        // Creazione del layout principale
        BorderPane root = new BorderPane();
        root.setTop(btnNavigation);
        root.setCenter(createButtonBox(btnGioia, btnTristezza, btnRabbia, btnSorpresa, btnPaura, btnDisgusto));
        root.setBottom(toolbar);

        // Creazione del VBox per il bottone di navigazione
        VBox navigationBox = new VBox();
        Region spacer = new Region();
        spacer.setPrefHeight(20); // Imposta l'altezza dello spazio vuoto
        navigationBox.getChildren().addAll(spacer, btnNavigation);
        navigationBox.setAlignment(Pos.CENTER);
        root.setTop(navigationBox);

        // Stile dei componenti
        root.setStyle("-fx-background-color: #87CEEB");
        lblExplanation.setStyle("-fx-font-size: 14px;");

        // Creazione della scena e visualizzazione della finestra
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Button createButton(String text) {
        Button button = new Button(text);
        button.setPrefWidth(100);
        button.setPrefHeight(50);
        button.setStyle("-fx-background-color: #4169E1; -fx-text-fill: white;");
        return button;
    }

    // Metodo per la creazione di un HBox contenente i bottoni delle emozioni
    private HBox createButtonBox(Button... buttons) {
        HBox buttonBox = new HBox(10);
        buttonBox.setPadding(new Insets(5, 30, 5, 30));
        buttonBox.getChildren().addAll(buttons);
        buttonBox.setStyle("-fx-alignment: center;");
        return buttonBox;
    }

    // Classe per il bottone di navigazione con icona a forma di cuore
    private static class NavigationButton extends Button {
        public NavigationButton(String text) {
            super(text);
            ImageView imageView = new ImageView(new Image("file:src/main/resources/cuore.png"));
            imageView.setFitWidth(20);
            imageView.setFitHeight(20);
            setGraphic(imageView);
            setStyle("-fx-background-color: #4169E1; -fx-text-fill: white;");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

