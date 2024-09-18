package com.alura;

import com.alura.models.MinhasPreferidas;
import  com.alura.models.Musica;
import  com.alura.models.Podcast;

public class Main {
  public static void main(String[] args) {
    Musica minhaMusica = new Musica(); // Está sendo instanciado um objeto do tipo Musica chamado minhaMusica.
    minhaMusica.setTitulo("He Like That"); // Está sendo chamado o método setTitulo do objeto minhaMusica, passando o valor "He Like That" como parâmetro.
    minhaMusica.setArtista("Fifth Harmony"); // Está sendo chamado o método setArtista do objeto minhaMusica, passando o valor "Fifth Harmony" como parâmetro.

    // O for está sendo utilizado para chamar o método reproduz do objeto minhaMusica 100 vezes.
    for(int i = 0; i < 100; i++) {
      minhaMusica.reproduz(); // Está sendo chamado o método reproduz do objeto minhaMusica.
    }

    // O for está sendo utilizado para chamar o método curte do objeto minhaMusica 50 vezes.
    for(int i = 0; i < 50; i++) {
      minhaMusica.curte(); // Está sendo chamado o método curte do objeto minhaMusica.
    }

    System.out.println("--------------------------------------------------");

    Podcast meuPodcast = new Podcast(); // Está sendo instanciado um objeto do tipo Podcast chamado meuPodcast.
    meuPodcast.setTitulo("Nerdcast"); // Está sendo chamado o método setTitulo do objeto meuPodcast, passando o valor "Nerdcast" como parâmetro.
    meuPodcast.setApresentador("Jovem Nerd"); // Está sendo chamado o método setApresentador do objeto meuPodcast, passando o valor "Jovem Nerd" como parâmetro.

    // O for está sendo utilizado para chamar o método reproduz do objeto meuPodcast 200 vezes.
    for(int i = 0; i < 5000; i++) {
      meuPodcast.reproduz(); // Está sendo chamado o método reproduz do objeto meuPodcast.
    }

    // O for está sendo utilizado para chamar o método curte do objeto meuPodcast 100 vezes.
    for(int i = 0; i < 1000; i++) {
      meuPodcast.curte(); // Está sendo chamado o método curte do objeto meuPodcast.
    }

    MinhasPreferidas minhasPreferidas = new MinhasPreferidas(); // Está sendo instanciado um objeto do tipo MinhasPreferidas chamado minhasPreferidas.
    minhasPreferidas.inclui(minhaMusica); // Está sendo chamado o método inclui do objeto minhasPreferidas, passando o objeto minhaMusica como parâmetro.
    minhasPreferidas.inclui(meuPodcast); // Está sendo chamado o método inclui do objeto minhasPreferidas, passando o objeto meuPodcast como parâmetro.
  }
}
