package br.com.alura.viagens.util

import java.math.BigDecimal
import java.text.DecimalFormat
import java.util.*

private const val IDIOMA_PORTUGUES = "pt"
private const val PAIS_BRASIL = "br"

private const val FORMATO_PADRAO = "R$"
private const val FORMATO_COM_ESPACO = "R$ "

class MoedaUtil {

    companion object {

        fun formataParaBrasileiro(preco: BigDecimal): String {
            val formatadorBr = DecimalFormat.getCurrencyInstance(Locale(IDIOMA_PORTUGUES, PAIS_BRASIL))
            return formatadorBr.format(preco).replace(FORMATO_PADRAO, FORMATO_COM_ESPACO)
        }
    }
}