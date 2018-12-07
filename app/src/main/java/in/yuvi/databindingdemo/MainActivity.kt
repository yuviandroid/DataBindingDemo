package `in`.yuvi.databindingdemo

import `in`.yuvi.databindingdemo.databinding.ActivityMainBinding
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    lateinit var mainBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        var userModel = UserModel()
        userModel.uName = "Yuvraj"
        userModel.pwd = "12345"
        mainBinding.userModel = userModel
    }
}
