package lat.pam.desertrecycleview

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DessertAdapter(private val dessertList: List<Dessert>) :
    RecyclerView.Adapter<DessertAdapter.DessertViewHolder>() {

    class DessertViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgContainer: View = view.findViewById(R.id.imgContainer)
        val imgDessert: ImageView = view.findViewById(R.id.imgDessert)
        val tvDescription: TextView = view.findViewById(R.id.tvDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DessertViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.itemdesert, parent, false)
        return DessertViewHolder(view)
    }

    override fun onBindViewHolder(holder: DessertViewHolder, position: Int) {
        val dessert = dessertList[position]
        holder.tvDescription.text = dessert.description
        holder.imgDessert.setImageResource(dessert.imageRes)
        holder.imgContainer.backgroundTintList = android.content.res.ColorStateList.valueOf(Color.parseColor(dessert.colorHex))
    }

    override fun getItemCount(): Int = dessertList.size
}
