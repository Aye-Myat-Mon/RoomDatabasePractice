package com.amm.test.android.roomdatabasepractice.repository

import androidx.lifecycle.LiveData
import com.amm.test.android.roomdatabasepractice.dao.WordDao
import com.amm.test.android.roomdatabasepractice.entity.Word

class WordRepository(private val wordDao: WordDao) {
    val allWords: LiveData<List<Word>> = wordDao.getWordAlphabetically()

    suspend fun insert(word: Word) {
        wordDao.insertWord(word)
    }
}