package com.example.racipyaplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import com.example.racipyaplication.databinding.ActivityHomeBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
//    private lateinit var rvAdapter: PopularAdapter
//    private lateinit var dataList: ArrayList<Recipe>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setUpRecyclerView()

        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

//    private fun setUpRecyclerView() {
//        dataList = ArrayList()
//        binding.rvPopular.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
//        var db = Room.databaseBuilder(this@HomeActivity, AppDatabase::class.java, "db_name")
//            .allowMainThreadQueries()
//            .fallbackToDestructiveMigration()
//            .createFromAsset("recipe.db")
//            .build()
//
//        var daoObject = db.getDao()
//        var recipes = daoObject.getAll()
//        for(i in recipes!!.indices)
//        {
//             if (recipes[i]!!.category.contains("Popular"))
//            {
//                dataList.add(recipes[i]!!)
//            }
//            rvAdapter = PopularAdapter(dataList, this@HomeActivity)
//            binding.rvPopular.adapter = rvAdapter
//
//        }
//    }


}