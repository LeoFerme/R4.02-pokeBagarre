package com.montaury.pokebagarre.metier;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {
    @Test
    void devrait_etre_vainqueur_s_il_a_une_meilleure_attaque() {

        // GIVEN
        var premier = new Pokemon("Pikachu", "urlImage", new Stats(12,10));
        var second = new Pokemon("Rondoudou", "urlImage2", new Stats(10,10));

        // WHEN
        var estVainqueur = premier.estVainqueurContre(second);

        // THEN
        assertThat(estVainqueur).isTrue();
    }

    @Test
    void devrait_etre_vainqueur_s_il_a_une_meilleure_defense_avec_meme_attaque() {

        // GIVEN
        var premier = new Pokemon("Pikachu", "urlImage", new Stats(12,12));
        var second = new Pokemon("Rondoudou", "urlImage2", new Stats(12,10));

        // WHEN
        var estVainqueur = premier.estVainqueurContre(second);

        // THEN
        assertThat(estVainqueur).isTrue();
    }

    @Test
    void devrait_etre_vainqueur_s_il_a_meme_defense_avec_meme_attaque_et_premier_saisie() {

        // GIVEN
        var premier = new Pokemon("Pikachu", "urlImage", new Stats(12,12));
        var second = new Pokemon("Rondoudou", "urlImage2", new Stats(12,12));

        // WHEN
        var estVainqueur = premier.estVainqueurContre(second);

        // THEN
        assertThat(estVainqueur).isTrue();
    }
}