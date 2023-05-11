package com.example.web_view

import android.annotation.SuppressLint
import android.app.ProgressDialog
import android.graphics.Bitmap
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Base64
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.web_view.databinding.ActivityMainBinding
import com.utils.webbrauser.str

class MainActivity : AppCompatActivity() {
    private lateinit var progressDialog: ProgressDialog
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


//            val header = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>"
//        binding.webView.loadData(header + str, "text/html", "UTF-8");
//        val settings: WebSettings = binding.webView.getSettings()
//        settings.defaultTextEncodingName = "utf-8"
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.FROYO) {
//            val base64: String = Base64.encodeToString(str.toByteArray(), Base64.DEFAULT)
//            binding.webView.loadData(base64, "text/html; charset=utf-8", "base64")
//        } else {
//            val header = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>"
//            binding.webView.loadData(header + str, "text/html; charset=UTF-8", null)
//        }


        progressDialog=ProgressDialog(this)
        binding.webView.loadUrl("https://www.youtube.com/")
        progressDialog.setTitle("Kutib turing...")
        progressDialog.setMessage("Yuklanmoqda...")
        binding.webView.settings.javaScriptEnabled = true
        binding.webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                if (url != null) {
                    view?.loadUrl(url)

                }
                return true
            }

            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)
//                progress_bar.visibility = View.VISIBLE
                progressDialog.show()
//
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
//                progress_bar.visibility = View.INVISIBLE
                progressDialog.hide()

            }

        }
    }

    override fun onBackPressed() {
        if (binding.webView.canGoBack()){
            binding.webView.goBack()
        }
        else{
            super.onBackPressed()
        }

    }
}