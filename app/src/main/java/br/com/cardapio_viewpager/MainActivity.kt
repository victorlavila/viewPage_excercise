package br.com.cardapio_viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import ui.main.PlaceHolderfragment
import ui.main.SelectionsPagerAdapter

class MainActivity : AppCompatActivity() {

    val viewpager by lazy { findViewById<ViewPager2>(R.id.view_pager) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragments = getFragments()
        val selectionsPagerAdapter = SelectionsPagerAdapter(fragments, this)

        viewpager.adapter = selectionsPagerAdapter
        viewpager.offscreenPageLimit = 1

    }

    private fun getFragments(): List<Fragment> {
        return listOf(
            PlaceHolderfragment.newInstance(
                "Cardápio 1",
                "Coxinha = R$ 6,00",
                "Esfirra = R$ 6,00",
                "Brigadeiro Gourmet = R$ 4,00",
                "Mousse de chocolate = R$ 10,00",
                "Refrigerante lata = R$ 5,00",
                R.color.teal_200
            ),
            PlaceHolderfragment.newInstance(
                "Cardápio 2",
                "Pizza (Mussarela, Calabresa, Portuguesa) = R$ 39,00",
                "Cerveja lt = R$ 4,50",
                "Torta de frango = R$ 8,00",
                "Brigadeiro Gourmet = R$ 4,00",
                "X Salada = R$ 14,00",
                R.color.white
            ),
            PlaceHolderfragment.newInstance(
                "Cardápio 3",
                "Hot Dog = R$ 8,00",
                "Porção de asinha de frango = R$ 30,00",
                "Tábua de frios = R$ 23,00",
                "Caipirinha = R$ 12,00",
                "Cervejas especiais = R$ 14,00",
                R.color.purple_200
            )

        )

    }
}