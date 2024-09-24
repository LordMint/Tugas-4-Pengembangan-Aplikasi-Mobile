import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: DataAdapter
    private val dataList = mutableListOf("Item 1", "Item 2", "Item 3")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Setup RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = DataAdapter(dataList)
        recyclerView.adapter = adapter

        // Add new data when button is clicked
        val btnAddData = findViewById<Button>(R.id.btnAddData)
        btnAddData.setOnClickListener {
            adapter.addItem("New Item")
        }
    }
}
