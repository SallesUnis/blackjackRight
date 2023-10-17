// Importações necessárias
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.blackjack.R
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var playerScore: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        updateScore()
    }

    // Função chamada quando o jogador clica em um botão (por exemplo, para adicionar pontos)
    fun addToScore(view: View) {
        playerScore += 1
        updateScore()
    }

    // Função para atualizar a pontuação na tela
    private fun updateScore() {
        val scoreTextView = findViewById<TextView>(R.id.scoreTextView)
        scoreTextView.text = "Pontuação: $playerScore"
    }

    // Função chamada quando o jogador decide encerrar o jogo e volta para a tela inicial
    fun endGame(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("playerScore", playerScore)
        startActivity(intent)
    }
}
