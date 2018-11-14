package br.com.alura.viagens.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import br.com.alura.viagens.R
import br.com.alura.viagens.model.Pacote
import br.com.alura.viagens.util.DiaUtil
import br.com.alura.viagens.util.MoedaUtil
import br.com.alura.viagens.util.ResourceUtil
import kotlinx.android.synthetic.main.item_pacotes.view.*
import java.text.DecimalFormat
import java.util.*

class ListaPacotesAdapter(
    val listaPacotes: List<Pacote>,
    val context: Context

) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view = LayoutInflater.from(context).inflate(R.layout.item_pacotes, parent, false)

        val pacote = getItem(position)

        setaLocal(pacote, view)
        setaImagem(pacote, view)
        setaDias(pacote, view)
        setaPreco(pacote, view)

        return view
    }

    private fun setaLocal(pacote: Pacote, view: View) {
        view.tvLocal.text = pacote.local
    }

    private fun setaPreco(pacote: Pacote, view: View) {
        view.tvPreco.text = MoedaUtil.formataParaBrasileiro(pacote.preco)
    }

    private fun setaDias(pacote: Pacote, view: View) {
        view.tvDia.text = DiaUtil.formataParaTexto(pacote.dias)
    }

    private fun setaImagem(pacote: Pacote, view: View) {
        val drawable = ResourceUtil.devolveDrawable(context, pacote.imagem)
        view.ivItemPacotes.setImageDrawable(drawable)
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