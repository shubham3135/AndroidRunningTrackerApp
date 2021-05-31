package com.example.runningtracker.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface RunDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRun(run: Run)

    @Delete
    suspend fun deleteRun(run: Run)

    @Query("select * from running_table order by timestamp desc")
    fun getAllRunsSortedByDate(): LiveData<List<Run>>

    @Query("select * from running_table order by timeInMillis desc")
    fun getAllRunsSortedByTimeInMillis(): LiveData<List<Run>>

    @Query("select * from running_table order by caloriesBurned desc")
    fun getAllRunsSortedByCaloriesBurned(): LiveData<List<Run>>

    @Query("select * from running_table order by avgSpeedInKMH desc")
    fun getAllRunsSortedByAvgSpeed(): LiveData<List<Run>>

    @Query("select * from running_table order by distanceInMeters desc")
    fun getAllRunsSortedByDistance(): LiveData<List<Run>>

    @Query("select SUM(timeInMillis) from running_table")
    fun getTotalTimeInMillis(): LiveData<Long>

    @Query("select SUM(caloriesBurned) from running_table")
    fun getTotalCaloriesBurned(): LiveData<Int>

    @Query("select SUM(distanceInMeters) from running_table")
    fun getTotalDistance(): LiveData<Int>

    @Query("select AVG(avgSpeedInKMH) from running_table")
    fun getTotalAvgSpeed(): LiveData<Float>
}