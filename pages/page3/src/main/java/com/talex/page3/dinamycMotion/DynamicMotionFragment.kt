package com.talex.page3.dinamycMotion

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.motion.widget.MotionScene
import androidx.constraintlayout.motion.widget.TransitionBuilder
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.lifecycle.ViewModelProvider
import androidx.fragment.app.Fragment
import com.talex.page3.R

class DynamicMotionFragment : Fragment(R.layout.page3_dynamic_motion_fragment) {

    companion object {
        fun newInstance() = DynamicMotionFragment()
    }

    private lateinit var viewModel: DynamicMotionViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)
        viewModel = ViewModelProvider(this).get(DynamicMotionViewModel::class.java)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val motionLayout = view.findViewById<MotionLayout>(R.id.page3_dynamic_motion_fragment_scene__container)


        with(viewModel) {
            dataLiveData.observe(viewLifecycleOwner) { list ->
                var lastId: Int? = null

                list.take(10).forEachIndexed { index, text ->
                    val textView = LayoutInflater.from(context)
                        .inflate(
                            R.layout.page3_dynamic_motion_text_view,
                            motionLayout,
                            false
                        ) as TextView
                    textView.text = text

                    textView.id = View.generateViewId()
                    motionLayout.addView(textView, 0)
                    dodod2(motionLayout, motionLayout.id, textView.id)


                    when (index) {
                        0 -> dodod(motionLayout, textView)
                        else -> dodod2(
                            motionLayout,
                            lastId ?: motionLayout.id,
                            textView.id
                        )

                    }

                    lastId = textView.id
                }
            }
        }

    }

    fun dodod2(parent: ConstraintLayout, attachToViewId: Int, childId: Int) = with(ConstraintSet()) {
        clone(parent)
        connect(childId, ConstraintSet.TOP, attachToViewId, ConstraintSet.BOTTOM)
        connect(childId, ConstraintSet.START, parent.id, ConstraintSet.START)
        connect(childId, ConstraintSet.END, parent.id, ConstraintSet.END)
        applyTo(parent)
    }

    fun dodod(parent: ConstraintLayout, child: View) = with(ConstraintSet()) {
        clone(parent)
        connect(child.id, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP)
        connect(child.id, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START)
        connect(child.id, ConstraintSet.END, ConstraintSet.PARENT_ID, ConstraintSet.END)
        applyTo(parent)
    }

    fun work(parent: ConstraintLayout, child: View) {
        val set = ConstraintSet()
        set.clone(parent)
        set.connect(child.id, ConstraintSet.TOP, parent.id, ConstraintSet.TOP, 60)
        set.applyTo(parent)
    }

    private fun MotionLayout.createTransition(scene: MotionScene): MotionScene.Transition {
        val startSetId = View.generateViewId()
        val startSet = ConstraintSet()
        startSet.clone(this)

        val endSetId = View.generateViewId()
        val endSet = ConstraintSet()
        endSet.clone(this)

        val transitionId = View.generateViewId()
        return TransitionBuilder.buildTransition(
            scene,
            transitionId,
            startSetId,
            startSet,
            endSetId,
            endSet
        )
    }


}