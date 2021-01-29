package ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import br.com.cardapio_viewpager.R


class PlaceHolderfragment : Fragment() {

    companion object {
        const val FRAGMENT_NOME = "fragment_nome"
        const val ITEM_1 = "item_1"
        const val ITEM_2 = "item_2"
        const val ITEM_3 =  "item_3"
        const val ITEM_4 = "item_4"
        const val ITEM_5 = "item_5"
        const val BACKGROUND_COLOR = "background_color"
        @JvmStatic
        fun newInstance(nome: String, item1: String, item2 : String, item3 : String, item4 : String, item5 : String, backgroundColor: Int) : PlaceHolderfragment{
           return PlaceHolderfragment().apply {
               arguments = Bundle().apply {
                   putString(FRAGMENT_NOME, nome)
                   putString(ITEM_1, item1)
                   putString(ITEM_2, item2)
                   putString(ITEM_3, item3)
                   putString(ITEM_4, item4)
                   putString(ITEM_5, item5)
                   putInt(BACKGROUND_COLOR, backgroundColor)
               }
           }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_placeholderfragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.let {
            view.findViewById<TextView>(R.id.fragment_nome).text =
                it.getString(FRAGMENT_NOME, "Empty name")
            view.findViewById<TextView>(R.id.item_1).text =
                it.getString(ITEM_1, "Empty name")
            view.findViewById<TextView>(R.id.item_2).text =
                it.getString(ITEM_2, "Empty name")
            view.findViewById<TextView>(R.id.item_3).text =
                it.getString(ITEM_3, "Empty name")
            view.findViewById<TextView>(R.id.item_4).text =
                it.getString(ITEM_4, "Empty name")
            view.findViewById<TextView>(R.id.item_5).text =
                it.getString(ITEM_5, "Empty name")
            view.findViewById<ConstraintLayout>(R.id.parent).setBackgroundColor(
                ContextCompat.getColor(
                    requireContext(), it.getInt(
                        BACKGROUND_COLOR,
                        R.color.white
                    )
                )
            )
        }

        super.onViewCreated(view, savedInstanceState)
    }


}