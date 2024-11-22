package com.example.examen1eval_hugo_gomez_medina

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class ListaActivity: AppCompatActivity(), AdapterView.OnItemSelectedListener {

    val categorias = arrayOf("Todas", "Política", "Economía","Cultura","Deportes")

    val imagenes = intArrayOf(
        R.drawable.cyltv,
        R.drawable.ic_politics,
        R.drawable.ic_economy,
        R.drawable.ic_culture,
        R.drawable.ic_sports,
    )

    val noticias = arrayOf(
        "Noticia política",
        "Noticia económica",
        "Noticia cultural",
        "Noticia deportiva",
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        val selector = findViewById<Spinner>(R.id.selector_categoria)
        val adaptadorPersonalizado = AdaptadorPersonalizado(this, R.layout.vista_selector, categorias)
        selector.adapter = adaptadorPersonalizado
        selector.onItemSelectedListener = this

        val lista = findViewById<ListView>(R.id.lista_noticias)
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }


    private inner class AdaptadorPersonalizado(
        context: Context,
        resource: Int,
        objects: Array<String>
    ) : ArrayAdapter<String>(context, resource, objects) {

        override fun getDropDownView(
            position: Int,
            convertView: View?,
            parent: ViewGroup
        ): View {

            return crearFilaPersonalizada(position, convertView, parent)
        }

        override fun getView(
            position: Int,
            convertView: View?,
            parent: ViewGroup
        ): View {

            return crearFilaPersonalizada(position, convertView, parent)
        }

        private fun crearFilaPersonalizada(
            position: Int,
            convertView: View?,
            parent: ViewGroup
        ): View {
            val layoutInflater = LayoutInflater.from(context)
            val rowView = convertView ?: layoutInflater.inflate(R.layout.vista_selector, parent, false)
            rowView.findViewById<TextView>(R.id.categoria).text = categorias[position]
            rowView.findViewById<ImageView>(R.id.imagen).setImageResource(imagenes[position])
            return rowView
        }
    }
}
