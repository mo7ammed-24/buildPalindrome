fun main() {
    print(buildPalindrome("abcdc"))
}

fun buildPalindrome(st: String):String {
    if (st == st.reversed())
        return st
    var charList = st.toSet()
    for (item in charList) {
        var newsString = st + item.toString()
        if (newsString == newsString.reversed())
            return newsString
    }
    for (i in 1 until st.length) {
        var newString: String =st
        for (j in i.downTo(0)) {
            newString +=st[j]
        }
        if (newString == newString.reversed())
            return newString

    }
    return st
}