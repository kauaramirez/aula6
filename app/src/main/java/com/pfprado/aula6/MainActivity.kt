package com.pfprado.aula6

import android.content.Context
import android.content.Intent
import android.os.Bundle

class MainActivity : DebugActivity() {
    // Propriedade para acessar o contexto de qualquer lugar
    private val context: Context get() = this

    override fun onCreate(icicle: Bundle?) {
        super.onCreate(icicle)
        setContentView(R.layout.activity_main)
        onClick(R.id.btLogin) { onClickLogin() }
    }

    fun onClickLogin() {
        val login = getTextString(R.id.tLogin)
        val senha = getTextString(R.id.tSenha)
        if ("pedro" == login && "123" == senha) {
           val intent = Intent(context,BemVindoActivity::class.java)
           val params = Bundle()
           params.putString("nome","Pedro Felipe")
           intent.putExtras(params)
           startActivity(intent)
        } else {
            toast("Login e senha incorretos.")
        }
    }
}

