package br.com.fiap.imagens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val imagens = intArrayOf(
        R.drawable.img_banana,
        R.drawable.img_kiwi,
        R.drawable.img_orange,
        R.drawable.img_maca
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun trocarImagem(view: View){
        val sorteado = Random().nextInt(imagens.size);
        frutas.setImageResource(imagens[sorteado])
    }
}
