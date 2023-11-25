package com.fragments_start

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fragments_start.databinding.ListItemAnimalBinding

class AdapterAnimal(val onClick: (model: Animal, position: Int) -> Unit) :
    RecyclerView.Adapter<AdapterAnimal.AnimalHolder>() {

    private var animalList = listOf<Animal>()

// пустой список animalList
    // fun setListanimalList которая:
    // 1 clean
    // 2 add new items
    // 3 -> сказать адаптеру notifyDataSetChanged()


    fun setAnimalList(animalList: List<Animal>) {
        this.animalList = animalList
    }

    fun clearAnimalList() {
        animalList = listOf()
    }

    fun update() {
        this.notifyDataSetChanged()
    }

    inner class AnimalHolder(item: View) : RecyclerView.ViewHolder(item) {
        private val binding = ListItemAnimalBinding.bind(item)
        fun bind(animal: Animal, position: Int) = with(binding) {
            type.text = animal.animalType
//            info.text = animal.infoShort
            pictureAnimal.setImageResource(animal.picture)


            // по клику вернет объект и номер
            binding.itemAnimal.setOnClickListener {
                onClick(animal, position)

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item_animal, parent, false)
        return AnimalHolder(view)
    }

    override fun getItemCount(): Int {
        return animalList.size
    }

    override fun onBindViewHolder(holder: AnimalHolder, position: Int) {
        holder.bind(animalList[position], position)
    }
}