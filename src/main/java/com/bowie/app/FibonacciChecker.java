package com.bowie.app;

public class FibonacciChecker {

    public static boolean isFibonacci(int n) { // 17, 0 1
        int primeiro = 0;
        int segundo = 1;

        // soma os números até o primeiro ser maior ou igual ao input
        while (primeiro <= n) {
            if (primeiro == n) {
                return true; // verdadeiro se número informado é igual número atual da sequência
            }
            int proximo = primeiro + segundo; // calcula próximo número na sequência
            primeiro = segundo; // mova para próximo número na sequência. Ex: antes tinhamos 0, 1, agora teremos 1, 1
            segundo = proximo;
        }

        return false; // falso se o número informado não está na sequência
    }
}
