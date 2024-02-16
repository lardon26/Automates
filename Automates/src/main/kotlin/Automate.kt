class Automate(val etats: Set<Etat>, val etatInitial: Etat, val etatsFinaux: Set<Etat>, val alphabet: Set<Char>) {

    fun estFinal(etat: Etat): Boolean {
        return etatsFinaux.contains(etat)
    }

    fun estUnMot(mot: String): Boolean {
        var etatCourant = etatInitial

        for (i in mot) {
            //Si le caractère n'est pas contenu dans l'alphabet -> return False
            if (!alphabet.contains(i)) {
                println("$i n'est pas un caractère valide dans l'alphabet")
                return false
            }
            //Si la transition n'existe pour le caractère i depuis l'état courant -> return False
            if (!etatCourant.transition.containsKey(i)) {
                //println("$i n'est pas une transition")
                return false
            }

            // L'état courant devient l'état courant + la transition pour le caractère i
            etatCourant = etatCourant.transition[i]!!


        }
        //Vérifie que le dernier état est final
        return estFinal(etatCourant)
    }

}