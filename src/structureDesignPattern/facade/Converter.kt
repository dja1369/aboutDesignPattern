package src.structureDesignPattern.facade


class Converter {
    /*
    Convert the data to a string
     */
    fun convert(data: Types<*>): StringType {
        return when (data.value){
            is Int -> StringType(data.value.toString())
            is String -> data as StringType
            else -> throw IllegalArgumentException("Invalid type")
        }
    }

}