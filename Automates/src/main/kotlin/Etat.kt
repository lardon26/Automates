// Classe représentant un état dans un automate
class Etat(val name: String) {
    // Propriété représentant les transitions possibles depuis cet état
    val transition = HashMap<Char, Etat>()

    // Fonction pour ajouter une transition à partir de cet état
    fun ajouterTransition(input: Char, nextState: Etat) {
        // Associe le caractère 'input' à l'état 'nextState' dans la HashMap 'transition'
        transition[input] = nextState
    }
}
