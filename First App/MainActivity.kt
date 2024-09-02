class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val buttonHot = findViewById<Button>(R.id.btnHot)
        val buttonCool = findViewById<Button>(R.id.btnCool)
        val linearLayout = findViewById<LinearLayout>(R.id.linearlayout)

        buttonHot.setOnClickListener {
            linearLayout.setBackgroundColor(R.color.black)
        }

        buttonCool.setOnClickListener {
            linearLayout.setBackgroundColor(com.google.android.material.R.color.material_blue_grey_800)
        }

    }
}