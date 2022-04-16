package uz.texnopos.capitalsquiz

object Constants {
    fun getQuestions(): List<Question> {
        return listOf(
            Question(1, "Uzbekistan", listOf("Tashkent", "Nukus", "Bishkek", "Nur-Sultan"), 0),
            Question(2, "Kazakhstan", listOf("Nur-Sultan", "Tashkent", "Bishkek", "Nukus"), 0),
            Question(3, "Kyrgyzstan", listOf("Bishkek", "Nukus", "Tashkent", "Nur-Sultan"), 0),
            Question(4, "Germany", listOf("Tashkent", "Paris", "Berlin", "London"), 2),
            Question(5, "England", listOf("Paris", "London", "Nukus", "Berlin"), 1),
            Question(6, "Karakalpakstan", listOf("Lisbon", "Ashgabat", "Tashkent", "Nukus"), 3),
            Question(7, "Portugal", listOf("Bishkek", "Amsterdam", "Lisbon", "Nur-Sultan"), 2),
            Question(8, "France", listOf("Paris", "Nukus", "Lisbon", "Bishkek"), 0),
            Question(9, "Spain", listOf("Berlin", "Beijing", "Nukus", "Madrid"), 3),
            Question(10, "Haiti", listOf("Wellington", "Bishkek", "Port-Au-Prince", "Tashkent"), 2),
        )
    }
}
