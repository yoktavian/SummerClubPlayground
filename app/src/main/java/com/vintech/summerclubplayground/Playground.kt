package com.vintech.summerclubplayground

/**
 * Created by YudaOktavian on 17-May-2020
 */

var day: String? = null

/** Case 1
fun main() {
    whatToDo(day)
}

fun whatToDo(day: String) {
    if (day == "sunday") print("holiday")
    else print("work")
}
*/

/**
 * Case 2
fun main() {
    initializeDay()
    whatToDo(day)
}

fun initializeDay() {
    day = "sunday"
}

fun whatToDo(day: String) {
    if (day == "sunday") print("holiday")
    else print("work")
}
*/

/**
 * Fix.
 */
fun main() {
    initializeDay()
    day?.let { whatToDo(it) }
}

fun initializeDay() {
    day = "sunday"
}

fun whatToDo(day: String) {
    if (day == "sunday") print("holiday")
    else print("work")
}