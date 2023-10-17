import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.blackjack.R
import android.widget.TextView

class GameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Função chamada quando o botão é clicado
    fun startGame(view: View) {
        val intent = Intent(this, GameActivity::class.java)
        startActivity(intent)
    }
}