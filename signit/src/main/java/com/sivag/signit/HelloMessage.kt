package com.sivag.signit

import android.content.Context
import android.widget.Toast

/**
 * Created by Siva G on 06,December,2022
 * Official Email : sivaguru3161@gmail.com
 */

class HelloMessage {
    fun shows(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }
}