package me.proj.mybusinesscard

import android.app.Application
import me.proj.mybusinesscard.data.AppDatabase
import me.proj.mybusinesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}