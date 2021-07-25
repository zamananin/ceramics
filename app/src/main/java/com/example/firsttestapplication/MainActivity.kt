package com.example.firsttestapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

val form = listOf("Гончарство", "Из комка", "Из жгута, который видно",
    "Из жгута с заглаживанием поверхности", "Сборка из прямых пластов",
    "Сборка из сильно деформированных пластов", "Сбор формы из модулей")

val decor = listOf("Кистевая роспись ангобом", "Нанесение ангобв тампонированием губкой",
    "Нанаесение ангоба сухой кистью", "Табачный ангоб", "Глазурирование кистью",
    "Работа с пулбфоном", "Роспись подглазурной краской по сырой эмали", "Сграффито",
    "Текстурирование штампами, тканями, или подручными средствами", "Пузыри",
    "Растительная отминка", "инкрустация цветной глиной")

val subject = listOf("Блюдо", "Ваза для цветов", "Чаша", "Подсвечник", "Пано", "Абстрактный объект",
    "Сосуд без конкретного назначения", "Рама для зеркала", "Кашпо", "Плошка под мелочи")

val about = listOf("Растения", "Цветы", "Город", "Сны", "Животные", "Чувства и состояния",
    "Что-то про себя", "Природа", "Время суток", "Стихи", "Портрет", "Орнаменты", "Стили в искусстве")

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b1: TextView = findViewById(R.id.row1body)
        val b2: TextView = findViewById(R.id.row2body)
        val b3: TextView = findViewById(R.id.row3body)
        val b4: TextView = findViewById(R.id.row4body)

        newResult(b1, b2, b3, b4)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener{
            newResult(b1, b2, b3, b4)
        }
    }

    private fun newResult(b1: TextView, b2: TextView, b3: TextView, b4: TextView) {
        b1.text = form[(Math.random() * form.size).toInt()]
        b2.text = decor[(Math.random() * decor.size).toInt()]
        b3.text = subject[(Math.random() * subject.size).toInt()]
        b4.text = about[(Math.random() * about.size).toInt()]
        b1.requestLayout()
        b2.requestLayout()
        b3.requestLayout()
        b4.requestLayout()
        b1.invalidate()
        b2.invalidate()
        b3.invalidate()
        b4.invalidate()
    }


}