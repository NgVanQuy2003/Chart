package com.example.chart

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class BarChartView : View {
    private var paint: Paint? = null

    constructor(context: Context?) : super(context) {
        init()
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        init()
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init()
    }

    private fun init() {
        paint = Paint()
        paint!!.color = Color.BLACK
        paint!!.strokeWidth = 5f
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        paint!!.color = Color.BLACK
        canvas.drawLine(100f, 50f, 100f, 800f, paint!!) // y
        canvas.drawLine(100f, 800f, 1000f, 800f, paint!!) //  X

        paint!!.color = Color.BLUE
        canvas.drawRect(150f, 600f, 250f, 800f, paint!!)
        canvas.drawRect(300f, 400f, 400f, 800f, paint!!)
        canvas.drawRect(450f, 300f, 550f, 800f, paint!!)
        canvas.drawRect(600f, 500f, 700f, 800f, paint!!)
        canvas.drawRect(750f, 200f, 850f, 800f, paint!!)
    }
}
