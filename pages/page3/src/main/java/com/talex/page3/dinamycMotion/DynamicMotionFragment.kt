package com.talex.page3.dinamycMotion

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.motion.widget.MotionScene
import androidx.constraintlayout.motion.widget.TransitionBuilder
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