package site.arksana.guica

sealed class Screen(val route:String){
    object LoginScreen : Screen("login_page")
    object RegisterScreen : Screen("register_page")
}
