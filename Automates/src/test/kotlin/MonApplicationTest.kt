import org.junit.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class MonApplicationTest {

    @ParameterizedTest
    @ValueSource(strings = [ ":()", ":]", ":--)", "ad", "(-)", "123"])
    fun testSmileyInvalide(smiley: String) {
        val automateSmiley = MonApplication().smiley()
        assertFalse(automateSmiley.estUnMot(smiley), "Le smiley $smiley devrait être invalide")
    }

    @ParameterizedTest
    @ValueSource(strings = [ ":)", ":-)", ":(", ";-)", ":=)", "]-)"])
    fun testSmileyValide(smiley: String) {
        val automateSmiley = MonApplication().smiley()
        assertTrue(automateSmiley.estUnMot(smiley), "Le smiley $smiley devrait être valide")
    }

    @ParameterizedTest
    @ValueSource(strings = [ "12:60", "00:", ":", "111:55", "24:12", "1:50", "zadfa"])
    fun testHeureInvalide(heure: String) {
        val automateHeure = MonApplication().heure()
        assertFalse(automateHeure.estUnMot(heure), "L'heure :  $heure devrait être invalide")
    }

    @ParameterizedTest
    @ValueSource(strings = ["12:12", "00:00", "23:59", "05:07", "17:58"])
    fun testHeureValide(heure: String) {
        val automateHeure = MonApplication().heure()
        assertTrue(automateHeure.estUnMot(heure), "L'heure $heure devrait être valide")
    }

    @ParameterizedTest
    @ValueSource(strings = ["Abc.example.com", "@monnomdedomaine.de", "@", "111:55", "24:12", "1:50", "zadfa"])
    fun testEmailInvalide(mail: String) {
        val automateMail = MonApplication().adresse()
        assertFalse(automateMail.estUnMot(mail), "L'heure :  $mail devrait être invalide")
    }

    @ParameterizedTest
    @ValueSource(strings = ["Abc@example.com", "Abc.123@example.com", "user+mailbox/department=shipping@example.com", "!#$%&'*+-/=?^_`.{|}~@example.com", "Loïc.Accentué@voilà.fr"])
    fun testEmailValide(mail: String) {
        val automateMail = MonApplication().adresse()
        assertTrue(automateMail.estUnMot(mail), "L'heure $mail devrait être valide")
    }
}