package br.com.alura.viagens.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import br.com.alura.viagens.R
import br.com.alura.viagens.model.Pacote
import kotlinx.android.synthetic.main.item_pacotes.view.*

class ListaPacotesAdapter(
    val listaPacotes: List<Pacote>,
    val context: Context

) : BaseAdapter() {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view = LayoutInflater.from(context).inflate(R.layout.item_pacotes, parent, false)

        val pacote = getItem(position)

        val idDrawable = context.resources.getIdentifier(
            pacote.imagem,
            "drawable",
            context.packageName
        )
        val drawable = context.resources.getDrawable(idDrawable)
        view.ivItemPacotes.setImageDrawable(drawable)

        view.tvDia.text = "${pacote.dias} dias"
        view.tvPreco.text = "${pacote.preco}"

        return view
    }

    override fun getItem(position: Int): Pacote {
        return listaPacotes[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return listaPacotes.size
    }
}