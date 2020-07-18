package coba.kuis

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWER: String = "correct_answer"

    fun getQuestions(): ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()

        val que1 = Questions(1, "What professions or jobs does this flag belong to?",
        R.drawable.dj, "singer",
            "dancer",
            "miner",
            "dj",
            1 )
        questionsList.add(que1)

        val que2 = Questions(2, "What professions or jobs does this flag belong to?",
            R.drawable.hairdresser, "nurse",
            "hairdresser",
            "stewardess",
            "stylelist",
            2 )
        questionsList.add(que2)

        val que3 = Questions(3, "What professions or jobs does this flag belong to?",
            R.drawable.hairdresser, "autrounot",
            "mechanic",
            "clown",
            "painter",
            1 )
        questionsList.add(que3)

        val que4 = Questions(4, "What professions or jobs does this flag belong to?",
            R.drawable.firefighter, "chemist",
            "sailor",
            "firefighter",
            "farmer",
            3 )
        questionsList.add(que4)

        val que5 = Questions(5, "What professions or jobs does this flag belong to?",
            R.drawable.plumber, "policeman",
            "taxi-driver",
            "plumber",
            "showman",
            3 )
        questionsList.add(que5)

        val que6 = Questions(6, "What professions or jobs does this flag belong to?",
            R.drawable.gardener, "gardener",
            "policeman",
            "detective",
            "farmer",
            1 )
        questionsList.add(que6)

        val que7 = Questions(7, "What professions or jobs does this flag belong to?",
            R.drawable.policeman, "athlete",
            "policeman",
            "soldier",
            "detective",
            2 )
        questionsList.add(que7)

        val que8 = Questions(8, "What professions or jobs does this flag belong to?",
            R.drawable.manager, "showman",
            "sailor",
            "maid",
            "manager",
            4 )
        questionsList.add(que8)

        val que9 = Questions(9, "What professions or jobs does this flag belong to?",
            R.drawable.builder, "concierge",
            "builder",
            "detective",
            "writer",
            2 )
        questionsList.add(que9)

        val que10 = Questions(10, "What professions or jobs does this flag belong to?",
            R.drawable.gardener, "showman",
            "painter",
            "gardener",
            "farmer",
            3 )
        questionsList.add(que6)

        return questionsList

    }
}