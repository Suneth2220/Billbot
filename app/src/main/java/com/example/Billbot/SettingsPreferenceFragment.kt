package com.example.Billbot

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.example.coinomy.R

class SettingsPreferenceFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences1, rootKey)
    }
}