package fr.istic.taa.jaxrs.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import jakarta.ws.rs.ext.ContextResolver;
import jakarta.ws.rs.ext.Provider;

@Provider
public class JacksonConfig implements ContextResolver<ObjectMapper> {
    private final ObjectMapper objectMapper;

    public JacksonConfig() {
        objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule()); // Active le support LocalDateTime
    }

    @Override
    public ObjectMapper getContext(Class<?> type) {
        return objectMapper;
    }
}
