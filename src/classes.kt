
// declares a named class without any properties
class Customer

class Contacts(var id : Int, var email : String)

fun main(){
    val customer = Customer()

    val contacts = Contacts(1, "kindo@gmail.com")

    println(contacts.id)
    contacts.email = "jane@gmail.com"
    println(contacts.email)
}