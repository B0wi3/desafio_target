package com.bowie.app;

public class ContaLetraA {

    public static int contarLetras(String input) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++; // a cada loop nos caracteres do input, verifica se há ocorrência da letra, e guarda quantas (0 ou mais) na variável
            }
        }
        return count;
    }
}

