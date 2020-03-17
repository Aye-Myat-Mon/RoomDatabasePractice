package com.amm.test.android.roomdatabasepractice.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.amm.test.android.roomdatabasepractice.entity.Word

@Dao
interface WordDao {
    @Query("SELECT * FROM word_table ORDER BY word ASC")
    fun getWordAlphabetically(): LiveData<List<Word>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertWord(word: Word)

    @Query("DELETE FROM word_table")
    suspend fun deleteAll()
}