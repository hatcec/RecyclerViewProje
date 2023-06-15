package com.example.recyclerviewproje

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.recyclerviewproje.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private  lateinit var filmlerList:ArrayList<Filmler>
    private lateinit var adapter:RVAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rv.setHasFixedSize(true)
        binding.rv.layoutManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)


        val f1=Filmler(1, "Asi Prenses", 15.55,"asiprenses" )
        val f2=Filmler(2, "Avatar", 19.55,"avatar" )
        val f3=Filmler(3, "Image", 15.55,"image" )
        val f4=Filmler(4, "Neslican", 14.55,"neslican" )
        val f5=Filmler(5, "Sinir", 15.85,"sinir" )
        val f6=Filmler(6, "Wonderwoman", 15.95,"wonderwoman" )
        filmlerList=ArrayList<Filmler>()
        filmlerList.add(f1)
        filmlerList.add(f2)
        filmlerList.add(f3)
        filmlerList.add(f4)
        filmlerList.add(f5)
        filmlerList.add(f6)
        adapter=RVAdapter(this,filmlerList)
        binding.rv.adapter=adapter
    }
}