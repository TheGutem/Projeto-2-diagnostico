/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projeto2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Classe responsável por registrar logs das operações realizadas no sistema.
 *
 * @author Gutem
 */
public class Logger {
    private static final String LOG_FILE = "logs.txt";
    private static boolean logToFile = true; // Configurar se os logs serão gravados em arquivo

    /**
     * Registra uma mensagem de log.
     *
     * @param message A mensagem que será registrada no log.
     */
    public static void log(String message) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String logMessage = "[" + timestamp + "] " + message;

        if (logToFile) {
            try (FileWriter fileWriter = new FileWriter(LOG_FILE, true);
                 PrintWriter printWriter = new PrintWriter(fileWriter)) {
                printWriter.println(logMessage);
            } catch (IOException e) {
                System.err.println("Erro ao escrever no arquivo de log: " + e.getMessage());
            }
        } else {
            System.out.println(logMessage);
        }
    }

    /**
     * Configura se os logs devem ser gravados em arquivo ou exibidos no console.
     *
     * @param toFile true para gravar em arquivo, false para exibir no console.
     */
    public static void setLogToFile(boolean toFile) {
        logToFile = toFile;
    }
}

