package bazzi.shariaty.googlesignin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import bazzi.shariaty.googlesignin.databinding.ActivityHomeBinding
import bazzi.shariaty.googlesignin.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

class HomeActivity : AppCompatActivity() {
    private lateinit var auth : FirebaseAuth
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth = FirebaseAuth.getInstance()

        val displayName = intent.getStringExtra("name")
        binding.textView.text = "Hello " + displayName
    }
}