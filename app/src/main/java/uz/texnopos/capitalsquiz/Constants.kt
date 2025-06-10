package uz.texnopos.capitalsquiz

object Constants {
    fun getQuestions(): List<Question> {
        return listOf(
            Question(1, "Uzbekistan", listOf("Tashkent", "Nukus", "Bishkek", "Nur-Sultan"), 0),
            Question(2, "Kazakhstan", listOf("Nur-Sultan", "Tashkent", "Bishkek", "Nukus"), 0),
            Question(3, "Kyrgyzstan", listOf("Bishkek", "Nukus", "Tashkent", "Nur-Sultan"), 0),
            Question(4, "Germany", listOf("Tashkent", "Paris", "Berlin", "London"), 2),
            Question(5, "England", listOf("Paris", "London", "Nukus", "Berlin"), 1), // Note: Capital of UK is London
            Question(6, "Karakalpakstan", listOf("Lisbon", "Ashgabat", "Tashkent", "Nukus"), 3),
            Question(7, "Portugal", listOf("Bishkek", "Amsterdam", "Lisbon", "Nur-Sultan"), 2),
            Question(8, "France", listOf("Paris", "Nukus", "Lisbon", "Bishkek"), 0),
            Question(9, "Spain", listOf("Berlin", "Beijing", "Nukus", "Madrid"), 3),
            Question(10, "Haiti", listOf("Wellington", "Bishkek", "Port-Au-Prince", "Tashkent"), 2),
            // New Questions
            Question(11, "Japan", listOf("Seoul", "Tokyo", "Beijing", "Bangkok"), 1),
            Question(12, "Canada", listOf("Toronto", "Vancouver", "Ottawa", "Montreal"), 2),
            Question(13, "Brazil", listOf("Rio de Janeiro", "São Paulo", "Brasília", "Buenos Aires"), 2),
            Question(14, "Australia", listOf("Sydney", "Melbourne", "Canberra", "Perth"), 2),
            Question(15, "Egypt", listOf("Alexandria", "Cairo", "Giza", "Luxor"), 1),
            Question(16, "India", listOf("Mumbai", "Kolkata", "New Delhi", "Chennai"), 2),
            Question(17, "Italy", listOf("Milan", "Naples", "Florence", "Rome"), 3),
            Question(18, "South Africa", listOf("Johannesburg", "Cape Town", "Durban", "Pretoria"), 3), // Pretoria (administrative)
            Question(19, "Argentina", listOf("Santiago", "Lima", "Buenos Aires", "Montevideo"), 2),
            Question(20, "Russia", listOf("Saint Petersburg", "Moscow", "Novosibirsk", "Yekaterinburg"), 1),
            Question(21, "Mexico", listOf("Guadalajara", "Monterrey", "Mexico City", "Cancun"), 2),
            Question(22, "Nigeria", listOf("Lagos", "Kano", "Ibadan", "Abuja"), 3),
            Question(23, "Saudi Arabia", listOf("Jeddah", "Mecca", "Riyadh", "Medina"), 2),
            Question(24, "South Korea", listOf("Busan", "Incheon", "Daegu", "Seoul"), 3),
            Question(25, "Turkey", listOf("Istanbul", "Ankara", "Izmir", "Bursa"), 1),
            Question(26, "Indonesia", listOf("Surabaya", "Bandung", "Medan", "Jakarta"), 3),
            Question(27, "Pakistan", listOf("Karachi", "Lahore", "Islamabad", "Faisalabad"), 2),
            Question(28, "Thailand", listOf("Chiang Mai", "Phuket", "Pattaya", "Bangkok"), 3),
            Question(29, "Sweden", listOf("Gothenburg", "Malmö", "Stockholm", "Uppsala"), 2),
            Question(30, "Norway", listOf("Bergen", "Trondheim", "Stavanger", "Oslo"), 3),
            Question(31, "Finland", listOf("Tampere", "Turku", "Helsinki", "Oulu"), 2),
            Question(32, "Greece", listOf("Thessaloniki", "Patras", "Heraklion", "Athens"), 3),
            Question(33, "Ireland", listOf("Cork", "Galway", "Limerick", "Dublin"), 3),
            Question(34, "New Zealand", listOf("Auckland", "Christchurch", "Wellington", "Hamilton"), 2),
            Question(35, "Chile", listOf("Valparaíso", "Concepción", "Antofagasta", "Santiago"), 3),
            Question(36, "Colombia", listOf("Medellín", "Cali", "Barranquilla", "Bogotá"), 3),
            Question(37, "Peru", listOf("Arequipa", "Trujillo", "Chiclayo", "Lima"), 3),
            Question(38, "Vietnam", listOf("Ho Chi Minh City", "Da Nang", "Hanoi", "Haiphong"), 2),
            Question(39, "Malaysia", listOf("Johor Bahru", "Ipoh", "Kuala Lumpur", "Penang"), 2),
            Question(40, "Philippines", listOf("Quezon City", "Davao City", "Caloocan", "Manila"), 3)
        )
    }

    fun getFlagQuestions(): List<Question> {
        // The first string parameter (questionText) will now be the flag Unicode
        return listOf(
            Question(1, "🇺🇿", listOf("Kazakhstan", "Uzbekistan", "Tajikistan", "Kyrgyzstan"), 1),
            Question(2, "🇩🇪", listOf("Belgium", "France", "Germany", "Netherlands"), 2),
            Question(3, "🇯🇵", listOf("China", "South Korea", "Japan", "Vietnam"), 2),
            Question(4, "🇧🇷", listOf("Argentina", "Brazil", "Colombia", "Peru"), 1),
            Question(5, "🇨🇦", listOf("United States", "Mexico", "Canada", "Australia"), 2),
            Question(6, "🇦🇺", listOf("New Zealand", "Papua New Guinea", "Australia", "Indonesia"), 2),
            Question(7, "🇮🇹", listOf("Spain", "Greece", "France", "Italy"), 3),
            Question(8, "🇮🇳", listOf("Pakistan", "India", "Bangladesh", "Sri Lanka"), 1),
            Question(9, "🇿🇦", listOf("Nigeria", "Kenya", "South Africa", "Egypt"), 2),
            Question(10, "🇫🇷", listOf("France", "Germany", "Spain", "United Kingdom"), 0),
            Question(11, "🇺🇸", listOf("Canada", "United Kingdom", "United States", "Mexico"), 2),
            Question(12, "🇨🇳", listOf("Japan", "India", "China", "Russia"), 2),
            Question(13, "🇪🇸", listOf("Portugal", "France", "Spain", "Italy"), 2),
            Question(14, "🇲🇽", listOf("Guatemala", "Mexico", "Brazil", "Colombia"), 1),
            Question(15, "🇷🇺", listOf("Ukraine", "Belarus", "Kazakhstan", "Russia"), 3),
            Question(16, "🇦🇷", listOf("Chile", "Uruguay", "Argentina", "Paraguay"), 2),
            Question(17, "🇪🇬", listOf("Sudan", "Libya", "Israel", "Egypt"), 3),
            Question(18, "🇬🇧", listOf("Ireland", "France", "United Kingdom", "Germany"), 2),
            Question(19, "🇹🇷", listOf("Greece", "Syria", "Turkey", "Iran"), 2),
            Question(20, "🇰🇷", listOf("North Korea", "Japan", "China", "South Korea"), 3),
            Question(21, "🇸🇪", listOf("Norway", "Finland", "Denmark", "Sweden"), 3),
            Question(22, "🇳🇴", listOf("Sweden", "Norway", "Finland", "Denmark"), 1),
            Question(23, "🇳🇱", listOf("Belgium", "Germany", "Netherlands", "Denmark"), 2),
            Question(24, "🇨🇭", listOf("Austria", "Germany", "France", "Switzerland"), 3),
            Question(25, "🇬🇷", listOf("Turkey", "Italy", "Albania", "Greece"), 3),
            Question(26, "🇵🇹", listOf("Spain", "Morocco", "Portugal", "France"), 2),
            Question(27, "🇮🇪", listOf("United Kingdom", "Ireland", "Iceland", "Scotland"), 1),
            Question(28, "🇳🇿", listOf("Australia", "Fiji", "New Zealand", "Tonga"), 2),
            Question(29, "🇸🇦", listOf("Iraq", "Yemen", "Oman", "Saudi Arabia"), 3),
            Question(30, "🇰🇿", listOf("Uzbekistan", "Russia", "Kazakhstan", "Kyrgyzstan"), 2)
            // Add more questions as needed
        )
    }
}
