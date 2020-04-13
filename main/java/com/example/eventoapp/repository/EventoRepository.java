package com.example.eventoapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.eventoapp.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String>{
}
