package br.com.alura.viagens.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import br.com.alura.viagens.R
import br.com.alura.viagens.dao.PacoteDAO
import br.com.alura.viagens.ui.adapter.ListaPacotesAdapter
import kotlinx.android.synthetic.main.activity_lista_pacotes.*

private const val TITULO_APPBAR = "Pacotes"

class ListaPacotesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_pacotes)

        title = TITULO_APPBAR
        configurarLista()
    }

    private fun configurarLista() {
        val dao = PacoteDAO()
        val pacotes = dao.lista()
        lvListaPacotes.adapter = ListaPacotesAdapter(pacotes, applicationContext)
    }
}
