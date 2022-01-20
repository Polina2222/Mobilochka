package com.example.fourthlab

import android.os.AsyncTask
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import java.util.concurrent.TimeUnit

class AsyncFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        PersonHolder.addListener {
            val activityCallback = requireActivity() as AsyncActivity
            activityCallback.updateAdapterData()
        }

        retainInstance = true

        Log.i("[APP]", "Create AsyncFragment")
        MessageSender().execute()
    }

    class MessageSender : AsyncTask<Void, Void, Void>() {

        override fun onProgressUpdate(vararg p0: Void?) {
            super.onProgressUpdate()
            PersonHolder.sendMessage()
        }

        override fun doInBackground(vararg p0: Void?): Void? {
            for (i in 1..10){
                TimeUnit.SECONDS.sleep(2)
                publishProgress()
            }
            return null
        }

    }

    companion object{
        const val TAG = "Async"
    }

}