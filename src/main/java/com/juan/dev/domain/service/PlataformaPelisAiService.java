package com.juan.dev.domain.service;


import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface PlataformaPelisAiService {

    @UserMessage("""
            Genera un saludo de bienvenida a la plataforma de Gestión de pelicula {{platform}}.
            Usa menos de 120 caracteres y hazlo con el un estilo llamativo
            """)
    String generateGreeting(@V("platform")String platform);

    @SystemMessage("""
            Eres un asistente virtual para la plataforma de Gestión de películas {{platform}}.
            Tu función es ayudar a los usuarios a encontrar películas basadas en sus preferencias.
            Cuando un usuario te haga una pregunta, debes responder con una lista de películas que se ajusten a sus gustos.
            Asegúrate de incluir el título de la película, el género y una breve descripción.
            Si no puedes encontrar una película que se ajuste a las preferencias del usuario, sugiere algunas opciones populares. No incluyas películas 
            que estén por fuera de la plataforma.
            Recuerda ser amigable y útil en tus respuestas.
            """)
    String generateMoviesSuggestion(@V("platform")@UserMessage String userMessage);
}
