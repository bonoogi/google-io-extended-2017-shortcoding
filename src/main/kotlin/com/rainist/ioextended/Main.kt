package com.rainist.ioextended


fun solve(combinedList: List<Long>): List<Long> {
    val a = combinedList.filter { it.rem(3) == 0.toLong() }.toMutableList()
    a.filter{it.rem(4) == 0.toLong()}.distinct().forEach{ v ->
        for (i in 1..a.filter { it == v.div(4).times(3) }.count())
            a.remove(v)
    }
    return a
}
