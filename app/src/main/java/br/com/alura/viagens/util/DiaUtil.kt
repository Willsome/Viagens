package br.com.alura.viagens.util

class DiaUtil {

    companion object {

        fun formataParaTexto(dias: Int): String {
            if (dias > 1) {
                return "$dias dias"
            }

            return "$dias dia"
        }
    }
}