package it.softwaredocotor.javafxemotionapplication;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;

public class EmotionController {
    @FXML
    private Label explanationLabel = new Label();

    // Metodo per ottenere la spiegazione corrispondente a un'emozione
    public String getExplanationForEmotion(String emotion) {
        switch (emotion) {
            case "Gioia":
                return "Secondo Ekman la gioia è caratterizzata da espressioni facciali come un sorriso genuino, rughe attorno agli occhi e una disposizione positiva del viso.";
            case "Tristezza":
                return "La tristezza è caratterizzata da una bocca leggermente curva verso il basso, sopracciglia abbassate, palpebre inferiori che si sollevano e un aspetto di abbattimento nel viso.";
            case "Rabbia":
                return "La rabbia è caratterizzata da una bocca stretta, sopracciglia abbassate, occhi aperti ampiamente e una tensione muscolare generale nel viso. ";
            case "Sorpresa":
                return "La sorpresa è caratterizzata da occhi spalancati, sopracciglia sollevate, bocca aperta e mento abbassato.";
            case "Paura":
                return "La paura è caratterizzata da occhi spalancati, sopracciglia sollevate, labbra strette, mento abbassato e tensione muscolare nel viso.";
            case "Disgusto":
                return "Il disgusto è caratterizzato da labbra arricciate, naso sollevato, rughe naso-labiali, sopracciglia abbassate e una sensazione di nausea o ribrezzo evidente nel viso.";
            default:
                return "";
        }
    }
}

