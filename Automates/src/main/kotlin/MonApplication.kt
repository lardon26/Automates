class MonApplication (){

    fun smiley():Automate{

        //Ensemble des Etats
        val E1 = Etat("E1")
        val E2 = Etat("E2")
        val E3 = Etat("E3")
        val E4 = Etat("E4")
        val E5 = Etat("E5")

        //Définition des l'état initial et final
        val etatInitial = E1
        val etatFinaux = setOf(E4)

        E1.ajouterTransition(';', E2)
        E1.ajouterTransition(']', E2)

        E1.ajouterTransition(':', E5)

        E2.ajouterTransition('-', E3)

        E3.ajouterTransition(')', E4)

        E5.ajouterTransition('-', E3)
        E5.ajouterTransition('=', E3)
        E5.ajouterTransition(')', E4)
        E5.ajouterTransition('(', E4)

        //Définition des caractères autorisés
        val alphabet  = setOf<Char>(':',';',']','-','=',')','(')

        return Automate(setOf(E1, E2, E3, E4, E5), etatInitial, etatFinaux, alphabet)
    }

    fun heure():Automate{

        val E0 = Etat("E0")
        val H1 = Etat("H1")
        val H2 = Etat("H2")
        val H = Etat("H")
        val M1 = Etat("M1")
        val M2 = Etat("M2")
        val M = Etat("M")

        val etatInitial = E0
        val etatFinaux = setOf(M)

        for (chiffre in '0'..'1') {
            E0.ajouterTransition(chiffre, H1)
        }

        E0.ajouterTransition('2', H2)

        for (chiffre in '0'..'9') {
            H1.ajouterTransition(chiffre, H)
        }

        for (chiffre in '0'..'3') {
            H2.ajouterTransition(chiffre, H)
        }

        H.ajouterTransition(':', M1)

        for (chiffre in '0'..'5') {
            M1.ajouterTransition(chiffre, M2)
        }

        for (chiffre in '0'..'9') {
            M2.ajouterTransition(chiffre, M)
        }

        val alphabet = setOf('0', '1', '2', '3', '4', '5','6', '7', '8', '9', ':')


        return Automate(setOf(E0, H1, H2, H, M1, M2, M), etatInitial, etatFinaux, alphabet)
    }


    fun adresse():Automate{

        val alphabet: Set<Char> = ('a'..'z').toSet()  + ('A'..'Z')  + ('à'..'ü') + setOf('!', '#', '@','$', '%', '&', '.', '\'','*', ',', '?','+', '-', '/','=', '{', '}', '^', '`', '~','|', '_') +('0'..'9').toSet()
        val alphabet_sans_arobase : Set<Char> = ('a'..'z').toSet()  + ('A'..'Z')  + ('à'..'ü') + setOf('!', '#','$', '%', '&','.', '\'','*', ',', '?', '+', '-', '/', '=', '{', '}', '^', '`', '~','|','_') +('0'..'9').toSet()
        val E0 = Etat("E0")
        val E1 = Etat("E1")
        val E2 = Etat("E2")
        val E3 = Etat("E3")
        val E4 = Etat("E4")
        val E5 = Etat("E5")

        val etatInitial = E0
        val etatFinaux = setOf(E5)


        for (caractere in alphabet_sans_arobase) {
            E0.ajouterTransition(caractere, E1)
        }
        for (caractere in alphabet_sans_arobase) {
            E1.ajouterTransition(caractere, E1)
        }
        E1.ajouterTransition('@', E2)

        for (caractere in alphabet_sans_arobase) {
            E2.ajouterTransition(caractere, E3)
        }
        for (caractere in alphabet_sans_arobase) {
            E3.ajouterTransition(caractere, E3)
        }
        E3.ajouterTransition('.', E4)
        for (caractere in alphabet_sans_arobase) {
            E4.ajouterTransition(caractere, E5)
        }
        for (caractere in alphabet_sans_arobase) {
            E5.ajouterTransition(caractere, E5)
        }

        return Automate(setOf(E0, E1, E2, E3, E4, E5), etatInitial, etatFinaux, alphabet)
    }

}