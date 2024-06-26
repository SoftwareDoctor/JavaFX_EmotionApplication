# JavaFX_EmotionApplication - Esplora le Emozioni

## Descrizione del Progetto

Questo progetto è un'applicazione JavaFX che consente agli utenti di esplorare diverse emozioni come Gioia, Tristezza, Rabbia, Sorpresa, Paura e Disgusto. Ogni pulsante rappresenta un'emozione e, una volta cliccato, mostra una spiegazione dettagliata dell'emozione selezionata.

![img.png](img.png)


## Tecnologie Utilizzate

- **Java**: Linguaggio di programmazione principale utilizzato.
- **JavaFX**: Framework per la costruzione dell'interfaccia grafica.
- **Maven**: Strumento di gestione del progetto e delle dipendenze.

## Struttura del Progetto

Il progetto è strutturato nei seguenti file e pacchetti:

- `src/main/java/com/example/demo/EmotionController.java`: Contiene la logica per gestire gli eventi dei pulsanti e mostrare le spiegazioni delle emozioni.
- `src/main/java/com/example/demo/EmotionApplication.java`: Classe principale che avvia l'applicazione JavaFX e costruisce l'interfaccia utente.
- `src/main/resources/`: Directory che contiene le risorse come immagini utilizzate nell'applicazione.

## Requisiti di Sistema

- **Java 17** o versioni successive.
- **Maven** 3.11.0
- **JavaFX Maven Plugin** 0.0.8

## Istruzioni per l'Avvio

1. **Clonare il Repository**:
    ```sh
    git clone <url-del-repository>
    cd <nome-del-repository>
    ```

2. **Compilare il Progetto**:
   Assicurarsi di avere Maven installato e configurato correttamente.
    ```sh
    mvn clean install
    ```

## Dettagli sull'Interfaccia Utente

L'interfaccia utente è composta da:

- **Bottoni delle Emozioni**: Ogni bottone rappresenta un'emozione specifica. Quando cliccato, aggiorna una label con la descrizione dell'emozione.
- **Label di Spiegazione**: Mostra la spiegazione dell'emozione selezionata.
- **Bottone di Navigazione**: Un bottone speciale con un'icona a forma di cuore che permette di ritornare alla scelta delle emozioni.

### Stili e Layout

- **Stili**: Bottoni con colore di sfondo blu (#4169E1) e testo bianco.
- **Layout**: Utilizzo di `BorderPane`, `VBox`, `HBox` e `ToolBar` per organizzare i componenti.

### Struttura del progetto
Il progetto è strutturato nei seguenti file e pacchetti:
src/main/java/com/example/demo/EmotionController.java: Contiene la logica per gestire gli eventi dei pulsanti e mostrare le spiegazioni delle emozioni.
src/main/java/com/example/demo/EmotionApplication.java: Classe principale che avvia l'applicazione JavaFX e costruisce l'interfaccia utente.
src/main/resources/: Directory che contiene le risorse come immagini utilizzate nell'applicazione.

---

Questo README fornisce una panoramica dettagliata su come configurare, eseguire e comprendere il progetto "Esplora le Emozioni". Assicurarsi di seguire i passaggi correttamente e che il dell'immagine `cuore.png` sia corretto. È possibile modificare il percorso nell'implementazione della classe `ButtonNavigationButton`.. Buona esplorazione delle emozioni!
