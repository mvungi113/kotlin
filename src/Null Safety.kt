fun main(){
    var neverNull: String = "This can't be Null"
    // when trying to assign null to non-nullable variable a compilation error is produced
//    neverNull = null

    var nullable : String? = "You can keep a null here"
    nullable = null


    var inferredNonNull = "The compiler assumes non - null"
//    inferredNonNull = null

    strLength(neverNull)

//    strLength(nullable) compile will produce error
}


fun strLength(notNull: String) : Int{
    return notNull.length
}


//A function that takes in a nullable string and returns its description
fun describeString(maybeString:String?):String{
    if(maybeString != null && maybeString.length > 0){
        return "String of the length ${maybeString.length}"
    }else{
        return "Empty or Null String"
    }

}