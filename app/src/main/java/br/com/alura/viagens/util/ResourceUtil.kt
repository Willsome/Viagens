package br.com.alura.viagens.util

import android.content.Context
import android.graphics.drawable.Drawable

private const val DRAWABLE = "drawable"

class ResourceUtil {

    companion object {

        fun devolveDrawable(context: Context, caminhoImagemDrawable: String): Drawable? {
            val idDrawable = context.resources.getIdentifier(
                caminhoImagemDrawable,
                DRAWABLE,
                context.packageName
            )

            return context.resources.getDrawable(idDrawable)
        }
    }
}