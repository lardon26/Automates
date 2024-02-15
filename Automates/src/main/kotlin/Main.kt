fun main(args: Array<String>) {
        println("---------- Nantes Université, BUT2 Informatique, 2024 ------------")
        println("------ TP - Modélisation et analyse à l'aide des automates------")
        println("------- Menu de l'application (développée par Hippolyte Guilloteau) -------")
    while(true) {
        println()
        println("Veuillez faire votre choix")
        println()
        println("1. Smiley (pour reconnaître un des smileys)")
        println()
        println("2. HH:MM (pour reconnaître une heure bien formée)")
        println()
        println("3. Adresse électronique (pour reconnaître une adresse électronique correctement formée)")
        println()
        println("99. Arrêt de l'application")
        println()
        println("Votre choix (1-99) ?")

        val choixUtilisateur = readLine()?.toIntOrNull()

        when (choixUtilisateur) {
            1 -> {
                val automateSmiley = MonApplication().smiley()
                println()
                demanderEtVerifierChaine(automateSmiley)
                println()
            }

            2 -> {
                val automateHeure = MonApplication().heure()
                println()
                demanderEtVerifierChaine(automateHeure)
                println()
            }

            3 -> {
                val automateAdresse = MonApplication().adresse()
                println()
                demanderEtVerifierChaine(automateAdresse)
                println()
            }

            99 -> {println("Arrêt de l'application.")
                break}
            else ->{ (println("Choix invalide."))
                println("--------------------------------------")}
        }
    }
}

    fun demanderEtVerifierChaine(automate: Automate) {
        println("Veuillez entrer la chaîne à analyser :")
        val chaine = readLine()
        if (chaine != null) {
            if (automate.estUnMot(chaine)) {
                println("\u001B[32mLa chaîne est valide.\u001B[0m")
            } else {
                println("\u001B[31mLa chaîne est invalide.\u001B[0m")
            }
        } else {
            println("Entrée invalide.")
        }
}
